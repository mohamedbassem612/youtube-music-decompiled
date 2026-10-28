package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aq extends at {
    int ag;
    int ah;
    private bxi at;
    protected final am af = new am();
    private int am = 0;
    private int an = 0;
    private ap[] ao = new ap[4];
    private ap[] ap = new ap[4];
    private ap[] aq = new ap[4];
    public int ai = 2;
    private final boolean[] ar = new boolean[3];
    private final ap[] as = new ap[4];
    public boolean aj = false;
    public boolean ak = false;

    /* JADX WARN: Code duplicated, block: B:92:0x014b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    private final int G(am amVar, ap[] apVarArr, ap apVar, int i, boolean[] zArr) {
        ao aoVar;
        ao aoVar2;
        boolean z = false;
        zArr[0] = true;
        zArr[1] = false;
        ap apVar2 = null;
        apVarArr[0] = null;
        apVarArr[2] = null;
        apVarArr[1] = null;
        apVarArr[3] = null;
        int i2 = 8;
        if (i == 0) {
            ao aoVar3 = apVar.i;
            ao aoVar4 = aoVar3.b;
            boolean z2 = aoVar4 == null || aoVar4.a == this;
            apVar.ab = null;
            ap apVar3 = apVar.K != 8 ? apVar : null;
            ap apVar4 = apVar;
            int i3 = 0;
            ap apVar5 = null;
            ap apVar6 = apVar3;
            while (true) {
                aoVar2 = apVar4.k;
                if (aoVar2.b == null) {
                    break;
                }
                apVar4.ab = apVar2;
                if (apVar4.K != 8) {
                    if (apVar3 == null) {
                        apVar3 = apVar4;
                    }
                    if (apVar6 != null && apVar6 != apVar4) {
                        apVar6.ab = apVar4;
                    }
                    apVar6 = apVar4;
                } else {
                    ao aoVar5 = apVar4.i;
                    amVar.n(aoVar5.f, aoVar5.b.f, 0, 5);
                    amVar.n(aoVar2.f, aoVar5.f, 0, 5);
                }
                if (apVar4.K != 8 && apVar4.ad == 3) {
                    if (apVar4.ae == 3) {
                        zArr[0] = false;
                    }
                    if (apVar4.u <= 0.0f) {
                        zArr[0] = false;
                        int i4 = i3 + 1;
                        ap[] apVarArr2 = this.ao;
                        int length = apVarArr2.length;
                        if (i4 >= length) {
                            apVarArr2 = (ap[]) Arrays.copyOf(apVarArr2, length << 1);
                            this.ao = apVarArr2;
                        }
                        apVarArr2[i3] = apVar4;
                        i3 = i4;
                    }
                }
                ap apVar7 = aoVar2.b.a;
                ao aoVar6 = apVar7.i.b;
                if (aoVar6 == null || aoVar6.a != apVar4 || apVar7 == apVar4) {
                    break;
                }
                apVar5 = apVar7;
                apVar4 = apVar5;
                apVar2 = null;
            }
            ao aoVar7 = aoVar2.b;
            if (aoVar7 != null && aoVar7.a != this) {
                z2 = false;
            }
            if (aoVar3.b == null || apVar5.k.b == null) {
                zArr[1] = true;
            }
            apVar.X = z2;
            apVar5.ab = null;
            apVarArr[0] = apVar;
            apVarArr[2] = apVar3;
            apVarArr[1] = apVar5;
            apVarArr[3] = apVar6;
            return i3;
        }
        ao aoVar8 = apVar.j;
        ao aoVar9 = aoVar8.b;
        boolean z3 = aoVar9 == null || aoVar9.a == this;
        ap apVar8 = null;
        apVar.ac = null;
        ap apVar9 = apVar;
        int i5 = 0;
        ap apVar10 = null;
        ap apVar11 = apVar.K != 8 ? apVar : null;
        ap apVar12 = apVar11;
        while (true) {
            aoVar = apVar9.l;
            if (aoVar.b == null) {
                z = z ? 1 : 0;
                break;
            }
            apVar9.ac = apVar8;
            if (apVar9.K != i2) {
                if (apVar11 == null) {
                    apVar11 = apVar9;
                }
                if (apVar12 != null && apVar12 != apVar9) {
                    apVar12.ac = apVar9;
                }
                apVar12 = apVar9;
            } else {
                ao aoVar10 = apVar9.j;
                amVar.n(aoVar10.f, aoVar10.b.f, z ? 1 : 0, 5);
                amVar.n(aoVar.f, aoVar10.f, z ? 1 : 0, 5);
            }
            i2 = 8;
            if (apVar9.K != 8 && apVar9.ae == 3) {
                if (apVar9.ad == 3) {
                    zArr[z ? 1 : 0] = z;
                }
                if (apVar9.u <= 0.0f) {
                    zArr[z ? 1 : 0] = z;
                    int i6 = i5 + 1;
                    ap[] apVarArr3 = this.ao;
                    int length2 = apVarArr3.length;
                    if (i6 >= length2) {
                        apVarArr3 = (ap[]) Arrays.copyOf(apVarArr3, length2 << 1);
                        this.ao = apVarArr3;
                    }
                    apVarArr3[i5] = apVar9;
                    i5 = i6;
                }
            }
            ap apVar13 = aoVar.b.a;
            ao aoVar11 = apVar13.j.b;
            if (aoVar11 == null || aoVar11.a != apVar9 || apVar13 == apVar9) {
                break;
            }
            apVar10 = apVar13;
            apVar9 = apVar10;
            z = z ? 1 : 0;
            apVar8 = null;
        }
        ao aoVar12 = aoVar.b;
        ?? r6 = z3;
        if (aoVar12 != null && aoVar12.a != this) {
            r6 = z3;
            r6 = z;
        }
        r6 = z3;
        if (aoVar8.b == null || apVar10.l.b == null) {
            zArr[1] = true;
        }
        apVar.Y = r6;
        apVar10.ac = null;
        apVarArr[z] = apVar;
        apVarArr[2] = apVar11;
        apVarArr[1] = apVar10;
        apVarArr[3] = apVar12;
        return i5;
    }

    /* JADX WARN: Code duplicated, block: B:242:0x0470  */
    /* JADX WARN: Code duplicated, block: B:244:0x0497  */
    /* JADX WARN: Code duplicated, block: B:245:0x049a  */
    /* JADX WARN: Code duplicated, block: B:247:0x049e  */
    /* JADX WARN: Code duplicated, block: B:249:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:250:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:252:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:254:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:255:0x04b3 A[PHI: r4
      0x04b3: PHI (r4v9 ap) = (r4v8 ap), (r4v20 ap) binds: [B:251:0x04a9, B:254:0x04b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:256:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:258:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:260:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:262:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:263:0x04c7 A[PHI: r4
      0x04c7: PHI (r4v13 an) = (r4v12 an), (r4v17 an) binds: [B:259:0x04bd, B:262:0x04c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:264:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:266:0x04cd A[ADDED_TO_REGION] */
    private final void H(am amVar) {
        int iG;
        float f;
        float f2;
        ao aoVar;
        float fH;
        ao aoVar2;
        ap apVar;
        ap apVar2;
        int i;
        int i2;
        ao aoVar3;
        ao aoVar4;
        ap apVar3;
        int iA;
        int iA2;
        ao aoVar5;
        an anVar;
        ap apVar4;
        an anVar2;
        an anVar3;
        ao aoVar6;
        ao aoVar7;
        ao aoVar8;
        int i3;
        ao aoVar9;
        ao aoVar10;
        ao aoVar11;
        ao aoVar12;
        ap apVar5;
        ao aoVar13;
        ao aoVar14;
        int iA3;
        int i4;
        int i5 = 0;
        while (i5 < this.am) {
            ap apVar6 = this.aq[i5];
            ap[] apVarArr = this.as;
            boolean[] zArr = this.ar;
            int iG2 = G(amVar, apVarArr, apVar6, 0, zArr);
            aq aqVar = this;
            ap[] apVarArr2 = apVarArr;
            ap apVar7 = apVar6;
            ap apVar8 = apVarArr2[2];
            if (apVar8 != null) {
                int i6 = 1;
                if (zArr[1]) {
                    int iB = apVar7.b();
                    while (apVar8 != null) {
                        ao aoVar15 = apVar8.i;
                        amVar.h(aoVar15.f, iB);
                        ap apVar9 = apVar8.ab;
                        iB += aoVar15.a() + apVar8.h() + apVar8.k.a();
                        apVar8 = apVar9;
                    }
                } else {
                    int i7 = apVar7.V;
                    boolean z = i7 == 0;
                    boolean z2 = i7 == 2;
                    int i8 = aqVar.ad;
                    int i9 = aqVar.ai;
                    int i10 = 0;
                    int i11 = 3;
                    if ((i9 == 2 || i9 == 8) && zArr[0] && apVar7.X && !z2 && i8 != 2 && i7 == 0) {
                        ap apVar10 = apVar7;
                        float f3 = 0.0f;
                        int i12 = 0;
                        int iA4 = 0;
                        ap apVar11 = null;
                        while (apVar10 != null) {
                            if (apVar10.K != 8) {
                                i12++;
                                if (apVar10.ad != 3) {
                                    int iH = iA4 + apVar10.h();
                                    ao aoVar16 = apVar10.i;
                                    int iA5 = iH + (aoVar16.b != null ? aoVar16.a() : 0);
                                    ao aoVar17 = apVar10.k;
                                    iA4 = iA5 + (aoVar17.b != null ? aoVar17.a() : 0);
                                } else {
                                    f3 += apVar10.Z;
                                }
                            }
                            ao aoVar18 = apVar10.k.b;
                            ap apVar12 = aoVar18 != null ? aoVar18.a : null;
                            if (apVar12 != null && ((aoVar2 = apVar12.i.b) == null || aoVar2.a != apVar10)) {
                                apVar12 = null;
                            }
                            ap apVar13 = apVar10;
                            apVar10 = apVar12;
                            apVar11 = apVar13;
                        }
                        int i13 = i12 + 1;
                        if (apVar11 != null) {
                            ao aoVar19 = apVar11.k.b;
                            iG = aoVar19 != null ? aoVar19.a.w : 0;
                            if (aoVar19 != null && aoVar19.a == aqVar) {
                                iG = aqVar.g();
                            }
                        } else {
                            iG = 0;
                        }
                        float f4 = i13;
                        float f5 = iG - iA4;
                        if (iG2 == 0) {
                            f2 = f5 / f4;
                            f = f2;
                        } else {
                            f = f5 / iG2;
                            f2 = 0.0f;
                        }
                        while (apVar7 != null) {
                            ao aoVar20 = apVar7.i;
                            int iA6 = aoVar20.b != null ? aoVar20.a() : 0;
                            ao aoVar21 = apVar7.k;
                            int iA7 = aoVar21.b != null ? aoVar21.a() : 0;
                            if (apVar7.K != 8) {
                                float f6 = iA7;
                                float f7 = iA6;
                                float f8 = f2 + f7;
                                amVar.h(aoVar20.f, (int) (f8 + 0.5f));
                                if (apVar7.ad == 3) {
                                    fH = (f3 == 0.0f ? f - f7 : ((apVar7.Z * f5) / f3) - f7) - f6;
                                } else {
                                    fH = apVar7.h();
                                }
                                float f9 = f8 + fH;
                                amVar.h(aoVar21.f, (int) (f9 + 0.5f));
                                if (iG2 == 0) {
                                    f9 += f;
                                }
                                f2 = f9 + f6;
                            } else {
                                int i14 = (int) ((f2 - (f / 2.0f)) + 0.5f);
                                amVar.h(aoVar20.f, i14);
                                amVar.h(aoVar21.f, i14);
                            }
                            ao aoVar22 = aoVar21.b;
                            ap apVar14 = aoVar22 != null ? aoVar22.a : null;
                            apVar7 = (apVar14 == null || (aoVar = apVar14.i.b) == null || aoVar.a == apVar7) ? apVar14 : null;
                            if (apVar7 == aqVar) {
                                apVar7 = null;
                            }
                        }
                    } else {
                        if (iG2 == 0) {
                            apVar = null;
                            apVar2 = null;
                            i = 0;
                        } else if (!z2) {
                            float f10 = 0.0f;
                            ap apVar15 = null;
                            while (apVar8 != null) {
                                if (apVar8.ad != 3) {
                                    ao aoVar23 = apVar8.i;
                                    int iA8 = aoVar23.a();
                                    if (apVar15 != null) {
                                        iA8 += apVar15.k.a();
                                    }
                                    ao aoVar24 = aoVar23.b;
                                    amVar.i(aoVar23.f, aoVar24.f, iA8, aoVar24.a.ad == 3 ? 2 : 3);
                                    ao aoVar25 = apVar8.k;
                                    int iA9 = aoVar25.a();
                                    ao aoVar26 = aoVar25.b.a.i;
                                    ao aoVar27 = aoVar26.b;
                                    if (aoVar27 != null && aoVar27.a == apVar8) {
                                        iA9 += aoVar26.a();
                                    }
                                    ao aoVar28 = aoVar25.b;
                                    amVar.j(aoVar25.f, aoVar28.f, -iA9, aoVar28.a.ad == 3 ? 2 : 3);
                                    i4 = i10;
                                } else {
                                    f10 += apVar8.Z;
                                    ao aoVar29 = apVar8.k;
                                    if (aoVar29.b != null) {
                                        iA3 = aoVar29.a();
                                        if (apVar8 != apVarArr2[3]) {
                                            iA3 += aoVar29.b.a.i.a();
                                        }
                                    } else {
                                        iA3 = i10;
                                    }
                                    i4 = i10;
                                    amVar.i(aoVar29.f, apVar8.i.f, i4, 1);
                                    amVar.j(aoVar29.f, aoVar29.b.f, -iA3, 1);
                                }
                                ap apVar16 = apVar8;
                                apVar8 = apVar8.ab;
                                apVar15 = apVar16;
                                i10 = i4;
                            }
                            int i15 = i10;
                            if (iG2 != 1) {
                                int i16 = i15;
                                while (true) {
                                    int i17 = iG2 - 1;
                                    if (i16 >= i17) {
                                        break;
                                    }
                                    ap[] apVarArr3 = aqVar.ao;
                                    ap apVar17 = apVarArr3[i16];
                                    i16++;
                                    ap apVar18 = apVarArr3[i16];
                                    ao aoVar30 = apVar17.i;
                                    an anVar4 = aoVar30.f;
                                    ao aoVar31 = apVar17.k;
                                    int i18 = i6;
                                    an anVar5 = aoVar31.f;
                                    int i19 = i11;
                                    ao aoVar32 = apVar18.i;
                                    an anVar6 = aoVar32.f;
                                    int i20 = iG2;
                                    ao aoVar33 = apVar18.k;
                                    int i21 = i5;
                                    an anVar7 = aoVar33.f;
                                    if (apVar18 == apVarArr2[i19]) {
                                        anVar7 = apVarArr2[i18].k.f;
                                    }
                                    int iA10 = aoVar30.a();
                                    ao aoVar34 = aoVar30.b;
                                    ap[] apVarArr4 = apVarArr2;
                                    amVar.i(anVar4, aoVar30.b.f, (aoVar34 == null || (aoVar14 = (aoVar13 = aoVar34.a.k).b) == null || aoVar14.a != apVar17) ? iA10 : iA10 + aoVar13.a(), 2);
                                    int iA11 = aoVar31.a();
                                    if (aoVar31.b != null && (apVar5 = apVar17.ab) != null) {
                                        ao aoVar35 = apVar5.i;
                                        iA11 += aoVar35.b != null ? aoVar35.a() : 0;
                                    }
                                    amVar.j(anVar5, aoVar31.b.f, -iA11, 2);
                                    if (i16 == i17) {
                                        int iA12 = aoVar32.a();
                                        ao aoVar36 = aoVar32.b;
                                        if (aoVar36 != null && (aoVar12 = (aoVar11 = aoVar36.a.k).b) != null && aoVar12.a == apVar18) {
                                            iA12 += aoVar11.a();
                                        }
                                        amVar.i(anVar6, aoVar32.b.f, iA12, 2);
                                        ao aoVar37 = apVar18 == apVarArr4[i19] ? apVarArr4[i18].k : aoVar33;
                                        int iA13 = aoVar37.a();
                                        ao aoVar38 = aoVar37.b;
                                        if (aoVar38 != null && (aoVar10 = (aoVar9 = aoVar38.a.i).b) != null && aoVar10.a == apVar18) {
                                            iA13 += aoVar9.a();
                                        }
                                        i3 = 2;
                                        amVar.j(anVar7, aoVar37.b.f, -iA13, 2);
                                    } else {
                                        i3 = 2;
                                    }
                                    int i22 = apVar7.f;
                                    if (i22 > 0) {
                                        amVar.j(anVar5, anVar4, i22, i3);
                                    }
                                    ak akVarA = amVar.a();
                                    akVarA.f(apVar17.Z, f10, apVar18.Z, anVar4, aoVar30.a(), anVar5, aoVar31.a(), anVar6, aoVar32.a(), anVar7, aoVar33.a());
                                    amVar.g(akVarA);
                                    aqVar = this;
                                    i6 = i18;
                                    i11 = i19;
                                    iG2 = i20;
                                    i5 = i21;
                                    apVarArr2 = apVarArr4;
                                }
                            } else {
                                ap apVar19 = aqVar.ao[i15];
                                ao aoVar39 = apVar19.i;
                                int iA14 = aoVar39.a();
                                ao aoVar40 = aoVar39.b;
                                if (aoVar40 != null) {
                                    iA14 += aoVar40.a();
                                }
                                ao aoVar41 = apVar19.k;
                                int iA15 = aoVar41.a();
                                ao aoVar42 = aoVar41.b;
                                if (aoVar42 != null) {
                                    iA15 += aoVar42.a();
                                }
                                ao aoVar43 = apVar7.k;
                                an anVar8 = aoVar43.b.f;
                                if (apVar19 == apVarArr2[3]) {
                                    anVar8 = apVarArr2[1].k.b.f;
                                }
                                int i23 = -iA15;
                                if (apVar19.c == 1) {
                                    ao aoVar44 = apVar7.i;
                                    amVar.i(aoVar44.f, aoVar44.b.f, iA14, 1);
                                    amVar.j(aoVar43.f, anVar8, i23, 1);
                                    amVar.n(aoVar43.f, aoVar44.f, apVar7.h(), 2);
                                } else {
                                    amVar.n(aoVar39.f, aoVar39.b.f, iA14, 1);
                                    amVar.n(aoVar41.f, anVar8, i23, 1);
                                }
                            }
                        } else {
                            i = 0;
                            apVar = null;
                            apVar2 = null;
                        }
                        while (apVar8 != null) {
                            ap apVar20 = apVar8.ab;
                            if (apVar20 == null) {
                                apVar = apVarArr2[i6];
                                i2 = i6;
                            } else {
                                i2 = i;
                            }
                            ap apVar21 = apVar;
                            if (z2) {
                                ao aoVar45 = apVar8.i;
                                int iA16 = aoVar45.a();
                                if (apVar2 != null) {
                                    iA16 += apVar2.k.a();
                                }
                                amVar.i(aoVar45.f, aoVar45.b.f, iA16, apVar8 != apVar8 ? i11 : i6);
                                int i24 = i11;
                                if (apVar8.ad == i24) {
                                    ao aoVar46 = apVar8.k;
                                    if (apVar8.c == i6) {
                                        amVar.n(aoVar46.f, aoVar45.f, Math.max(apVar8.e, apVar8.h()), i24);
                                    } else {
                                        amVar.i(aoVar45.f, aoVar45.b.f, aoVar45.c, i24);
                                        amVar.j(aoVar46.f, aoVar45.f, apVar8.e, i24);
                                    }
                                }
                            } else if (z || i2 == 0) {
                                if (z && i2 == 0 && apVar2 == null) {
                                    ao aoVar47 = apVar8.i;
                                    if (aoVar47.b == null) {
                                        amVar.h(aoVar47.f, apVar8.b());
                                    } else {
                                        amVar.n(aoVar47.f, apVar7.i.b.f, aoVar47.a(), 5);
                                    }
                                } else {
                                    aoVar3 = apVar8.i;
                                    aoVar4 = apVar8.k;
                                    apVar3 = apVar2;
                                    iA = aoVar3.a();
                                    iA2 = aoVar4.a();
                                    amVar.i(aoVar3.f, aoVar3.b.f, iA, 1);
                                    amVar.j(aoVar4.f, aoVar4.b.f, -iA2, 1);
                                    aoVar5 = aoVar3.b;
                                    if (aoVar5 != null) {
                                        anVar = aoVar5.f;
                                    } else {
                                        anVar = null;
                                    }
                                    if (apVar3 == null) {
                                        aoVar8 = apVar7.i.b;
                                        if (aoVar8 != null) {
                                            anVar = aoVar8.f;
                                        } else {
                                            anVar = null;
                                        }
                                    }
                                    if (apVar20 != null) {
                                        apVar4 = apVar20;
                                    } else {
                                        aoVar7 = apVar21.k.b;
                                        if (aoVar7 != null) {
                                            apVar20 = aoVar7.a;
                                            apVar4 = apVar20;
                                        } else {
                                            apVar4 = null;
                                        }
                                    }
                                    if (apVar4 != null) {
                                        anVar2 = apVar4.i.f;
                                        if (i2 == 0) {
                                            anVar3 = anVar2;
                                        } else {
                                            aoVar6 = apVar21.k.b;
                                            if (aoVar6 != null) {
                                                anVar2 = aoVar6.f;
                                                anVar3 = anVar2;
                                            } else {
                                                anVar3 = null;
                                            }
                                        }
                                        if (anVar != null && anVar3 != null) {
                                            amVar.m(aoVar3.f, anVar, iA, 0.5f, anVar3, aoVar4.f, iA2);
                                        }
                                    }
                                    apVar20 = apVar4;
                                }
                            } else if (apVar2 != null) {
                                ao aoVar48 = apVar8.k;
                                if (aoVar48.b == null) {
                                    amVar.h(aoVar48.f, apVar8.b() + apVar8.y);
                                } else {
                                    amVar.n(aoVar48.f, apVar21.k.b.f, -aoVar48.a(), 5);
                                }
                            } else {
                                apVar2 = null;
                                if (z) {
                                    aoVar3 = apVar8.i;
                                    aoVar4 = apVar8.k;
                                    apVar3 = apVar2;
                                    iA = aoVar3.a();
                                    iA2 = aoVar4.a();
                                    amVar.i(aoVar3.f, aoVar3.b.f, iA, 1);
                                    amVar.j(aoVar4.f, aoVar4.b.f, -iA2, 1);
                                    aoVar5 = aoVar3.b;
                                    if (aoVar5 != null) {
                                        anVar = aoVar5.f;
                                    } else {
                                        anVar = null;
                                    }
                                    if (apVar3 == null) {
                                        aoVar8 = apVar7.i.b;
                                        if (aoVar8 != null) {
                                            anVar = aoVar8.f;
                                        } else {
                                            anVar = null;
                                        }
                                    }
                                    if (apVar20 != null) {
                                        apVar4 = apVar20;
                                    } else {
                                        aoVar7 = apVar21.k.b;
                                        if (aoVar7 != null) {
                                            apVar20 = aoVar7.a;
                                            apVar4 = apVar20;
                                        } else {
                                            apVar4 = null;
                                        }
                                    }
                                    if (apVar4 != null) {
                                        anVar2 = apVar4.i.f;
                                        if (i2 == 0) {
                                            anVar3 = anVar2;
                                        } else {
                                            aoVar6 = apVar21.k.b;
                                            if (aoVar6 != null) {
                                                anVar2 = aoVar6.f;
                                                anVar3 = anVar2;
                                            } else {
                                                anVar3 = null;
                                            }
                                        }
                                        if (anVar != null) {
                                            amVar.m(aoVar3.f, anVar, iA, 0.5f, anVar3, aoVar4.f, iA2);
                                        }
                                    }
                                    apVar20 = apVar4;
                                } else {
                                    aoVar3 = apVar8.i;
                                    aoVar4 = apVar8.k;
                                    apVar3 = apVar2;
                                    iA = aoVar3.a();
                                    iA2 = aoVar4.a();
                                    amVar.i(aoVar3.f, aoVar3.b.f, iA, 1);
                                    amVar.j(aoVar4.f, aoVar4.b.f, -iA2, 1);
                                    aoVar5 = aoVar3.b;
                                    if (aoVar5 != null) {
                                        anVar = aoVar5.f;
                                    } else {
                                        anVar = null;
                                    }
                                    if (apVar3 == null) {
                                        aoVar8 = apVar7.i.b;
                                        if (aoVar8 != null) {
                                            anVar = aoVar8.f;
                                        } else {
                                            anVar = null;
                                        }
                                    }
                                    if (apVar20 != null) {
                                        apVar4 = apVar20;
                                    } else {
                                        aoVar7 = apVar21.k.b;
                                        if (aoVar7 != null) {
                                            apVar20 = aoVar7.a;
                                            apVar4 = apVar20;
                                        } else {
                                            apVar4 = null;
                                        }
                                    }
                                    if (apVar4 != null) {
                                        anVar2 = apVar4.i.f;
                                        if (i2 == 0) {
                                            anVar3 = anVar2;
                                        } else {
                                            aoVar6 = apVar21.k.b;
                                            if (aoVar6 != null) {
                                                anVar2 = aoVar6.f;
                                                anVar3 = anVar2;
                                            } else {
                                                anVar3 = null;
                                            }
                                        }
                                        if (anVar != null) {
                                            amVar.m(aoVar3.f, anVar, iA, 0.5f, anVar3, aoVar4.f, iA2);
                                        }
                                    }
                                    apVar20 = apVar4;
                                }
                            }
                            if (1 == i2) {
                                apVar20 = null;
                            }
                            apVar2 = apVar8;
                            i = i2;
                            apVar = apVar21;
                            i6 = 1;
                            i11 = 3;
                            apVar8 = apVar20;
                        }
                        if (z2) {
                            ao aoVar49 = apVar8.i;
                            ao aoVar50 = apVar.k;
                            int iA17 = aoVar49.a();
                            int iA18 = aoVar50.a();
                            ao aoVar51 = apVar7.i.b;
                            an anVar9 = aoVar51 != null ? aoVar51.f : null;
                            ao aoVar52 = aoVar50.b;
                            an anVar10 = aoVar52 != null ? aoVar52.f : null;
                            if (anVar9 != null && anVar10 != null) {
                                amVar.j(aoVar50.f, anVar10, -iA18, 1);
                                amVar.m(aoVar49.f, anVar9, iA17, apVar7.H, anVar10, aoVar50.f, iA18);
                            }
                        }
                    }
                }
                i5 = i5;
            } else {
                i5 = i5;
            }
            i5++;
        }
    }

    final void A(ap apVar, int i) {
        int i2 = 0;
        if (i == 0) {
            while (true) {
                ao aoVar = apVar.i;
                ao aoVar2 = aoVar.b;
                if (aoVar2 == null) {
                    break;
                }
                ap apVar2 = aoVar2.a;
                ao aoVar3 = apVar2.k.b;
                if (aoVar3 == null || aoVar3 != aoVar || apVar2 == apVar) {
                    break;
                } else {
                    apVar = apVar2;
                }
            }
            while (true) {
                int i3 = this.am;
                ap[] apVarArr = this.aq;
                if (i2 >= i3) {
                    int i4 = i3 + 1;
                    int length = apVarArr.length;
                    if (i4 >= length) {
                        apVarArr = (ap[]) Arrays.copyOf(apVarArr, length << 1);
                        this.aq = apVarArr;
                    }
                    int i5 = this.am;
                    apVarArr[i5] = apVar;
                    this.am = i5 + 1;
                    return;
                }
                if (apVarArr[i2] == apVar) {
                    return;
                } else {
                    i2++;
                }
            }
        } else {
            while (true) {
                ao aoVar4 = apVar.j;
                ao aoVar5 = aoVar4.b;
                if (aoVar5 == null) {
                    break;
                }
                ap apVar3 = aoVar5.a;
                ao aoVar6 = apVar3.l.b;
                if (aoVar6 == null || aoVar6 != aoVar4 || apVar3 == apVar) {
                    break;
                } else {
                    apVar = apVar3;
                }
            }
            while (true) {
                int i6 = this.an;
                ap[] apVarArr2 = this.ap;
                if (i2 >= i6) {
                    int i7 = i6 + 1;
                    int length2 = apVarArr2.length;
                    if (i7 >= length2) {
                        apVarArr2 = (ap[]) Arrays.copyOf(apVarArr2, length2 << 1);
                        this.ap = apVarArr2;
                    }
                    int i8 = this.an;
                    apVarArr2[i8] = apVar;
                    this.an = i8 + 1;
                    return;
                }
                if (apVarArr2[i2] == apVar) {
                    return;
                } else {
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x012b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0141 A[PHI: r0
      0x0141: PHI (r0v3 int) = (r0v2 int), (r0v2 int), (r0v4 int), (r0v4 int) binds: [B:89:0x00fb, B:91:0x0101, B:108:0x012e, B:112:0x0138] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    public final void B(ap apVar, boolean[] zArr) {
        int iA;
        ap apVar2;
        int iF;
        ao aoVar;
        int iF2;
        boolean z;
        ao aoVar2;
        ao aoVar3;
        ap apVar3;
        boolean z2 = false;
        i = 0;
        int i = 0;
        z2 = false;
        z2 = false;
        if (apVar.ad == 3 && apVar.ae == 3 && apVar.u > 0.0f) {
            zArr[0] = false;
            return;
        }
        int iF3 = apVar.f();
        if (apVar.ad == 3 && apVar.ae != 3 && apVar.u > 0.0f) {
            zArr[0] = false;
            return;
        }
        apVar.T = true;
        if (apVar instanceof ar) {
            ar arVar = (ar) apVar;
            if (arVar.ai == 1) {
                int i2 = arVar.ag;
                if (i2 != -1) {
                    iA = 0;
                    i = i2;
                } else {
                    int i3 = arVar.ah;
                    if (i3 != -1) {
                        iA = i3;
                    }
                }
            } else {
                i = iF3;
            }
            iA = i;
        } else {
            ao aoVar4 = apVar.k;
            if (aoVar4.c() || apVar.i.c()) {
                ao aoVar5 = aoVar4.b;
                if (aoVar5 != null && (aoVar3 = apVar.i.b) != null && (aoVar5 == aoVar3 || ((apVar3 = aoVar5.a) == aoVar3.a && apVar3 != apVar.r))) {
                    zArr[0] = false;
                    return;
                }
                ap apVar4 = null;
                if (aoVar5 != null) {
                    iA = aoVar4.a() + iF3;
                    apVar2 = aoVar5.a;
                    if (!apVar2.s() && !apVar2.T) {
                        B(apVar2, zArr);
                    }
                } else {
                    iA = iF3;
                    apVar2 = null;
                }
                ao aoVar6 = apVar.i;
                ao aoVar7 = aoVar6.b;
                if (aoVar7 != null) {
                    iF3 += aoVar6.a();
                    apVar4 = aoVar7.a;
                    if (!apVar4.s() && !apVar4.T) {
                        B(apVar4, zArr);
                    }
                }
                if (aoVar4.b != null && !apVar2.s()) {
                    int i4 = aoVar4.b.g;
                    if (i4 == 4) {
                        iF2 = apVar2.N - apVar2.f();
                    } else if (i4 == 2) {
                        iF2 = apVar2.N;
                    } else {
                        if (apVar2.Q && (apVar2.i.b == null || apVar2.k.b == null || apVar2.ad == 3)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        apVar.Q = z;
                        if (z && ((aoVar2 = apVar2.i.b) == null || aoVar2.a != apVar)) {
                            iA += iA - apVar2.N;
                        }
                    }
                    iA += iF2;
                    if (apVar2.Q) {
                        z = true;
                    } else {
                        z = true;
                    }
                    apVar.Q = z;
                    if (z) {
                        iA += iA - apVar2.N;
                    }
                }
                if (aoVar6.b == null || apVar4.s()) {
                    i = iF3;
                } else {
                    int i5 = aoVar6.b.g;
                    if (i5 == 2) {
                        iF = apVar4.M - apVar4.f();
                    } else if (i5 == 4) {
                        iF = apVar4.M;
                    } else {
                        if (apVar4.P || (apVar4.i.b != null && apVar4.k.b != null && apVar4.ad != 3)) {
                            z2 = true;
                        }
                        apVar.P = z2;
                        if (z2 || ((aoVar = apVar4.k.b) != null && aoVar.a == apVar)) {
                            i = iF3;
                        } else {
                            i = iF3 + (iF3 - apVar4.M);
                        }
                    }
                    iF3 += iF;
                    if (apVar4.P) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    apVar.P = z2;
                    if (z2) {
                        i = iF3;
                    } else {
                        i = iF3;
                    }
                }
            } else {
                i = iF3 + apVar.w;
                iA = iF3;
            }
        }
        if (apVar.K == 8) {
            int i6 = apVar.s;
            i -= i6;
            iA -= i6;
        }
        apVar.M = i;
        apVar.N = iA;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x016c  */
    /* JADX WARN: Code duplicated, block: B:88:0x011e  */
    public final void C(ap apVar, boolean[] zArr) {
        int iA;
        ap apVar2;
        int iE;
        ao aoVar;
        ao aoVar2;
        ao aoVar3;
        int iE2;
        boolean z;
        ao aoVar4;
        ao aoVar5;
        ao aoVar6;
        ao aoVar7;
        ap apVar3;
        boolean z2 = false;
        i = 0;
        int i = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (apVar.ae == 3 && apVar.ad != 3 && apVar.u > 0.0f) {
            zArr[0] = false;
            return;
        }
        int iE3 = apVar.e();
        apVar.U = true;
        if (apVar instanceof ar) {
            ar arVar = (ar) apVar;
            if (arVar.ai == 0) {
                int i2 = arVar.ag;
                if (i2 != -1) {
                    iA = i2;
                } else {
                    int i3 = arVar.ah;
                    iA = 0;
                    if (i3 != -1) {
                        i = i3;
                    }
                }
            } else {
                i = iE3;
                iA = i;
            }
        } else {
            ao aoVar8 = apVar.m;
            if (aoVar8.b == null && apVar.j.b == null && apVar.l.b == null) {
                iA = iE3 + apVar.x;
            } else {
                ao aoVar9 = apVar.l;
                ao aoVar10 = aoVar9.b;
                if (aoVar10 != null && (aoVar7 = apVar.j.b) != null && (aoVar10 == aoVar7 || ((apVar3 = aoVar10.a) == aoVar7.a && apVar3 != apVar.r))) {
                    zArr[0] = false;
                    return;
                }
                if (aoVar8.c()) {
                    ap apVar4 = aoVar8.b.a;
                    if (!apVar4.U) {
                        C(apVar4, zArr);
                    }
                    int iMax = Math.max((apVar4.L - apVar4.t) + iE3, iE3);
                    int iMax2 = Math.max((apVar4.O - apVar4.t) + iE3, iE3);
                    if (apVar.K == 8) {
                        int i4 = apVar.t;
                        iMax -= i4;
                        iMax2 -= i4;
                    }
                    apVar.L = iMax;
                    apVar.O = iMax2;
                    return;
                }
                ao aoVar11 = apVar.j;
                ap apVar5 = null;
                if (aoVar11.c()) {
                    apVar2 = aoVar11.b.a;
                    iA = aoVar11.a() + iE3;
                    if (!apVar2.s() && !apVar2.U) {
                        C(apVar2, zArr);
                    }
                } else {
                    iA = iE3;
                    apVar2 = null;
                }
                if (aoVar9.c()) {
                    apVar5 = aoVar9.b.a;
                    iE3 += aoVar9.a();
                    if (!apVar5.s() && !apVar5.U) {
                        C(apVar5, zArr);
                    }
                }
                if (aoVar11.b != null && !apVar2.s()) {
                    int i5 = aoVar11.b.g;
                    if (i5 == 3) {
                        iE2 = apVar2.L - apVar2.e();
                    } else if (i5 == 5) {
                        iE2 = apVar2.L;
                    } else {
                        if (apVar2.R && ((aoVar5 = apVar2.j.b) == null || aoVar5.a == apVar || (aoVar6 = apVar2.l.b) == null || aoVar6.a == apVar || apVar2.ae == 3)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        apVar.R = z;
                        if (z && ((aoVar4 = apVar2.l.b) == null || aoVar4.a != apVar)) {
                            iA += iA - apVar2.L;
                        }
                    }
                    iA += iE2;
                    if (apVar2.R) {
                        z = true;
                    } else {
                        z = true;
                    }
                    apVar.R = z;
                    if (z) {
                        iA += iA - apVar2.L;
                    }
                }
                if (aoVar9.b != null && !apVar5.s()) {
                    int i6 = aoVar9.b.g;
                    if (i6 == 5) {
                        iE = apVar5.O - apVar5.e();
                    } else if (i6 == 3) {
                        iE = apVar5.O;
                    } else {
                        if (apVar5.S || ((aoVar2 = apVar5.j.b) != null && aoVar2.a != apVar && (aoVar3 = apVar5.l.b) != null && aoVar3.a != apVar && apVar5.ae != 3)) {
                            z2 = true;
                        }
                        apVar.S = z2;
                        if (!z2 && ((aoVar = apVar5.j.b) == null || aoVar.a != apVar)) {
                            i = iE3 + (iE3 - apVar5.O);
                        }
                    }
                    iE3 += iE;
                    if (apVar5.S) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    apVar.S = z2;
                    if (!z2) {
                    }
                }
            }
            i = iE3;
        }
        if (apVar.K == 8) {
            int i7 = apVar.t;
            iA -= i7;
            i -= i7;
        }
        apVar.L = iA;
        apVar.O = i;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:141:0x030a A[Catch: Exception -> 0x03bc, TryCatch #3 {Exception -> 0x03bc, blocks: (B:113:0x02af, B:123:0x02c7, B:124:0x02cc, B:129:0x02e1, B:139:0x0306, B:141:0x030a, B:143:0x0319, B:147:0x0328, B:149:0x032c, B:151:0x0336, B:153:0x033e, B:159:0x0358, B:156:0x034a, B:162:0x0367, B:163:0x0378, B:165:0x037c, B:166:0x0386, B:170:0x038e, B:133:0x02ee, B:175:0x03ab, B:177:0x03af, B:167:0x0389), top: B:283:0x02af, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0319 A[Catch: Exception -> 0x03bc, TryCatch #3 {Exception -> 0x03bc, blocks: (B:113:0x02af, B:123:0x02c7, B:124:0x02cc, B:129:0x02e1, B:139:0x0306, B:141:0x030a, B:143:0x0319, B:147:0x0328, B:149:0x032c, B:151:0x0336, B:153:0x033e, B:159:0x0358, B:156:0x034a, B:162:0x0367, B:163:0x0378, B:165:0x037c, B:166:0x0386, B:170:0x038e, B:133:0x02ee, B:175:0x03ab, B:177:0x03af, B:167:0x0389), top: B:283:0x02af, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0324  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v127 */
    /* JADX WARN: Type inference failed for: r0v128 */
    /* JADX WARN: Type inference failed for: r0v129 */
    /* JADX WARN: Type inference failed for: r0v130 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v13 */
    /* JADX WARN: Type inference failed for: r25v14 */
    /* JADX WARN: Type inference failed for: r25v18 */
    /* JADX WARN: Type inference failed for: r25v19 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v20 */
    /* JADX WARN: Type inference failed for: r25v21 */
    /* JADX WARN: Type inference failed for: r25v22 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v74 */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v55 */
    /* JADX WARN: Type inference failed for: r8v62 */
    /* JADX WARN: Type inference failed for: r8v63 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:146:0x0326
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // defpackage.at
    public final void D() {
        /*
            Method dump skipped, instruction units count: 1471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aq.D():void");
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0368  */
    /* JADX WARN: Code duplicated, block: B:132:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:134:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:142:0x040c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x040e  */
    /* JADX WARN: Code duplicated, block: B:151:0x045f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0465  */
    /* JADX WARN: Code duplicated, block: B:155:0x046c  */
    /* JADX WARN: Code duplicated, block: B:156:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:157:0x04aa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:162:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:164:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:165:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:167:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:168:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:170:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:172:0x051c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0522  */
    /* JADX WARN: Code duplicated, block: B:189:0x0555  */
    /* JADX WARN: Code duplicated, block: B:359:0x07c1 A[PHI: r16
      0x07c1: PHI (r16v6 float) = (r16v5 float), (r16v5 float), (r16v5 float), (r16v5 float), (r16v5 float), (r16v9 float) binds: [B:272:0x06b2, B:274:0x06b6, B:275:0x06b8, B:276:0x06ba, B:277:0x06bc, B:268:0x06a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:458:0x09e3  */
    /* JADX WARN: Code duplicated, block: B:460:0x09e7  */
    /* JADX WARN: Code duplicated, block: B:462:0x09ee  */
    /* JADX WARN: Code duplicated, block: B:464:0x09f6  */
    /* JADX WARN: Code duplicated, block: B:466:0x09ff  */
    /* JADX WARN: Code duplicated, block: B:467:0x0a01  */
    /* JADX WARN: Code duplicated, block: B:470:0x0a06  */
    /* JADX WARN: Code duplicated, block: B:471:0x0a0b  */
    /* JADX WARN: Code duplicated, block: B:473:0x0a11  */
    /* JADX WARN: Code duplicated, block: B:474:0x0a21  */
    /* JADX WARN: Code duplicated, block: B:47:0x0126  */
    /* JADX WARN: Code duplicated, block: B:480:0x0a2f  */
    /* JADX WARN: Code duplicated, block: B:482:0x0a36  */
    /* JADX WARN: Code duplicated, block: B:483:0x0a48  */
    /* JADX WARN: Code duplicated, block: B:484:0x0a5d  */
    /* JADX WARN: Code duplicated, block: B:493:0x0a89 A[DONT_INVERT, PHI: r3
      0x0a89: PHI (r3v17 ap) = (r3v15 ap), (r3v15 ap), (r3v33 ap) binds: [B:485:0x0a5e, B:486:0x0a60, B:492:0x0a88] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:494:0x0a8b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:504:0x0ae1  */
    /* JADX WARN: Code duplicated, block: B:505:0x0ae4  */
    /* JADX WARN: Code duplicated, block: B:507:0x0ae7  */
    /* JADX WARN: Code duplicated, block: B:509:0x0aed  */
    /* JADX WARN: Code duplicated, block: B:510:0x0af0  */
    /* JADX WARN: Code duplicated, block: B:512:0x0af3  */
    /* JADX WARN: Code duplicated, block: B:514:0x0af9  */
    /* JADX WARN: Code duplicated, block: B:515:0x0afd  */
    /* JADX WARN: Code duplicated, block: B:516:0x0aff  */
    /* JADX WARN: Code duplicated, block: B:518:0x0b03  */
    /* JADX WARN: Code duplicated, block: B:520:0x0b09  */
    /* JADX WARN: Code duplicated, block: B:522:0x0b0f  */
    /* JADX WARN: Code duplicated, block: B:523:0x0b12  */
    /* JADX WARN: Code duplicated, block: B:525:0x0b15 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:527:0x0b2c  */
    /* JADX WARN: Code duplicated, block: B:52:0x015c  */
    /* JADX WARN: Code duplicated, block: B:530:0x0b35  */
    /* JADX WARN: Code duplicated, block: B:533:0x0b3f  */
    /* JADX WARN: Code duplicated, block: B:535:0x0b51  */
    /* JADX WARN: Code duplicated, block: B:536:0x0b54  */
    /* JADX WARN: Code duplicated, block: B:539:0x0b59  */
    /* JADX WARN: Code duplicated, block: B:540:0x0b5d  */
    /* JADX WARN: Code duplicated, block: B:54:0x015f  */
    /* JADX WARN: Code duplicated, block: B:554:0x0b78 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:0x0b36 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0198  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x01d2 A[ADDED_TO_REGION] */
    public final boolean E(am amVar) {
        int i;
        float f;
        int i2;
        int i3;
        int i4;
        ao aoVar;
        ao aoVar2;
        ao aoVar3;
        ao aoVar4;
        int i5;
        ar arVar;
        int i6;
        int i7;
        float fD;
        int iD;
        int i8;
        ao aoVar5;
        float fH;
        int iH;
        int i9;
        float f2;
        int iA;
        float f3;
        float f4;
        ao aoVar6;
        ao aoVar7;
        ap apVar;
        boolean z;
        ap apVar2;
        ap apVar3;
        ao aoVar8;
        an anVar;
        ao aoVar9;
        an anVar2;
        ap apVar4;
        ap apVar5;
        boolean z2;
        ao aoVar10;
        an anVar3;
        ap apVar6;
        ap apVar7;
        an anVar4;
        ao aoVar11;
        ao aoVar12;
        ao aoVar13;
        ao aoVar14;
        int iA2;
        int i10;
        ao aoVar15;
        ao aoVar16;
        ao aoVar17;
        an anVar5;
        an anVar6;
        ao aoVar18;
        int i11;
        ao aoVar19;
        ao aoVar20;
        ao aoVar21;
        ao aoVar22;
        ap apVar8;
        ao aoVar23;
        ao aoVar24;
        int i12;
        int iA3;
        aq aqVar = this;
        am amVar2 = amVar;
        x(amVar);
        ArrayList arrayList = aqVar.al;
        int size = arrayList.size();
        int i13 = aqVar.ai;
        int i14 = 4;
        int i15 = 3;
        int i16 = 1;
        int i17 = 2;
        if (i13 == 2 || i13 == 4) {
            int size2 = arrayList.size();
            int i18 = 0;
            while (true) {
                i = -1;
                if (i18 >= size2) {
                    break;
                }
                ap apVar9 = (ap) arrayList.get(i18);
                apVar9.a = -1;
                apVar9.b = -1;
                if (apVar9.ad == 3 || apVar9.ae == 3) {
                    apVar9.a = 1;
                    apVar9.b = 1;
                }
                i18++;
            }
            boolean z3 = false;
            int i19 = 0;
            int i20 = 0;
            while (!z3) {
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                while (i21 < size2) {
                    ap apVar10 = (ap) arrayList.get(i21);
                    if (apVar10.a != i) {
                        i3 = i17;
                    } else {
                        int i24 = aqVar.ad;
                        if (i24 == i17 || (i8 = apVar10.ad) == i15) {
                            apVar10.a = i16;
                        } else if (i24 == i17 || i8 != i14) {
                            ao aoVar25 = apVar10.i;
                            ao aoVar26 = aoVar25.b;
                            if (aoVar26 == null) {
                                ao aoVar27 = apVar10.k;
                                aoVar5 = aoVar27.b;
                                if (aoVar5 == null && aoVar5.a == aqVar) {
                                    aoVar25.f = amVar2.e(aoVar25);
                                    aoVar27.f = amVar2.e(aoVar27);
                                    int iH2 = aqVar.h() - aoVar27.a();
                                    int iH3 = iH2 - apVar10.h();
                                    amVar2.h(aoVar25.f, iH3);
                                    amVar2.h(aoVar27.f, iH2);
                                    i17 = 2;
                                    apVar10.a = 2;
                                    apVar10.k(iH3, iH2);
                                } else if (aoVar26 == null && aoVar26.a.a == 2) {
                                    an anVar7 = aoVar26.f;
                                    aoVar25.f = amVar2.e(aoVar25);
                                    aoVar27.f = amVar2.e(aoVar27);
                                    int iA4 = (int) (anVar7.d + aoVar25.a() + 0.5f);
                                    int iH4 = apVar10.h() + iA4;
                                    amVar2.h(aoVar25.f, iA4);
                                    amVar2.h(aoVar27.f, iH4);
                                    i17 = 2;
                                    apVar10.a = 2;
                                    apVar10.k(iA4, iH4);
                                } else {
                                    if (aoVar5 == null && aoVar5.a.a == 2) {
                                        an anVar8 = aoVar5.f;
                                        aoVar25.f = amVar2.e(aoVar25);
                                        aoVar27.f = amVar2.e(aoVar27);
                                        int iA5 = (int) ((anVar8.d - aoVar27.a()) + 0.5f);
                                        int iH5 = iA5 - apVar10.h();
                                        amVar2.h(aoVar25.f, iH5);
                                        amVar2.h(aoVar27.f, iA5);
                                        apVar10.a = 2;
                                        apVar10.k(iH5, iA5);
                                    } else if (aoVar26 != null && aoVar5 == null) {
                                        if (apVar10 instanceof ar) {
                                            ar arVar2 = (ar) apVar10;
                                            if (arVar2.ai == 1) {
                                                aoVar25.f = amVar2.e(aoVar25);
                                                aoVar27.f = amVar2.e(aoVar27);
                                                int i25 = arVar2.ag;
                                                if (i25 != -1) {
                                                    fH = i25;
                                                } else {
                                                    int i26 = arVar2.ah;
                                                    fH = i26 != -1 ? aqVar.h() - i26 : arVar2.af * aqVar.h();
                                                }
                                                int i27 = (int) (fH + 0.5f);
                                                amVar2.h(aoVar25.f, i27);
                                                amVar2.h(aoVar27.f, i27);
                                                apVar10.a = 2;
                                                apVar10.b = 2;
                                                apVar10.k(i27, i27);
                                                apVar10.o(0, aqVar.d());
                                            }
                                        } else {
                                            aoVar25.f = amVar2.e(aoVar25);
                                            aoVar27.f = amVar2.e(aoVar27);
                                            int i28 = apVar10.w;
                                            int iH6 = apVar10.h() + i28;
                                            amVar2.h(aoVar25.f, i28);
                                            amVar2.h(aoVar27.f, iH6);
                                            i3 = 2;
                                            apVar10.a = 2;
                                        }
                                    }
                                    i3 = 2;
                                }
                            } else {
                                ao aoVar28 = apVar10.k;
                                ao aoVar29 = aoVar28.b;
                                if (aoVar29 != null) {
                                    if (aoVar26.a == aqVar && aoVar29.a == aqVar) {
                                        int iA6 = aoVar25.a();
                                        int iA7 = aoVar28.a();
                                        if (aqVar.ad == i15) {
                                            iH = aqVar.h() - iA7;
                                        } else {
                                            iA6 += (int) (((((aqVar.h() - iA6) - iA7) - apVar10.h()) * apVar10.H) + 0.5f);
                                            iH = iA6 + apVar10.h();
                                        }
                                        aoVar25.f = amVar2.e(aoVar25);
                                        aoVar28.f = amVar2.e(aoVar28);
                                        amVar2.h(aoVar25.f, iA6);
                                        amVar2.h(aoVar28.f, iH);
                                        apVar10.a = 2;
                                        apVar10.k(iA6, iH);
                                    } else {
                                        apVar10.a = 1;
                                    }
                                } else if (aoVar26.a == aqVar) {
                                    int iA8 = aoVar25.a();
                                    int iH7 = apVar10.h() + iA8;
                                    aoVar25.f = amVar2.e(aoVar25);
                                    ao aoVar30 = apVar10.k;
                                    aoVar30.f = amVar2.e(aoVar30);
                                    amVar2.h(aoVar25.f, iA8);
                                    amVar2.h(aoVar30.f, iH7);
                                    apVar10.a = 2;
                                    apVar10.k(iA8, iH7);
                                } else {
                                    ao aoVar210 = apVar10.k;
                                    aoVar5 = aoVar210.b;
                                    if (aoVar5 == null) {
                                        if (aoVar26 == null) {
                                        }
                                        if (aoVar5 == null) {
                                            if (aoVar26 != null) {
                                            }
                                        } else if (aoVar26 != null) {
                                        }
                                    } else {
                                        if (aoVar26 == null) {
                                        }
                                        if (aoVar5 == null) {
                                            if (aoVar26 != null) {
                                            }
                                        } else if (aoVar26 != null) {
                                        }
                                    }
                                }
                                i3 = 2;
                            }
                        } else {
                            ao aoVar31 = apVar10.i;
                            aoVar31.f = amVar2.e(aoVar31);
                            ao aoVar32 = apVar10.k;
                            aoVar32.f = amVar2.e(aoVar32);
                            int i29 = aoVar31.c;
                            int iH8 = aqVar.h() - aoVar32.c;
                            amVar2.h(aoVar31.f, i29);
                            amVar2.h(aoVar32.f, iH8);
                            apVar10.k(i29, iH8);
                            apVar10.a = i17;
                        }
                        i3 = i17;
                    }
                    if (apVar10.b == -1) {
                        int i30 = aqVar.ae;
                        if (i30 == i3 || (i4 = apVar10.ae) == 3) {
                            apVar10.b = 1;
                        } else if (i30 == i3 || i4 != 4) {
                            ao aoVar33 = apVar10.j;
                            ao aoVar34 = aoVar33.b;
                            if (aoVar34 == null) {
                                aoVar = apVar10.l;
                                aoVar2 = aoVar.b;
                                if (aoVar2 == null && aoVar2.a == aqVar) {
                                    aoVar33.f = amVar2.e(aoVar33);
                                    aoVar.f = amVar2.e(aoVar);
                                    int iD2 = aqVar.d() - aoVar.a();
                                    int iD3 = iD2 - apVar10.d();
                                    amVar2.h(aoVar33.f, iD3);
                                    amVar2.h(aoVar.f, iD2);
                                    if (apVar10.C > 0 || apVar10.K == 8) {
                                        ao aoVar35 = apVar10.m;
                                        aoVar35.f = amVar2.e(aoVar35);
                                        amVar2.h(aoVar35.f, apVar10.C + iD3);
                                    }
                                    apVar10.b = 2;
                                    apVar10.o(iD3, iD2);
                                } else if (aoVar34 == null && aoVar34.a.b == 2) {
                                    an anVar9 = aoVar34.f;
                                    aoVar33.f = amVar2.e(aoVar33);
                                    aoVar.f = amVar2.e(aoVar);
                                    int iA9 = (int) (anVar9.d + aoVar33.a() + 0.5f);
                                    int iD4 = apVar10.d() + iA9;
                                    amVar2.h(aoVar33.f, iA9);
                                    amVar2.h(aoVar.f, iD4);
                                    if (apVar10.C > 0 || apVar10.K == 8) {
                                        ao aoVar36 = apVar10.m;
                                        aoVar36.f = amVar2.e(aoVar36);
                                        amVar2.h(aoVar36.f, apVar10.C + iA9);
                                    }
                                    apVar10.b = 2;
                                    apVar10.o(iA9, iD4);
                                } else if (aoVar2 == null && aoVar2.a.b == 2) {
                                    an anVar10 = aoVar2.f;
                                    aoVar33.f = amVar2.e(aoVar33);
                                    aoVar.f = amVar2.e(aoVar);
                                    int iA10 = (int) ((anVar10.d - aoVar.a()) + 0.5f);
                                    int iD5 = iA10 - apVar10.d();
                                    amVar2.h(aoVar33.f, iD5);
                                    amVar2.h(aoVar.f, iA10);
                                    if (apVar10.C > 0 || apVar10.K == 8) {
                                        ao aoVar37 = apVar10.m;
                                        aoVar37.f = amVar2.e(aoVar37);
                                        amVar2.h(aoVar37.f, apVar10.C + iD5);
                                    }
                                    apVar10.b = 2;
                                    apVar10.o(iD5, iA10);
                                } else {
                                    aoVar3 = apVar10.m;
                                    aoVar4 = aoVar3.b;
                                    if (aoVar4 != null) {
                                        if (aoVar4.a.b == 2) {
                                            an anVar11 = aoVar4.f;
                                            aoVar33.f = amVar2.e(aoVar33);
                                            aoVar.f = amVar2.e(aoVar);
                                            int i31 = (int) ((anVar11.d - apVar10.C) + 0.5f);
                                            int iD6 = apVar10.d() + i31;
                                            amVar2.h(aoVar33.f, i31);
                                            amVar2.h(aoVar.f, iD6);
                                            aoVar3.f = amVar2.e(aoVar3);
                                            amVar2.h(aoVar3.f, apVar10.C + i31);
                                            apVar10.b = 2;
                                            apVar10.o(i31, iD6);
                                        }
                                    } else if (aoVar34 == null && aoVar2 == null) {
                                        if (apVar10 instanceof ar) {
                                            arVar = (ar) apVar10;
                                            if (arVar.ai == 0) {
                                                aoVar33.f = amVar2.e(aoVar33);
                                                aoVar.f = amVar2.e(aoVar);
                                                i6 = arVar.ag;
                                                if (i6 != -1) {
                                                    fD = i6;
                                                } else {
                                                    i7 = arVar.ah;
                                                    if (i7 != -1) {
                                                        fD = aqVar.d() - i7;
                                                    } else {
                                                        fD = arVar.af * aqVar.d();
                                                    }
                                                }
                                                int i32 = (int) (fD + 0.5f);
                                                amVar2.h(aoVar33.f, i32);
                                                amVar2.h(aoVar.f, i32);
                                                apVar10.b = 2;
                                                apVar10.a = 2;
                                                apVar10.o(i32, i32);
                                                apVar10.k(0, aqVar.h());
                                            }
                                        } else {
                                            aoVar33.f = amVar2.e(aoVar33);
                                            aoVar.f = amVar2.e(aoVar);
                                            i5 = apVar10.x;
                                            int iD7 = apVar10.d() + i5;
                                            amVar2.h(aoVar33.f, i5);
                                            amVar2.h(aoVar.f, iD7);
                                            if (apVar10.C <= 0 || apVar10.K == 8) {
                                                aoVar3.f = amVar2.e(aoVar3);
                                                amVar2.h(aoVar3.f, i5 + apVar10.C);
                                            }
                                            apVar10.b = 2;
                                        }
                                    }
                                }
                            } else {
                                ao aoVar38 = apVar10.l;
                                ao aoVar39 = aoVar38.b;
                                if (aoVar39 != null) {
                                    if (aoVar34.a == aqVar && aoVar39.a == aqVar) {
                                        int iA11 = aoVar33.a();
                                        int iA12 = aoVar38.a();
                                        if (aqVar.ae == 3) {
                                            iD = apVar10.d();
                                        } else {
                                            float fD2 = iA11 + ((((aqVar.d() - iA11) - iA12) - apVar10.d()) * apVar10.I) + 0.5f;
                                            iD = apVar10.d();
                                            iA11 = (int) fD2;
                                        }
                                        int i33 = iD + iA11;
                                        aoVar33.f = amVar2.e(aoVar33);
                                        aoVar38.f = amVar2.e(aoVar38);
                                        amVar2.h(aoVar33.f, iA11);
                                        amVar2.h(aoVar38.f, i33);
                                        if (apVar10.C > 0 || apVar10.K == 8) {
                                            ao aoVar40 = apVar10.m;
                                            aoVar40.f = amVar2.e(aoVar40);
                                            amVar2.h(aoVar40.f, apVar10.C + iA11);
                                        }
                                        apVar10.b = 2;
                                        apVar10.o(iA11, i33);
                                    } else {
                                        apVar10.b = 1;
                                    }
                                } else if (aoVar34.a == aqVar) {
                                    int iA13 = aoVar33.a();
                                    int iD8 = apVar10.d() + iA13;
                                    aoVar33.f = amVar2.e(aoVar33);
                                    ao aoVar41 = apVar10.l;
                                    aoVar41.f = amVar2.e(aoVar41);
                                    amVar2.h(aoVar33.f, iA13);
                                    amVar2.h(aoVar41.f, iD8);
                                    if (apVar10.C > 0 || apVar10.K == 8) {
                                        ao aoVar42 = apVar10.m;
                                        aoVar42.f = amVar2.e(aoVar42);
                                        amVar2.h(aoVar42.f, apVar10.C + iA13);
                                    }
                                    apVar10.b = 2;
                                    apVar10.o(iA13, iD8);
                                } else {
                                    aoVar = apVar10.l;
                                    aoVar2 = aoVar.b;
                                    if (aoVar2 == null) {
                                        if (aoVar34 == null) {
                                            if (aoVar2 == null) {
                                                aoVar3 = apVar10.m;
                                                aoVar4 = aoVar3.b;
                                                if (aoVar4 != null) {
                                                    if (aoVar4.a.b == 2) {
                                                        an anVar12 = aoVar4.f;
                                                        aoVar33.f = amVar2.e(aoVar33);
                                                        aoVar.f = amVar2.e(aoVar);
                                                        int i34 = (int) ((anVar12.d - apVar10.C) + 0.5f);
                                                        int iD9 = apVar10.d() + i34;
                                                        amVar2.h(aoVar33.f, i34);
                                                        amVar2.h(aoVar.f, iD9);
                                                        aoVar3.f = amVar2.e(aoVar3);
                                                        amVar2.h(aoVar3.f, apVar10.C + i34);
                                                        apVar10.b = 2;
                                                        apVar10.o(i34, iD9);
                                                    }
                                                } else if (aoVar34 == null) {
                                                    if (apVar10 instanceof ar) {
                                                        arVar = (ar) apVar10;
                                                        if (arVar.ai == 0) {
                                                            aoVar33.f = amVar2.e(aoVar33);
                                                            aoVar.f = amVar2.e(aoVar);
                                                            i6 = arVar.ag;
                                                            if (i6 != -1) {
                                                                fD = i6;
                                                            } else {
                                                                i7 = arVar.ah;
                                                                if (i7 != -1) {
                                                                    fD = aqVar.d() - i7;
                                                                } else {
                                                                    fD = arVar.af * aqVar.d();
                                                                }
                                                            }
                                                            int i35 = (int) (fD + 0.5f);
                                                            amVar2.h(aoVar33.f, i35);
                                                            amVar2.h(aoVar.f, i35);
                                                            apVar10.b = 2;
                                                            apVar10.a = 2;
                                                            apVar10.o(i35, i35);
                                                            apVar10.k(0, aqVar.h());
                                                        }
                                                    } else {
                                                        aoVar33.f = amVar2.e(aoVar33);
                                                        aoVar.f = amVar2.e(aoVar);
                                                        i5 = apVar10.x;
                                                        int iD10 = apVar10.d() + i5;
                                                        amVar2.h(aoVar33.f, i5);
                                                        amVar2.h(aoVar.f, iD10);
                                                        if (apVar10.C <= 0) {
                                                            aoVar3.f = amVar2.e(aoVar3);
                                                            amVar2.h(aoVar3.f, i5 + apVar10.C);
                                                        } else {
                                                            aoVar3.f = amVar2.e(aoVar3);
                                                            amVar2.h(aoVar3.f, i5 + apVar10.C);
                                                        }
                                                        apVar10.b = 2;
                                                    }
                                                }
                                            } else {
                                                aoVar3 = apVar10.m;
                                                aoVar4 = aoVar3.b;
                                                if (aoVar4 != null) {
                                                    if (aoVar4.a.b == 2) {
                                                        an anVar13 = aoVar4.f;
                                                        aoVar33.f = amVar2.e(aoVar33);
                                                        aoVar.f = amVar2.e(aoVar);
                                                        int i36 = (int) ((anVar13.d - apVar10.C) + 0.5f);
                                                        int iD11 = apVar10.d() + i36;
                                                        amVar2.h(aoVar33.f, i36);
                                                        amVar2.h(aoVar.f, iD11);
                                                        aoVar3.f = amVar2.e(aoVar3);
                                                        amVar2.h(aoVar3.f, apVar10.C + i36);
                                                        apVar10.b = 2;
                                                        apVar10.o(i36, iD11);
                                                    }
                                                } else if (aoVar34 == null) {
                                                    if (apVar10 instanceof ar) {
                                                        arVar = (ar) apVar10;
                                                        if (arVar.ai == 0) {
                                                            aoVar33.f = amVar2.e(aoVar33);
                                                            aoVar.f = amVar2.e(aoVar);
                                                            i6 = arVar.ag;
                                                            if (i6 != -1) {
                                                                fD = i6;
                                                            } else {
                                                                i7 = arVar.ah;
                                                                if (i7 != -1) {
                                                                    fD = aqVar.d() - i7;
                                                                } else {
                                                                    fD = arVar.af * aqVar.d();
                                                                }
                                                            }
                                                            int i37 = (int) (fD + 0.5f);
                                                            amVar2.h(aoVar33.f, i37);
                                                            amVar2.h(aoVar.f, i37);
                                                            apVar10.b = 2;
                                                            apVar10.a = 2;
                                                            apVar10.o(i37, i37);
                                                            apVar10.k(0, aqVar.h());
                                                        }
                                                    } else {
                                                        aoVar33.f = amVar2.e(aoVar33);
                                                        aoVar.f = amVar2.e(aoVar);
                                                        i5 = apVar10.x;
                                                        int iD12 = apVar10.d() + i5;
                                                        amVar2.h(aoVar33.f, i5);
                                                        amVar2.h(aoVar.f, iD12);
                                                        if (apVar10.C <= 0) {
                                                            aoVar3.f = amVar2.e(aoVar3);
                                                            amVar2.h(aoVar3.f, i5 + apVar10.C);
                                                        } else {
                                                            aoVar3.f = amVar2.e(aoVar3);
                                                            amVar2.h(aoVar3.f, i5 + apVar10.C);
                                                        }
                                                        apVar10.b = 2;
                                                    }
                                                }
                                            }
                                        } else if (aoVar2 == null) {
                                            aoVar3 = apVar10.m;
                                            aoVar4 = aoVar3.b;
                                            if (aoVar4 != null) {
                                                if (aoVar4.a.b == 2) {
                                                    an anVar14 = aoVar4.f;
                                                    aoVar33.f = amVar2.e(aoVar33);
                                                    aoVar.f = amVar2.e(aoVar);
                                                    int i38 = (int) ((anVar14.d - apVar10.C) + 0.5f);
                                                    int iD13 = apVar10.d() + i38;
                                                    amVar2.h(aoVar33.f, i38);
                                                    amVar2.h(aoVar.f, iD13);
                                                    aoVar3.f = amVar2.e(aoVar3);
                                                    amVar2.h(aoVar3.f, apVar10.C + i38);
                                                    apVar10.b = 2;
                                                    apVar10.o(i38, iD13);
                                                }
                                            } else if (aoVar34 == null) {
                                                if (apVar10 instanceof ar) {
                                                    arVar = (ar) apVar10;
                                                    if (arVar.ai == 0) {
                                                        aoVar33.f = amVar2.e(aoVar33);
                                                        aoVar.f = amVar2.e(aoVar);
                                                        i6 = arVar.ag;
                                                        if (i6 != -1) {
                                                            fD = i6;
                                                        } else {
                                                            i7 = arVar.ah;
                                                            if (i7 != -1) {
                                                                fD = aqVar.d() - i7;
                                                            } else {
                                                                fD = arVar.af * aqVar.d();
                                                            }
                                                        }
                                                        int i39 = (int) (fD + 0.5f);
                                                        amVar2.h(aoVar33.f, i39);
                                                        amVar2.h(aoVar.f, i39);
                                                        apVar10.b = 2;
                                                        apVar10.a = 2;
                                                        apVar10.o(i39, i39);
                                                        apVar10.k(0, aqVar.h());
                                                    }
                                                } else {
                                                    aoVar33.f = amVar2.e(aoVar33);
                                                    aoVar.f = amVar2.e(aoVar);
                                                    i5 = apVar10.x;
                                                    int iD14 = apVar10.d() + i5;
                                                    amVar2.h(aoVar33.f, i5);
                                                    amVar2.h(aoVar.f, iD14);
                                                    if (apVar10.C <= 0) {
                                                        aoVar3.f = amVar2.e(aoVar3);
                                                        amVar2.h(aoVar3.f, i5 + apVar10.C);
                                                    } else {
                                                        aoVar3.f = amVar2.e(aoVar3);
                                                        amVar2.h(aoVar3.f, i5 + apVar10.C);
                                                    }
                                                    apVar10.b = 2;
                                                }
                                            }
                                        } else {
                                            aoVar3 = apVar10.m;
                                            aoVar4 = aoVar3.b;
                                            if (aoVar4 != null) {
                                                if (aoVar4.a.b == 2) {
                                                    an anVar15 = aoVar4.f;
                                                    aoVar33.f = amVar2.e(aoVar33);
                                                    aoVar.f = amVar2.e(aoVar);
                                                    int i310 = (int) ((anVar15.d - apVar10.C) + 0.5f);
                                                    int iD15 = apVar10.d() + i310;
                                                    amVar2.h(aoVar33.f, i310);
                                                    amVar2.h(aoVar.f, iD15);
                                                    aoVar3.f = amVar2.e(aoVar3);
                                                    amVar2.h(aoVar3.f, apVar10.C + i310);
                                                    apVar10.b = 2;
                                                    apVar10.o(i310, iD15);
                                                }
                                            } else if (aoVar34 == null) {
                                                if (apVar10 instanceof ar) {
                                                    arVar = (ar) apVar10;
                                                    if (arVar.ai == 0) {
                                                        aoVar33.f = amVar2.e(aoVar33);
                                                        aoVar.f = amVar2.e(aoVar);
                                                        i6 = arVar.ag;
                                                        if (i6 != -1) {
                                                            fD = i6;
                                                        } else {
                                                            i7 = arVar.ah;
                                                            if (i7 != -1) {
                                                                fD = aqVar.d() - i7;
                                                            } else {
                                                                fD = arVar.af * aqVar.d();
                                                            }
                                                        }
                                                        int i311 = (int) (fD + 0.5f);
                                                        amVar2.h(aoVar33.f, i311);
                                                        amVar2.h(aoVar.f, i311);
                                                        apVar10.b = 2;
                                                        apVar10.a = 2;
                                                        apVar10.o(i311, i311);
                                                        apVar10.k(0, aqVar.h());
                                                    }
                                                } else {
                                                    aoVar33.f = amVar2.e(aoVar33);
                                                    aoVar.f = amVar2.e(aoVar);
                                                    i5 = apVar10.x;
                                                    int iD16 = apVar10.d() + i5;
                                                    amVar2.h(aoVar33.f, i5);
                                                    amVar2.h(aoVar.f, iD16);
                                                    if (apVar10.C <= 0) {
                                                        aoVar3.f = amVar2.e(aoVar3);
                                                        amVar2.h(aoVar3.f, i5 + apVar10.C);
                                                    } else {
                                                        aoVar3.f = amVar2.e(aoVar3);
                                                        amVar2.h(aoVar3.f, i5 + apVar10.C);
                                                    }
                                                    apVar10.b = 2;
                                                }
                                            }
                                        }
                                    } else if (aoVar34 == null) {
                                        if (aoVar2 == null) {
                                            aoVar3 = apVar10.m;
                                            aoVar4 = aoVar3.b;
                                            if (aoVar4 != null) {
                                                if (aoVar4.a.b == 2) {
                                                    an anVar16 = aoVar4.f;
                                                    aoVar33.f = amVar2.e(aoVar33);
                                                    aoVar.f = amVar2.e(aoVar);
                                                    int i312 = (int) ((anVar16.d - apVar10.C) + 0.5f);
                                                    int iD17 = apVar10.d() + i312;
                                                    amVar2.h(aoVar33.f, i312);
                                                    amVar2.h(aoVar.f, iD17);
                                                    aoVar3.f = amVar2.e(aoVar3);
                                                    amVar2.h(aoVar3.f, apVar10.C + i312);
                                                    apVar10.b = 2;
                                                    apVar10.o(i312, iD17);
                                                }
                                            } else if (aoVar34 == null) {
                                                if (apVar10 instanceof ar) {
                                                    arVar = (ar) apVar10;
                                                    if (arVar.ai == 0) {
                                                        aoVar33.f = amVar2.e(aoVar33);
                                                        aoVar.f = amVar2.e(aoVar);
                                                        i6 = arVar.ag;
                                                        if (i6 != -1) {
                                                            fD = i6;
                                                        } else {
                                                            i7 = arVar.ah;
                                                            if (i7 != -1) {
                                                                fD = aqVar.d() - i7;
                                                            } else {
                                                                fD = arVar.af * aqVar.d();
                                                            }
                                                        }
                                                        int i313 = (int) (fD + 0.5f);
                                                        amVar2.h(aoVar33.f, i313);
                                                        amVar2.h(aoVar.f, i313);
                                                        apVar10.b = 2;
                                                        apVar10.a = 2;
                                                        apVar10.o(i313, i313);
                                                        apVar10.k(0, aqVar.h());
                                                    }
                                                } else {
                                                    aoVar33.f = amVar2.e(aoVar33);
                                                    aoVar.f = amVar2.e(aoVar);
                                                    i5 = apVar10.x;
                                                    int iD18 = apVar10.d() + i5;
                                                    amVar2.h(aoVar33.f, i5);
                                                    amVar2.h(aoVar.f, iD18);
                                                    if (apVar10.C <= 0) {
                                                        aoVar3.f = amVar2.e(aoVar3);
                                                        amVar2.h(aoVar3.f, i5 + apVar10.C);
                                                    } else {
                                                        aoVar3.f = amVar2.e(aoVar3);
                                                        amVar2.h(aoVar3.f, i5 + apVar10.C);
                                                    }
                                                    apVar10.b = 2;
                                                }
                                            }
                                        } else {
                                            aoVar3 = apVar10.m;
                                            aoVar4 = aoVar3.b;
                                            if (aoVar4 != null) {
                                                if (aoVar4.a.b == 2) {
                                                    an anVar17 = aoVar4.f;
                                                    aoVar33.f = amVar2.e(aoVar33);
                                                    aoVar.f = amVar2.e(aoVar);
                                                    int i314 = (int) ((anVar17.d - apVar10.C) + 0.5f);
                                                    int iD19 = apVar10.d() + i314;
                                                    amVar2.h(aoVar33.f, i314);
                                                    amVar2.h(aoVar.f, iD19);
                                                    aoVar3.f = amVar2.e(aoVar3);
                                                    amVar2.h(aoVar3.f, apVar10.C + i314);
                                                    apVar10.b = 2;
                                                    apVar10.o(i314, iD19);
                                                }
                                            } else if (aoVar34 == null) {
                                                if (apVar10 instanceof ar) {
                                                    arVar = (ar) apVar10;
                                                    if (arVar.ai == 0) {
                                                        aoVar33.f = amVar2.e(aoVar33);
                                                        aoVar.f = amVar2.e(aoVar);
                                                        i6 = arVar.ag;
                                                        if (i6 != -1) {
                                                            fD = i6;
                                                        } else {
                                                            i7 = arVar.ah;
                                                            if (i7 != -1) {
                                                                fD = aqVar.d() - i7;
                                                            } else {
                                                                fD = arVar.af * aqVar.d();
                                                            }
                                                        }
                                                        int i315 = (int) (fD + 0.5f);
                                                        amVar2.h(aoVar33.f, i315);
                                                        amVar2.h(aoVar.f, i315);
                                                        apVar10.b = 2;
                                                        apVar10.a = 2;
                                                        apVar10.o(i315, i315);
                                                        apVar10.k(0, aqVar.h());
                                                    }
                                                } else {
                                                    aoVar33.f = amVar2.e(aoVar33);
                                                    aoVar.f = amVar2.e(aoVar);
                                                    i5 = apVar10.x;
                                                    int iD110 = apVar10.d() + i5;
                                                    amVar2.h(aoVar33.f, i5);
                                                    amVar2.h(aoVar.f, iD110);
                                                    if (apVar10.C <= 0) {
                                                        aoVar3.f = amVar2.e(aoVar3);
                                                        amVar2.h(aoVar3.f, i5 + apVar10.C);
                                                    } else {
                                                        aoVar3.f = amVar2.e(aoVar3);
                                                        amVar2.h(aoVar3.f, i5 + apVar10.C);
                                                    }
                                                    apVar10.b = 2;
                                                }
                                            }
                                        }
                                    } else if (aoVar2 == null) {
                                        aoVar3 = apVar10.m;
                                        aoVar4 = aoVar3.b;
                                        if (aoVar4 != null) {
                                            if (aoVar4.a.b == 2) {
                                                an anVar18 = aoVar4.f;
                                                aoVar33.f = amVar2.e(aoVar33);
                                                aoVar.f = amVar2.e(aoVar);
                                                int i316 = (int) ((anVar18.d - apVar10.C) + 0.5f);
                                                int iD111 = apVar10.d() + i316;
                                                amVar2.h(aoVar33.f, i316);
                                                amVar2.h(aoVar.f, iD111);
                                                aoVar3.f = amVar2.e(aoVar3);
                                                amVar2.h(aoVar3.f, apVar10.C + i316);
                                                apVar10.b = 2;
                                                apVar10.o(i316, iD111);
                                            }
                                        } else if (aoVar34 == null) {
                                            if (apVar10 instanceof ar) {
                                                arVar = (ar) apVar10;
                                                if (arVar.ai == 0) {
                                                    aoVar33.f = amVar2.e(aoVar33);
                                                    aoVar.f = amVar2.e(aoVar);
                                                    i6 = arVar.ag;
                                                    if (i6 != -1) {
                                                        fD = i6;
                                                    } else {
                                                        i7 = arVar.ah;
                                                        if (i7 != -1) {
                                                            fD = aqVar.d() - i7;
                                                        } else {
                                                            fD = arVar.af * aqVar.d();
                                                        }
                                                    }
                                                    int i317 = (int) (fD + 0.5f);
                                                    amVar2.h(aoVar33.f, i317);
                                                    amVar2.h(aoVar.f, i317);
                                                    apVar10.b = 2;
                                                    apVar10.a = 2;
                                                    apVar10.o(i317, i317);
                                                    apVar10.k(0, aqVar.h());
                                                }
                                            } else {
                                                aoVar33.f = amVar2.e(aoVar33);
                                                aoVar.f = amVar2.e(aoVar);
                                                i5 = apVar10.x;
                                                int iD112 = apVar10.d() + i5;
                                                amVar2.h(aoVar33.f, i5);
                                                amVar2.h(aoVar.f, iD112);
                                                if (apVar10.C <= 0) {
                                                    aoVar3.f = amVar2.e(aoVar3);
                                                    amVar2.h(aoVar3.f, i5 + apVar10.C);
                                                } else {
                                                    aoVar3.f = amVar2.e(aoVar3);
                                                    amVar2.h(aoVar3.f, i5 + apVar10.C);
                                                }
                                                apVar10.b = 2;
                                            }
                                        }
                                    } else {
                                        aoVar3 = apVar10.m;
                                        aoVar4 = aoVar3.b;
                                        if (aoVar4 != null) {
                                            if (aoVar4.a.b == 2) {
                                                an anVar19 = aoVar4.f;
                                                aoVar33.f = amVar2.e(aoVar33);
                                                aoVar.f = amVar2.e(aoVar);
                                                int i318 = (int) ((anVar19.d - apVar10.C) + 0.5f);
                                                int iD113 = apVar10.d() + i318;
                                                amVar2.h(aoVar33.f, i318);
                                                amVar2.h(aoVar.f, iD113);
                                                aoVar3.f = amVar2.e(aoVar3);
                                                amVar2.h(aoVar3.f, apVar10.C + i318);
                                                apVar10.b = 2;
                                                apVar10.o(i318, iD113);
                                            }
                                        } else if (aoVar34 == null) {
                                            if (apVar10 instanceof ar) {
                                                arVar = (ar) apVar10;
                                                if (arVar.ai == 0) {
                                                    aoVar33.f = amVar2.e(aoVar33);
                                                    aoVar.f = amVar2.e(aoVar);
                                                    i6 = arVar.ag;
                                                    if (i6 != -1) {
                                                        fD = i6;
                                                    } else {
                                                        i7 = arVar.ah;
                                                        if (i7 != -1) {
                                                            fD = aqVar.d() - i7;
                                                        } else {
                                                            fD = arVar.af * aqVar.d();
                                                        }
                                                    }
                                                    int i319 = (int) (fD + 0.5f);
                                                    amVar2.h(aoVar33.f, i319);
                                                    amVar2.h(aoVar.f, i319);
                                                    apVar10.b = 2;
                                                    apVar10.a = 2;
                                                    apVar10.o(i319, i319);
                                                    apVar10.k(0, aqVar.h());
                                                }
                                            } else {
                                                aoVar33.f = amVar2.e(aoVar33);
                                                aoVar.f = amVar2.e(aoVar);
                                                i5 = apVar10.x;
                                                int iD114 = apVar10.d() + i5;
                                                amVar2.h(aoVar33.f, i5);
                                                amVar2.h(aoVar.f, iD114);
                                                if (apVar10.C <= 0) {
                                                    aoVar3.f = amVar2.e(aoVar3);
                                                    amVar2.h(aoVar3.f, i5 + apVar10.C);
                                                } else {
                                                    aoVar3.f = amVar2.e(aoVar3);
                                                    amVar2.h(aoVar3.f, i5 + apVar10.C);
                                                }
                                                apVar10.b = 2;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            ao aoVar43 = apVar10.j;
                            aoVar43.f = amVar2.e(aoVar43);
                            ao aoVar44 = apVar10.l;
                            aoVar44.f = amVar2.e(aoVar44);
                            int i40 = aoVar43.c;
                            int iD20 = aqVar.d() - aoVar44.c;
                            amVar2.h(aoVar43.f, i40);
                            amVar2.h(aoVar44.f, iD20);
                            if (apVar10.C > 0 || apVar10.K == 8) {
                                ao aoVar45 = apVar10.m;
                                aoVar45.f = amVar2.e(aoVar45);
                                amVar2.h(aoVar45.f, apVar10.C + i40);
                            }
                            apVar10.o(i40, iD20);
                            apVar10.b = 2;
                        }
                    }
                    if (apVar10.b == -1) {
                        i23++;
                    }
                    if (apVar10.a == -1) {
                        i22++;
                    }
                    i21++;
                    i14 = 4;
                    i = -1;
                    i15 = 3;
                    i16 = 1;
                    i17 = 2;
                }
                if (i23 == 0) {
                    if (i22 != 0) {
                        i2 = 0;
                    } else {
                        z3 = true;
                    }
                    i20 = i22;
                    i19 = i23;
                    i14 = 4;
                    i = -1;
                    i15 = 3;
                    i16 = 1;
                    i17 = 2;
                } else {
                    i2 = i23;
                }
                if (i19 == i2 && i20 == i22) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i20 = i22;
                i19 = i23;
                i14 = 4;
                i = -1;
                i15 = 3;
                i16 = 1;
                i17 = 2;
            }
            f = 0.5f;
            int i41 = 0;
            int i42 = 0;
            for (int i43 = 0; i43 < size2; i43++) {
                ap apVar11 = (ap) arrayList.get(i43);
                int i44 = apVar11.a;
                if (i44 == 1 || i44 == -1) {
                    i41++;
                }
                int i45 = apVar11.b;
                if (i45 == 1 || i45 == -1) {
                    i42++;
                }
            }
            if (i41 == 0 && i42 == 0) {
                return false;
            }
            i16 = 0;
        } else {
            f = 0.5f;
        }
        for (int i46 = 0; i46 < size; i46++) {
            ap apVar12 = (ap) arrayList.get(i46);
            if (apVar12 instanceof aq) {
                int i47 = apVar12.ad;
                int i48 = apVar12.ae;
                if (i47 == 2) {
                    apVar12.v(1);
                    i47 = 2;
                }
                if (i48 == 2) {
                    apVar12.w(1);
                    i48 = 2;
                }
                apVar12.x(amVar2);
                if (i47 == 2) {
                    apVar12.v(2);
                }
                if (i48 == 2) {
                    apVar12.w(2);
                }
            } else {
                int i49 = 2;
                if (i16 != 0) {
                    if (aqVar.ad != 2) {
                        if (apVar12.ad == 4) {
                            ao aoVar46 = apVar12.i;
                            aoVar46.f = amVar2.e(aoVar46);
                            ao aoVar47 = apVar12.k;
                            aoVar47.f = amVar2.e(aoVar47);
                            int i50 = aoVar46.c;
                            int iH9 = aqVar.h() - aoVar47.c;
                            amVar2.h(aoVar46.f, i50);
                            amVar2.h(aoVar47.f, iH9);
                            apVar12.k(i50, iH9);
                            i49 = 2;
                            apVar12.a = 2;
                        } else {
                            i49 = 2;
                        }
                    }
                    if (aqVar.ae != i49 && apVar12.ae == 4) {
                        ao aoVar48 = apVar12.j;
                        aoVar48.f = amVar2.e(aoVar48);
                        ao aoVar49 = apVar12.l;
                        aoVar49.f = amVar2.e(aoVar49);
                        int i51 = aoVar48.c;
                        int iD21 = aqVar.d() - aoVar49.c;
                        amVar2.h(aoVar48.f, i51);
                        amVar2.h(aoVar49.f, iD21);
                        if (apVar12.C > 0 || apVar12.K == 8) {
                            ao aoVar50 = apVar12.m;
                            aoVar50.f = amVar2.e(aoVar50);
                            amVar2.h(aoVar50.f, apVar12.C + i51);
                        }
                        apVar12.o(i51, iD21);
                        apVar12.b = 2;
                    }
                }
                apVar12.x(amVar2);
            }
        }
        if (aqVar.am > 0) {
            H(amVar);
        }
        if (aqVar.an > 0) {
            int i52 = 0;
            while (i52 < aqVar.an) {
                ap apVar13 = aqVar.ap[i52];
                ap[] apVarArr = aqVar.as;
                boolean[] zArr = aqVar.ar;
                int iG = aqVar.G(amVar2, apVarArr, apVar13, 1, zArr);
                aq aqVar2 = aqVar;
                am amVar3 = amVar2;
                ap apVar14 = apVar13;
                ap apVar15 = apVarArr[2];
                if (apVar15 == null) {
                    i9 = i52;
                } else {
                    if (zArr[1]) {
                        int iC = apVar14.c();
                        while (apVar15 != null) {
                            ao aoVar51 = apVar15.j;
                            amVar3.h(aoVar51.f, iC);
                            ap apVar16 = apVar15.ac;
                            iC += aoVar51.a() + apVar15.d() + apVar15.l.a();
                            apVar15 = apVar16;
                        }
                    } else {
                        int i53 = apVar14.W;
                        boolean z4 = i53 == 0;
                        boolean z5 = i53 == 2;
                        int i54 = aqVar2.ae;
                        int i55 = aqVar2.ai;
                        if (i55 != 2) {
                            f2 = 0.0f;
                            if (i55 != 8) {
                                if (iG == 0 && !z5) {
                                    float f5 = f2;
                                    ap apVar17 = null;
                                    while (apVar15 != null) {
                                        if (apVar15.ae != 3) {
                                            ao aoVar52 = apVar15.j;
                                            int iA14 = aoVar52.a();
                                            if (apVar17 != null) {
                                                iA14 += apVar17.l.a();
                                            }
                                            ao aoVar53 = aoVar52.b;
                                            amVar3.i(aoVar52.f, aoVar53.f, iA14, aoVar53.a.ae == 3 ? 2 : 3);
                                            ao aoVar54 = apVar15.l;
                                            int iA15 = aoVar54.a();
                                            ao aoVar55 = aoVar54.b.a.j;
                                            ao aoVar56 = aoVar55.b;
                                            if (aoVar56 != null && aoVar56.a == apVar15) {
                                                iA15 += aoVar55.a();
                                            }
                                            ao aoVar57 = aoVar54.b;
                                            amVar3.j(aoVar54.f, aoVar57.f, -iA15, aoVar57.a.ae == 3 ? 2 : 3);
                                        } else {
                                            f5 += apVar15.aa;
                                            ao aoVar58 = apVar15.l;
                                            if (aoVar58.b != null) {
                                                iA3 = aoVar58.a();
                                                if (apVar15 != apVarArr[3]) {
                                                    iA3 += aoVar58.b.a.j.a();
                                                }
                                            } else {
                                                iA3 = 0;
                                            }
                                            amVar3.i(aoVar58.f, apVar15.j.f, 0, 1);
                                            amVar3.j(aoVar58.f, aoVar58.b.f, -iA3, 1);
                                        }
                                        apVar17 = apVar15;
                                        apVar15 = apVar15.ac;
                                    }
                                    if (iG != 1) {
                                        int i56 = 0;
                                        while (true) {
                                            int i57 = iG - 1;
                                            if (i56 >= i57) {
                                                break;
                                            }
                                            ap[] apVarArr2 = aqVar2.ao;
                                            ap apVar18 = apVarArr2[i56];
                                            i56++;
                                            ap apVar19 = apVarArr2[i56];
                                            ao aoVar59 = apVar18.j;
                                            an anVar20 = aoVar59.f;
                                            ao aoVar60 = apVar18.l;
                                            an anVar21 = aoVar60.f;
                                            ao aoVar61 = apVar19.j;
                                            an anVar22 = aoVar61.f;
                                            int i58 = iG;
                                            ao aoVar62 = apVar19.l;
                                            int i59 = i52;
                                            an anVar23 = aoVar62.f;
                                            if (apVar19 == apVarArr[3]) {
                                                anVar23 = apVarArr[1].l.f;
                                            }
                                            int iA16 = aoVar59.a();
                                            ao aoVar63 = aoVar59.b;
                                            amVar3.i(anVar20, aoVar59.b.f, (aoVar63 == null || (aoVar24 = (aoVar23 = aoVar63.a.l).b) == null || aoVar24.a != apVar18) ? iA16 : iA16 + aoVar23.a(), 2);
                                            int iA17 = aoVar60.a();
                                            if (aoVar60.b != null && (apVar8 = apVar18.ac) != null) {
                                                ao aoVar64 = apVar8.j;
                                                iA17 += aoVar64.b != null ? aoVar64.a() : 0;
                                            }
                                            amVar3.j(anVar21, aoVar60.b.f, -iA17, 2);
                                            if (i56 == i57) {
                                                int iA18 = aoVar61.a();
                                                ao aoVar65 = aoVar61.b;
                                                if (aoVar65 != null && (aoVar22 = (aoVar21 = aoVar65.a.l).b) != null && aoVar22.a == apVar19) {
                                                    iA18 += aoVar21.a();
                                                }
                                                amVar3.i(anVar22, aoVar61.b.f, iA18, 2);
                                                ao aoVar66 = apVar19 == apVarArr[3] ? apVarArr[1].l : aoVar62;
                                                int iA19 = aoVar66.a();
                                                ao aoVar67 = aoVar66.b;
                                                if (aoVar67 != null && (aoVar20 = (aoVar19 = aoVar67.a.j).b) != null && aoVar20.a == apVar19) {
                                                    iA19 += aoVar19.a();
                                                }
                                                i11 = 2;
                                                amVar3.j(anVar23, aoVar66.b.f, -iA19, 2);
                                            } else {
                                                i11 = 2;
                                            }
                                            int i60 = apVar14.h;
                                            if (i60 > 0) {
                                                amVar3.j(anVar21, anVar20, i60, i11);
                                            }
                                            ak akVarA = amVar3.a();
                                            akVarA.f(apVar18.aa, f5, apVar19.aa, anVar20, aoVar59.a(), anVar21, aoVar60.a(), anVar22, aoVar61.a(), anVar23, aoVar62.a());
                                            amVar3.g(akVarA);
                                            aqVar2 = this;
                                            iG = i58;
                                            i52 = i59;
                                        }
                                    } else {
                                        ap apVar20 = aqVar2.ao[0];
                                        ao aoVar68 = apVar20.j;
                                        int iA20 = aoVar68.a();
                                        ao aoVar69 = aoVar68.b;
                                        if (aoVar69 != null) {
                                            iA20 += aoVar69.a();
                                        }
                                        ao aoVar70 = apVar20.l;
                                        int iA21 = aoVar70.a();
                                        ao aoVar71 = aoVar70.b;
                                        if (aoVar71 != null) {
                                            iA21 += aoVar71.a();
                                        }
                                        ao aoVar72 = apVar14.l;
                                        an anVar24 = aoVar72.b.f;
                                        if (apVar20 == apVarArr[3]) {
                                            i12 = 1;
                                            anVar24 = apVarArr[1].l.b.f;
                                        } else {
                                            i12 = 1;
                                        }
                                        int i61 = -iA21;
                                        if (apVar20.d == i12) {
                                            ao aoVar73 = apVar14.j;
                                            amVar3.i(aoVar73.f, aoVar73.b.f, iA20, i12);
                                            amVar3.j(aoVar72.f, anVar24, i61, i12);
                                            amVar3.n(aoVar72.f, aoVar73.f, apVar14.d(), 2);
                                        } else {
                                            amVar3.n(aoVar68.f, aoVar68.b.f, iA20, i12);
                                            amVar3.n(aoVar70.f, anVar24, i61, i12);
                                        }
                                    }
                                } else {
                                    i9 = i52;
                                    apVar = apVar15;
                                    z = false;
                                    apVar2 = null;
                                    apVar3 = null;
                                    while (apVar != null) {
                                        apVar4 = apVar.ac;
                                        if (apVar4 == null) {
                                            apVar2 = apVarArr[1];
                                            z = true;
                                        }
                                        if (z5) {
                                            aoVar14 = apVar.j;
                                            iA2 = aoVar14.a();
                                            if (apVar3 != null) {
                                                iA2 += apVar3.l.a();
                                            }
                                            if (apVar15 != apVar) {
                                                i10 = 3;
                                            } else {
                                                i10 = 1;
                                            }
                                            aoVar15 = aoVar14.b;
                                            if (aoVar15 != null) {
                                                anVar6 = aoVar14.f;
                                                anVar5 = aoVar15.f;
                                            } else {
                                                aoVar16 = apVar.m;
                                                aoVar17 = aoVar16.b;
                                                if (aoVar17 != null) {
                                                    an anVar25 = aoVar16.f;
                                                    an anVar26 = aoVar17.f;
                                                    iA2 -= aoVar14.a();
                                                    anVar6 = anVar25;
                                                    anVar5 = anVar26;
                                                } else {
                                                    anVar5 = null;
                                                    anVar6 = null;
                                                }
                                            }
                                            if (anVar6 != null && anVar5 != null) {
                                                amVar3.i(anVar6, anVar5, iA2, i10);
                                            }
                                            if (apVar.ae == 3) {
                                                aoVar18 = apVar.l;
                                                if (apVar.d == 1) {
                                                    amVar3.n(aoVar18.f, aoVar14.f, Math.max(apVar.g, apVar.d()), 3);
                                                } else {
                                                    amVar3.i(aoVar14.f, aoVar14.b.f, aoVar14.c, 3);
                                                    amVar3.j(aoVar18.f, aoVar14.f, apVar.g, 3);
                                                }
                                            }
                                        } else {
                                            if (z4 && z) {
                                                if (apVar3 != null) {
                                                    ao aoVar74 = apVar.l;
                                                    if (aoVar74.b == null) {
                                                        amVar3.h(aoVar74.f, apVar.c() + apVar.z);
                                                    } else {
                                                        amVar3.n(aoVar74.f, apVar2.l.b.f, -aoVar74.a(), 5);
                                                    }
                                                } else {
                                                    apVar3 = null;
                                                    if (z4) {
                                                    }
                                                    ao aoVar75 = apVar.j;
                                                    ao aoVar76 = apVar.l;
                                                    apVar5 = apVar3;
                                                    int iA22 = aoVar75.a();
                                                    int iA23 = aoVar76.a();
                                                    z2 = z;
                                                    amVar3.i(aoVar75.f, aoVar75.b.f, iA22, 1);
                                                    amVar3.j(aoVar76.f, aoVar76.b.f, -iA23, 1);
                                                    aoVar10 = aoVar75.b;
                                                    if (aoVar10 != null) {
                                                        anVar3 = aoVar10.f;
                                                    } else {
                                                        anVar3 = null;
                                                    }
                                                    if (apVar5 == null) {
                                                        aoVar13 = apVar14.j.b;
                                                        if (aoVar13 != null) {
                                                            anVar3 = aoVar13.f;
                                                        } else {
                                                            anVar3 = null;
                                                        }
                                                    }
                                                    if (apVar4 == null) {
                                                        aoVar12 = apVar2.l.b;
                                                        if (aoVar12 != null) {
                                                            apVar6 = aoVar12.a;
                                                        } else {
                                                            apVar6 = null;
                                                        }
                                                    } else {
                                                        apVar6 = apVar4;
                                                    }
                                                    if (apVar6 != null) {
                                                        anVar4 = apVar6.j.f;
                                                        if (z2) {
                                                            aoVar11 = apVar2.l.b;
                                                            if (aoVar11 != null) {
                                                                anVar4 = aoVar11.f;
                                                            } else {
                                                                anVar4 = null;
                                                            }
                                                        }
                                                        if (anVar3 != null) {
                                                            apVar7 = apVar2;
                                                        } else {
                                                            apVar7 = apVar2;
                                                        }
                                                    } else {
                                                        apVar7 = apVar2;
                                                    }
                                                    apVar4 = apVar6;
                                                }
                                            } else if (z4 && !z && apVar3 == null) {
                                                ao aoVar77 = apVar.j;
                                                if (aoVar77.b == null) {
                                                    amVar3.h(aoVar77.f, apVar.c());
                                                } else {
                                                    amVar3.n(aoVar77.f, apVar14.j.b.f, aoVar77.a(), 5);
                                                }
                                            } else {
                                                ao aoVar78 = apVar.j;
                                                ao aoVar79 = apVar.l;
                                                apVar5 = apVar3;
                                                int iA24 = aoVar78.a();
                                                int iA25 = aoVar79.a();
                                                z2 = z;
                                                amVar3.i(aoVar78.f, aoVar78.b.f, iA24, 1);
                                                amVar3.j(aoVar79.f, aoVar79.b.f, -iA25, 1);
                                                aoVar10 = aoVar78.b;
                                                if (aoVar10 != null) {
                                                    anVar3 = aoVar10.f;
                                                } else {
                                                    anVar3 = null;
                                                }
                                                if (apVar5 == null) {
                                                    aoVar13 = apVar14.j.b;
                                                    if (aoVar13 != null) {
                                                        anVar3 = aoVar13.f;
                                                    } else {
                                                        anVar3 = null;
                                                    }
                                                }
                                                if (apVar4 == null) {
                                                    aoVar12 = apVar2.l.b;
                                                    if (aoVar12 != null) {
                                                        apVar6 = aoVar12.a;
                                                    } else {
                                                        apVar6 = null;
                                                    }
                                                } else {
                                                    apVar6 = apVar4;
                                                }
                                                if (apVar6 != null) {
                                                    anVar4 = apVar6.j.f;
                                                    if (z2) {
                                                        aoVar11 = apVar2.l.b;
                                                        if (aoVar11 != null) {
                                                            anVar4 = aoVar11.f;
                                                        } else {
                                                            anVar4 = null;
                                                        }
                                                    }
                                                    if (anVar3 != null || anVar4 == null) {
                                                        apVar7 = apVar2;
                                                    } else {
                                                        apVar7 = apVar2;
                                                        amVar3.m(aoVar78.f, anVar3, iA24, 0.5f, anVar4, aoVar79.f, iA25);
                                                    }
                                                } else {
                                                    apVar7 = apVar2;
                                                }
                                                apVar4 = apVar6;
                                            }
                                            if (true == z2) {
                                                apVar4 = null;
                                            }
                                            z = z2;
                                            apVar2 = apVar7;
                                            apVar3 = apVar;
                                            apVar = apVar4;
                                        }
                                        apVar7 = apVar2;
                                        apVar = apVar;
                                        z2 = z;
                                        if (true == z2) {
                                            apVar4 = null;
                                        }
                                        z = z2;
                                        apVar2 = apVar7;
                                        apVar3 = apVar;
                                        apVar = apVar4;
                                    }
                                    if (z5) {
                                        ao aoVar80 = apVar15.j;
                                        ao aoVar81 = apVar2.l;
                                        int iA26 = aoVar80.a();
                                        int iA27 = aoVar81.a();
                                        aoVar8 = apVar14.j.b;
                                        if (aoVar8 != null) {
                                            anVar = aoVar8.f;
                                        } else {
                                            anVar = null;
                                        }
                                        aoVar9 = aoVar81.b;
                                        if (aoVar9 != null) {
                                            anVar2 = aoVar9.f;
                                        } else {
                                            anVar2 = null;
                                        }
                                        if (anVar == null && anVar2 != null) {
                                            amVar3.j(aoVar81.f, anVar2, -iA27, 1);
                                            amVar3.m(aoVar80.f, anVar, iA26, apVar14.I, anVar2, aoVar81.f, iA27);
                                        }
                                    }
                                }
                            }
                        } else {
                            f2 = 0.0f;
                        }
                        if (zArr[0] && apVar14.Y && !z5 && i54 != 2 && i53 == 0) {
                            ap apVar21 = apVar14;
                            float f6 = f2;
                            int iA28 = 0;
                            ap apVar22 = null;
                            int i62 = 0;
                            while (apVar21 != null) {
                                if (apVar21.K != 8) {
                                    i62++;
                                    if (apVar21.ae != 3) {
                                        int iD22 = iA28 + apVar21.d();
                                        ao aoVar82 = apVar21.j;
                                        int iA29 = iD22 + (aoVar82.b != null ? aoVar82.a() : 0);
                                        ao aoVar83 = apVar21.l;
                                        iA28 = iA29 + (aoVar83.b != null ? aoVar83.a() : 0);
                                    } else {
                                        f6 += apVar21.aa;
                                    }
                                }
                                ao aoVar84 = apVar21.l.b;
                                ap apVar23 = aoVar84 != null ? aoVar84.a : null;
                                if (apVar23 != null && ((aoVar7 = apVar23.j.b) == null || aoVar7.a != apVar21)) {
                                    apVar23 = null;
                                }
                                ap apVar24 = apVar21;
                                apVar21 = apVar23;
                                apVar22 = apVar24;
                            }
                            int i63 = i62 + 1;
                            if (apVar22 != null) {
                                ao aoVar85 = apVar22.l.b;
                                iA = (aoVar85 == null || aoVar85.a != aqVar2) ? aoVar85 != null ? aoVar85.a.w : 0 : aqVar2.a();
                            } else {
                                iA = 0;
                            }
                            float f7 = i63;
                            float f8 = iA - iA28;
                            if (iG == 0) {
                                f4 = f8 / f7;
                                f3 = f4;
                            } else {
                                f3 = f8 / iG;
                                f4 = f2;
                            }
                            while (apVar14 != null) {
                                ao aoVar86 = apVar14.j;
                                int iA30 = aoVar86.b != null ? aoVar86.a() : 0;
                                ao aoVar87 = apVar14.l;
                                int iA31 = aoVar87.b != null ? aoVar87.a() : 0;
                                if (apVar14.K != 8) {
                                    float f9 = iA31;
                                    float f10 = iA30;
                                    float f11 = f4 + f10;
                                    amVar3.h(aoVar86.f, (int) (f11 + f));
                                    float fD3 = f11 + (apVar14.ae == 3 ? (f6 == f2 ? f3 - f10 : ((apVar14.aa * f8) / f6) - f10) - f9 : apVar14.d());
                                    amVar3.h(aoVar87.f, (int) (fD3 + f));
                                    if (iG == 0) {
                                        fD3 += f3;
                                    }
                                    f4 = fD3 + f9;
                                } else {
                                    int i64 = (int) ((f4 - (f3 / 2.0f)) + f);
                                    amVar3.h(aoVar86.f, i64);
                                    amVar3.h(aoVar87.f, i64);
                                }
                                ao aoVar88 = aoVar87.b;
                                ap apVar25 = aoVar88 != null ? aoVar88.a : null;
                                apVar14 = (apVar25 == null || (aoVar6 = apVar25.j.b) == null || aoVar6.a == apVar14) ? apVar25 : null;
                                if (apVar14 == aqVar2) {
                                    apVar14 = null;
                                }
                            }
                        } else {
                            if (iG == 0) {
                            }
                            i9 = i52;
                            apVar = apVar15;
                            z = false;
                            apVar2 = null;
                            apVar3 = null;
                            while (apVar != null) {
                                apVar4 = apVar.ac;
                                if (apVar4 == null) {
                                    apVar2 = apVarArr[1];
                                    z = true;
                                }
                                if (z5) {
                                    aoVar14 = apVar.j;
                                    iA2 = aoVar14.a();
                                    if (apVar3 != null) {
                                        iA2 += apVar3.l.a();
                                    }
                                    if (apVar15 != apVar) {
                                        i10 = 3;
                                    } else {
                                        i10 = 1;
                                    }
                                    aoVar15 = aoVar14.b;
                                    if (aoVar15 != null) {
                                        anVar6 = aoVar14.f;
                                        anVar5 = aoVar15.f;
                                    } else {
                                        aoVar16 = apVar.m;
                                        aoVar17 = aoVar16.b;
                                        if (aoVar17 != null) {
                                            an anVar27 = aoVar16.f;
                                            an anVar28 = aoVar17.f;
                                            iA2 -= aoVar14.a();
                                            anVar6 = anVar27;
                                            anVar5 = anVar28;
                                        } else {
                                            anVar5 = null;
                                            anVar6 = null;
                                        }
                                    }
                                    if (anVar6 != null) {
                                        amVar3.i(anVar6, anVar5, iA2, i10);
                                    }
                                    if (apVar.ae == 3) {
                                        aoVar18 = apVar.l;
                                        if (apVar.d == 1) {
                                            amVar3.n(aoVar18.f, aoVar14.f, Math.max(apVar.g, apVar.d()), 3);
                                        } else {
                                            amVar3.i(aoVar14.f, aoVar14.b.f, aoVar14.c, 3);
                                            amVar3.j(aoVar18.f, aoVar14.f, apVar.g, 3);
                                        }
                                    }
                                } else {
                                    if (z4) {
                                        if (z4) {
                                        }
                                        ao aoVar710 = apVar.j;
                                        ao aoVar711 = apVar.l;
                                        apVar5 = apVar3;
                                        int iA210 = aoVar710.a();
                                        int iA211 = aoVar711.a();
                                        z2 = z;
                                        amVar3.i(aoVar710.f, aoVar710.b.f, iA210, 1);
                                        amVar3.j(aoVar711.f, aoVar711.b.f, -iA211, 1);
                                        aoVar10 = aoVar710.b;
                                        if (aoVar10 != null) {
                                            anVar3 = aoVar10.f;
                                        } else {
                                            anVar3 = null;
                                        }
                                        if (apVar5 == null) {
                                            aoVar13 = apVar14.j.b;
                                            if (aoVar13 != null) {
                                                anVar3 = aoVar13.f;
                                            } else {
                                                anVar3 = null;
                                            }
                                        }
                                        if (apVar4 == null) {
                                            aoVar12 = apVar2.l.b;
                                            if (aoVar12 != null) {
                                                apVar6 = aoVar12.a;
                                            } else {
                                                apVar6 = null;
                                            }
                                        } else {
                                            apVar6 = apVar4;
                                        }
                                        if (apVar6 != null) {
                                            anVar4 = apVar6.j.f;
                                            if (z2) {
                                                aoVar11 = apVar2.l.b;
                                                if (aoVar11 != null) {
                                                    anVar4 = aoVar11.f;
                                                } else {
                                                    anVar4 = null;
                                                }
                                            }
                                            if (anVar3 != null) {
                                                apVar7 = apVar2;
                                            } else {
                                                apVar7 = apVar2;
                                            }
                                        } else {
                                            apVar7 = apVar2;
                                        }
                                        apVar4 = apVar6;
                                    } else {
                                        if (z4) {
                                        }
                                        ao aoVar712 = apVar.j;
                                        ao aoVar713 = apVar.l;
                                        apVar5 = apVar3;
                                        int iA212 = aoVar712.a();
                                        int iA213 = aoVar713.a();
                                        z2 = z;
                                        amVar3.i(aoVar712.f, aoVar712.b.f, iA212, 1);
                                        amVar3.j(aoVar713.f, aoVar713.b.f, -iA213, 1);
                                        aoVar10 = aoVar712.b;
                                        if (aoVar10 != null) {
                                            anVar3 = aoVar10.f;
                                        } else {
                                            anVar3 = null;
                                        }
                                        if (apVar5 == null) {
                                            aoVar13 = apVar14.j.b;
                                            if (aoVar13 != null) {
                                                anVar3 = aoVar13.f;
                                            } else {
                                                anVar3 = null;
                                            }
                                        }
                                        if (apVar4 == null) {
                                            aoVar12 = apVar2.l.b;
                                            if (aoVar12 != null) {
                                                apVar6 = aoVar12.a;
                                            } else {
                                                apVar6 = null;
                                            }
                                        } else {
                                            apVar6 = apVar4;
                                        }
                                        if (apVar6 != null) {
                                            anVar4 = apVar6.j.f;
                                            if (z2) {
                                                aoVar11 = apVar2.l.b;
                                                if (aoVar11 != null) {
                                                    anVar4 = aoVar11.f;
                                                } else {
                                                    anVar4 = null;
                                                }
                                            }
                                            if (anVar3 != null) {
                                                apVar7 = apVar2;
                                            } else {
                                                apVar7 = apVar2;
                                            }
                                        } else {
                                            apVar7 = apVar2;
                                        }
                                        apVar4 = apVar6;
                                    }
                                    if (true == z2) {
                                        apVar4 = null;
                                    }
                                    z = z2;
                                    apVar2 = apVar7;
                                    apVar3 = apVar;
                                    apVar = apVar4;
                                }
                                apVar7 = apVar2;
                                apVar = apVar;
                                z2 = z;
                                if (true == z2) {
                                    apVar4 = null;
                                }
                                z = z2;
                                apVar2 = apVar7;
                                apVar3 = apVar;
                                apVar = apVar4;
                            }
                            if (z5) {
                                ao aoVar89 = apVar15.j;
                                ao aoVar810 = apVar2.l;
                                int iA214 = aoVar89.a();
                                int iA215 = aoVar810.a();
                                aoVar8 = apVar14.j.b;
                                if (aoVar8 != null) {
                                    anVar = aoVar8.f;
                                } else {
                                    anVar = null;
                                }
                                aoVar9 = aoVar810.b;
                                if (aoVar9 != null) {
                                    anVar2 = aoVar9.f;
                                } else {
                                    anVar2 = null;
                                }
                                if (anVar == null) {
                                }
                            }
                        }
                    }
                    i9 = i52;
                }
                i52 = i9 + 1;
                aqVar = this;
                amVar2 = amVar;
            }
        }
        return true;
    }

    @Override // defpackage.at, defpackage.ap
    public final void i() {
        this.af.l();
        super.i();
    }
}
