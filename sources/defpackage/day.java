package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class day extends dax {
    private int a;
    private boolean q;
    private dep r;
    private dfb s;
    private zf t;

    @Override // defpackage.dax
    protected final long a(bwb bwbVar) {
        byte b = bwbVar.b[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        dep depVar = this.r;
        depVar.getClass();
        acih[] acihVarArr = (acih[]) depVar.d;
        boolean z = acihVarArr[(b >> 1) & (255 >>> (8 - aua.e(acihVarArr.length - 1)))].a;
        Object obj = depVar.b;
        int i = z ? ((dfb) obj).a : ((dfb) obj).g;
        int i2 = this.q ? (this.a + i) / 4 : 0;
        int iE = bwbVar.e();
        int i3 = bwbVar.d + 4;
        if (iE < i3) {
            bwbVar.M(Arrays.copyOf(bwbVar.b, i3));
        } else {
            bwbVar.O(i3);
        }
        long j = i2;
        byte[] bArr = bwbVar.b;
        int i4 = bwbVar.d;
        bArr[i4 - 4] = (byte) (j & 255);
        bArr[i4 - 3] = (byte) ((j >>> 8) & 255);
        bArr[i4 - 2] = (byte) ((j >>> 16) & 255);
        bArr[i4 - 1] = (byte) ((j >>> 24) & 255);
        this.q = true;
        this.a = i;
        return j;
    }

    @Override // defpackage.dax
    protected final void b(boolean z) {
        super.b(z);
        if (z) {
            this.r = null;
            this.s = null;
            this.t = null;
        }
        this.a = 0;
        this.q = false;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0365  */
    @Override // defpackage.dax
    protected final boolean c(bwb bwbVar, long j, isw iswVar) throws bsz {
        dep depVar;
        if (this.r != null) {
            iswVar.a.getClass();
            return false;
        }
        dfb dfbVar = this.s;
        int i = 4;
        boolean z = true;
        if (dfbVar != null) {
            zf zfVar = this.t;
            if (zfVar == null) {
                this.t = aua.g(bwbVar, true, true);
            } else {
                int i2 = bwbVar.d;
                byte[] bArr = new byte[i2];
                System.arraycopy(bwbVar.b, 0, bArr, 0, i2);
                int i3 = dfbVar.c;
                int i4 = 5;
                aua.f(5, bwbVar, false);
                int iN = bwbVar.n() + 1;
                bxm bxmVar = new bxm(bwbVar.b);
                int i5 = 3;
                bxmVar.b(bwbVar.c << 3);
                int i6 = 0;
                while (true) {
                    int i7 = 2;
                    int i8 = i5;
                    int i9 = 16;
                    if (i6 >= iN) {
                        boolean z2 = z;
                        int i10 = 6;
                        int iA = bxmVar.a(6) + (z2 ? 1 : 0);
                        for (int i11 = 0; i11 < iA; i11++) {
                            if (bxmVar.a(16) != 0) {
                                throw new bsz("placeholder of time domain transforms not zeroed out", null, z2, z2 ? 1 : 0);
                            }
                        }
                        int iA2 = bxmVar.a(6) + (z2 ? 1 : 0);
                        int i12 = 0;
                        while (i12 < iA2) {
                            int iA3 = bxmVar.a(i9);
                            if (iA3 == 0) {
                                int i13 = 8;
                                bxmVar.b(8);
                                bxmVar.b(16);
                                bxmVar.b(16);
                                bxmVar.b(6);
                                bxmVar.b(8);
                                int iA4 = bxmVar.a(4) + (z2 ? 1 : 0);
                                int i14 = 0;
                                while (i14 < iA4) {
                                    bxmVar.b(i13);
                                    i14++;
                                    i13 = 8;
                                }
                            } else {
                                if (iA3 != z2) {
                                    throw new bsz(a.bR(iA3, "floor type greater than 1 not decodable: "), null, true, 1);
                                }
                                int iA5 = bxmVar.a(5);
                                int[] iArr = new int[iA5];
                                int i15 = -1;
                                for (int i16 = 0; i16 < iA5; i16++) {
                                    int iA6 = bxmVar.a(4);
                                    iArr[i16] = iA6;
                                    if (iA6 > i15) {
                                        i15 = iA6;
                                    }
                                }
                                int i17 = i15 + 1;
                                int[] iArr2 = new int[i17];
                                int i18 = 0;
                                while (i18 < i17) {
                                    iArr2[i18] = bxmVar.a(i8) + 1;
                                    int iA7 = bxmVar.a(i7);
                                    if (iA7 > 0) {
                                        bxmVar.b(8);
                                    }
                                    int i19 = i17;
                                    int i20 = 0;
                                    for (int i21 = 1; i20 < (i21 << iA7); i21 = 1) {
                                        bxmVar.b(8);
                                        i20++;
                                    }
                                    i18++;
                                    i17 = i19;
                                    i8 = 3;
                                    i7 = 2;
                                }
                                bxmVar.b(i7);
                                int iA8 = bxmVar.a(4);
                                int i22 = 0;
                                int i23 = 0;
                                for (int i24 = 0; i24 < iA5; i24++) {
                                    i22 += iArr2[iArr[i24]];
                                    while (i23 < i22) {
                                        bxmVar.b(iA8);
                                        i23++;
                                    }
                                }
                            }
                            i12++;
                            i8 = 3;
                            i10 = 6;
                            i7 = 2;
                            z2 = true;
                            i9 = 16;
                        }
                        int i25 = i10;
                        int i26 = 1;
                        int iA9 = bxmVar.a(i25) + 1;
                        int i27 = 0;
                        while (i27 < iA9) {
                            if (bxmVar.a(16) > 2) {
                                throw new bsz("residueType greater than 2 is not decodable", null, true, 1);
                            }
                            bxmVar.b(24);
                            bxmVar.b(24);
                            bxmVar.b(24);
                            int iA10 = bxmVar.a(i25) + 1;
                            bxmVar.b(8);
                            int[] iArr3 = new int[iA10];
                            for (int i28 = 0; i28 < iA10; i28++) {
                                iArr3[i28] = ((bxmVar.c() ? bxmVar.a(5) : 0) << 3) + bxmVar.a(3);
                            }
                            for (int i29 = 0; i29 < iA10; i29++) {
                                for (int i30 = 0; i30 < 8; i30++) {
                                    if ((iArr3[i29] & (1 << i30)) != 0) {
                                        bxmVar.b(8);
                                    }
                                }
                            }
                            i27++;
                            i25 = 6;
                            i26 = 1;
                        }
                        int iA11 = bxmVar.a(i25) + i26;
                        for (int i31 = 0; i31 < iA11; i31++) {
                            int iA12 = bxmVar.a(16);
                            if (iA12 != 0) {
                                bvx.c("VorbisUtil", a.bR(iA12, "mapping type other than 0 not supported: "));
                            } else {
                                int iA13 = bxmVar.c() ? bxmVar.a(4) + 1 : 1;
                                if (bxmVar.c()) {
                                    int iA14 = bxmVar.a(8) + 1;
                                    for (int i32 = 0; i32 < iA14; i32++) {
                                        int i33 = i3 - 1;
                                        bxmVar.b(aua.e(i33));
                                        bxmVar.b(aua.e(i33));
                                    }
                                }
                                if (bxmVar.a(2) != 0) {
                                    throw new bsz("to reserved bits must be zero after mapping coupling steps", null, true, 1);
                                }
                                if (iA13 > 1) {
                                    for (int i34 = 0; i34 < i3; i34++) {
                                        bxmVar.b(4);
                                    }
                                }
                                for (int i35 = 0; i35 < iA13; i35++) {
                                    bxmVar.b(8);
                                    bxmVar.b(8);
                                    bxmVar.b(8);
                                }
                            }
                        }
                        int iA15 = bxmVar.a(6) + 1;
                        acih[] acihVarArr = new acih[iA15];
                        for (int i36 = 0; i36 < iA15; i36++) {
                            boolean zC = bxmVar.c();
                            bxmVar.a(16);
                            bxmVar.a(16);
                            bxmVar.a(8);
                            acihVarArr[i36] = new acih(zC);
                        }
                        if (!bxmVar.c()) {
                            throw new bsz("framing bit after modes not set as expected", null, true, 1);
                        }
                        depVar = new dep(dfbVar, zfVar, bArr, acihVarArr);
                        break;
                    }
                    if (bxmVar.a(24) != 5653314) {
                        throw new bsz("expected code book to start with [0x56, 0x43, 0x42] at " + ((bxmVar.a << 3) + bxmVar.b), null, true, 1);
                    }
                    int iA16 = bxmVar.a(16);
                    int iA17 = bxmVar.a(24);
                    if (bxmVar.c()) {
                        bxmVar.b(i4);
                        for (int iA18 = 0; iA18 < iA17; iA18 += bxmVar.a(aua.e(iA17 - iA18))) {
                        }
                    } else {
                        boolean zC2 = bxmVar.c();
                        for (int i37 = 0; i37 < iA17; i37++) {
                            if (!zC2) {
                                bxmVar.b(i4);
                            } else if (bxmVar.c()) {
                                bxmVar.b(i4);
                            }
                        }
                    }
                    int iA19 = bxmVar.a(i);
                    if (iA19 > 2) {
                        throw new bsz(a.bR(iA19, "lookup type greater than 2 not decodable: "), null, true, 1);
                    }
                    if (iA19 != 1) {
                        if (iA19 != 2) {
                            iN = iN;
                        }
                        i6++;
                        i5 = i8;
                        iN = iN;
                        i = 4;
                        z = true;
                        i4 = 5;
                    } else {
                        i7 = iA19;
                    }
                    bxmVar.b(32);
                    bxmVar.b(32);
                    int iA20 = bxmVar.a(i) + 1;
                    bxmVar.b(1);
                    bxmVar.b((int) ((i7 == 1 ? iA16 != 0 ? (long) Math.floor(Math.pow(iA17, 1.0d / ((double) iA16))) : 0L : ((long) iA17) * ((long) iA16)) * ((long) iA20)));
                    i6++;
                    i5 = i8;
                    iN = iN;
                    i = 4;
                    z = true;
                    i4 = 5;
                }
            }
            this.r = depVar;
            if (depVar != null) {
                ArrayList arrayList = new ArrayList();
                dfb dfbVar2 = (dfb) depVar.b;
                arrayList.add(dfbVar2.f);
                arrayList.add(depVar.a);
                bsx bsxVarA = cwk.a(agke.p((Object[]) ((zf) depVar.c).a));
                bsd bsdVar = new bsd();
                bsdVar.a("audio/ogg");
                bsdVar.e("audio/vorbis");
                bsdVar.i = dfbVar2.d;
                bsdVar.j = dfbVar2.e;
                bsdVar.G = dfbVar2.c;
                bsdVar.I = dfbVar2.b;
                bsdVar.r = arrayList;
                bsdVar.l = bsxVarA;
                iswVar.a = new bse(bsdVar);
            }
            return true;
        }
        aua.f(1, bwbVar, false);
        bwbVar.k();
        int iN2 = bwbVar.n();
        int iK = bwbVar.k();
        int iJ = bwbVar.j();
        int i38 = iJ <= 0 ? -1 : iJ;
        int iJ2 = bwbVar.j();
        int i39 = iJ2 <= 0 ? -1 : iJ2;
        bwbVar.j();
        int iN3 = bwbVar.n();
        int iPow = (int) Math.pow(2.0d, iN3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iN3 & 240) >> 4);
        bwbVar.n();
        this.s = new dfb(iN2, iK, i38, i39, iPow, iPow2, Arrays.copyOf(bwbVar.b, bwbVar.d));
        depVar = null;
        this.r = depVar;
        if (depVar != null) {
            ArrayList arrayList2 = new ArrayList();
            dfb dfbVar3 = (dfb) depVar.b;
            arrayList2.add(dfbVar3.f);
            arrayList2.add(depVar.a);
            bsx bsxVarA2 = cwk.a(agke.p((Object[]) ((zf) depVar.c).a));
            bsd bsdVar2 = new bsd();
            bsdVar2.a("audio/ogg");
            bsdVar2.e("audio/vorbis");
            bsdVar2.i = dfbVar3.d;
            bsdVar2.j = dfbVar3.e;
            bsdVar2.G = dfbVar3.c;
            bsdVar2.I = dfbVar3.b;
            bsdVar2.r = arrayList2;
            bsdVar2.l = bsxVarA2;
            iswVar.a = new bse(bsdVar2);
        }
        return true;
    }

    @Override // defpackage.dax
    protected final void h(long j) {
        super.h(j);
        this.q = j != 0;
        dfb dfbVar = this.s;
        this.a = dfbVar != null ? dfbVar.g : 0;
    }
}
