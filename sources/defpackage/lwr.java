package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lwr {
    public static final /* synthetic */ int a = 0;
    private static volatile int b = 100;

    static double a(byte[] bArr, int i) {
        return Double.longBitsToDouble(a.f(bArr, i));
    }

    static float b(byte[] bArr, int i) {
        return Float.intBitsToFloat(d(bArr, i));
    }

    static int c(byte[] bArr, int i, lwq lwqVar) throws lyh {
        int iJ = j(bArr, i, lwqVar);
        int i2 = lwqVar.a;
        if (i2 < 0) {
            throw new lyh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iJ) {
            throw new lyh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            lwqVar.c = lxa.d;
            return iJ;
        }
        lwqVar.c = lxa.i(bArr, iJ, i2);
        return iJ + i2;
    }

    static int d(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    static int e(lyz lyzVar, byte[] bArr, int i, int i2, int i3, lwq lwqVar) throws lyh {
        Object objE = lyzVar.e();
        int iN = n(objE, lyzVar, bArr, i, i2, i3, lwqVar);
        lyzVar.f(objE);
        lwqVar.c = objE;
        return iN;
    }

    static int f(lyz lyzVar, byte[] bArr, int i, int i2, lwq lwqVar) throws lyh {
        Object objE = lyzVar.e();
        int iO = o(objE, lyzVar, bArr, i, i2, lwqVar);
        lyzVar.f(objE);
        lwqVar.c = objE;
        return iO;
    }

    static int g(lyz lyzVar, int i, byte[] bArr, int i2, int i3, lye lyeVar, lwq lwqVar) throws lyh {
        int iF = f(lyzVar, bArr, i2, i3, lwqVar);
        lyeVar.add(lwqVar.c);
        while (iF < i3) {
            int iJ = j(bArr, iF, lwqVar);
            if (i != lwqVar.a) {
                break;
            }
            iF = f(lyzVar, bArr, iJ, i3, lwqVar);
            lyeVar.add(lwqVar.c);
        }
        return iF;
    }

    static int h(byte[] bArr, int i, lye lyeVar, lwq lwqVar) throws lyh {
        lxu lxuVar = (lxu) lyeVar;
        int iJ = j(bArr, i, lwqVar);
        int i2 = lwqVar.a;
        if (i2 < 0) {
            throw new lyh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iJ) {
            throw new lyh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i3 = i2 + iJ;
        while (iJ < i3) {
            iJ = j(bArr, iJ, lwqVar);
            lxuVar.g(lwqVar.a);
        }
        if (iJ == i3) {
            return iJ;
        }
        throw new lyh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int i(int i, byte[] bArr, int i2, int i3, lzh lzhVar, lwq lwqVar) throws lyh {
        if ((i >>> 3) == 0) {
            throw new lyh("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM = m(bArr, i2, lwqVar);
            lzhVar.d(i, Long.valueOf(lwqVar.b));
            return iM;
        }
        if (i4 == 1) {
            lzhVar.d(i, Long.valueOf(a.f(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iJ = j(bArr, i2, lwqVar);
            int i5 = lwqVar.a;
            if (i5 < 0) {
                throw new lyh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - iJ) {
                throw new lyh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                lzhVar.d(i, lxa.d);
            } else {
                lzhVar.d(i, lxa.i(bArr, iJ, i5));
            }
            return i5 + iJ;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new lyh("Protocol message contained an invalid tag (zero).");
            }
            lzhVar.d(i, Integer.valueOf(d(bArr, i2)));
            return i2 + 4;
        }
        lzh lzhVar2 = new lzh();
        int i6 = (i & (-8)) | 4;
        int i7 = lwqVar.e + 1;
        lwqVar.e = i7;
        q(i7);
        int i8 = 0;
        while (i2 < i3) {
            int iJ2 = j(bArr, i2, lwqVar);
            int i9 = lwqVar.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iJ2;
                break;
            }
            i2 = i(i9, bArr, iJ2, i3, lzhVar2, lwqVar);
            i8 = i9;
        }
        lwqVar.e--;
        if (i2 > i3 || i8 != i6) {
            throw new lyh("Failed to parse the message.");
        }
        lzhVar.d(i, lzhVar2);
        return i2;
    }

    static int j(byte[] bArr, int i, lwq lwqVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return k(b2, bArr, i2, lwqVar);
        }
        lwqVar.a = b2;
        return i2;
    }

    static int k(int i, byte[] bArr, int i2, lwq lwqVar) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b2 >= 0) {
            lwqVar.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & 127) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            lwqVar.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & 127) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            lwqVar.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & 127) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            lwqVar.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                lwqVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int l(int i, byte[] bArr, int i2, int i3, lye lyeVar, lwq lwqVar) {
        lxu lxuVar = (lxu) lyeVar;
        int iJ = j(bArr, i2, lwqVar);
        lxuVar.g(lwqVar.a);
        while (iJ < i3) {
            int iJ2 = j(bArr, iJ, lwqVar);
            if (i != lwqVar.a) {
                break;
            }
            iJ = j(bArr, iJ2, lwqVar);
            lxuVar.g(lwqVar.a);
        }
        return iJ;
    }

    static int m(byte[] bArr, int i, lwq lwqVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            lwqVar.b = j;
        } else {
            byte b2 = bArr[i2];
            long j2 = (j & 127) | (((long) (b2 & 127)) << 7);
            i2 = i + 2;
            int i3 = 7;
            while (b2 < 0) {
                int i4 = i2 + 1;
                byte b3 = bArr[i2];
                i3 += 7;
                j2 |= ((long) (b3 & 127)) << i3;
                i2 = i4;
                b2 = b3;
            }
            lwqVar.b = j2;
        }
        return i2;
    }

    static int n(Object obj, lyz lyzVar, byte[] bArr, int i, int i2, int i3, lwq lwqVar) throws lyh {
        int i4 = lwqVar.e + 1;
        lwqVar.e = i4;
        q(i4);
        int iC = ((lys) lyzVar).c(obj, bArr, i, i2, i3, lwqVar);
        lwqVar.e--;
        lwqVar.c = obj;
        return iC;
    }

    static int o(Object obj, lyz lyzVar, byte[] bArr, int i, int i2, lwq lwqVar) throws lyh {
        int iK = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iK = k(i3, bArr, iK, lwqVar);
            i3 = lwqVar.a;
        }
        int i4 = iK;
        if (i3 < 0 || i3 > i2 - i4) {
            throw new lyh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i5 = lwqVar.e + 1;
        lwqVar.e = i5;
        q(i5);
        int i6 = i4 + i3;
        lyzVar.h(obj, bArr, i4, i6, lwqVar);
        lwqVar.e--;
        lwqVar.c = obj;
        return i6;
    }

    static int p(int i, byte[] bArr, int i2, int i3, lwq lwqVar) throws lyh {
        if ((i >>> 3) == 0) {
            throw new lyh("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return m(bArr, i2, lwqVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return j(bArr, i2, lwqVar) + lwqVar.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new lyh("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = lwqVar.e + 1;
        lwqVar.e = i6;
        q(i6);
        int i7 = 0;
        while (i2 < i3) {
            i2 = j(bArr, i2, lwqVar);
            i7 = lwqVar.a;
            if (i7 == i5) {
                break;
            }
            i2 = p(i7, bArr, i2, i3, lwqVar);
        }
        lwqVar.e--;
        if (i2 > i3 || i7 != i5) {
            throw new lyh("Failed to parse the message.");
        }
        return i2;
    }

    private static void q(int i) throws lyh {
        if (i >= b) {
            throw new lyh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
