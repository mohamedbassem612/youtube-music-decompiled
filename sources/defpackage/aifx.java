package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aifx {
    public static final /* synthetic */ int a = 0;
    private static volatile int b = 100;

    static int a(byte[] bArr, int i, aifw aifwVar) {
        int iD = d(bArr, i, bArr.length, aifwVar);
        int i2 = aifwVar.a;
        if (i2 == 0) {
            aifwVar.c = aigj.d;
            return iD;
        }
        aigj aigjVar = aigj.d;
        try {
            aifwVar.c = aigj.H(bArr, iD, i2);
            return iD + i2;
        } catch (aiik e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    static int b(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    static int c(aijg aijgVar, byte[] bArr, int i, int i2, int i3, aifw aifwVar) {
        Object objE = aijgVar.e();
        int iW = w(objE, aijgVar, bArr, i, i2, i3, aifwVar);
        aijgVar.g(objE);
        aifwVar.c = objE;
        return iW;
    }

    static int d(byte[] bArr, int i, int i2, aifw aifwVar) {
        int iS = s(bArr, i, aifwVar);
        int i3 = aifwVar.a;
        if (i3 < 0) {
            throw new aiik("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 <= i2 - iS) {
            return iS;
        }
        throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int e(aijg aijgVar, byte[] bArr, int i, int i2, aifw aifwVar) {
        Object objE = aijgVar.e();
        int iX = x(objE, aijgVar, bArr, i, i2, aifwVar);
        aijgVar.g(objE);
        aifwVar.c = objE;
        return iX;
    }

    static int f(aijg aijgVar, int i, byte[] bArr, int i2, int i3, aiie aiieVar, aifw aifwVar) {
        int iE = e(aijgVar, bArr, i2, i3, aifwVar);
        aiieVar.add(aifwVar.c);
        while (iE < i3) {
            int iS = s(bArr, iE, aifwVar);
            if (i != aifwVar.a) {
                break;
            }
            iE = e(aijgVar, bArr, iS, i3, aifwVar);
            aiieVar.add(aifwVar.c);
        }
        return iE;
    }

    static int g(byte[] bArr, int i, aiie aiieVar, aifw aifwVar) {
        aiga aigaVar = (aiga) aiieVar;
        int iD = d(bArr, i, bArr.length, aifwVar);
        int i2 = aifwVar.a + iD;
        while (iD < i2) {
            iD = v(bArr, iD, aifwVar);
            aigaVar.f(aifwVar.b != 0);
        }
        if (iD == i2) {
            return iD;
        }
        throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int h(byte[] bArr, int i, aiie aiieVar, aifw aifwVar) {
        aigt aigtVar = (aigt) aiieVar;
        int iD = d(bArr, i, bArr.length, aifwVar);
        int i2 = aifwVar.a;
        int i3 = iD + i2;
        int i4 = aigtVar.d + (i2 / 8);
        int length = aigtVar.c.length;
        if (i4 > length) {
            if (length == 0) {
                aigtVar.c = new double[Math.max(i4, 10)];
            } else {
                while (length < i4) {
                    length = Math.max(((length * 3) / 2) + 1, 10);
                }
                aigtVar.c = Arrays.copyOf(aigtVar.c, length);
            }
        }
        while (iD < i3) {
            aigtVar.g(Double.longBitsToDouble(a.f(bArr, iD)));
            iD += 8;
        }
        if (iD == i3) {
            return iD;
        }
        throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int i(byte[] bArr, int i, aiie aiieVar, aifw aifwVar) {
        aiho aihoVar = (aiho) aiieVar;
        int iD = d(bArr, i, bArr.length, aifwVar);
        int i2 = aifwVar.a;
        int i3 = iD + i2;
        int i4 = aihoVar.c + (i2 / 4);
        int length = aihoVar.b.length;
        if (i4 > length) {
            if (length == 0) {
                aihoVar.b = new int[Math.max(i4, 10)];
            } else {
                while (length < i4) {
                    length = Math.max(((length * 3) / 2) + 1, 10);
                }
                aihoVar.b = Arrays.copyOf(aihoVar.b, length);
            }
        }
        while (iD < i3) {
            aihoVar.h(b(bArr, iD));
            iD += 4;
        }
        if (iD == i3) {
            return iD;
        }
        throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int j(byte[] bArr, int i, aiie aiieVar, aifw aifwVar) {
        aiio aiioVar = (aiio) aiieVar;
        int iD = d(bArr, i, bArr.length, aifwVar);
        int i2 = aifwVar.a;
        int i3 = iD + i2;
        int i4 = aiioVar.c + (i2 / 8);
        int length = aiioVar.b.length;
        if (i4 > length) {
            if (length == 0) {
                aiioVar.b = new long[Math.max(i4, 10)];
            } else {
                while (length < i4) {
                    length = Math.max(((length * 3) / 2) + 1, 10);
                }
                aiioVar.b = Arrays.copyOf(aiioVar.b, length);
            }
        }
        while (iD < i3) {
            aiioVar.g(a.f(bArr, iD));
            iD += 8;
        }
        if (iD == i3) {
            return iD;
        }
        throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int k(byte[] bArr, int i, aiie aiieVar, aifw aifwVar) {
        aihc aihcVar = (aihc) aiieVar;
        int iD = d(bArr, i, bArr.length, aifwVar);
        int i2 = aifwVar.a;
        int i3 = iD + i2;
        int i4 = aihcVar.d + (i2 / 4);
        int length = aihcVar.c.length;
        if (i4 > length) {
            if (length == 0) {
                aihcVar.c = new float[Math.max(i4, 10)];
            } else {
                while (length < i4) {
                    length = Math.max(((length * 3) / 2) + 1, 10);
                }
                aihcVar.c = Arrays.copyOf(aihcVar.c, length);
            }
        }
        while (iD < i3) {
            aihcVar.h(Float.intBitsToFloat(b(bArr, iD)));
            iD += 4;
        }
        if (iD == i3) {
            return iD;
        }
        throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int l(byte[] bArr, int i, aiie aiieVar, aifw aifwVar) {
        aiho aihoVar = (aiho) aiieVar;
        int iD = d(bArr, i, bArr.length, aifwVar);
        int i2 = aifwVar.a + iD;
        while (iD < i2) {
            iD = s(bArr, iD, aifwVar);
            int i3 = aifwVar.a;
            int i4 = aigm.l;
            aihoVar.h((i3 >>> 1) ^ (-(i3 & 1)));
        }
        if (iD == i2) {
            return iD;
        }
        throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int m(byte[] bArr, int i, aiie aiieVar, aifw aifwVar) {
        aiio aiioVar = (aiio) aiieVar;
        int iD = d(bArr, i, bArr.length, aifwVar);
        int i2 = aifwVar.a + iD;
        while (iD < i2) {
            iD = v(bArr, iD, aifwVar);
            long j = aifwVar.b;
            int i3 = aigm.l;
            aiioVar.g((j >>> 1) ^ (-(j & 1)));
        }
        if (iD == i2) {
            return iD;
        }
        throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int n(byte[] bArr, int i, aiie aiieVar, aifw aifwVar) {
        aiho aihoVar = (aiho) aiieVar;
        int iD = d(bArr, i, bArr.length, aifwVar);
        int i2 = aifwVar.a + iD;
        while (iD < i2) {
            iD = s(bArr, iD, aifwVar);
            aihoVar.h(aifwVar.a);
        }
        if (iD == i2) {
            return iD;
        }
        throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int o(byte[] bArr, int i, aiie aiieVar, aifw aifwVar) {
        aiio aiioVar = (aiio) aiieVar;
        int iD = d(bArr, i, bArr.length, aifwVar);
        int i2 = aifwVar.a + iD;
        while (iD < i2) {
            iD = v(bArr, iD, aifwVar);
            aiioVar.g(aifwVar.b);
        }
        if (iD == i2) {
            return iD;
        }
        throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int p(byte[] bArr, int i, aifw aifwVar) {
        int iD = d(bArr, i, bArr.length, aifwVar);
        int i2 = aifwVar.a;
        if (i2 == 0) {
            aifwVar.c = "";
            return iD;
        }
        aifwVar.c = new String(bArr, iD, i2, StandardCharsets.UTF_8);
        return iD + i2;
    }

    static int q(byte[] bArr, int i, aifw aifwVar) {
        int iD = d(bArr, i, bArr.length, aifwVar);
        int i2 = aifwVar.a;
        if (i2 == 0) {
            aifwVar.c = "";
            return iD;
        }
        aifwVar.c = ahng.aI(bArr, iD, i2);
        return iD + i2;
    }

    static int r(int i, byte[] bArr, int i2, int i3, aijt aijtVar, aifw aifwVar) {
        if ((i >>> 3) == 0) {
            throw new aiik("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iV = v(bArr, i2, aifwVar);
            aijtVar.f(i, Long.valueOf(aifwVar.b));
            return iV;
        }
        if (i4 == 1) {
            aijtVar.f(i, Long.valueOf(a.f(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iD = d(bArr, i2, bArr.length, aifwVar);
            int i5 = aifwVar.a;
            if (i5 == 0) {
                aijtVar.f(i, aigj.d);
            } else {
                aigj aigjVar = aigj.d;
                try {
                    aijtVar.f(i, aigj.H(bArr, iD, i5));
                } catch (aiik e) {
                    throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                }
            }
            return i5 + iD;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new aiik("Protocol message contained an invalid tag (zero).");
            }
            aijtVar.f(i, Integer.valueOf(b(bArr, i2)));
            return i2 + 4;
        }
        aijt aijtVar2 = new aijt();
        int i6 = (i & (-8)) | 4;
        int i7 = aifwVar.e + 1;
        aifwVar.e = i7;
        if (i7 >= b) {
            throw new aiik("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (i2 < i3) {
            int iS = s(bArr, i2, aifwVar);
            int i9 = aifwVar.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iS;
                break;
            }
            i2 = r(i9, bArr, iS, i3, aijtVar2, aifwVar);
            i8 = i9;
        }
        aifwVar.e--;
        if (i2 > i3 || i8 != i6) {
            throw new aiik("Failed to parse the message.");
        }
        aijtVar.f(i, aijtVar2);
        return i2;
    }

    static int s(byte[] bArr, int i, aifw aifwVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return t(b2, bArr, i2, aifwVar);
        }
        aifwVar.a = b2;
        return i2;
    }

    static int t(int i, byte[] bArr, int i2, aifw aifwVar) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b2 >= 0) {
            aifwVar.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & 127) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            aifwVar.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & 127) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            aifwVar.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & 127) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            aifwVar.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                aifwVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int u(int i, byte[] bArr, int i2, int i3, aiie aiieVar, aifw aifwVar) {
        aiho aihoVar = (aiho) aiieVar;
        int iS = s(bArr, i2, aifwVar);
        aihoVar.h(aifwVar.a);
        while (iS < i3) {
            int iS2 = s(bArr, iS, aifwVar);
            if (i != aifwVar.a) {
                break;
            }
            iS = s(bArr, iS2, aifwVar);
            aihoVar.h(aifwVar.a);
        }
        return iS;
    }

    static int v(byte[] bArr, int i, aifw aifwVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            aifwVar.b = j;
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
            aifwVar.b = j2;
        }
        return i2;
    }

    static int w(Object obj, aijg aijgVar, byte[] bArr, int i, int i2, int i3, aifw aifwVar) {
        int i4 = aifwVar.e + 1;
        aifwVar.e = i4;
        z(i4);
        int iC = ((aiiu) aijgVar).c(obj, bArr, i, i2, i3, aifwVar);
        aifwVar.e--;
        aifwVar.c = obj;
        return iC;
    }

    static int x(Object obj, aijg aijgVar, byte[] bArr, int i, int i2, aifw aifwVar) {
        int iD = d(bArr, i, i2, aifwVar);
        int i3 = aifwVar.a;
        int i4 = aifwVar.e + 1;
        aifwVar.e = i4;
        if (i4 >= b) {
            throw new aiik("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i5 = i3 + iD;
        aijgVar.j(obj, bArr, iD, i5, aifwVar);
        aifwVar.e--;
        aifwVar.c = obj;
        return i5;
    }

    static int y(int i, byte[] bArr, int i2, int i3, aifw aifwVar) {
        if ((i >>> 3) == 0) {
            throw new aiik("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return v(bArr, i2, aifwVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return d(bArr, i2, bArr.length, aifwVar) + aifwVar.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new aiik("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = aifwVar.e + 1;
        aifwVar.e = i6;
        z(i6);
        int i7 = 0;
        while (i2 < i3) {
            i2 = s(bArr, i2, aifwVar);
            i7 = aifwVar.a;
            if (i7 == i5) {
                break;
            }
            i2 = y(i7, bArr, i2, i3, aifwVar);
        }
        aifwVar.e--;
        if (i2 > i3 || i7 != i5) {
            throw new aiik("Failed to parse the message.");
        }
        return i2;
    }

    private static void z(int i) throws aiik {
        if (i >= b) {
            throw new aiik("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
