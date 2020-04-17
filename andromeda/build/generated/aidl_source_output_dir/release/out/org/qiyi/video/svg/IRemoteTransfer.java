/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.qiyi.video.svg;
// Declare any non-default types here with import statements

public interface IRemoteTransfer extends android.os.IInterface
{
  /** Default implementation for IRemoteTransfer. */
  public static class Default implements org.qiyi.video.svg.IRemoteTransfer
  {
    @Override public void registerDispatcher(android.os.IBinder dispatcherBinder) throws android.os.RemoteException
    {
    }
    @Override public void unregisterRemoteService(java.lang.String serviceCanonicalName) throws android.os.RemoteException
    {
    }
    @Override public void notify(org.qiyi.video.svg.event.Event event) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.qiyi.video.svg.IRemoteTransfer
  {
    private static final java.lang.String DESCRIPTOR = "org.qiyi.video.svg.IRemoteTransfer";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.qiyi.video.svg.IRemoteTransfer interface,
     * generating a proxy if needed.
     */
    public static org.qiyi.video.svg.IRemoteTransfer asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.qiyi.video.svg.IRemoteTransfer))) {
        return ((org.qiyi.video.svg.IRemoteTransfer)iin);
      }
      return new org.qiyi.video.svg.IRemoteTransfer.Stub.Proxy(obj);
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
        case TRANSACTION_registerDispatcher:
        {
          data.enforceInterface(descriptor);
          android.os.IBinder _arg0;
          _arg0 = data.readStrongBinder();
          this.registerDispatcher(_arg0);
          return true;
        }
        case TRANSACTION_unregisterRemoteService:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.unregisterRemoteService(_arg0);
          return true;
        }
        case TRANSACTION_notify:
        {
          data.enforceInterface(descriptor);
          org.qiyi.video.svg.event.Event _arg0;
          if ((0!=data.readInt())) {
            _arg0 = org.qiyi.video.svg.event.Event.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.notify(_arg0);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.qiyi.video.svg.IRemoteTransfer
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
      @Override public void registerDispatcher(android.os.IBinder dispatcherBinder) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder(dispatcherBinder);
          boolean _status = mRemote.transact(Stub.TRANSACTION_registerDispatcher, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().registerDispatcher(dispatcherBinder);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void unregisterRemoteService(java.lang.String serviceCanonicalName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(serviceCanonicalName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_unregisterRemoteService, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().unregisterRemoteService(serviceCanonicalName);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void notify(org.qiyi.video.svg.event.Event event) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((event!=null)) {
            _data.writeInt(1);
            event.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_notify, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().notify(event);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static org.qiyi.video.svg.IRemoteTransfer sDefaultImpl;
    }
    static final int TRANSACTION_registerDispatcher = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_unregisterRemoteService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_notify = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    public static boolean setDefaultImpl(org.qiyi.video.svg.IRemoteTransfer impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static org.qiyi.video.svg.IRemoteTransfer getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public void registerDispatcher(android.os.IBinder dispatcherBinder) throws android.os.RemoteException;
  public void unregisterRemoteService(java.lang.String serviceCanonicalName) throws android.os.RemoteException;
  public void notify(org.qiyi.video.svg.event.Event event) throws android.os.RemoteException;
}
