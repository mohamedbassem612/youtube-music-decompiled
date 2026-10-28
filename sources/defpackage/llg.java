package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class llg extends kry implements Comparable {
    public static final Parcelable.Creator CREATOR = new kvu(7);
    public final String a;
    public final long b;
    public final boolean c;
    public final double d;
    public final String e;
    public final byte[] f;
    public final int g;
    public final int h;
    public final int i;

    public llg(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2, int i3) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = d;
        this.e = str2;
        this.f = bArr;
        this.g = i;
        this.h = i2;
        this.i = i3;
    }

    private static int b(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i != i2 ? 1 : 0;
    }

    final void a(StringBuilder sb) {
        sb.append("Flag(");
        String str = this.a;
        sb.append(str);
        sb.append(", ");
        int i = this.g;
        if (i == 1) {
            sb.append(this.b);
        } else if (i == 2) {
            sb.append(this.c);
        } else if (i == 3) {
            sb.append(this.d);
        } else if (i == 4) {
            sb.append('\'');
            String str2 = this.e;
            kro.l(str2);
            sb.append(str2);
            sb.append('\'');
        } else {
            if (i != 5) {
                throw new AssertionError(a.cg(i, str, "Invalid type: ", ", "));
            }
            sb.append('\'');
            byte[] bArr = this.f;
            kro.l(bArr);
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append('\'');
        }
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        sb.append(this.i);
        sb.append(')');
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0072, code lost:
    
        if (r6 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007f, code lost:
    
        if (r4 == r6) goto L42;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r7) {
        /*
            r6 = this;
            llg r7 = (defpackage.llg) r7
            java.lang.String r0 = r7.a
            java.lang.String r1 = r6.a
            int r0 = r1.compareTo(r0)
            if (r0 != 0) goto L84
            int r0 = r6.g
            int r1 = r7.g
            int r1 = b(r0, r1)
            if (r1 != 0) goto L7d
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L75
            r4 = 2
            if (r0 == r4) goto L6c
            r4 = 3
            if (r0 == r4) goto L63
            r4 = 4
            if (r0 == r4) goto L54
            r4 = 5
            if (r0 != r4) goto L48
            byte[] r6 = r6.f
            byte[] r7 = r7.f
            if (r6 == r7) goto L81
            if (r6 == 0) goto L7d
            if (r7 == 0) goto L83
        L31:
            int r0 = r7.length
            int r1 = r6.length
            int r3 = java.lang.Math.min(r1, r0)
            if (r2 >= r3) goto L43
            r0 = r6[r2]
            r1 = r7[r2]
            int r0 = r0 - r1
            if (r0 != 0) goto L84
            int r2 = r2 + 1
            goto L31
        L43:
            int r0 = b(r1, r0)
            goto L84
        L48:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.String r7 = "Invalid enum value: "
            java.lang.String r7 = defpackage.a.bR(r0, r7)
            r6.<init>(r7)
            throw r6
        L54:
            java.lang.String r6 = r6.e
            java.lang.String r7 = r7.e
            if (r6 == r7) goto L81
            if (r6 == 0) goto L7d
            if (r7 == 0) goto L83
            int r0 = r6.compareTo(r7)
            goto L84
        L63:
            double r0 = r6.d
            double r6 = r7.d
            int r0 = java.lang.Double.compare(r0, r6)
            goto L84
        L6c:
            boolean r6 = r6.c
            boolean r7 = r7.c
            if (r6 == r7) goto L81
            if (r6 == 0) goto L7d
            goto L83
        L75:
            long r4 = r6.b
            long r6 = r7.b
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L7f
        L7d:
            r0 = r1
            goto L84
        L7f:
            if (r6 != 0) goto L83
        L81:
            r0 = r2
            goto L84
        L83:
            r0 = r3
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llg.compareTo(java.lang.Object):int");
    }

    public final boolean equals(Object obj) {
        int i;
        if (!(obj instanceof llg)) {
            return false;
        }
        llg llgVar = (llg) obj;
        if (!a.ae(this.a, llgVar.a) || (i = this.g) != llgVar.g || this.h != llgVar.h || this.i != llgVar.i) {
            return false;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return a.ae(this.e, llgVar.e);
                    }
                    if (i == 5) {
                        return Arrays.equals(this.f, llgVar.f);
                    }
                    throw new AssertionError(a.bR(i, "Invalid enum value: "));
                }
                if (this.d != llgVar.d) {
                    return false;
                }
            } else if (this.c != llgVar.c) {
                return false;
            }
        } else if (this.b != llgVar.b) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        String str = this.a;
        if (!kvu.b(str)) {
            ksy.B(parcel, 2, str);
        }
        long j = this.b;
        if (j != 0) {
            ksy.m(parcel, 3, j);
        }
        if (this.c) {
            ksy.i(parcel, 4, true);
        }
        double d = this.d;
        if (d != 0.0d) {
            ksy.j(parcel, 5, d);
        }
        String str2 = this.e;
        if (!kvu.b(str2)) {
            ksy.B(parcel, 6, str2);
        }
        byte[] bArr = this.f;
        if (!kvu.b(bArr)) {
            ksy.q(parcel, 7, bArr);
        }
        int i2 = this.g;
        if (!kvu.a(i2)) {
            ksy.l(parcel, 8, i2);
        }
        int i3 = this.h;
        if (!kvu.a(i3)) {
            ksy.l(parcel, 9, i3);
        }
        int i4 = this.i;
        if (!kvu.a(i4)) {
            ksy.l(parcel, 10, i4);
        }
        ksy.h(parcel, iG);
    }
}
