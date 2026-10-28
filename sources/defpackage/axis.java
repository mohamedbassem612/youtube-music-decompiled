package defpackage;

import org.chromium.base.AndroidInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axis {
    public static final /* synthetic */ int a = 0;

    static {
        "0123456789abcdef".getBytes(awtd.a).getClass();
    }

    public static final long a(axig axigVar, axii axiiVar, long j, long j2, int i) {
        axio axioVar;
        long j3 = i;
        AndroidInfo.c(axiiVar.b(), 0L, j3);
        if (i <= 0) {
            throw new IllegalArgumentException("byteCount == 0");
        }
        long j4 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(a.bS(j, "fromIndex < 0: "));
        }
        if (j > j2) {
            throw new IllegalArgumentException(a.cr(j2, j, "fromIndex > toIndex: ", " > "));
        }
        long j5 = axigVar.b;
        long j6 = j2 > j5 ? j5 : j2;
        if (j != j6 && (axioVar = axigVar.a) != null) {
            if (j5 - j < j) {
                while (j5 > j) {
                    axioVar = axioVar.g;
                    axioVar.getClass();
                    j5 -= (long) (axioVar.c - axioVar.b);
                }
                if (axioVar != null) {
                    byte[] bArr = axiiVar.b;
                    byte b = bArr[0];
                    long jMin = Math.min(j6, (axigVar.b - j3) + 1);
                    long j7 = j5;
                    long j8 = j;
                    while (j7 < jMin) {
                        byte[] bArr2 = axioVar.a;
                        int iMin = (int) Math.min(axioVar.c, (((long) axioVar.b) + jMin) - j7);
                        int i2 = (int) ((((long) axioVar.b) + j8) - j7);
                        while (i2 < iMin) {
                            int i3 = i2 + 1;
                            if (bArr2[i2] == b && b(axioVar, i3, bArr, i)) {
                                return ((long) (i2 - axioVar.b)) + j7;
                            }
                            i2 = i3;
                        }
                        j7 += (long) (axioVar.c - axioVar.b);
                        axioVar = axioVar.f;
                        axioVar.getClass();
                        j8 = j7;
                    }
                }
            } else {
                while (true) {
                    long j9 = ((long) (axioVar.c - axioVar.b)) + j4;
                    if (j9 > j) {
                        break;
                    }
                    axioVar = axioVar.f;
                    axioVar.getClass();
                    j4 = j9;
                }
                if (axioVar != null) {
                    byte[] bArr3 = axiiVar.b;
                    byte b2 = bArr3[0];
                    long jMin2 = Math.min(j6, (axigVar.b - j3) + 1);
                    long j10 = j4;
                    long j11 = j;
                    while (j10 < jMin2) {
                        byte[] bArr4 = axioVar.a;
                        int iMin2 = (int) Math.min(axioVar.c, (((long) axioVar.b) + jMin2) - j10);
                        int i4 = (int) ((((long) axioVar.b) + j11) - j10);
                        while (i4 < iMin2) {
                            int i5 = i4 + 1;
                            if (bArr4[i4] == b2 && b(axioVar, i5, bArr3, i)) {
                                return ((long) (i4 - axioVar.b)) + j10;
                            }
                            i4 = i5;
                        }
                        j10 += (long) (axioVar.c - axioVar.b);
                        axioVar = axioVar.f;
                        axioVar.getClass();
                        j11 = j10;
                    }
                }
            }
        }
        return -1L;
    }

    public static final boolean b(axio axioVar, int i, byte[] bArr, int i2) {
        axioVar.getClass();
        bArr.getClass();
        byte[] bArr2 = axioVar.a;
        int i3 = axioVar.c;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                axioVar = axioVar.f;
                axioVar.getClass();
                byte[] bArr3 = axioVar.a;
                int i5 = axioVar.b;
                i3 = axioVar.c;
                bArr2 = bArr3;
                i = i5;
            }
            if (bArr2[i] != bArr[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
