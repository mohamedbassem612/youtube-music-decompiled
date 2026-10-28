package defpackage;

import android.view.WindowInsets;
import app.rive.semantics.SemanticState;
import com.google.cardboard.sdk.R;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class bbm {
    static int a(int i) {
        int iStatusBars;
        int i2 = 0;
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    iStatusBars = WindowInsets.Type.statusBars();
                } else if (i3 == 2) {
                    iStatusBars = WindowInsets.Type.navigationBars();
                } else if (i3 == 4) {
                    iStatusBars = WindowInsets.Type.captionBar();
                } else if (i3 == 8) {
                    iStatusBars = WindowInsets.Type.ime();
                } else if (i3 == 16) {
                    iStatusBars = WindowInsets.Type.systemGestures();
                } else if (i3 == 32) {
                    iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i3 == 64) {
                    iStatusBars = WindowInsets.Type.tappableElement();
                } else if (i3 == 128) {
                    iStatusBars = WindowInsets.Type.displayCutout();
                } else if (i3 == 512) {
                    iStatusBars = WindowInsets.Type.systemOverlays();
                }
                i2 |= iStatusBars;
            }
        }
        return i2;
    }

    public static bsx h(cvj cvjVar, boolean z) {
        bsx bsxVarM = new zs((byte[]) null).m(cvjVar, !z ? cyg.a : null, 0);
        if (bsxVarM == null || bsxVarM.a() == 0) {
            return null;
        }
        return bsxVarM;
    }

    public static int i(bwb bwbVar, int i) {
        int i2;
        int i3;
        int iN;
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                i2 = i - 2;
                i3 = 576;
                return i3 << i2;
            case 6:
                iN = bwbVar.n();
                return iN + 1;
            case 7:
                iN = bwbVar.s();
                return iN + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = i - 8;
                i3 = SemanticState.Hidden;
                return i3 << i2;
            default:
                return -1;
        }
    }

    public static boolean j(bwb bwbVar, cvn cvnVar, boolean z, qha qhaVar) {
        try {
            long jY = bwbVar.y();
            if (!z) {
                jY *= (long) cvnVar.b;
            }
            long j = cvnVar.j;
            if (j == 0 || jY <= j) {
                qhaVar.a = jY;
                return true;
            }
        } catch (NumberFormatException unused) {
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c0 A[LOOP:0: B:55:0x00be->B:56:0x00c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e6  */
    public static boolean k(bwb bwbVar, cvn cvnVar, int i, qha qhaVar) {
        int iN;
        byte[] bArr;
        int i2;
        int i3;
        int iH;
        int i4;
        long jW = bwbVar.w();
        long j = jW >>> 16;
        if (j == i) {
            boolean z = (j & 1) == 1;
            long j2 = jW >> 12;
            long j3 = jW >> 8;
            long j4 = jW >> 4;
            long j5 = jW >> 1;
            long j6 = jW & 1;
            int i5 = (int) (j4 & 15);
            if (i5 > 7 ? !(i5 > 10 || cvnVar.g != 2) : i5 == cvnVar.g - 1) {
                int i6 = (int) (j5 & 7);
                if ((i6 == 0 || i6 == cvnVar.i) && j6 != 1 && j(bwbVar, cvnVar, z, qhaVar)) {
                    long j7 = qhaVar.a;
                    int i7 = i(bwbVar, (int) (j2 & 15));
                    long j8 = cvnVar.j;
                    boolean z2 = j8 == 0 || j7 + ((long) i7) >= j8;
                    if (i7 != -1 && ((z2 || i7 >= cvnVar.a) && i7 <= cvnVar.b)) {
                        int i8 = cvnVar.e;
                        int i9 = (int) (j3 & 15);
                        if (i9 == 0) {
                            iN = bwbVar.n();
                            int i10 = bwbVar.c;
                            bArr = bwbVar.b;
                            i2 = i10 - 1;
                            int i11 = bwp.a;
                            i3 = 0;
                            for (int i12 = bwbVar.c; i12 < i2; i12++) {
                                i3 = bwp.h[i3 ^ (bArr[i12] & 255)];
                            }
                            if (iN == i3) {
                                if (bwbVar.d() != 0) {
                                    iH = bwbVar.h();
                                    if ((iH & SemanticState.Focused) == 0) {
                                        i4 = (iH & R.styleable.AppCompatTheme_windowNoTitle) >> 1;
                                        if ((i4 < 2 && i4 <= 7) || (i4 >= 13 && i4 <= 31)) {
                                            bvx.h(a.bR(i4, "Ignoring frame where first subframe has a reserved type: "));
                                        }
                                    }
                                }
                                return true;
                            }
                        } else if (i9 <= 11) {
                            if (i9 == cvnVar.f) {
                                iN = bwbVar.n();
                                int i13 = bwbVar.c;
                                bArr = bwbVar.b;
                                i2 = i13 - 1;
                                int i14 = bwp.a;
                                i3 = 0;
                                while (i12 < i2) {
                                    i3 = bwp.h[i3 ^ (bArr[i12] & 255)];
                                }
                                if (iN == i3) {
                                    if (bwbVar.d() != 0) {
                                        iH = bwbVar.h();
                                        if ((iH & SemanticState.Focused) == 0) {
                                            i4 = (iH & R.styleable.AppCompatTheme_windowNoTitle) >> 1;
                                            if (i4 < 2) {
                                                bvx.h(a.bR(i4, "Ignoring frame where first subframe has a reserved type: "));
                                            } else {
                                                bvx.h(a.bR(i4, "Ignoring frame where first subframe has a reserved type: "));
                                            }
                                        }
                                    }
                                    return true;
                                }
                            }
                        } else if (i9 == 12) {
                            if (bwbVar.n() * 1000 == i8) {
                                iN = bwbVar.n();
                                int i15 = bwbVar.c;
                                bArr = bwbVar.b;
                                i2 = i15 - 1;
                                int i16 = bwp.a;
                                i3 = 0;
                                while (i12 < i2) {
                                    i3 = bwp.h[i3 ^ (bArr[i12] & 255)];
                                }
                                if (iN == i3) {
                                    if (bwbVar.d() != 0) {
                                        iH = bwbVar.h();
                                        if ((iH & SemanticState.Focused) == 0) {
                                            i4 = (iH & R.styleable.AppCompatTheme_windowNoTitle) >> 1;
                                            if (i4 < 2) {
                                                bvx.h(a.bR(i4, "Ignoring frame where first subframe has a reserved type: "));
                                            } else {
                                                bvx.h(a.bR(i4, "Ignoring frame where first subframe has a reserved type: "));
                                            }
                                        }
                                    }
                                    return true;
                                }
                            }
                        } else if (i9 <= 14) {
                            int iS = bwbVar.s();
                            if (i9 == 14) {
                                iS *= 10;
                            }
                            if (iS == i8) {
                                iN = bwbVar.n();
                                int i17 = bwbVar.c;
                                bArr = bwbVar.b;
                                i2 = i17 - 1;
                                int i18 = bwp.a;
                                i3 = 0;
                                while (i12 < i2) {
                                    i3 = bwp.h[i3 ^ (bArr[i12] & 255)];
                                }
                                if (iN == i3) {
                                    if (bwbVar.d() != 0) {
                                        iH = bwbVar.h();
                                        if ((iH & SemanticState.Focused) == 0) {
                                            i4 = (iH & R.styleable.AppCompatTheme_windowNoTitle) >> 1;
                                            if (i4 < 2) {
                                                bvx.h(a.bR(i4, "Ignoring frame where first subframe has a reserved type: "));
                                            } else {
                                                bvx.h(a.bR(i4, "Ignoring frame where first subframe has a reserved type: "));
                                            }
                                        }
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static eol l(bwb bwbVar) {
        bwbVar.Q(1);
        int iP = bwbVar.p();
        long j = bwbVar.c;
        long j2 = iP;
        int i = iP / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jV = bwbVar.v();
            if (jV == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jV;
            jArrCopyOf2[i2] = bwbVar.v();
            bwbVar.Q(2);
        }
        bwbVar.Q((int) ((j + j2) - ((long) bwbVar.c)));
        return new eol(jArrCopyOf, jArrCopyOf2, (byte[]) null);
    }

    public boolean e() {
        return false;
    }

    public void f() {
    }

    public void g() {
    }

    public void b(int i) {
    }

    public void c(boolean z) {
    }

    public void d(boolean z) {
    }
}
