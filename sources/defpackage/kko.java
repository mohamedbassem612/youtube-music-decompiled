package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kko extends kry {
    public static final Parcelable.Creator CREATOR = new kbc(12);
    public final int a;
    public final double b;
    public final int c;
    public final int d;
    public final String e;

    public kko(int i, double d, int i2, int i3, String str) {
        this.a = i;
        this.b = d;
        this.c = i2;
        this.d = i3;
        this.e = str;
    }

    public final int hashCode() {
        int i = agxm.b;
        agxk agxkVarF = agxy.a.f();
        agxkVarF.k(this.a);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(this.b);
        agxx agxxVar = (agxx) agxkVarF;
        agxxVar.b(4, (int) jDoubleToRawLongBits);
        agxxVar.b(4, jDoubleToRawLongBits >>> 32);
        agxkVarF.k(this.c);
        agxkVarF.k(this.d);
        String str = this.e;
        if (str != null) {
            agxkVarF.i(str, StandardCharsets.UTF_8);
        }
        return ((agxg) agxkVarF.o()).a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, i2);
        ksy.j(parcel, 2, this.b);
        ksy.l(parcel, 3, this.c);
        ksy.l(parcel, 4, this.d);
        ksy.B(parcel, 5, this.e);
        ksy.h(parcel, iG);
    }
}
