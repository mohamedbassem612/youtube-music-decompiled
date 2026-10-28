package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kbb extends kry {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final int c;

    static {
        new khn("VideoInfo", (String) null);
        CREATOR = new kbc(0);
    }

    public kbb(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kbb) {
            kbb kbbVar = (kbb) obj;
            if (this.b == kbbVar.b && this.a == kbbVar.a && this.c == kbbVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Integer.valueOf(this.a), Integer.valueOf(this.c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 2, this.a);
        ksy.l(parcel, 3, this.b);
        ksy.l(parcel, 4, this.c);
        ksy.h(parcel, iG);
    }
}
