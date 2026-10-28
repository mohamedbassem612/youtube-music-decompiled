package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class arv extends arx {
    public final arp a;
    arq b;

    public arv(ard ardVar) {
        super(ardVar);
        arp arpVar = new arp(this);
        this.a = arpVar;
        this.b = null;
        this.h.l = 6;
        this.i.l = 7;
        arpVar.l = 8;
        this.f = 1;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0269  */
    /* JADX WARN: Code duplicated, block: B:102:0x026f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0275  */
    /* JADX WARN: Code duplicated, block: B:105:0x0293  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:109:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:113:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:116:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:118:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:121:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:123:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:125:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:126:0x0313  */
    /* JADX WARN: Code duplicated, block: B:128:0x031a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0320  */
    /* JADX WARN: Code duplicated, block: B:132:0x033b  */
    /* JADX WARN: Code duplicated, block: B:133:0x0343  */
    /* JADX WARN: Code duplicated, block: B:135:0x0349  */
    /* JADX WARN: Code duplicated, block: B:137:0x034f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0361  */
    /* JADX WARN: Code duplicated, block: B:144:0x0381  */
    /* JADX WARN: Code duplicated, block: B:147:0x038c  */
    /* JADX WARN: Code duplicated, block: B:149:0x0394  */
    /* JADX WARN: Code duplicated, block: B:151:0x039a  */
    /* JADX WARN: Code duplicated, block: B:154:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.arx
    public final void b() {
        ard ardVar;
        ard ardVar2;
        arc[] arcVarArr;
        arc arcVar;
        arc arcVar2;
        arc arcVar3;
        ard ardVar3;
        arp arpVar;
        ard ardVar4;
        aru aruVar;
        arp arpVarK;
        arp arpVarK2;
        arp arpVar2;
        arp arpVarK3;
        arp arpVar3;
        ard ardVar5;
        aru aruVar2;
        arp arpVarK4;
        arp arpVarK5;
        ard ardVar6;
        ard ardVar7 = this.d;
        if (ardVar7.e) {
            this.e.c(ardVar7.h());
        }
        arq arqVar = this.e;
        if (!arqVar.i) {
            this.j = this.d.N();
            if (this.d.F) {
                this.b = new arq(this);
            }
            if (this.j != 3) {
                if (this.j == 4 && (ardVar6 = this.d.U) != null && ardVar6.N() == 1) {
                    int iH = (ardVar6.h() - this.d.K.b()) - this.d.M.b();
                    j(this.h, ardVar6.i.h, this.d.K.b());
                    j(this.i, ardVar6.i.i, -this.d.M.b());
                    arqVar.c(iH);
                    return;
                }
                if (this.j == 1) {
                    arqVar.c(this.d.h());
                }
            }
        } else if (this.j == 4 && (ardVar = this.d.U) != null && ardVar.N() == 1) {
            j(this.h, ardVar.i.h, this.d.K.b());
            j(this.i, ardVar.i.i, -this.d.M.b());
            return;
        }
        if (!arqVar.i) {
            if (this.j == 3) {
                ard ardVar8 = this.d;
                int i = ardVar8.t;
                if (i == 2) {
                    ard ardVar9 = ardVar8.U;
                    if (ardVar9 != null) {
                        arq arqVar2 = ardVar9.i.e;
                        arqVar.k.add(arqVar2);
                        arqVar2.j.add(arqVar);
                        arqVar.b = true;
                        List list = arqVar.j;
                        list.add(this.h);
                        list.add(this.i);
                    }
                } else if (i == 3 && !ardVar8.I()) {
                    ard ardVar10 = this.d;
                    if (ardVar10.s != 3) {
                        arq arqVar3 = ardVar10.h.e;
                        arqVar.k.add(arqVar3);
                        arqVar3.j.add(arqVar);
                        arqVar.b = true;
                        List list2 = arqVar.j;
                        list2.add(this.h);
                        list2.add(this.i);
                    }
                }
            }
            ardVar2 = this.d;
            arcVarArr = ardVar2.R;
            arcVar = arcVarArr[2];
            if (arcVar.e != null) {
                arcVar2 = arcVarArr[3];
                if (arcVar2.e != null) {
                    arpVarK2 = k(arcVar2);
                    if (arpVarK2 != null) {
                        arp arpVar4 = this.i;
                        j(arpVar4, arpVarK2, -this.d.R[3].b());
                        arpVar2 = this.h;
                        i(arpVar2, arpVar4, -1, arqVar);
                        if (this.d.F) {
                            i(this.a, arpVar2, 1, this.b);
                        }
                    }
                } else {
                    arcVar3 = arcVarArr[4];
                    if (arcVar3.e != null) {
                        arpVarK = k(arcVar3);
                        if (arpVarK != null) {
                            arp arpVar5 = this.a;
                            j(arpVar5, arpVarK, 0);
                            arp arpVar6 = this.h;
                            i(arpVar6, arpVar5, -1, this.b);
                            i(this.i, arpVar6, 1, arqVar);
                        }
                    } else if (!(ardVar2 instanceof arh) && (ardVar3 = ardVar2.U) != null) {
                        arp arpVar7 = ardVar3.i.h;
                        arpVar = this.h;
                        j(arpVar, arpVar7, ardVar2.l());
                        i(this.i, arpVar, 1, arqVar);
                        if (this.d.F) {
                            i(this.a, arpVar, 1, this.b);
                        }
                        if (this.j == 3) {
                            ardVar4 = this.d;
                            if (ardVar4.X > 0.0f) {
                                aruVar = ardVar4.h;
                                if (aruVar.j == 3) {
                                    aruVar.e.j.add(arqVar);
                                    arqVar.k.add(this.d.h.e);
                                    arqVar.a = this;
                                }
                            }
                        }
                    }
                }
            } else if (arcVarArr[3].e != null) {
                if (ardVar2.I()) {
                    this.h.e = this.d.R[2].b();
                    this.i.e = -this.d.R[3].b();
                } else {
                    arpVarK4 = k(this.d.R[2]);
                    arpVarK5 = k(this.d.R[3]);
                    if (arpVarK4 != null) {
                        arpVarK4.a(this);
                    }
                    if (arpVarK5 != null) {
                        arpVarK5.a(this);
                    }
                    this.k = 4;
                }
                if (this.d.F) {
                    i(this.a, this.h, 1, this.b);
                }
            } else {
                arpVarK3 = k(arcVar);
                if (arpVarK3 != null) {
                    arpVar3 = this.h;
                    j(arpVar3, arpVarK3, this.d.R[2].b());
                    i(this.i, arpVar3, 1, arqVar);
                    if (this.d.F) {
                        i(this.a, arpVar3, 1, this.b);
                    }
                    if (this.j == 3) {
                        ardVar5 = this.d;
                        if (ardVar5.X > 0.0f) {
                            aruVar2 = ardVar5.h;
                            if (aruVar2.j == 3) {
                                aruVar2.e.j.add(arqVar);
                                arqVar.k.add(this.d.h.e);
                                arqVar.a = this;
                            }
                        }
                    }
                }
            }
            if (arqVar.k.size() == 0) {
                arqVar.c = true;
            }
        }
        ard ardVar11 = this.d;
        if (ardVar11.e) {
            arc[] arcVarArr2 = ardVar11.R;
            arc arcVar4 = arcVarArr2[2];
            if (arcVar4.e != null) {
                if (arcVarArr2[3].e == null) {
                    arp arpVarK6 = k(arcVar4);
                    if (arpVarK6 != null) {
                        arp arpVar8 = this.h;
                        j(arpVar8, arpVarK6, this.d.R[2].b());
                        j(this.i, arpVar8, arqVar.f);
                        ard ardVar12 = this.d;
                        if (ardVar12.F) {
                            j(this.a, arpVar8, ardVar12.ab);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (ardVar11.I()) {
                    this.h.e = this.d.R[2].b();
                    this.i.e = -this.d.R[3].b();
                } else {
                    arp arpVarK7 = k(this.d.R[2]);
                    if (arpVarK7 != null) {
                        j(this.h, arpVarK7, this.d.R[2].b());
                    }
                    arp arpVarK8 = k(this.d.R[3]);
                    if (arpVarK8 != null) {
                        j(this.i, arpVarK8, -this.d.R[3].b());
                    }
                    this.h.b = true;
                    this.i.b = true;
                }
                ard ardVar13 = this.d;
                if (ardVar13.F) {
                    j(this.a, this.h, ardVar13.ab);
                    return;
                }
                return;
            }
            arc arcVar5 = arcVarArr2[3];
            if (arcVar5.e != null) {
                arp arpVarK9 = k(arcVar5);
                if (arpVarK9 != null) {
                    arp arpVar9 = this.i;
                    j(arpVar9, arpVarK9, -this.d.R[3].b());
                    j(this.h, arpVar9, -arqVar.f);
                }
                ard ardVar14 = this.d;
                if (ardVar14.F) {
                    j(this.a, this.h, ardVar14.ab);
                    return;
                }
                return;
            }
            arc arcVar6 = arcVarArr2[4];
            if (arcVar6.e != null) {
                arp arpVarK10 = k(arcVar6);
                if (arpVarK10 != null) {
                    arp arpVar10 = this.a;
                    j(arpVar10, arpVarK10, 0);
                    arp arpVar11 = this.h;
                    j(arpVar11, arpVar10, -this.d.ab);
                    j(this.i, arpVar11, arqVar.f);
                    return;
                }
                return;
            }
            if ((ardVar11 instanceof arh) || ardVar11.U == null || ardVar11.K(7).e != null) {
                return;
            }
            ard ardVar15 = this.d;
            arp arpVar12 = ardVar15.U.i.h;
            arp arpVar13 = this.h;
            j(arpVar13, arpVar12, ardVar15.l());
            j(this.i, arpVar13, arqVar.f);
            ard ardVar16 = this.d;
            if (ardVar16.F) {
                j(this.a, arpVar13, ardVar16.ab);
                return;
            }
            return;
        }
        arqVar.a(this);
        ardVar2 = this.d;
        arcVarArr = ardVar2.R;
        arcVar = arcVarArr[2];
        if (arcVar.e != null) {
            arcVar2 = arcVarArr[3];
            if (arcVar2.e != null) {
                arpVarK2 = k(arcVar2);
                if (arpVarK2 != null) {
                    arp arpVar14 = this.i;
                    j(arpVar14, arpVarK2, -this.d.R[3].b());
                    arpVar2 = this.h;
                    i(arpVar2, arpVar14, -1, arqVar);
                    if (this.d.F) {
                        i(this.a, arpVar2, 1, this.b);
                    }
                }
            } else {
                arcVar3 = arcVarArr[4];
                if (arcVar3.e != null) {
                    arpVarK = k(arcVar3);
                    if (arpVarK != null) {
                        arp arpVar15 = this.a;
                        j(arpVar15, arpVarK, 0);
                        arp arpVar16 = this.h;
                        i(arpVar16, arpVar15, -1, this.b);
                        i(this.i, arpVar16, 1, arqVar);
                    }
                } else if (!(ardVar2 instanceof arh)) {
                    arp arpVar17 = ardVar3.i.h;
                    arpVar = this.h;
                    j(arpVar, arpVar17, ardVar2.l());
                    i(this.i, arpVar, 1, arqVar);
                    if (this.d.F) {
                        i(this.a, arpVar, 1, this.b);
                    }
                    if (this.j == 3) {
                        ardVar4 = this.d;
                        if (ardVar4.X > 0.0f) {
                            aruVar = ardVar4.h;
                            if (aruVar.j == 3) {
                                aruVar.e.j.add(arqVar);
                                arqVar.k.add(this.d.h.e);
                                arqVar.a = this;
                            }
                        }
                    }
                }
            }
        } else if (arcVarArr[3].e != null) {
            if (ardVar2.I()) {
                this.h.e = this.d.R[2].b();
                this.i.e = -this.d.R[3].b();
            } else {
                arpVarK4 = k(this.d.R[2]);
                arpVarK5 = k(this.d.R[3]);
                if (arpVarK4 != null) {
                    arpVarK4.a(this);
                }
                if (arpVarK5 != null) {
                    arpVarK5.a(this);
                }
                this.k = 4;
            }
            if (this.d.F) {
                i(this.a, this.h, 1, this.b);
            }
        } else {
            arpVarK3 = k(arcVar);
            if (arpVarK3 != null) {
                arpVar3 = this.h;
                j(arpVar3, arpVarK3, this.d.R[2].b());
                i(this.i, arpVar3, 1, arqVar);
                if (this.d.F) {
                    i(this.a, arpVar3, 1, this.b);
                }
                if (this.j == 3) {
                    ardVar5 = this.d;
                    if (ardVar5.X > 0.0f) {
                        aruVar2 = ardVar5.h;
                        if (aruVar2.j == 3) {
                            aruVar2.e.j.add(arqVar);
                            arqVar.k.add(this.d.h.e);
                            arqVar.a = this;
                        }
                    }
                }
            }
        }
        if (arqVar.k.size() == 0) {
            arqVar.c = true;
        }
    }

    @Override // defpackage.arx
    public final void c() {
        arp arpVar = this.h;
        if (arpVar.i) {
            this.d.aa = arpVar.f;
        }
    }

    @Override // defpackage.arx
    public final void d() {
        this.l = null;
        this.h.b();
        this.i.b();
        this.a.b();
        this.e.b();
        this.g = false;
    }

    @Override // defpackage.arx
    public final boolean e() {
        return this.j != 3 || this.d.t == 0;
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
            m(ardVar.K, ardVar.M, 1);
            return;
        }
        arq arqVar = this.e;
        if (arqVar.c && !arqVar.i && this.j == 3) {
            ard ardVar2 = this.d;
            int i3 = ardVar2.t;
            if (i3 == 2) {
                ard ardVar3 = ardVar2.U;
                if (ardVar3 != null) {
                    arq arqVar2 = ardVar3.i.e;
                    if (arqVar2.i) {
                        arqVar.c((int) ((arqVar2.f * ardVar2.A) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                arq arqVar3 = ardVar2.h.e;
                if (arqVar3.i) {
                    int i4 = ardVar2.Y;
                    if (i4 == -1 || i4 != 0) {
                        float f2 = arqVar3.f;
                        float f3 = ardVar2.X;
                        f = f2 / f3;
                    } else {
                        f = arqVar3.f * ardVar2.X;
                    }
                    arqVar.c((int) (f + 0.5f));
                }
            }
        }
        arp arpVar = this.h;
        if (arpVar.c) {
            arp arpVar2 = this.i;
            if (arpVar2.c) {
                if (arpVar.i && arpVar2.i && arqVar.i) {
                    return;
                }
                if (!arqVar.i && this.j == 3) {
                    ard ardVar4 = this.d;
                    if (ardVar4.s == 0 && !ardVar4.I()) {
                        arp arpVar3 = (arp) arpVar.k.get(0);
                        arp arpVar4 = (arp) arpVar2.k.get(0);
                        int i5 = arpVar3.f + arpVar.e;
                        int i6 = arpVar4.f + arpVar2.e;
                        arpVar.c(i5);
                        arpVar2.c(i6);
                        arqVar.c(i6 - i5);
                        return;
                    }
                }
                if (!arqVar.i && this.j == 3 && this.c == 1) {
                    List list = arpVar.k;
                    if (list.size() > 0) {
                        List list2 = arpVar2.k;
                        if (list2.size() > 0) {
                            arp arpVar5 = (arp) list.get(0);
                            arp arpVar6 = (arp) list2.get(0);
                            int i7 = arpVar5.f + arpVar.e;
                            int i8 = arpVar6.f + arpVar2.e;
                            int i9 = arqVar.m;
                            int i10 = i8 - i7;
                            if (i10 < i9) {
                                arqVar.c(i10);
                            } else {
                                arqVar.c(i9);
                            }
                        }
                    }
                }
                if (arqVar.i) {
                    List list3 = arpVar.k;
                    if (list3.size() > 0) {
                        List list4 = arpVar2.k;
                        if (list4.size() > 0) {
                            arp arpVar7 = (arp) list3.get(0);
                            arp arpVar8 = (arp) list4.get(0);
                            int i11 = arpVar7.f;
                            int i12 = arpVar.e + i11;
                            int i13 = arpVar8.f;
                            int i14 = arpVar2.e + i13;
                            float f4 = this.d.af;
                            if (arpVar7 == arpVar8) {
                                f4 = 0.5f;
                            } else {
                                i11 = i12;
                                i13 = i14;
                            }
                            arpVar.c((int) (i11 + 0.5f + (((i13 - i11) - arqVar.f) * f4)));
                            arpVar2.c(arpVar.f + arqVar.f);
                        }
                    }
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
        arp arpVar3 = this.a;
        arpVar3.b();
        arpVar3.i = false;
        this.e.i = false;
    }

    public final String toString() {
        return "VerticalRun ".concat(String.valueOf(this.d.ai));
    }
}
