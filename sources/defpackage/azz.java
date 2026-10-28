package defpackage;

import android.os.Build;
import android.view.ContentInfo;
import android.view.View;
import android.view.Window;
import app.rive.semantics.SemanticState;
import java.io.EOFException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class azz {
    public static ayf a(View view, ayf ayfVar) {
        ContentInfo contentInfoD = ayfVar.a.d();
        contentInfoD.getClass();
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoD);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent != contentInfoD ? new ayf(new ayc(contentInfoPerformReceiveContent)) : ayfVar;
    }

    public static String[] b(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static void c(Window window, boolean z) {
        int i;
        boolean z2;
        if (Build.VERSION.SDK_INT >= 35) {
            window.setDecorFitsSystemWindows(z);
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
            return;
        }
        View decorView2 = window.getDecorView();
        int systemUiVisibility2 = decorView2.getSystemUiVisibility();
        if (z) {
            i = systemUiVisibility2 & (-257);
            z2 = true;
        } else {
            i = systemUiVisibility2 | SemanticState.Hidden;
            z2 = false;
        }
        decorView2.setSystemUiVisibility(i);
        window.setDecorFitsSystemWindows(z2);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00be  */
    public static int d(int i, ByteBuffer byteBuffer) {
        int i2;
        int i3;
        int i4;
        byte b;
        int i5;
        int iB;
        int i6;
        int i7;
        int i8;
        if (i == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i2 = 0;
            } else {
                byte b2 = byteBuffer.get(26);
                int i9 = 28;
                int i10 = 28;
                for (int i11 = 0; i11 < b2; i11++) {
                    i10 += byteBuffer.get(i11 + 27);
                }
                byte b3 = byteBuffer.get(i10 + 26);
                for (int i12 = 0; i12 < b3; i12++) {
                    i9 += byteBuffer.get(i10 + 27 + i12);
                }
                i2 = i10 + i9;
            }
            int i13 = byteBuffer.get(i2 + 26) + 27 + i2;
            return (int) ((atz.c(byteBuffer.get(i13), byteBuffer.limit() - i13 > 1 ? byteBuffer.get(i13 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int i14 = bwp.i(byteBuffer, byteBuffer.position());
                    if (!cvv.c(i14) || (i6 = (i14 >>> 19) & 3) == 1 || (i7 = (i14 >>> 17) & 3) == 0) {
                        iB = -1;
                    } else {
                        int i15 = i14 >>> 12;
                        int i16 = (i14 >>> 10) & 3;
                        int i17 = i15 & 15;
                        if (i17 == 0 || i17 == 15 || i16 == 3) {
                            iB = -1;
                        } else {
                            iB = cvv.b(i6, i7);
                        }
                    }
                    if (iB == -1) {
                        throw new IllegalArgumentException();
                    }
                    return iB;
                case 10:
                    return SemanticState.ReadOnly;
                case 11:
                case 12:
                    return SemanticState.Modal;
                default:
                    switch (i) {
                        case 14:
                            int[] iArr = cuo.a;
                            int iPosition = byteBuffer.position();
                            int iLimit = byteBuffer.limit() - 10;
                            int i18 = iPosition;
                            while (true) {
                                if (i18 > iLimit) {
                                    i8 = -1;
                                } else if ((bwp.i(byteBuffer, i18 + 4) & (-2)) == -126718022) {
                                    i8 = i18 - iPosition;
                                } else {
                                    i18++;
                                }
                            }
                            if (i8 != -1) {
                                return (40 << ((byteBuffer.get((byteBuffer.position() + i8) + ((byteBuffer.get((byteBuffer.position() + i8) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) << 4;
                            }
                            return 0;
                        case 15:
                            return SemanticState.LiveRegion;
                        case 16:
                            return SemanticState.ReadOnly;
                        case 17:
                            int i19 = cuq.a;
                            byte[] bArr = new byte[16];
                            int iPosition2 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(iPosition2);
                            return cuq.c(new dqp(bArr, (byte[]) null)).a;
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException(a.bR(i, "Unexpected audio encoding: "));
                    }
                    break;
            }
            int[] iArr2 = cuo.a;
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return cuo.a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] << 8;
            }
            return 1536;
        }
        int[] iArr3 = cvh.a;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return SemanticState.ReadOnly;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return SemanticState.Obscured;
        }
        int iPosition3 = byteBuffer.position();
        byte b4 = byteBuffer.get(iPosition3);
        if (b4 != -2) {
            if (b4 != -1) {
                if (b4 != 31) {
                    i4 = (byteBuffer.get(iPosition3 + 4) & 1) << 6;
                    i5 = byteBuffer.get(iPosition3 + 5) & 252;
                } else {
                    i4 = (byteBuffer.get(iPosition3 + 5) & 7) << 4;
                    b = byteBuffer.get(iPosition3 + 6);
                }
                i3 = i4 | (i5 >> 2);
            } else {
                i4 = (byteBuffer.get(iPosition3 + 4) & 7) << 4;
                b = byteBuffer.get(iPosition3 + 7);
            }
            i5 = b & 60;
            i3 = i4 | (i5 >> 2);
        } else {
            i3 = ((byteBuffer.get(iPosition3 + 5) & 1) << 6) | ((byteBuffer.get(iPosition3 + 4) & 252) >> 2);
        }
        return (i3 + 1) << 5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x0033 A[RETURN, SYNTHETIC] */
    public static int e(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i != 30) {
            switch (i) {
                case 5:
                    return 80000;
                case 6:
                    return 768000;
                case 7:
                    return 192000;
                case 8:
                    break;
                case 9:
                    return 40000;
                case 10:
                    return 100000;
                case 11:
                    return 16000;
                case 12:
                    return 7000;
                default:
                    switch (i) {
                        case 14:
                            return 3062500;
                        case 15:
                            return 8000;
                        case 16:
                            return 256000;
                        case 17:
                            return 336000;
                        case 18:
                            return 768000;
                        default:
                            return -2147483647;
                    }
            }
        }
        return 2250000;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039 A[LOOP:0: B:3:0x0001->B:13:0x0039, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:16:0x003b A[EDGE_INSN: B:16:0x003b->B:14:0x003b BREAK  A[LOOP:0: B:3:0x0001->B:13:0x0039], SYNTHETIC] */
    public static int f(cvj cvjVar, byte[] bArr, int i, int i2) {
        int iMin;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i + i3;
            int i5 = i2 - i3;
            cvb cvbVar = (cvb) cvjVar;
            cvbVar.h(i5);
            int i6 = cvbVar.e;
            int i7 = cvbVar.d;
            int i8 = i6 - i7;
            if (i8 == 0) {
                iMin = cvbVar.b(cvbVar.c, i7, i5, 0, true);
                if (iMin == -1) {
                    iMin = -1;
                } else {
                    cvbVar.e += iMin;
                }
                if (iMin != -1) {
                    break;
                }
                i3 += iMin;
            } else {
                iMin = Math.min(i5, i8);
            }
            System.arraycopy(cvbVar.c, cvbVar.d, bArr, i4, iMin);
            cvbVar.d += iMin;
            if (iMin != -1) {
                break;
                break;
            }
            i3 += iMin;
        }
        return i3;
    }

    public static void g(boolean z, String str) throws bsz {
        if (!z) {
            throw new bsz(str, null, true, 1);
        }
    }

    public static boolean h(cvj cvjVar, byte[] bArr, int i, int i2) {
        try {
            ((cvb) cvjVar).o(bArr, i, i2, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean i(cvj cvjVar, int i) {
        try {
            ((cvb) cvjVar).p(i, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean j(cvj cvjVar, byte[] bArr, int i, boolean z) throws EOFException {
        try {
            return cvjVar.n(bArr, 0, i, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static void k(long j, bwb bwbVar, cwj[] cwjVarArr) {
        int i;
        while (true) {
            if (bwbVar.d() <= 1) {
                return;
            }
            int iM = m(bwbVar);
            int iM2 = m(bwbVar);
            int i2 = bwbVar.c + iM2;
            if (iM2 == -1 || iM2 > bwbVar.d()) {
                bvx.e("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i2 = bwbVar.d;
            } else if (iM == 4 && iM2 >= 8) {
                int iN = bwbVar.n();
                int iS = bwbVar.s();
                if (iS == 49) {
                    i = bwbVar.i();
                    iS = 49;
                } else {
                    i = 0;
                }
                int iN2 = bwbVar.n();
                if (iS == 47) {
                    bwbVar.Q(1);
                    iS = 47;
                }
                boolean z = iN == 181 && (iS == 49 || iS == 47) && iN2 == 3;
                if (iS == 49) {
                    z &= i == 1195456820;
                }
                if (z) {
                    l(j, bwbVar, cwjVarArr);
                }
            }
            bwbVar.P(i2);
        }
    }

    public static void l(long j, bwb bwbVar, cwj[] cwjVarArr) {
        int iN = bwbVar.n();
        if ((iN & 64) != 0) {
            int i = iN & 31;
            bwbVar.Q(1);
            int i2 = bwbVar.c;
            for (cwj cwjVar : cwjVarArr) {
                int i3 = i * 3;
                bwbVar.P(i2);
                cwjVar.c(bwbVar, i3);
                ahno.O(j != -9223372036854775807L);
                cwjVar.e(j, 1, i3, 0, null);
            }
        }
    }

    private static int m(bwb bwbVar) {
        int i = 0;
        while (bwbVar.d() != 0) {
            int iN = bwbVar.n();
            i += iN;
            if (iN != 255) {
                return i;
            }
        }
        return -1;
    }
}
