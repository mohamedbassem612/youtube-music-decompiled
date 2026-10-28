package androidx.car.app.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public interface ITelephoneKeypadEventListener extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.model.ITelephoneKeypadEventListener";
    public static final int VERSION = 1;

    int getInterfaceVersion();

    void onKeyDown(int i, IOnDoneCallback iOnDoneCallback);

    void onKeyLongPress(int i, IOnDoneCallback iOnDoneCallback);

    void onKeyUp(int i, IOnDoneCallback iOnDoneCallback);

    /* JADX INFO: compiled from: PG */
    public abstract class Stub extends Binder implements ITelephoneKeypadEventListener {
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_onKeyDown = 3;
        static final int TRANSACTION_onKeyLongPress = 2;
        static final int TRANSACTION_onKeyUp = 4;

        /* JADX INFO: compiled from: PG */
        final class Proxy implements ITelephoneKeypadEventListener {
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

            @Override // androidx.car.app.model.ITelephoneKeypadEventListener
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

            @Override // androidx.car.app.model.ITelephoneKeypadEventListener
            public void onKeyDown(int i, IOnDoneCallback iOnDoneCallback) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(3, parcelObtain, null, 1)) {
                        throw new RemoteException("Method onKeyDown is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.model.ITelephoneKeypadEventListener
            public void onKeyLongPress(int i, IOnDoneCallback iOnDoneCallback) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(2, parcelObtain, null, 1)) {
                        throw new RemoteException("Method onKeyLongPress is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.model.ITelephoneKeypadEventListener
            public void onKeyUp(int i, IOnDoneCallback iOnDoneCallback) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(4, parcelObtain, null, 1)) {
                        throw new RemoteException("Method onKeyUp is unimplemented.");
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

        public static ITelephoneKeypadEventListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ITelephoneKeypadEventListener)) ? new Proxy(iBinder) : (ITelephoneKeypadEventListener) iInterfaceQueryLocalInterface;
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
            if (i == 2) {
                onKeyLongPress(parcel.readInt(), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                return true;
            }
            if (i == 3) {
                onKeyDown(parcel.readInt(), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                return true;
            }
            if (i != 4) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onKeyUp(parcel.readInt(), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* JADX INFO: compiled from: PG */
    public class Default implements ITelephoneKeypadEventListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.model.ITelephoneKeypadEventListener
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // androidx.car.app.model.ITelephoneKeypadEventListener
        public void onKeyDown(int i, IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.model.ITelephoneKeypadEventListener
        public void onKeyLongPress(int i, IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.model.ITelephoneKeypadEventListener
        public void onKeyUp(int i, IOnDoneCallback iOnDoneCallback) {
        }
    }
}
