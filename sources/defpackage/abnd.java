package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abnd implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapl(3);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    @Deprecated
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final abnq j;
    public final aboa k;

    public abnd(Parcel parcel) {
        aboa aboaVar;
        this.a = parcel.readInt() == 1;
        this.b = parcel.readInt() == 1;
        this.c = parcel.readInt() == 1;
        this.d = parcel.readInt() == 1;
        this.e = parcel.readInt() == 1;
        this.g = parcel.readInt() == 1;
        this.h = parcel.readInt() == 1;
        this.i = parcel.readInt() == 1;
        int i = parcel.readInt();
        this.j = (i < 0 || (i >> 3) > 0) ? new abnq() : new abnq(i);
        int i2 = parcel.readInt();
        aboa[] aboaVarArrValues = aboa.values();
        int length = aboaVarArrValues.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                aboaVar = aboa.DEFAULT_VALUE;
                break;
            }
            aboaVar = aboaVarArrValues[i3];
            if (aboaVar.c == i2) {
                break;
            } else {
                i3++;
            }
        }
        this.k = aboaVar;
        this.f = parcel.readInt() == 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j.a);
        parcel.writeInt(this.k.c);
        parcel.writeInt(this.f ? 1 : 0);
    }

    public abnd(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, abnq abnqVar, aboa aboaVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = z6;
        this.j = abnqVar;
        this.k = aboaVar;
    }
}
