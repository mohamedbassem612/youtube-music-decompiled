package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dtr;
import defpackage.eq;
import defpackage.fh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator CREATOR = new fh(1);
    public final Object b;
    public eq c;
    public final Object a = new Object();
    public dtr d = null;

    public MediaSessionCompat$Token(Object obj, eq eqVar) {
        this.b = obj;
        this.c = eqVar;
    }

    public static MediaSessionCompat$Token b(Object obj, eq eqVar) {
        if (obj != null) {
            return new MediaSessionCompat$Token(obj, eqVar);
        }
        return null;
    }

    public final eq a() {
        eq eqVar;
        synchronized (this.a) {
            eqVar = this.c;
        }
        return eqVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaSessionCompat$Token) {
            MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
            Object obj2 = this.b;
            if (obj2 != null) {
                Object obj3 = mediaSessionCompat$Token.b;
                if (obj3 != null) {
                    return obj2.equals(obj3);
                }
            } else if (mediaSessionCompat$Token.b == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
