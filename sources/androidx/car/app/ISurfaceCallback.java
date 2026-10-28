package androidx.car.app;

import android.graphics.Rect;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.aek;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public interface ISurfaceCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.ISurfaceCallback";
    public static final int VERSION = 1;

    int getInterfaceVersion();

    void onClick(float f, float f2);

    void onFling(float f, float f2);

    void onScale(float f, float f2, float f3);

    void onScroll(float f, float f2);

    void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback);

    void onSurfaceAvailable(aek aekVar, IOnDoneCallback iOnDoneCallback);

    void onSurfaceDestroyed(aek aekVar, IOnDoneCallback iOnDoneCallback);

    void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback);

    /* JADX INFO: compiled from: PG */
    public abstract class Stub extends Binder implements ISurfaceCallback {
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_onClick = 9;
        static final int TRANSACTION_onFling = 7;
        static final int TRANSACTION_onScale = 8;
        static final int TRANSACTION_onScroll = 6;
        static final int TRANSACTION_onStableAreaChanged = 4;
        static final int TRANSACTION_onSurfaceAvailable = 2;
        static final int TRANSACTION_onSurfaceDestroyed = 5;
        static final int TRANSACTION_onVisibleAreaChanged = 3;

        /* JADX INFO: compiled from: PG */
        final class Proxy implements ISurfaceCallback {
            private int mCachedVersion = -1;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public final String getInterfaceDescriptor() {
                return DESCRIPTOR;
            }

            @Override // androidx.car.app.ISurfaceCallback
            public int getInterfaceVersion() {
                if (this.mCachedVersion == -1) {
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(DESCRIPTOR);
                        this.mRemote.transact(Stub.TRANSACTION_getInterfaceVersion, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        this.mCachedVersion = parcelObtain2.readInt();
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                }
                return this.mCachedVersion;
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onClick(float f, float f2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeFloat(f);
                    parcelObtain.writeFloat(f2);
                    if (!this.mRemote.transact(9, parcelObtain, null, 1)) {
                        throw new RemoteException("Method onClick is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onFling(float f, float f2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeFloat(f);
                    parcelObtain.writeFloat(f2);
                    if (!this.mRemote.transact(7, parcelObtain, null, 1)) {
                        throw new RemoteException("Method onFling is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onScale(float f, float f2, float f3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeFloat(f);
                    parcelObtain.writeFloat(f2);
                    parcelObtain.writeFloat(f3);
                    if (!this.mRemote.transact(8, parcelObtain, null, 1)) {
                        throw new RemoteException("Method onScale is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onScroll(float f, float f2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeFloat(f);
                    parcelObtain.writeFloat(f2);
                    if (!this.mRemote.transact(6, parcelObtain, null, 1)) {
                        throw new RemoteException("Method onScroll is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeTypedObject(rect, 0);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(4, parcelObtain, null, 1)) {
                        throw new RemoteException("Method onStableAreaChanged is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onSurfaceAvailable(aek aekVar, IOnDoneCallback iOnDoneCallback) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeTypedObject(aekVar, 0);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(2, parcelObtain, null, 1)) {
                        throw new RemoteException("Method onSurfaceAvailable is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onSurfaceDestroyed(aek aekVar, IOnDoneCallback iOnDoneCallback) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeTypedObject(aekVar, 0);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(5, parcelObtain, null, 1)) {
                        throw new RemoteException("Method onSurfaceDestroyed is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeTypedObject(rect, 0);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(3, parcelObtain, null, 1)) {
                        throw new RemoteException("Method onVisibleAreaChanged is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ISurfaceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ISurfaceCallback)) ? new Proxy(iBinder) : (ISurfaceCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i > 0 && i <= TRANSACTION_getInterfaceVersion) {
                parcel.enforceInterface(DESCRIPTOR);
            }
            if (i == TRANSACTION_getInterfaceVersion) {
                parcel2.writeNoException();
                parcel2.writeInt(getInterfaceVersion());
                return true;
            }
            switch (i) {
                case 2:
                    onSurfaceAvailable((aek) parcel.readTypedObject(aek.CREATOR), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 3:
                    onVisibleAreaChanged((Rect) parcel.readTypedObject(Rect.CREATOR), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 4:
                    onStableAreaChanged((Rect) parcel.readTypedObject(Rect.CREATOR), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 5:
                    onSurfaceDestroyed((aek) parcel.readTypedObject(aek.CREATOR), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 6:
                    onScroll(parcel.readFloat(), parcel.readFloat());
                    return true;
                case 7:
                    onFling(parcel.readFloat(), parcel.readFloat());
                    return true;
                case 8:
                    onScale(parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
                    return true;
                case 9:
                    onClick(parcel.readFloat(), parcel.readFloat());
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* JADX INFO: compiled from: PG */
    public class Default implements ISurfaceCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.ISurfaceCallback
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onClick(float f, float f2) {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onFling(float f, float f2) {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onScroll(float f, float f2) {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onSurfaceAvailable(aek aekVar, IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onSurfaceDestroyed(aek aekVar, IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onScale(float f, float f2, float f3) {
        }
    }
}
