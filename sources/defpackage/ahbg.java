package defpackage;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahbg {
    public static final /* synthetic */ int a = 0;
    private static final agdw b = new agdn('.');
    private static final agdw c = new agdn(':');

    static {
    }

    public static InetAddress a(byte[] bArr, String str) {
        int i;
        try {
            InetAddress byAddress = InetAddress.getByAddress(bArr);
            if (str == null) {
                return byAddress;
            }
            ahno.G(byAddress instanceof Inet6Address, "Unexpected state, scope should only appear for ipv6");
            Inet6Address inet6Address = (Inet6Address) byAddress;
            int length = str.length();
            long j = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    if (j <= 2147483647L) {
                        i = (int) j;
                        break;
                    }
                    break;
                }
                if (j <= 2147483647L) {
                    long j2 = j * 10;
                    int iDigit = Character.digit(str.charAt(i2), 10);
                    if (iDigit >= 0) {
                        j = j2 + ((long) iDigit);
                        i2++;
                    }
                }
                i = -1;
                break;
            }
            if (i != -1) {
                return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), i);
            }
            try {
                NetworkInterface byName = NetworkInterface.getByName(str);
                if (byName != null) {
                    return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), byName);
                }
                throw d("No such interface: '%s'", str);
            } catch (SocketException | UnknownHostException e) {
                throw new IllegalArgumentException(a.ce(str, "No such interface: "), e);
            }
        } catch (UnknownHostException e2) {
            throw new AssertionError(e2);
        }
    }

    public static InetAddress b(String str) {
        auym auymVar = new auym();
        byte[] bArrC = c(str, auymVar);
        if (bArrC != null) {
            return a(bArrC, (String) auymVar.b);
        }
        throw d("'%s' is not an IP string literal.", str);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x013e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0080 A[PHI: r13
      0x0080: PHI (r13v2 java.lang.String) = (r13v0 java.lang.String), (r13v13 java.lang.String) binds: [B:19:0x0035, B:24:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:66:0x0106 A[Catch: NumberFormatException -> 0x0152, TryCatch #0 {NumberFormatException -> 0x0152, blocks: (B:61:0x00f9, B:64:0x0100, B:66:0x0106, B:68:0x010c, B:69:0x0110, B:73:0x0119, B:82:0x013b, B:74:0x011f, B:80:0x0129, B:81:0x0137, B:83:0x013e, B:84:0x0143), top: B:93:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x010c A[Catch: NumberFormatException -> 0x0152, TryCatch #0 {NumberFormatException -> 0x0152, blocks: (B:61:0x00f9, B:64:0x0100, B:66:0x0106, B:68:0x010c, B:69:0x0110, B:73:0x0119, B:82:0x013b, B:74:0x011f, B:80:0x0129, B:81:0x0137, B:83:0x013e, B:84:0x0143), top: B:93:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0116  */
    /* JADX WARN: Code duplicated, block: B:73:0x0119 A[Catch: NumberFormatException -> 0x0152, LOOP:3: B:72:0x0117->B:73:0x0119, LOOP_END, TryCatch #0 {NumberFormatException -> 0x0152, blocks: (B:61:0x00f9, B:64:0x0100, B:66:0x0106, B:68:0x010c, B:69:0x0110, B:73:0x0119, B:82:0x013b, B:74:0x011f, B:80:0x0129, B:81:0x0137, B:83:0x013e, B:84:0x0143), top: B:93:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x011f A[Catch: NumberFormatException -> 0x0152, TryCatch #0 {NumberFormatException -> 0x0152, blocks: (B:61:0x00f9, B:64:0x0100, B:66:0x0106, B:68:0x010c, B:69:0x0110, B:73:0x0119, B:82:0x013b, B:74:0x011f, B:80:0x0129, B:81:0x0137, B:83:0x013e, B:84:0x0143), top: B:93:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0123  */
    public static byte[] c(String str, auym auymVar) {
        int iG;
        int i;
        int i2;
        ByteBuffer byteBufferAllocate;
        int i3;
        int iIndexOf;
        int i4;
        int i5;
        int i6 = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (i6 >= str.length()) {
                i6 = -1;
                break;
            }
            char cCharAt = str.charAt(i6);
            if (cCharAt == '.') {
                z = true;
            } else {
                if (cCharAt != ':') {
                    if (cCharAt == '%') {
                        break;
                    }
                    if (Character.digit(cCharAt, 16) != -1) {
                    }
                    return null;
                }
                if (z) {
                    return null;
                }
                z = false;
                z2 = true;
            }
            i6++;
        }
        if (z2) {
            if (z) {
                int iLastIndexOf = str.lastIndexOf(58) + 1;
                String strSubstring = str.substring(0, iLastIndexOf);
                byte[] bArrE = e(str.substring(iLastIndexOf));
                str = bArrE == null ? null : strSubstring + Integer.toHexString(((bArrE[0] & 255) << 8) | (bArrE[1] & 255)) + ':' + Integer.toHexString(((bArrE[2] & 255) << 8) | (bArrE[3] & 255));
                if (str != null) {
                    if (i6 != -1) {
                        if (auymVar != null) {
                            auymVar.b = str.substring(i6 + 1);
                        }
                        str = str.substring(0, i6);
                    }
                    iG = c.g(str);
                    if (iG >= 2 && iG <= 8) {
                        int i7 = iG + 1;
                        i = 8 - i7;
                        i2 = 0;
                        boolean z3 = false;
                        while (i2 < str.length() - 1) {
                            if (str.charAt(i2) != ':' && str.charAt(i2 + 1) == ':') {
                                if (!z3) {
                                    int i8 = i + 1;
                                    if (i2 == 0) {
                                        i8 = i + 2;
                                        i2 = 0;
                                    }
                                    if (i2 == str.length() - 2) {
                                        i8++;
                                    }
                                    i = i8;
                                    z3 = true;
                                }
                            }
                            i2++;
                        }
                        if ((str.charAt(0) == ':' || str.charAt(1) == ':') && ((str.charAt(str.length() - 1) != ':' || str.charAt(str.length() - 2) == ':') && (!z3 ? i7 == 8 : i > 0))) {
                            byteBufferAllocate = ByteBuffer.allocate(16);
                            try {
                                i3 = str.charAt(0) != ':' ? 0 : 1;
                                while (i3 < str.length()) {
                                    iIndexOf = str.indexOf(58, i3);
                                    if (iIndexOf == -1) {
                                        iIndexOf = str.length();
                                    }
                                    if (str.charAt(i3) == ':') {
                                        for (i5 = 0; i5 < i; i5++) {
                                            byteBufferAllocate.putShort((short) 0);
                                        }
                                    } else {
                                        i4 = iIndexOf - i3;
                                        if (i4 > 0 || i4 > 4) {
                                            throw new NumberFormatException();
                                        }
                                        int iDigit = 0;
                                        while (i3 < iIndexOf) {
                                            iDigit = (iDigit << 4) | Character.digit(str.charAt(i3), 16);
                                            i3++;
                                        }
                                        byteBufferAllocate.putShort((short) iDigit);
                                    }
                                    i3 = iIndexOf + 1;
                                }
                                return byteBufferAllocate.array();
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else {
                if (i6 != -1) {
                    if (auymVar != null) {
                        auymVar.b = str.substring(i6 + 1);
                    }
                    str = str.substring(0, i6);
                }
                iG = c.g(str);
                if (iG >= 2) {
                    int i9 = iG + 1;
                    i = 8 - i9;
                    i2 = 0;
                    boolean z4 = false;
                    while (i2 < str.length() - 1) {
                        if (str.charAt(i2) != ':') {
                        }
                        i2++;
                    }
                    if (str.charAt(0) == ':') {
                        byteBufferAllocate = ByteBuffer.allocate(16);
                        if (str.charAt(0) != ':') {
                        }
                        while (i3 < str.length()) {
                            iIndexOf = str.indexOf(58, i3);
                            if (iIndexOf == -1) {
                                iIndexOf = str.length();
                            }
                            if (str.charAt(i3) == ':') {
                                i4 = iIndexOf - i3;
                                if (i4 > 0) {
                                }
                                throw new NumberFormatException();
                            }
                            while (i5 < i) {
                                byteBufferAllocate.putShort((short) 0);
                            }
                            i3 = iIndexOf + 1;
                        }
                        return byteBufferAllocate.array();
                    }
                    byteBufferAllocate = ByteBuffer.allocate(16);
                    if (str.charAt(0) != ':') {
                    }
                    while (i3 < str.length()) {
                        iIndexOf = str.indexOf(58, i3);
                        if (iIndexOf == -1) {
                            iIndexOf = str.length();
                        }
                        if (str.charAt(i3) == ':') {
                            i4 = iIndexOf - i3;
                            if (i4 > 0) {
                            }
                            throw new NumberFormatException();
                        }
                        while (i5 < i) {
                            byteBufferAllocate.putShort((short) 0);
                        }
                        i3 = iIndexOf + 1;
                    }
                    return byteBufferAllocate.array();
                }
            }
        } else if (z && i6 == -1) {
            return e(str);
        }
        return null;
    }

    private static IllegalArgumentException d(String str, Object... objArr) {
        return new IllegalArgumentException(String.format(Locale.ROOT, str, objArr));
    }

    private static byte[] e(String str) {
        if (b.g(str) + 1 == 4) {
            byte[] bArr = new byte[4];
            int i = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                int iIndexOf = str.indexOf(46, i);
                if (iIndexOf == -1) {
                    iIndexOf = str.length();
                }
                int i3 = iIndexOf - i;
                if (i3 <= 0 || i3 > 3) {
                    throw new NumberFormatException();
                }
                if (i3 > 1) {
                    try {
                        if (str.charAt(i) == '0') {
                            throw new NumberFormatException();
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                int i4 = 0;
                while (i < iIndexOf) {
                    int i5 = i4 * 10;
                    int iDigit = Character.digit(str.charAt(i), 10);
                    if (iDigit < 0) {
                        throw new NumberFormatException();
                    }
                    i4 = i5 + iDigit;
                    i++;
                }
                if (i4 > 255) {
                    throw new NumberFormatException();
                }
                bArr[i2] = (byte) i4;
                i = iIndexOf + 1;
            }
            return bArr;
        }
        return null;
    }
}
