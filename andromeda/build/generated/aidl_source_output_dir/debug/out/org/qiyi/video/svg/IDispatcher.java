/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.qiyi.video.svg;
public interface IDispatcher extends android.os.IInterface
{
  /** Default implementation for IDispatcher. */
  public static class Default implements org.qiyi.video.svg.IDispatcher
  {
    @Override public org.qiyi.video.svg.bean.BinderBean getTargetBinder(java.lang.String serviceCanonicalName) throws android.os.RemoteException
    {
      return null;
    }
    //IBinder getTargetBinderLocked(String serviceCanonicalName);
    //杩欎釜uri鍏跺疄灏辨槸Target Service鐨刟ction

    @Override public android.os.IBinder fetchTargetBinder(java.lang.String uri) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void registerRemoteTransfer(int pid, android.os.IBinder remoteTransferBinder) throws android.os.RemoteException
    {
    }
    @Override public void registerRemoteService(java.lang.String serviceCanonicalName, java.lang.String processName, android.os.IBinder binder) throws android.os.RemoteException
    {
    }
    @Override public void unregisterRemoteService(java.lang.String serviceCanonicalName) throws android.os.RemoteException
    {
    }
    @Override public void publish(org.qiyi.video.svg.event.Event event) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.qiyi.video.svg.IDispatcher
  {
    private static final java.lang.String DESCRIPTOR = "org.qiyi.video.svg.IDispatcher";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.qiyi.video.svg.IDispatcher interface,
     * generating a proxy if needed.
     */
    public static org.qiyi.video.svg.IDispatcher asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.qiyi.video.svg.IDispatcher))) {
        return ((org.qiyi.video.svg.IDispatcher)iin);
      }
      return new org.qiyi.video.svg.IDispatcher.Stub.Proxy(obj);
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
        case TRANSACTION_getTargetBinder:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          org.qiyi.video.svg.bean.BinderBean _result = this.getTargetBinder(_arg0);
          reply.writeNoException();
          if ((_result!=null)) {
            reply.writeInt(1);
            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_fetchTargetBinder:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          android.os.IBinder _result = this.fetchTargetBinder(_arg0);
          reply.writeNoException();
          reply.writeStrongBinder(_result);
          return true;
        }
        case TRANSACTION_registerRemoteTransfer:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          android.os.IBinder _arg1;
          _arg1 = data.readStrongBinder();
          this.registerRemoteTransfer(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_registerRemoteService:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          android.os.IBinder _arg2;
          _arg2 = data.readStrongBinder();
          this.registerRemoteService(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_unregisterRemoteService:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.unregisterRemoteService(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_publish:
        {
          data.enforceInterface(descriptor);
          org.qiyi.video.svg.event.Event _arg0;
          if ((0!=data.readInt())) {
            _arg0 = org.qiyi.video.svg.event.Event.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.publish(_arg0);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.qiyi.video.svg.IDispatcher
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
      @Override public org.qiyi.video.svg.bean.BinderBean getTargetBinder(java.lang.String serviceCanonicalName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.qiyi.video.svg.bean.BinderBean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(serviceCanonicalName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getTargetBinder, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getTargetBinder(serviceCanonicalName);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = org.qiyi.video.svg.bean.BinderBean.CREATOR.createFromParcel(_reply);
          }
          else {
            _result = null;
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //IBinder getTargetBinderLocked(String serviceCanonicalName);
      //杩欎釜uri鍏跺疄灏辨槸Target Service鐨刟ction

      @Override public android.os.IBinder fetchTargetBinder(java.lang.String uri) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.IBinder _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uri);
          boolean _status = mRemote.transact(Stub.TRANSACTION_fetchTargetBinder, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().fetchTargetBinder(uri);
          }
          _reply.readException();
          _result = _reply.readStrongBinder();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void registerRemoteTransfer(int pid, android.os.IBinder remoteTransferBinder) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pid);
          _data.writeStrongBinder(remoteTransferBinder);
          boolean _status = mRemote.transact(Stub.TRANSACTION_registerRemoteTransfer, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().registerRemoteTransfer(pid, remoteTransferBinder);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void registerRemoteService(java.lang.String serviceCanonicalName, java.lang.String processName, android.os.IBinder binder) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(serviceCanonicalName);
          _data.writeString(processName);
          _data.writeStrongBinder(binder);
          boolean _status = mRemote.transact(Stub.TRANSACTION_registerRemoteService, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().registerRemoteService(serviceCanonicalName, processName, binder);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void unregisterRemoteService(java.lang.String serviceCanonicalName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(serviceCanonicalName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_unregisterRemoteService, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().unregisterRemoteService(serviceCanonicalName);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void publish(org.qiyi.video.svg.event.Event event) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((event!=null)) {
            _data.writeInt(1);
            event.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_publish, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().publish(event);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static org.qiyi.video.svg.IDispatcher sDefaultImpl;
    }
    static final int TRANSACTION_getTargetBinder = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_fetchTargetBinder = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_registerRemoteTransfer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_registerRemoteService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_unregisterRemoteService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_publish = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    public static boolean setDefaultImpl(org.qiyi.video.svg.IDispatcher impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static org.qiyi.video.svg.IDispatcher getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public org.qiyi.video.svg.bean.BinderBean getTargetBinder(java.lang.String serviceCanonicalName) throws android.os.RemoteException;
  //IBinder getTargetBinderLocked(String serviceCanonicalName);
  //杩欎釜uri鍏跺疄灏辨槸Target Service鐨刟ction

  public android.os.IBinder fetchTargetBinder(java.lang.String uri) throws android.os.RemoteException;
  public void registerRemoteTransfer(int pid, android.os.IBinder remoteTransferBinder) throws android.os.RemoteException;
  public void registerRemoteService(java.lang.String serviceCanonicalName, java.lang.String processName, android.os.IBinder binder) throws android.os.RemoteException;
  public void unregisterRemoteService(java.lang.String serviceCanonicalName) throws android.os.RemoteException;
  public void publish(org.qiyi.video.svg.event.Event event) throws android.os.RemoteException;
}
