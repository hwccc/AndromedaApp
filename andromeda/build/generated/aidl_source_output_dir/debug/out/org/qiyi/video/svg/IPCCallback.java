/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.qiyi.video.svg;
// Declare any non-default types here with import statements

public interface IPCCallback extends android.os.IInterface
{
  /** Default implementation for IPCCallback. */
  public static class Default implements org.qiyi.video.svg.IPCCallback
  {
    @Override public void onSuccess(android.os.Bundle result) throws android.os.RemoteException
    {
    }
    @Override public void onFail(java.lang.String reason) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.qiyi.video.svg.IPCCallback
  {
    private static final java.lang.String DESCRIPTOR = "org.qiyi.video.svg.IPCCallback";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.qiyi.video.svg.IPCCallback interface,
     * generating a proxy if needed.
     */
    public static org.qiyi.video.svg.IPCCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.qiyi.video.svg.IPCCallback))) {
        return ((org.qiyi.video.svg.IPCCallback)iin);
      }
      return new org.qiyi.video.svg.IPCCallback.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_onSuccess:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.onSuccess(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onFail:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.onFail(_arg0);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.qiyi.video.svg.IPCCallback
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void onSuccess(android.os.Bundle result) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((result!=null)) {
            _data.writeInt(1);
            result.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onSuccess, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onSuccess(result);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onFail(java.lang.String reason) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(reason);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onFail, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onFail(reason);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static org.qiyi.video.svg.IPCCallback sDefaultImpl;
    }
    static final int TRANSACTION_onSuccess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onFail = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    public static boolean setDefaultImpl(org.qiyi.video.svg.IPCCallback impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static org.qiyi.video.svg.IPCCallback getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public void onSuccess(android.os.Bundle result) throws android.os.RemoteException;
  public void onFail(java.lang.String reason) throws android.os.RemoteException;
}
