package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kpo extends kry {
    public static final Parcelable.Creator CREATOR = new kpm(3);
    final int a;
    public final Uri b;
    public final int c;
    public final int d;

    public kpo(Uri uri, int i, int i2) {
        this(1, uri, i, i2);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof kpo)) {
            kpo kpoVar = (kpo) obj;
            if (Objects.equals(this.b, kpoVar.b) && this.c == kpoVar.c && this.d == kpoVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.c), Integer.valueOf(this.d), this.b.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, this.a);
        ksy.A(parcel, 2, this.b, i);
        ksy.l(parcel, 3, this.c);
        ksy.l(parcel, 4, this.d);
        ksy.h(parcel, iG);
    }

    public kpo(int i, Uri uri, int i2, int i3) {
        this.a = i;
        this.b = uri;
        this.c = i2;
        this.d = i3;
    }
}
