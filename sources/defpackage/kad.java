package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kad extends kry {
    public static final Parcelable.Creator CREATOR = new jys(10);
    public final float a;
    public final float b;
    public final float c;

    public kad(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kad) {
            kad kadVar = (kad) obj;
            if (this.a == kadVar.a && this.b == kadVar.b && this.c == kadVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float f = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.k(parcel, 2, f);
        ksy.k(parcel, 3, this.b);
        ksy.k(parcel, 4, this.c);
        ksy.h(parcel, iG);
    }
}
