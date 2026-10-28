package defpackage;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class q extends Number implements Comparable {
    private static final long serialVersionUID = -4756200506571685661L;

    @Deprecated
    public final double a;

    @Deprecated
    public final int b;

    @Deprecated
    public final int c;

    @Deprecated
    public final long d;

    @Deprecated
    public final long e;

    @Deprecated
    public final long f;

    @Deprecated
    public final boolean g;

    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    @Deprecated
    public q(double d, int i) {
        int iRound;
        double d2 = i;
        int i2 = 0;
        if (i == 0) {
            iRound = 0;
        } else {
            double d3 = d < 0.0d ? -d : d;
            int iPow = (int) Math.pow(10.0d, d2);
            iRound = (int) (Math.round(d3 * ((double) iPow)) % ((long) iPow));
        }
        int i3 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
        this.g = i3 >>> 31;
        long j = iRound;
        this.a = i3 < 0 ? -d : d;
        this.b = i;
        this.d = j;
        this.f = d > 1.0E18d ? 1000000000000000000L : (long) d;
        long j2 = 0;
        if (j != 0) {
            while (j % 10 == 0) {
                j /= 10;
                i--;
            }
            i2 = i;
            j2 = j;
        }
        this.e = j2;
        this.c = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws NotSerializableException {
        throw new NotSerializableException();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws NotSerializableException {
        throw new NotSerializableException();
    }

    @Override // java.lang.Comparable
    @Deprecated
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        q qVar = (q) obj;
        long j = qVar.f;
        long j2 = this.f;
        if (j2 == j) {
            double d = this.a;
            double d2 = qVar.a;
            if (d == d2) {
                int i = this.b;
                int i2 = qVar.b;
                if (i == i2) {
                    long j3 = this.d - qVar.d;
                    if (j3 == 0) {
                        return 0;
                    }
                    if (j3 >= 0) {
                        return 1;
                    }
                } else if (i >= i2) {
                    return 1;
                }
            } else if (d >= d2) {
                return 1;
            }
        } else if (j2 >= j) {
            return 1;
        }
        return -1;
    }

    @Override // java.lang.Number
    @Deprecated
    public final double doubleValue() {
        boolean z = this.g;
        double d = this.a;
        return z ? -d : d;
    }

    @Deprecated
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj != this) {
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            if (this.a != qVar.a || this.b != qVar.b || this.d != qVar.d) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Number
    @Deprecated
    public final float floatValue() {
        return (float) this.a;
    }

    @Deprecated
    public final int hashCode() {
        return (int) (this.d + ((long) ((this.b + ((int) (this.a * 37.0d))) * 37)));
    }

    @Override // java.lang.Number
    @Deprecated
    public final int intValue() {
        return (int) this.f;
    }

    @Override // java.lang.Number
    @Deprecated
    public final long longValue() {
        return this.f;
    }

    @Deprecated
    public final String toString() {
        return String.format("%." + this.b + 'f', Double.valueOf(this.a));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public q(String str) {
        double d = Double.parseDouble(str);
        String strTrim = str.trim();
        int iIndexOf = strTrim.indexOf(46) + 1;
        this(d, iIndexOf == 0 ? 0 : strTrim.length() - iIndexOf);
    }
}
