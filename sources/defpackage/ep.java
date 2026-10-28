package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ep extends Binder implements eq {
    public final AtomicReference a;

    public ep(fb fbVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new AtomicReference(fbVar);
    }

    @Override // defpackage.eq
    public final PlaybackStateCompat a() {
        int i;
        fb fbVar = (fb) this.a.get();
        if (fbVar == null) {
            return null;
        }
        PlaybackStateCompat playbackStateCompat = fbVar.e;
        MediaMetadataCompat mediaMetadataCompat = fbVar.g;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j = playbackStateCompat.b;
        long jA = -1;
        if (j == -1) {
            return playbackStateCompat;
        }
        int i2 = playbackStateCompat.a;
        if (i2 == 3 || i2 == 4) {
            i = i2;
        } else {
            i = 5;
            if (i2 != 5) {
                return playbackStateCompat;
            }
        }
        long j2 = playbackStateCompat.h;
        if (j2 <= 0) {
            return playbackStateCompat;
        }
        float f = playbackStateCompat.d;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = jElapsedRealtime - j2;
        if (mediaMetadataCompat != null && mediaMetadataCompat.b.containsKey("android.media.metadata.DURATION")) {
            jA = mediaMetadataCompat.a("android.media.metadata.DURATION");
        }
        long j4 = ((long) (j3 * f)) + j;
        if (jA >= 0 && j4 > jA) {
            j4 = jA;
        } else if (j4 < 0) {
            j4 = 0;
        }
        fi fiVar = new fi(playbackStateCompat);
        fiVar.d(i, j4, f, jElapsedRealtime);
        return fiVar.a();
    }

    @Override // defpackage.eq
    public final void b(en enVar) {
        fb fbVar = (fb) this.a.get();
        if (fbVar != null) {
            fbVar.d.register(enVar, new brf("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
            synchronized (fbVar.c) {
            }
        }
    }

    @Override // defpackage.eq
    public final void c(en enVar) {
        fb fbVar = (fb) this.a.get();
        if (fbVar != null) {
            fbVar.d.unregister(enVar);
            Binder.getCallingPid();
            Binder.getCallingUid();
            synchronized (fbVar.c) {
            }
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        en elVar = null;
        switch (i) {
            case 1:
                parcel.readString();
                throw new AssertionError();
            case 2:
                throw new AssertionError();
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    elVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof en)) ? new el(strongBinder) : (en) iInterfaceQueryLocalInterface;
                }
                b(elVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    elVar = (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof en)) ? new el(strongBinder2) : (en) iInterfaceQueryLocalInterface2;
                }
                c(elVar);
                parcel2.writeNoException();
                return true;
            case 5:
                throw new AssertionError();
            case 6:
                throw new AssertionError();
            case 7:
                throw new AssertionError();
            case 8:
                throw new AssertionError();
            case 9:
                throw new AssertionError();
            case 10:
                throw new AssertionError();
            case 11:
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                throw new AssertionError();
            case 12:
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                throw new AssertionError();
            case 13:
                throw new AssertionError();
            case 14:
                parcel.readString();
                throw new AssertionError();
            case 15:
                parcel.readString();
                throw new AssertionError();
            case 16:
                throw new AssertionError();
            case 17:
                parcel.readLong();
                throw new AssertionError();
            case 18:
                throw new AssertionError();
            case 19:
                throw new AssertionError();
            case 20:
                throw new AssertionError();
            case 21:
                throw new AssertionError();
            case 22:
                throw new AssertionError();
            case 23:
                throw new AssertionError();
            case 24:
                parcel.readLong();
                throw new AssertionError();
            case 25:
                throw new AssertionError();
            case 26:
                parcel.readString();
                throw new AssertionError();
            case 27:
                throw new AssertionError();
            case 28:
                PlaybackStateCompat playbackStateCompatA = a();
                parcel2.writeNoException();
                nj.d(parcel2, playbackStateCompatA);
                return true;
            case 29:
                parcel2.writeNoException();
                parcel2.writeInt(-1);
                return true;
            case 30:
                throw new AssertionError();
            case 31:
                throw new AssertionError();
            case 32:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                throw new AssertionError();
            case 34:
                parcel.readString();
                throw new AssertionError();
            case 35:
                parcel.readString();
                throw new AssertionError();
            case 36:
                throw new AssertionError();
            case 37:
                fb fbVar = (fb) this.a.get();
                i3 = fbVar != null ? fbVar.h : -1;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 38:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                parcel.readInt();
                throw new AssertionError();
            case 40:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 41:
                throw new AssertionError();
            case 42:
                parcel.readInt();
                throw new AssertionError();
            case 43:
                throw new AssertionError();
            case 44:
                parcel.readInt();
                throw new AssertionError();
            case 45:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 46:
                parcel.readInt();
                throw new AssertionError();
            case 47:
                fb fbVar2 = (fb) this.a.get();
                i3 = fbVar2 != null ? fbVar2.i : -1;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 48:
                parcel.readInt();
                throw new AssertionError();
            case 49:
                parcel.readFloat();
                throw new AssertionError();
            case 50:
                parcel2.writeNoException();
                nj.d(parcel2, null);
                return true;
            case 51:
                throw new AssertionError();
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
