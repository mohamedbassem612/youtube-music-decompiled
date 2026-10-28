package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class qtt implements Parcelable {
    public static final Parcelable.Creator CREATOR = new pyc(4);
    public final qtu a;
    public final qty b;
    private final List c = new CopyOnWriteArrayList();

    public qtt(Parcel parcel) {
        this.a = (qtu) parcel.readParcelable(qtu.class.getClassLoader());
        this.b = (qty) parcel.readParcelable(qty.class.getClassLoader());
    }

    public final double a() {
        return this.a.p;
    }

    public final double b() {
        return this.a.q;
    }

    public final double c() {
        return this.a.r;
    }

    public final double d() {
        return this.a.o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public final void e(double d, double d2) {
        ahno.F(d >= 0.0d && d < 1.0d);
        ahno.F(d2 >= 0.0d && d2 < 1.0d);
        ahno.F(((d + d2) > 1.0d ? 1 : ((d + d2) == 1.0d ? 0 : -1)) >>> 31);
        qtu qtuVar = this.a;
        qtuVar.q = d;
        qtuVar.r = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qtt) {
            qtt qttVar = (qtt) obj;
            if (afxw.l(this.b, qttVar.b) && afxw.l(this.c, qttVar.c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public final void f(double d, double d2) {
        ahno.F(d >= 0.0d && d < 1.0d);
        ahno.F(d2 >= 0.0d && d2 < 1.0d);
        ahno.F(((d + d2) > 1.0d ? 1 : ((d + d2) == 1.0d ? 0 : -1)) >>> 31);
        qtu qtuVar = this.a;
        qtuVar.o = d;
        qtuVar.p = d2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public final String toString() {
        return nqv.i(getClass().getName(), "videoMetaData=".concat(String.valueOf(String.valueOf(this.b))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }

    public qtt(qtu qtuVar, qty qtyVar) {
        qtuVar.getClass();
        this.a = qtuVar;
        qtyVar.getClass();
        this.b = qtyVar;
    }

    public qtt(qty qtyVar) {
        this.b = qtyVar;
        this.a = new qtu(qtyVar);
    }
}
