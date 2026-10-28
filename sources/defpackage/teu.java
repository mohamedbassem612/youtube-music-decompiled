package defpackage;

import app.rive.semantics.SemanticState;
import internal.org.jni_zero.JniZero;
import java.io.FileInputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class teu {
    private static final byte[] a;
    private static final byte[] b;
    private static final byte[] c;

    static {
        byte[] bytes = "RssAnon:".getBytes(awtd.a);
        bytes.getClass();
        a = bytes;
        byte[] bytes2 = "VmSwap:".getBytes(awtd.a);
        bytes2.getClass();
        b = bytes2;
        byte[] bytes3 = "MemAvailable:".getBytes(awtd.a);
        bytes3.getClass();
        c = bytes3;
    }

    public static final tet a() {
        Long lC;
        Integer numValueOf;
        Long lC2;
        try {
            byte[] bArr = new byte[SemanticState.Multiline];
            FileInputStream fileInputStream = new FileInputStream("/proc/self/status");
            int i = 0;
            int i2 = 0;
            while (i2 < 8192) {
                try {
                    int i3 = fileInputStream.read(bArr, i2, 8192 - i2);
                    if (i3 == -1) {
                        break;
                    }
                    i2 += i3;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        JniZero.l(fileInputStream, th);
                        throw th2;
                    }
                }
            }
            JniZero.l(fileInputStream, null);
            if (i2 <= 0 || (lC = c(bArr, i2, a)) == null) {
                return null;
            }
            long jLongValue = lC.longValue();
            Long lC3 = c(bArr, i2, b);
            long jLongValue2 = 0;
            long jLongValue3 = lC3 != null ? lC3.longValue() : 0L;
            try {
                FileInputStream fileInputStream2 = new FileInputStream("/proc/self/dmabuf_rss");
                try {
                    int i4 = fileInputStream2.read(bArr, 0, SemanticState.Multiline);
                    JniZero.l(fileInputStream2, null);
                    if (i4 > 0) {
                        int i5 = 0;
                        while (i5 < i4) {
                            int i6 = bArr[i5] - 48;
                            if (i6 >= 0 && i6 < 10) {
                                break;
                            }
                            i5++;
                        }
                        Long lB = b(bArr, i5, i4);
                        if (lB != null) {
                            jLongValue2 = lB.longValue();
                        }
                    }
                    try {
                        FileInputStream fileInputStream3 = new FileInputStream("/proc/meminfo");
                        while (i < 8192) {
                            try {
                                int i7 = fileInputStream3.read(bArr, i, 8192 - i);
                                if (i7 == -1) {
                                    break;
                                }
                                i += i7;
                            } catch (Throwable th3) {
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    JniZero.l(fileInputStream3, th3);
                                    throw th4;
                                }
                            }
                        }
                        JniZero.l(fileInputStream3, null);
                        numValueOf = (i <= 0 || (lC2 = c(bArr, i, c)) == null) ? null : Integer.valueOf((int) (lC2.longValue() / 1024));
                    } catch (Exception unused) {
                    }
                    int i8 = (int) (jLongValue / 1024);
                    int i9 = (int) (jLongValue3 / 1024);
                    int i10 = (int) (jLongValue2 / 1048576);
                    return new tet(i8, i9, i10, i8 + i9 + i10, numValueOf);
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        JniZero.l(fileInputStream2, th5);
                        throw th6;
                    }
                }
            } catch (Exception unused2) {
            }
        } catch (Exception unused3) {
            return null;
        }
    }

    private static final Long b(byte[] bArr, int i, int i2) {
        boolean z = false;
        long j = 0;
        while (i < i2) {
            int i3 = bArr[i] - 48;
            if (i3 < 0 || i3 >= 10) {
                break;
            }
            i++;
            j = (j * 10) + ((long) i3);
            z = true;
        }
        if (z) {
            return Long.valueOf(j);
        }
        return null;
    }

    private static final Long c(byte[] bArr, int i, byte[] bArr2) {
        int length = bArr2.length;
        int i2 = i - length;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                if (i3 == 0 || bArr[i3 - 1] == 10) {
                    for (int i4 = i3; i4 <= i2; i4++) {
                        byte b2 = bArr[i4];
                        if (b2 != 32 && b2 != 9) {
                            int i5 = 0;
                            while (true) {
                                if (i5 >= length) {
                                    int i6 = i4 + length;
                                    while (i6 < i) {
                                        byte b3 = bArr[i6];
                                        if (b3 != 32 && b3 != 9) {
                                            break;
                                        }
                                        i6++;
                                    }
                                    return b(bArr, i6, i);
                                }
                                if (bArr[i4 + i5] != bArr2[i5]) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                }
                if (i3 != i2) {
                    i3++;
                }
            }
        }
        return null;
    }
}
