package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class em extends Binder implements en {
    private final WeakReference a;

    public em(et etVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(etVar);
    }

    @Override // defpackage.en
    public final void a(PlaybackStateCompat playbackStateCompat) {
        et etVar = (et) this.a.get();
        if (etVar != null) {
            etVar.d(2, playbackStateCompat, null);
        }
    }

    @Override // defpackage.en
    public final void b(int i) {
        et etVar = (et) this.a.get();
        if (etVar != null) {
            etVar.d(9, Integer.valueOf(i), null);
        }
    }

    @Override // defpackage.en
    public final void c(int i) {
        et etVar = (et) this.a.get();
        if (etVar != null) {
            etVar.d(12, Integer.valueOf(i), null);
        }
    }

    public void d(Bundle bundle) {
        et etVar = (et) this.a.get();
        if (etVar != null) {
            etVar.d(7, bundle, null);
        }
    }

    public void e(MediaMetadataCompat mediaMetadataCompat) {
        et etVar = (et) this.a.get();
        if (etVar != null) {
            etVar.d(3, mediaMetadataCompat, null);
        }
    }

    public void f(List list) {
        et etVar = (et) this.a.get();
        if (etVar != null) {
            etVar.d(5, list, null);
        }
    }

    public void g(CharSequence charSequence) {
        et etVar = (et) this.a.get();
        if (etVar != null) {
            etVar.d(6, charSequence, null);
        }
    }

    public void h() {
        et etVar = (et) this.a.get();
        if (etVar != null) {
            etVar.d(8, null, null);
        }
    }

    public void i(ParcelableVolumeInfo parcelableVolumeInfo) {
        et etVar = (et) this.a.get();
        if (etVar != null) {
            etVar.d(4, parcelableVolumeInfo != null ? new fdr(parcelableVolumeInfo.b) : null, null);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i) {
            case 1:
                String string = parcel.readString();
                Bundle bundle = (Bundle) ed.b(parcel, Bundle.CREATOR);
                et etVar = (et) this.a.get();
                if (etVar != null) {
                    etVar.d(1, string, bundle);
                }
                return true;
            case 2:
                h();
                return true;
            case 3:
                a((PlaybackStateCompat) ed.b(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                e((MediaMetadataCompat) ed.b(parcel, MediaMetadataCompat.CREATOR));
                return true;
            case 5:
                f(parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR));
                return true;
            case 6:
                g((CharSequence) ed.b(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                return true;
            case 7:
                d((Bundle) ed.b(parcel, Bundle.CREATOR));
                return true;
            case 8:
                i((ParcelableVolumeInfo) ed.b(parcel, ParcelableVolumeInfo.CREATOR));
                return true;
            case 9:
                b(parcel.readInt());
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                boolean z = parcel.readInt() != 0;
                et etVar2 = (et) this.a.get();
                if (etVar2 != null) {
                    etVar2.d(11, Boolean.valueOf(z), null);
                }
                return true;
            case 12:
                c(parcel.readInt());
                return true;
            case 13:
                et etVar3 = (et) this.a.get();
                if (etVar3 != null) {
                    etVar3.d(13, null, null);
                    return true;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
