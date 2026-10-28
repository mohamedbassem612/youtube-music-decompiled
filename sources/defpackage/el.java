package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class el implements en {
    private final IBinder a;

    public el(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // defpackage.en
    public final void a(PlaybackStateCompat playbackStateCompat) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(1);
            playbackStateCompat.writeToParcel(parcelObtain, 0);
            this.a.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // defpackage.en
    public final void b(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(i);
            this.a.transact(9, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.en
    public final void c(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(i);
            this.a.transact(12, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
