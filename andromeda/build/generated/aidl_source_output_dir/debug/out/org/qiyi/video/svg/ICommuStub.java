/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.qiyi.video.svg;
// Declare any non-default types here with import statements
//杩欎釜鎺ュ彛鍙槸璧蜂竴涓崰浣嶄綔鐢紝鏆傛椂鏄笉鐢ㄧ殑

public interface ICommuStub extends android.os.IInterface
{
  /** Default implementation for ICommuStub. */
  public static class Default implements org.qiyi.video.svg.ICommuStub
  {
    @Override public void commu(android.os.Bundle args) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.qiyi.video.svg.ICommuStub
  {
    private static final java.lang.String DESCRIPTOR = "org.qiyi.video.svg.ICommuStub";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.qiyi.video.svg.ICommuStub interface,
     * generating a proxy if needed.
     */
    public static org.qiyi.video.svg.ICommuStub asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.qiyi.video.svg.ICommuStub))) {
        return ((org.qiyi.video.svg.ICommuStub)iin);
      }
      return new org.qiyi.video.svg.ICommuStub.Stub.Proxy(obj);
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
        case TRANSACTION_commu:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.commu(_arg0);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.qiyi.video.svg.ICommuStub
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
      @Override public void commu(android.os.Bundle args) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((args!=null)) {
            _data.writeInt(1);
            args.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_commu, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().commu(args);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static org.qiyi.video.svg.ICommuStub sDefaultImpl;
    }
    static final int TRANSACTION_commu = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(org.qiyi.video.svg.ICommuStub impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static org.qiyi.video.svg.ICommuStub getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public void commu(android.os.Bundle args) throws android.os.RemoteException;
}
