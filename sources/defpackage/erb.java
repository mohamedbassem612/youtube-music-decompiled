package defpackage;

import j$.util.DesugarCollections;
import java.io.InputStream;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class erb {
    public final int a;
    public final int b;
    public final Object c;
    public final Object d;

    public erb(erb erbVar) {
        float[] fArr = (float[]) erbVar.d;
        this.a = fArr.length / 3;
        this.d = bvo.d(fArr);
        this.c = bvo.d((float[]) erbVar.c);
        int i = erbVar.b;
        this.b = i != 1 ? i != 2 ? 4 : 6 : 5;
    }

    public static erb b(bwb bwbVar) throws bsz {
        int iN;
        int iN2;
        int i;
        int i2;
        char c;
        int i3;
        int i4 = 1;
        try {
            if (bwbVar.i() != 0) {
                throw new bsz("Unsupported VVC version", null, true, 1);
            }
            int iN3 = bwbVar.n();
            int i5 = ((iN3 >> 1) & 3) + 1;
            char c2 = 2;
            String str = "L";
            if ((iN3 & 1) != 0) {
                bwbVar.Q(1);
                int iN4 = bwbVar.n() >> 4;
                iN = bwbVar.n() >> 5;
                int iN5 = bwbVar.n() & 63;
                int iN6 = bwbVar.n();
                i = iN6 >> 1;
                str = (iN6 & 1) != 0 ? "H" : "L";
                iN2 = bwbVar.n();
                bwbVar.Q(iN5);
                int i6 = iN4 & 7;
                if (i6 > 1) {
                    int iN7 = bwbVar.n();
                    for (int i7 = 0; i7 < i6 - 1; i7++) {
                        if (((iN7 >> (7 - i7)) & 1) != 0) {
                            bwbVar.Q(1);
                        }
                    }
                }
                bwbVar.Q(bwbVar.n() << 2);
                bwbVar.Q(6);
            } else {
                iN = 0;
                iN2 = 0;
                i = 0;
            }
            int iN8 = bwbVar.n();
            int i8 = bwbVar.c;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                i2 = 12;
                c = c2;
                i3 = 13;
                if (i9 >= iN8) {
                    break;
                }
                int i11 = i4;
                int iN9 = bwbVar.n() & 31;
                int iS = (iN9 == 13 || iN9 == 12) ? i11 : bwbVar.s();
                for (int i12 = 0; i12 < iS; i12++) {
                    int iS2 = bwbVar.s();
                    i10 += iS2 + 4;
                    bwbVar.Q(iS2);
                }
                i9++;
                c2 = c;
                i4 = i11;
            }
            int i13 = i4;
            bwbVar.P(i8);
            byte[] bArr = new byte[i10];
            int i14 = 0;
            int i15 = 0;
            while (i14 < iN8) {
                int iN10 = bwbVar.n() & 31;
                int iS3 = (iN10 == i3 || iN10 == i2) ? i13 : bwbVar.s();
                for (int i16 = 0; i16 < iS3; i16++) {
                    int iS4 = bwbVar.s();
                    System.arraycopy(bxf.a, 0, bArr, i15, 4);
                    int i17 = i15 + 4;
                    bwbVar.K(bArr, i17, iS4);
                    i15 = i17 + iS4;
                }
                i14++;
                i3 = 13;
                i2 = 12;
            }
            Locale locale = Locale.US;
            Integer numValueOf = Integer.valueOf(i);
            Integer numValueOf2 = Integer.valueOf(iN2);
            Object[] objArr = new Object[3];
            objArr[0] = numValueOf;
            objArr[i13] = str;
            objArr[c] = numValueOf2;
            return new erb(agke.q(bArr), i5, String.format(locale, "vvc1.%d.%s%d", objArr), iN + 8);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new bsz("Error parsing VVC configuration", e, true, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final List a() {
        return DesugarCollections.unmodifiableList(this.d);
    }

    private erb(List list, int i, String str, int i2) {
        this.d = list;
        this.a = i;
        this.c = str;
        this.b = i2;
    }

    public erb(int i, float[] fArr, float[] fArr2, int i2) {
        this.a = i;
        ahno.F((((long) fArr.length) << 1) == ((long) fArr2.length) * 3);
        this.d = fArr;
        this.c = fArr2;
        this.b = i2;
    }

    public erb(int i, List list, int i2, InputStream inputStream) {
        this.a = i;
        this.d = list;
        this.b = i2;
        this.c = inputStream;
    }
}
