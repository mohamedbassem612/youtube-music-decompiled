package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aru extends arx {
    private static final int[] a = new int[2];

    public aru(ard ardVar) {
        super(ardVar);
        this.h.l = 4;
        this.i.l = 5;
        this.f = 0;
    }

    private static final void n(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i4 - i3;
        int i7 = i2 - i;
        if (i5 != -1) {
            if (i5 != 0) {
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f) + 0.5f);
                return;
            } else {
                iArr[0] = (int) ((i6 * f) + 0.5f);
                iArr[1] = i6;
                return;
            }
        }
        float f2 = (i7 / f) + 0.5f;
        int i8 = (int) ((i6 * f) + 0.5f);
        if (i8 <= i7) {
            iArr[0] = i8;
            iArr[1] = i6;
            return;
        }
        int i9 = (int) f2;
        if (i9 <= i6) {
            iArr[0] = i7;
            iArr[1] = i9;
        }
    }

    @Override // defpackage.arx
    public final void b() {
        ard ardVar;
        ard ardVar2;
        ard ardVar3;
        ard ardVar4 = this.d;
        if (ardVar4.e) {
            this.e.c(ardVar4.j());
        }
        arq arqVar = this.e;
        if (!arqVar.i) {
            int iM = this.d.M();
            this.j = iM;
            if (iM != 3) {
                if (this.j == 4 && (ardVar3 = this.d.U) != null && (ardVar3.M() == 1 || ardVar3.M() == 4)) {
                    int iJ = (ardVar3.j() - this.d.J.b()) - this.d.L.b();
                    j(this.h, ardVar3.h.h, this.d.J.b());
                    j(this.i, ardVar3.h.i, -this.d.L.b());
                    arqVar.c(iJ);
                    return;
                }
                if (this.j == 1) {
                    arqVar.c(this.d.j());
                }
            }
        } else if (this.j == 4 && (ardVar = this.d.U) != null && (ardVar.M() == 1 || ardVar.M() == 4)) {
            j(this.h, ardVar.h.h, this.d.J.b());
            j(this.i, ardVar.h.i, -this.d.L.b());
            return;
        }
        if (arqVar.i) {
            ard ardVar5 = this.d;
            if (ardVar5.e) {
                arc[] arcVarArr = ardVar5.R;
                arc arcVar = arcVarArr[0];
                if (arcVar.e == null) {
                    arc arcVar2 = arcVarArr[1];
                    if (arcVar2.e != null) {
                        arp arpVarK = k(arcVar2);
                        if (arpVarK != null) {
                            arp arpVar = this.i;
                            j(arpVar, arpVarK, -this.d.R[1].b());
                            j(this.h, arpVar, -arqVar.f);
                            return;
                        }
                        return;
                    }
                    if ((ardVar5 instanceof arh) || ardVar5.U == null || ardVar5.K(7).e != null) {
                        return;
                    }
                    ard ardVar6 = this.d;
                    arp arpVar2 = ardVar6.U.h.h;
                    arp arpVar3 = this.h;
                    j(arpVar3, arpVar2, ardVar6.k());
                    j(this.i, arpVar3, arqVar.f);
                    return;
                }
                if (arcVarArr[1].e == null) {
                    arp arpVarK2 = k(arcVar);
                    if (arpVarK2 != null) {
                        arp arpVar4 = this.h;
                        j(arpVar4, arpVarK2, this.d.R[0].b());
                        j(this.i, arpVar4, arqVar.f);
                        return;
                    }
                    return;
                }
                if (ardVar5.H()) {
                    this.h.e = this.d.R[0].b();
                    this.i.e = -this.d.R[1].b();
                    return;
                }
                arp arpVarK3 = k(this.d.R[0]);
                if (arpVarK3 != null) {
                    j(this.h, arpVarK3, this.d.R[0].b());
                }
                arp arpVarK4 = k(this.d.R[1]);
                if (arpVarK4 != null) {
                    j(this.i, arpVarK4, -this.d.R[1].b());
                }
                this.h.b = true;
                this.i.b = true;
                return;
            }
        }
        if (this.j == 3) {
            ard ardVar7 = this.d;
            int i = ardVar7.s;
            if (i == 2) {
                ard ardVar8 = ardVar7.U;
                if (ardVar8 != null) {
                    arq arqVar2 = ardVar8.i.e;
                    arqVar.k.add(arqVar2);
                    arqVar2.j.add(arqVar);
                    arqVar.b = true;
                    arp arpVar5 = this.h;
                    List list = arqVar.j;
                    list.add(arpVar5);
                    list.add(this.i);
                }
            } else if (i == 3) {
                if (ardVar7.t == 3) {
                    this.h.a = this;
                    this.i.a = this;
                    arv arvVar = ardVar7.i;
                    arvVar.h.a = this;
                    arvVar.i.a = this;
                    arqVar.a = this;
                    if (ardVar7.I()) {
                        List list2 = arqVar.k;
                        list2.add(this.d.i.e);
                        this.d.i.e.j.add(arqVar);
                        arv arvVar2 = this.d.i;
                        arvVar2.e.a = this;
                        list2.add(arvVar2.h);
                        list2.add(this.d.i.i);
                        this.d.i.h.j.add(arqVar);
                        this.d.i.i.j.add(arqVar);
                    } else {
                        boolean zH = this.d.H();
                        ard ardVar9 = this.d;
                        if (zH) {
                            ardVar9.i.e.k.add(arqVar);
                            arqVar.j.add(this.d.i.e);
                        } else {
                            ardVar9.i.e.k.add(arqVar);
                        }
                    }
                } else {
                    arq arqVar3 = ardVar7.i.e;
                    arqVar.k.add(arqVar3);
                    arqVar3.j.add(arqVar);
                    this.d.i.h.j.add(arqVar);
                    this.d.i.i.j.add(arqVar);
                    arqVar.b = true;
                    arp arpVar6 = this.h;
                    List list3 = arqVar.j;
                    list3.add(arpVar6);
                    arp arpVar7 = this.i;
                    list3.add(arpVar7);
                    arpVar6.k.add(arqVar);
                    arpVar7.k.add(arqVar);
                }
            }
        }
        ard ardVar10 = this.d;
        arc[] arcVarArr2 = ardVar10.R;
        arc arcVar3 = arcVarArr2[0];
        if (arcVar3.e == null) {
            arc arcVar4 = arcVarArr2[1];
            if (arcVar4.e != null) {
                arp arpVarK5 = k(arcVar4);
                if (arpVarK5 != null) {
                    arp arpVar8 = this.i;
                    j(arpVar8, arpVarK5, -this.d.R[1].b());
                    i(this.h, arpVar8, -1, arqVar);
                    return;
                }
                return;
            }
            if ((ardVar10 instanceof arh) || (ardVar2 = ardVar10.U) == null) {
                return;
            }
            arp arpVar9 = ardVar2.h.h;
            arp arpVar10 = this.h;
            j(arpVar10, arpVar9, ardVar10.k());
            i(this.i, arpVar10, 1, arqVar);
            return;
        }
        if (arcVarArr2[1].e == null) {
            arp arpVarK6 = k(arcVar3);
            if (arpVarK6 != null) {
                arp arpVar11 = this.h;
                j(arpVar11, arpVarK6, this.d.R[0].b());
                i(this.i, arpVar11, 1, arqVar);
                return;
            }
            return;
        }
        if (ardVar10.H()) {
            this.h.e = this.d.R[0].b();
            this.i.e = -this.d.R[1].b();
            return;
        }
        arp arpVarK7 = k(this.d.R[0]);
        arp arpVarK8 = k(this.d.R[1]);
        if (arpVarK7 != null) {
            arpVarK7.a(this);
        }
        if (arpVarK8 != null) {
            arpVarK8.a(this);
        }
        this.k = 4;
    }

    @Override // defpackage.arx
    public final void c() {
        arp arpVar = this.h;
        if (arpVar.i) {
            this.d.Z = arpVar.f;
        }
    }

    @Override // defpackage.arx
    public final void d() {
        this.l = null;
        this.h.b();
        this.i.b();
        this.e.b();
        this.g = false;
    }

    @Override // defpackage.arx
    public final boolean e() {
        return this.j != 3 || this.d.s == 0;
    }

    @Override // defpackage.arx, defpackage.arn
    public final void f() {
        float f;
        int i = this.k;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 3) {
            ard ardVar = this.d;
            m(ardVar.J, ardVar.L, 0);
            return;
        }
        arq arqVar = this.e;
        if (!arqVar.i && this.j == 3) {
            ard ardVar2 = this.d;
            int i3 = ardVar2.s;
            if (i3 == 2) {
                ard ardVar3 = ardVar2.U;
                if (ardVar3 != null) {
                    arq arqVar2 = ardVar3.h.e;
                    if (arqVar2.i) {
                        arqVar.c((int) ((arqVar2.f * ardVar2.x) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = ardVar2.t;
                if (i4 == 0 || i4 == 3) {
                    arv arvVar = ardVar2.i;
                    arp arpVar = arvVar.h;
                    arp arpVar2 = arvVar.i;
                    boolean z = ardVar2.J.e != null;
                    boolean z2 = ardVar2.K.e != null;
                    boolean z3 = ardVar2.L.e != null;
                    boolean z4 = ardVar2.M.e != null;
                    int i5 = ardVar2.Y;
                    if (z && z2 && z3 && z4) {
                        float f2 = ardVar2.X;
                        if (arpVar.i && arpVar2.i) {
                            arp arpVar3 = this.h;
                            if (arpVar3.c) {
                                arp arpVar4 = this.i;
                                if (arpVar4.c) {
                                    int i6 = ((arp) arpVar3.k.get(0)).f + arpVar3.e;
                                    int i7 = ((arp) arpVar4.k.get(0)).f - arpVar4.e;
                                    int i8 = arpVar.f + arpVar.e;
                                    int i9 = arpVar2.f - arpVar2.e;
                                    int[] iArr = a;
                                    n(iArr, i6, i7, i8, i9, f2, i5);
                                    arqVar.c(iArr[0]);
                                    this.d.i.e.c(iArr[1]);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        arp arpVar5 = this.h;
                        if (arpVar5.i) {
                            arp arpVar6 = this.i;
                            if (arpVar6.i) {
                                if (!arpVar.c || !arpVar2.c) {
                                    return;
                                }
                                int i10 = arpVar5.f + arpVar5.e;
                                int i11 = arpVar6.f - arpVar6.e;
                                int i12 = ((arp) arpVar.k.get(0)).f + arpVar.e;
                                int i13 = ((arp) arpVar2.k.get(0)).f - arpVar2.e;
                                int[] iArr2 = a;
                                n(iArr2, i10, i11, i12, i13, f2, i5);
                                arqVar.c(iArr2[0]);
                                this.d.i.e.c(iArr2[1]);
                            }
                        }
                        if (!arpVar5.c) {
                            return;
                        }
                        arp arpVar7 = this.i;
                        if (!arpVar7.c || !arpVar.c || !arpVar2.c) {
                            return;
                        }
                        int i14 = ((arp) arpVar5.k.get(0)).f + arpVar5.e;
                        int i15 = ((arp) arpVar7.k.get(0)).f - arpVar7.e;
                        int i16 = ((arp) arpVar.k.get(0)).f + arpVar.e;
                        int i17 = ((arp) arpVar2.k.get(0)).f - arpVar2.e;
                        int[] iArr3 = a;
                        n(iArr3, i14, i15, i16, i17, f2, i5);
                        arqVar.c(iArr3[0]);
                        this.d.i.e.c(iArr3[1]);
                    } else if (z && z3) {
                        arp arpVar8 = this.h;
                        if (!arpVar8.c) {
                            return;
                        }
                        arp arpVar9 = this.i;
                        if (!arpVar9.c) {
                            return;
                        }
                        float f3 = ardVar2.X;
                        int i18 = (((arp) arpVar9.k.get(0)).f - arpVar9.e) - (((arp) arpVar8.k.get(0)).f + arpVar8.e);
                        if (i5 == -1 || i5 == 0) {
                            int iH = h(i18, 0);
                            int i19 = (int) ((iH * f3) + 0.5f);
                            int iH2 = h(i19, 1);
                            if (i19 != iH2) {
                                iH = (int) ((iH2 / f3) + 0.5f);
                            }
                            arqVar.c(iH);
                            this.d.i.e.c(iH2);
                        } else {
                            int iH3 = h(i18, 0);
                            int i20 = (int) ((iH3 / f3) + 0.5f);
                            int iH4 = h(i20, 1);
                            if (i20 != iH4) {
                                iH3 = (int) ((iH4 * f3) + 0.5f);
                            }
                            arqVar.c(iH3);
                            this.d.i.e.c(iH4);
                        }
                    } else if (z2 && z4) {
                        if (!arpVar.c || !arpVar2.c) {
                            return;
                        }
                        float f4 = ardVar2.X;
                        int i21 = (((arp) arpVar2.k.get(0)).f - arpVar2.e) - (((arp) arpVar.k.get(0)).f + arpVar.e);
                        if (i5 != 0) {
                            int iH5 = h(i21, 1);
                            int i22 = (int) ((iH5 / f4) + 0.5f);
                            int iH6 = h(i22, 0);
                            if (i22 != iH6) {
                                iH5 = (int) ((iH6 * f4) + 0.5f);
                            }
                            arqVar.c(iH6);
                            this.d.i.e.c(iH5);
                        } else {
                            int iH7 = h(i21, 1);
                            int i23 = (int) ((iH7 * f4) + 0.5f);
                            int iH8 = h(i23, 0);
                            if (i23 != iH8) {
                                iH7 = (int) ((iH8 / f4) + 0.5f);
                            }
                            arqVar.c(iH8);
                            this.d.i.e.c(iH7);
                        }
                    }
                } else {
                    int i24 = ardVar2.Y;
                    if (i24 == -1 || i24 != 0) {
                        float f5 = ardVar2.i.e.f;
                        float f6 = ardVar2.X;
                        f = f5 * f6;
                    } else {
                        f = ardVar2.i.e.f / ardVar2.X;
                    }
                    arqVar.c((int) (f + 0.5f));
                }
            }
        }
        arp arpVar10 = this.h;
        if (arpVar10.c) {
            arp arpVar11 = this.i;
            if (arpVar11.c) {
                if (arpVar10.i && arpVar11.i && arqVar.i) {
                    return;
                }
                if (!arqVar.i && this.j == 3) {
                    ard ardVar4 = this.d;
                    if (ardVar4.s == 0 && !ardVar4.H()) {
                        arp arpVar12 = (arp) arpVar10.k.get(0);
                        arp arpVar13 = (arp) arpVar11.k.get(0);
                        int i25 = arpVar12.f + arpVar10.e;
                        int i26 = arpVar13.f + arpVar11.e;
                        arpVar10.c(i25);
                        arpVar11.c(i26);
                        arqVar.c(i26 - i25);
                        return;
                    }
                }
                if (!arqVar.i && this.j == 3 && this.c == 1) {
                    List list = arpVar10.k;
                    if (list.size() > 0) {
                        List list2 = arpVar11.k;
                        if (list2.size() > 0) {
                            arp arpVar14 = (arp) list.get(0);
                            int iMin = Math.min((((arp) list2.get(0)).f + arpVar11.e) - (arpVar14.f + arpVar10.e), arqVar.m);
                            ard ardVar5 = this.d;
                            int i27 = ardVar5.w;
                            int iMax = Math.max(ardVar5.v, iMin);
                            if (i27 > 0) {
                                iMax = Math.min(i27, iMax);
                            }
                            arqVar.c(iMax);
                        }
                    }
                }
                if (arqVar.i) {
                    arp arpVar15 = (arp) arpVar10.k.get(0);
                    arp arpVar16 = (arp) arpVar11.k.get(0);
                    int i28 = arpVar15.f;
                    int i29 = arpVar10.e + i28;
                    int i30 = arpVar16.f;
                    int i31 = arpVar11.e + i30;
                    float f7 = this.d.ae;
                    if (arpVar15 == arpVar16) {
                        f7 = 0.5f;
                    } else {
                        i28 = i29;
                        i30 = i31;
                    }
                    arpVar10.c((int) (i28 + 0.5f + (((i30 - i28) - arqVar.f) * f7)));
                    arpVar11.c(arpVar10.f + arqVar.f);
                }
            }
        }
    }

    public final void g() {
        this.g = false;
        arp arpVar = this.h;
        arpVar.b();
        arpVar.i = false;
        arp arpVar2 = this.i;
        arpVar2.b();
        arpVar2.i = false;
        this.e.i = false;
    }

    public final String toString() {
        return "HorizontalRun ".concat(String.valueOf(this.d.ai));
    }
}
