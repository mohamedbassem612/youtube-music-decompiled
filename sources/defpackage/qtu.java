package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class qtu implements Parcelable {
    public static final Parcelable.Creator CREATOR = new pyc(5);
    final boolean a;
    final long b;
    long c;
    final long d;
    String e;
    long f;
    long g;
    boolean h;
    int i;
    long j;
    Duration k;
    Uri l;
    boolean m;

    @Deprecated
    float n;
    double o;
    double p;
    double q;
    double r;
    float s;
    float t;
    float u;
    float v;

    public qtu(qty qtyVar) {
        Iterator qtxVar;
        int iIntValue;
        long jMax;
        this.h = true;
        this.j = 0L;
        this.k = Duration.ZERO;
        this.b = 1000000L;
        this.c = 0L;
        long j = this.g;
        long j2 = this.f;
        if (j - j2 > 0) {
            this.g = j2;
        }
        long j3 = qtyVar.f;
        int[] iArr = qtyVar.i;
        if (iArr != null) {
            qtxVar = new qts(iArr);
        } else {
            long[] jArr = qtyVar.g;
            if (jArr != null) {
                iIntValue = jArr.length;
            } else {
                Integer num = qtyVar.h;
                iIntValue = num != null ? num.intValue() : 0;
            }
            qtxVar = new qtx(iIntValue);
        }
        if (qtxVar.hasNext()) {
            long jA = qtyVar.a(((Integer) qtxVar.next()).intValue());
            long jMax2 = 0;
            while (qtxVar.hasNext()) {
                long jA2 = qtyVar.a(((Integer) qtxVar.next()).intValue());
                jMax2 = Math.max(jMax2, jA2 - jA);
                jA = jA2;
            }
            jMax = Math.max(jMax2, j3 - jA);
        } else {
            jMax = 0;
        }
        this.a = (j3 > this.b) & (jMax <= 6000000);
        this.d = jMax;
        this.f = 0L;
        long j4 = this.c;
        this.g = j4 > 0 ? Math.min(j3, j4) : j3;
        this.i = 0;
        this.e = null;
        this.j = 0L;
        this.k = Duration.ZERO;
        this.s = 0.3f;
        this.l = null;
        this.t = 0.0f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeInt(this.i);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.l, i);
        parcel.writeLong(this.j);
        parcel.writeFloat(this.n);
        parcel.writeLong(this.d);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
        parcel.writeDouble(this.o);
        parcel.writeDouble(this.p);
        parcel.writeDouble(this.q);
        parcel.writeDouble(this.r);
        parcel.writeFloat(this.s);
        parcel.writeFloat(this.t);
        parcel.writeFloat(this.u);
        parcel.writeFloat(this.v);
        parcel.writeLong(ahbt.a(this.k));
    }

    public qtu(Parcel parcel) {
        this.h = true;
        this.j = 0L;
        this.k = Duration.ZERO;
        this.a = parcel.readByte() != 0;
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.h = parcel.readByte() != 0;
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        this.i = parcel.readInt();
        this.e = parcel.readString();
        this.l = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.j = parcel.readLong();
        this.n = parcel.readFloat();
        this.d = parcel.readLong();
        this.m = parcel.readByte() != 0;
        this.o = parcel.readDouble();
        this.p = parcel.readDouble();
        this.q = parcel.readDouble();
        this.r = parcel.readDouble();
        this.s = parcel.readFloat();
        this.t = parcel.readFloat();
        this.u = parcel.readFloat();
        this.v = parcel.readFloat();
        this.k = Duration.of(parcel.readLong(), ChronoUnit.MICROS);
    }
}
