package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cuq {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, SemanticState.Modal};

    /* JADX WARN: Code duplicated, block: B:140:0x0207  */
    /* JADX WARN: Code duplicated, block: B:142:0x020d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0224  */
    /* JADX WARN: Code duplicated, block: B:150:0x0238 A[LOOP:2: B:149:0x0236->B:150:0x0238, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:152:0x0247  */
    /* JADX WARN: Code duplicated, block: B:155:0x0250  */
    /* JADX WARN: Code duplicated, block: B:157:0x025a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0261  */
    /* JADX WARN: Code duplicated, block: B:163:0x026f  */
    /* JADX WARN: Code duplicated, block: B:165:0x0274  */
    /* JADX WARN: Code duplicated, block: B:167:0x0280  */
    /* JADX WARN: Code duplicated, block: B:218:0x0301 A[PHI: r7
      0x0301: PHI (r7v5 int) = (r7v3 int), (r7v6 int) binds: [B:209:0x02e5, B:190:0x02bb] A[DONT_GENERATE, DONT_INLINE]] */
    public static bse a(bwb bwbVar, String str, String str2, bsa bsaVar) throws bsz {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean zU;
        int i6;
        int i7;
        int iF;
        int i8;
        boolean z;
        int i9;
        int i10;
        int i11;
        int i12;
        int iF2;
        int i13;
        int i14;
        dqp dqpVar = new dqp((byte[]) null);
        dqpVar.n(bwbVar);
        int iF3 = dqpVar.f();
        int i15 = dqpVar.i(3);
        if (i15 > 1) {
            throw new bsz(a.bR(i15, "Unsupported AC-4 DSI version: "), null, false, 1);
        }
        int i16 = dqpVar.i(7);
        int i17 = true != dqpVar.u() ? 44100 : 48000;
        dqpVar.s(4);
        int i18 = dqpVar.i(9);
        if (i16 > 1) {
            if (i15 == 0) {
                throw new bsz("Invalid AC-4 DSI version: 0", null, false, 1);
            }
            if (dqpVar.u()) {
                dqpVar.s(16);
                if (dqpVar.u()) {
                    dqpVar.s(SemanticState.Focused);
                }
            }
        }
        if (i15 == 1) {
            if (!g(dqpVar)) {
                throw new bsz("Invalid AC-4 DSI bitrate.", null, false, 1);
            }
            dqpVar.m();
        }
        cup cupVar = new cup();
        int i19 = 0;
        while (true) {
            if (i19 < i18) {
                if (i15 == 0) {
                    zU = dqpVar.u();
                    i6 = dqpVar.i(5);
                    i7 = dqpVar.i(5);
                    iF = 0;
                    i8 = 0;
                    z = false;
                } else {
                    int i20 = dqpVar.i(8);
                    i8 = dqpVar.i(8);
                    if (i8 == 255) {
                        i8 = dqpVar.i(16) + 255;
                    }
                    if (i20 > 2) {
                        dqpVar.s(i8 << 3);
                        i19++;
                    } else {
                        iF = (iF3 - dqpVar.f()) / 8;
                        int i21 = dqpVar.i(5);
                        z = i21 == 31;
                        i7 = i20;
                        i6 = i21;
                        zU = false;
                    }
                }
                cupVar.f = i7;
                if (zU || z || i6 != 6) {
                    cupVar.g = dqpVar.i(3);
                    if (dqpVar.u()) {
                        dqpVar.s(5);
                    }
                    dqpVar.s(2);
                    if (i15 == 1) {
                        if (i7 == 1) {
                            dqpVar.s(2);
                        } else {
                            if (i7 == 2) {
                                i7 = 2;
                                dqpVar.s(2);
                            }
                            if (i10 <= 0) {
                                i2 = 8;
                                i = 5;
                            } else {
                                if (!dqpVar.u() && !g(dqpVar)) {
                                    throw new bsz("Can't parse bitrate DSI.", null, false, 1);
                                }
                                if (dqpVar.u()) {
                                    dqpVar.m();
                                    dqpVar.t(dqpVar.i(16));
                                    i = 5;
                                    i13 = dqpVar.i(5);
                                    for (i14 = 0; i14 < i13; i14++) {
                                        dqpVar.s(3);
                                        dqpVar.s(8);
                                    }
                                    i2 = 8;
                                } else {
                                    i2 = 8;
                                    i = 5;
                                }
                            }
                            dqpVar.m();
                            if (i15 == 1) {
                                iF2 = ((i9 - dqpVar.f()) / i2) - iF;
                                if (i8 < iF2) {
                                    throw new bsz("pres_bytes is smaller than presentation bytes read.", null, false, 1);
                                }
                                dqpVar.t(i8 - iF2);
                            }
                            if (cupVar.a) {
                                i3 = -1;
                                if (cupVar.b == -1) {
                                    throw new bsz(a.bR(i19, "Can't determine channel mode of presentation "), null, false, 1);
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                    }
                    dqpVar.s(5);
                    dqpVar.s(10);
                    if (i15 == 1) {
                        if (i7 > 0) {
                            cupVar.a = dqpVar.u();
                        }
                        if (cupVar.a) {
                            if (i7 != 1) {
                                i11 = 2;
                                if (i7 == 2) {
                                    i10 = 2;
                                } else {
                                    i9 = iF3;
                                    i10 = i7;
                                }
                                dqpVar.s(24);
                                i12 = 1;
                            } else {
                                i10 = 1;
                            }
                            i9 = iF3;
                            int i22 = dqpVar.i(5);
                            if (i22 >= 0 && i22 <= 15) {
                                cupVar.b = i22;
                            }
                            if (i22 < 11 || i22 > 14) {
                                i11 = 2;
                            } else {
                                cupVar.d = dqpVar.u();
                                i11 = 2;
                                cupVar.e = dqpVar.i(2);
                            }
                            dqpVar.s(24);
                            i12 = 1;
                        } else {
                            i9 = iF3;
                            i11 = 2;
                            i12 = 1;
                            i10 = i7;
                        }
                        if (i7 == i12 || i7 == i11) {
                            if (dqpVar.u() && dqpVar.u()) {
                                dqpVar.s(i11);
                            }
                            if (dqpVar.u()) {
                                dqpVar.r();
                                int i23 = 8;
                                int i24 = dqpVar.i(8);
                                int i25 = 0;
                                while (i25 < i24) {
                                    dqpVar.s(i23);
                                    i25++;
                                    i23 = 8;
                                }
                            }
                        }
                    } else {
                        i9 = iF3;
                        i10 = i7;
                    }
                    if (!zU && !z) {
                        dqpVar.r();
                        if (i6 == 0 || i6 == 1 || i6 == 2) {
                            int i26 = 0;
                            if (i10 == 0) {
                                while (i26 < 2) {
                                    d(dqpVar, cupVar);
                                    i26++;
                                }
                                i10 = 0;
                            } else {
                                for (int i27 = 2; i26 < i27; i27 = 2) {
                                    e(dqpVar, cupVar);
                                    i26++;
                                }
                            }
                        } else if (i6 == 3 || i6 == 4) {
                            int i28 = 0;
                            if (i10 == 0) {
                                while (i28 < 3) {
                                    d(dqpVar, cupVar);
                                    i28++;
                                }
                                i10 = 0;
                            } else {
                                for (int i29 = 3; i28 < i29; i29 = 3) {
                                    e(dqpVar, cupVar);
                                    i28++;
                                }
                            }
                        } else if (i6 != 5) {
                            int i30 = dqpVar.i(7);
                            for (int i31 = 0; i31 < i30; i31++) {
                                dqpVar.s(8);
                            }
                        } else if (i10 == 0) {
                            d(dqpVar, cupVar);
                            i10 = 0;
                        } else {
                            int i32 = dqpVar.i(3);
                            for (int i33 = 0; i33 < i32 + 2; i33++) {
                                e(dqpVar, cupVar);
                            }
                        }
                    } else if (i10 == 0) {
                        d(dqpVar, cupVar);
                        i10 = 0;
                    } else {
                        e(dqpVar, cupVar);
                    }
                    dqpVar.r();
                    if (dqpVar.u()) {
                        i7 = i10;
                    } else {
                        i4 = 7;
                    }
                    if (i10 <= 0) {
                        i2 = 8;
                        i = 5;
                    } else {
                        if (!dqpVar.u()) {
                        }
                        if (dqpVar.u()) {
                            dqpVar.m();
                            dqpVar.t(dqpVar.i(16));
                            i = 5;
                            i13 = dqpVar.i(5);
                            while (i14 < i13) {
                                dqpVar.s(3);
                                dqpVar.s(8);
                            }
                            i2 = 8;
                        } else {
                            i2 = 8;
                            i = 5;
                        }
                    }
                    dqpVar.m();
                    if (i15 == 1) {
                        iF2 = ((i9 - dqpVar.f()) / i2) - iF;
                        if (i8 < iF2) {
                            throw new bsz("pres_bytes is smaller than presentation bytes read.", null, false, 1);
                        }
                        dqpVar.t(i8 - iF2);
                    }
                    if (cupVar.a) {
                        i3 = -1;
                        if (cupVar.b == -1) {
                            throw new bsz(a.bR(i19, "Can't determine channel mode of presentation "), null, false, 1);
                        }
                    } else {
                        i3 = -1;
                    }
                } else {
                    i9 = iF3;
                }
                i4 = 7;
                int i34 = dqpVar.i(7);
                for (int i35 = 0; i35 < i34; i35++) {
                    dqpVar.s(15);
                }
                i10 = i7;
                if (i10 <= 0) {
                    i2 = 8;
                    i = 5;
                } else {
                    if (!dqpVar.u()) {
                    }
                    if (dqpVar.u()) {
                        dqpVar.m();
                        dqpVar.t(dqpVar.i(16));
                        i = 5;
                        i13 = dqpVar.i(5);
                        while (i14 < i13) {
                            dqpVar.s(3);
                            dqpVar.s(8);
                        }
                        i2 = 8;
                    } else {
                        i2 = 8;
                        i = 5;
                    }
                }
                dqpVar.m();
                if (i15 == 1) {
                    iF2 = ((i9 - dqpVar.f()) / i2) - iF;
                    if (i8 < iF2) {
                        throw new bsz("pres_bytes is smaller than presentation bytes read.", null, false, 1);
                    }
                    dqpVar.t(i8 - iF2);
                }
                if (cupVar.a) {
                    i3 = -1;
                    if (cupVar.b == -1) {
                        throw new bsz(a.bR(i19, "Can't determine channel mode of presentation "), null, false, 1);
                    }
                } else {
                    i3 = -1;
                }
            } else {
                i = 5;
                i2 = 8;
                i3 = -1;
                i4 = 7;
            }
            if (cupVar.a) {
                int i36 = cupVar.b;
                boolean z2 = cupVar.d;
                int i37 = cupVar.e;
                switch (i36) {
                    case 0:
                        i2 = 1;
                        break;
                    case 1:
                        i2 = 2;
                        break;
                    case 2:
                        i2 = 3;
                        break;
                    case 3:
                        i2 = i;
                        break;
                    case 4:
                        i2 = 6;
                        break;
                    case 5:
                    case 7:
                    case 9:
                        i2 = i4;
                        break;
                    case 6:
                    case 8:
                    case 10:
                        break;
                    case 11:
                        i2 = 11;
                        break;
                    case 12:
                        i2 = 12;
                        break;
                    case 13:
                        i2 = 13;
                        break;
                    case 14:
                        i2 = 14;
                        break;
                    case 15:
                        i2 = 24;
                        break;
                    default:
                        i2 = i3;
                        break;
                }
                if (i36 == 11 || i36 == 12 || i36 == 13 || i36 == 14) {
                    if (!z2) {
                        i2 -= 2;
                    }
                    i5 = i2;
                    if (i37 == 0) {
                        i5 -= 4;
                    } else if (i37 == 1) {
                        i5 -= 2;
                    }
                } else {
                    i5 = i2;
                }
            } else {
                int i38 = cupVar.c;
                int i39 = cupVar.g;
                if (i38 > 0) {
                    i5 = i38 + 1;
                    if (i39 == 4 && i5 == 17) {
                        i5 = 21;
                    }
                } else if (i39 == 0) {
                    i5 = 2;
                } else if (i39 == 1) {
                    i5 = 6;
                } else if (i39 == 2) {
                    i5 = i2;
                } else if (i39 == 3) {
                    i5 = 10;
                } else if (i39 != 4) {
                    bvx.e("Ac4Util", a.bP(i39, "AC-4 level ", " has not been defined."));
                    i5 = 2;
                } else {
                    i5 = 12;
                }
            }
            if (i5 <= 0) {
                throw new bsz("Cannot determine channel count of presentation.", null, false, 1);
            }
            String strK = bwp.K("ac-4.%02d.%02d.%02d", Integer.valueOf(i16), Integer.valueOf(cupVar.f), Integer.valueOf(cupVar.g));
            bsd bsdVar = new bsd();
            bsdVar.a = str;
            bsdVar.e("audio/ac4");
            bsdVar.G = i5;
            bsdVar.I = i17;
            bsdVar.s = bsaVar;
            bsdVar.d = str2;
            bsdVar.k = strK;
            return new bse(bsdVar);
        }
    }

    public static void b(int i, bwb bwbVar) {
        bwbVar.L(7);
        byte[] bArr = bwbVar.b;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:0x008f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0092 A[PHI: r6
      0x0092: PHI (r6v2 int) = (r6v1 int), (r6v1 int), (r6v4 int), (r6v4 int), (r6v4 int), (r6v4 int) binds: [B:28:0x0067, B:30:0x006b, B:45:0x008d, B:42:0x0088, B:36:0x007d, B:39:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    public static aamu c(dqp dqpVar) {
        int i;
        int i2;
        int i3 = dqpVar.i(16);
        int i4 = dqpVar.i(16);
        if (i4 == 65535) {
            i4 = dqpVar.i(24);
            i = 7;
        } else {
            i = 4;
        }
        int i5 = i4 + i;
        if (i3 == 44097) {
            i5 += 2;
        }
        if (dqpVar.i(2) == 3) {
            do {
                dqpVar.i(2);
            } while (dqpVar.u());
        }
        int i6 = dqpVar.i(10);
        if (dqpVar.u() && dqpVar.i(3) > 0) {
            dqpVar.s(2);
        }
        int i7 = true != dqpVar.u() ? 44100 : 48000;
        int i8 = dqpVar.i(4);
        if (i7 == 44100 && i8 == 13) {
            i2 = b[13];
        } else {
            int i9 = 0;
            if (i7 != 48000 || i8 >= 14) {
                i2 = i9;
            } else {
                i9 = b[i8];
                int i10 = i6 % 5;
                if (i10 == 1) {
                    if (i8 != 3 || i8 == 8) {
                        i2 = i9 + 1;
                    } else {
                        i2 = i9;
                    }
                } else if (i10 != 2) {
                    if (i10 == 3) {
                        if (i8 != 3) {
                        }
                        i2 = i9 + 1;
                    } else if (i10 == 4 && (i8 == 3 || i8 == 8 || i8 == 11)) {
                        i2 = i9 + 1;
                    } else {
                        i2 = i9;
                    }
                } else if (i8 == 8 || i8 == 11) {
                    i2 = i9 + 1;
                } else {
                    i2 = i9;
                }
            }
        }
        return new aamu(i7, i5, i2, (char[]) null);
    }

    private static void d(dqp dqpVar, cup cupVar) throws bsz {
        int i = dqpVar.i(5);
        dqpVar.s(2);
        if (dqpVar.u()) {
            dqpVar.s(5);
        }
        if (i >= 7 && i <= 10) {
            dqpVar.r();
        }
        if (dqpVar.u()) {
            int i2 = dqpVar.i(3);
            if (cupVar.b == -1 && i >= 0 && i <= 15 && (i2 == 0 || i2 == 1)) {
                cupVar.b = i;
            }
            if (dqpVar.u()) {
                f(dqpVar);
            }
        }
    }

    private static void e(dqp dqpVar, cup cupVar) throws bsz {
        dqpVar.s(2);
        boolean zU = dqpVar.u();
        int i = dqpVar.i(8);
        for (int i2 = 0; i2 < i; i2++) {
            dqpVar.s(2);
            if (dqpVar.u()) {
                dqpVar.s(5);
            }
            if (zU) {
                dqpVar.s(24);
            } else {
                if (dqpVar.u()) {
                    if (!dqpVar.u()) {
                        dqpVar.s(4);
                    }
                    cupVar.c = dqpVar.i(6) + 1;
                }
                dqpVar.s(4);
            }
        }
        if (dqpVar.u()) {
            dqpVar.s(3);
            if (dqpVar.u()) {
                f(dqpVar);
            }
        }
    }

    private static void f(dqp dqpVar) throws bsz {
        int i = dqpVar.i(6);
        if (i < 2 || i > 42) {
            throw new bsz(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(i)), null, false, 1);
        }
        dqpVar.s(i << 3);
    }

    private static boolean g(dqp dqpVar) {
        if (dqpVar.f() < 66) {
            return false;
        }
        dqpVar.s(66);
        return true;
    }
}
