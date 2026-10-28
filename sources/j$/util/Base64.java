package j$.util;

import app.rive.semantics.SemanticState;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public class Base64 {

    /* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
    public static class Decoder {
        public static final int[] a;
        public static final int[] b;
        public static final Decoder c;

        static {
            int[] iArr;
            int[] iArr2 = new int[SemanticState.Hidden];
            a = iArr2;
            Arrays.fill(iArr2, -1);
            int i = 0;
            int i2 = 0;
            while (true) {
                iArr = a;
                if (i2 >= 64) {
                    break;
                }
                iArr[Encoder.c[i2]] = i2;
                i2++;
            }
            iArr[61] = -2;
            int[] iArr3 = new int[SemanticState.Hidden];
            b = iArr3;
            Arrays.fill(iArr3, -1);
            while (true) {
                int[] iArr4 = b;
                if (i >= 64) {
                    iArr4[61] = -2;
                    c = new Decoder();
                    return;
                } else {
                    iArr4[Encoder.d[i]] = i;
                    i++;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00b0 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x00b2 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:41:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:44:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:48:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:50:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:52:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:70:0x00ad A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:74:0x00fd A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00be, code lost:
        
            if (r10 == 18) goto L47;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:48:0x00c6, please report this as an issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public byte[] decode(java.lang.String r21) {
            /*
                Method dump skipped, instruction units count: 325
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.util.Base64.Decoder.decode(java.lang.String):byte[]");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
    public static class Encoder {
        public static final char[] c = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        public static final char[] d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};
        public static final Encoder e = new Encoder(false, true);
        public static final Encoder f = new Encoder(true, true);
        public final boolean a;
        public final boolean b;

        public Encoder(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public String encodeToString(byte[] bArr) {
            int i;
            int length = bArr.length;
            boolean z = this.b;
            if (z) {
                i = ((length + 2) / 3) << 2;
            } else {
                int i2 = length % 3;
                i = ((length / 3) << 2) + (i2 == 0 ? 0 : i2 + 1);
            }
            byte[] bArrCopyOf = new byte[i];
            int length2 = bArr.length;
            char[] cArr = c;
            char[] cArr2 = d;
            boolean z2 = this.a;
            char[] cArr3 = z2 ? cArr2 : cArr;
            int i3 = (length2 / 3) * 3;
            int i4 = 0;
            int i5 = 0;
            while (i4 < i3) {
                int iMin = Math.min(i4 + i3, i3);
                char[] cArr4 = z2 ? cArr2 : cArr;
                int i6 = i4;
                int i7 = i5;
                while (i6 < iMin) {
                    int i8 = i6 + 2;
                    boolean z3 = z2;
                    int i9 = ((bArr[i6] & 255) << 16) | ((bArr[i6 + 1] & 255) << 8);
                    i6 += 3;
                    int i10 = i9 | (bArr[i8] & 255);
                    bArrCopyOf[i7] = (byte) cArr4[(i10 >>> 18) & 63];
                    bArrCopyOf[i7 + 1] = (byte) cArr4[(i10 >>> 12) & 63];
                    int i11 = i7 + 3;
                    bArrCopyOf[i7 + 2] = (byte) cArr4[(i10 >>> 6) & 63];
                    i7 += 4;
                    bArrCopyOf[i11] = (byte) cArr4[i10 & 63];
                    z2 = z3;
                }
                boolean z4 = z2;
                int i12 = ((iMin - i4) / 3) << 2;
                i5 += i12;
                if (i12 == -1 && iMin < length2) {
                    throw null;
                }
                z2 = z4;
                i4 = iMin;
            }
            if (i4 < length2) {
                int i13 = i4 + 1;
                int i14 = bArr[i4] & 255;
                int i15 = i5 + 1;
                bArrCopyOf[i5] = (byte) cArr3[i14 >> 2];
                if (i13 == length2) {
                    int i16 = i5 + 2;
                    bArrCopyOf[i15] = (byte) cArr3[(i14 << 4) & 63];
                    if (z) {
                        int i17 = i5 + 3;
                        bArrCopyOf[i16] = 61;
                        i5 += 4;
                        bArrCopyOf[i17] = 61;
                    } else {
                        i5 = i16;
                    }
                } else {
                    int i18 = bArr[i13] & 255;
                    bArrCopyOf[i15] = (byte) cArr3[((i14 << 4) & 63) | (i18 >> 4)];
                    int i19 = i5 + 3;
                    bArrCopyOf[i5 + 2] = (byte) cArr3[(i18 << 2) & 63];
                    if (z) {
                        i5 += 4;
                        bArrCopyOf[i19] = 61;
                    } else {
                        i5 = i19;
                    }
                }
            }
            if (i5 != i) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
            }
            return new String(bArrCopyOf, 0, 0, bArrCopyOf.length);
        }

        public Encoder withoutPadding() {
            return this.b ? new Encoder(this.a, false) : this;
        }
    }

    public static Encoder getEncoder() {
        return Encoder.e;
    }

    public static Decoder getUrlDecoder() {
        return Decoder.c;
    }

    public static Encoder getUrlEncoder() {
        return Encoder.f;
    }
}
