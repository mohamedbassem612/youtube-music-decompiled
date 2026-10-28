package androidx.car.app.media;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.aek;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public interface IMediaPlaybackHost extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.media.IMediaPlaybackHost";
    public static final int VERSION = 1;

    int getInterfaceVersion();

    void registerMediaSessionToken(aek aekVar);

    /* JADX INFO: compiled from: PG */
    public abstract class Stub extends Binder implements IMediaPlaybackHost {
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_registerMediaSessionToken = 1;

        /* JADX INFO: compiled from: PG */
        final class Proxy implements IMediaPlaybackHost {
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

            @Override // androidx.car.app.media.IMediaPlaybackHost
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

            @Override // androidx.car.app.media.IMediaPlaybackHost
            public void registerMediaSessionToken(aek aekVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeTypedObject(aekVar, 0);
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method registerMediaSessionToken is unimplemented.");
                    }
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IMediaPlaybackHost asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMediaPlaybackHost)) ? new Proxy(iBinder) : (IMediaPlaybackHost) iInterfaceQueryLocalInterface;
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
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            registerMediaSessionToken((aek) parcel.readTypedObject(aek.CREATOR));
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* JADX INFO: compiled from: PG */
    public class Default implements IMediaPlaybackHost {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.media.IMediaPlaybackHost
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // androidx.car.app.media.IMediaPlaybackHost
        public void registerMediaSessionToken(aek aekVar) {
        }
    }
}
