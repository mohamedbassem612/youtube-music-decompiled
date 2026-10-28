package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class arm extends arx {
    ArrayList a;
    private int b;

    public arm(ard ardVar, int i) {
        ard ardVar2;
        ArrayList arrayList;
        super(ardVar);
        this.a = new ArrayList();
        this.f = i;
        ard ardVar3 = this.d;
        ard ardVarN = ardVar3.n(i);
        while (true) {
            ard ardVar4 = ardVarN;
            ardVar2 = ardVar3;
            ardVar3 = ardVar4;
            if (ardVar3 == null) {
                break;
            } else {
                ardVarN = ardVar3.n(this.f);
            }
        }
        this.d = ardVar2;
        this.a.add(ardVar2.o(this.f));
        ard ardVarM = ardVar2.m(this.f);
        while (true) {
            arrayList = this.a;
            if (ardVarM == null) {
                break;
            }
            arrayList.add(ardVarM.o(this.f));
            ardVarM = ardVarM.m(this.f);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arx arxVar = (arx) arrayList.get(i2);
            int i3 = this.f;
            if (i3 == 0) {
                arxVar.d.f = this;
            } else if (i3 == 1) {
                arxVar.d.g = this;
            }
        }
        if (this.f == 0 && ((are) this.d.U).c && this.a.size() > 1) {
            ArrayList arrayList2 = this.a;
            this.d = ((arx) arrayList2.get(arrayList2.size() - 1)).d;
        }
        int i4 = this.f;
        ard ardVar5 = this.d;
        this.b = i4 == 0 ? ardVar5.aj : ardVar5.ak;
    }

    private final ard g() {
        for (int i = 0; i < this.a.size(); i++) {
            ard ardVar = ((arx) this.a.get(i)).d;
            if (ardVar.ah != 8) {
                return ardVar;
            }
        }
        return null;
    }

    private final ard n() {
        ard ardVar;
        int size = this.a.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            ardVar = ((arx) this.a.get(size)).d;
        } while (ardVar.ah == 8);
        return ardVar;
    }

    @Override // defpackage.arx
    public final long a() {
        int size = this.a.size();
        long jA = 0;
        for (int i = 0; i < size; i++) {
            arx arxVar = (arx) this.a.get(i);
            jA = jA + ((long) arxVar.h.e) + arxVar.a() + ((long) arxVar.i.e);
        }
        return jA;
    }

    @Override // defpackage.arx
    public final void b() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((arx) arrayList.get(i)).b();
        }
        int size2 = this.a.size();
        if (size2 > 0) {
            ard ardVar = ((arx) this.a.get(0)).d;
            ard ardVar2 = ((arx) this.a.get(size2 - 1)).d;
            if (this.f == 0) {
                arc arcVar = ardVar.J;
                arc arcVar2 = ardVar2.L;
                arp arpVarL = l(arcVar, 0);
                int iB = arcVar.b();
                ard ardVarG = g();
                if (ardVarG != null) {
                    iB = ardVarG.J.b();
                }
                if (arpVarL != null) {
                    j(this.h, arpVarL, iB);
                }
                arp arpVarL2 = l(arcVar2, 0);
                int iB2 = arcVar2.b();
                ard ardVarN = n();
                if (ardVarN != null) {
                    iB2 = ardVarN.L.b();
                }
                if (arpVarL2 != null) {
                    j(this.i, arpVarL2, -iB2);
                }
            } else {
                arc arcVar3 = ardVar.K;
                arc arcVar4 = ardVar2.M;
                arp arpVarL3 = l(arcVar3, 1);
                int iB3 = arcVar3.b();
                ard ardVarG2 = g();
                if (ardVarG2 != null) {
                    iB3 = ardVarG2.K.b();
                }
                if (arpVarL3 != null) {
                    j(this.h, arpVarL3, iB3);
                }
                arp arpVarL4 = l(arcVar4, 1);
                int iB4 = arcVar4.b();
                ard ardVarN2 = n();
                if (ardVarN2 != null) {
                    iB4 = ardVarN2.M.b();
                }
                if (arpVarL4 != null) {
                    j(this.i, arpVarL4, -iB4);
                }
            }
            this.h.a = this;
            this.i.a = this;
        }
    }

    @Override // defpackage.arx
    public final void c() {
        for (int i = 0; i < this.a.size(); i++) {
            ((arx) this.a.get(i)).c();
        }
    }

    @Override // defpackage.arx
    public final void d() {
        this.l = null;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((arx) arrayList.get(i)).d();
        }
    }

    @Override // defpackage.arx
    public final boolean e() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (!((arx) this.a.get(i)).e()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0190  */
    @Override // defpackage.arx, defpackage.arn
    public final void f() {
        int i;
        boolean z;
        float f;
        float f2;
        int i2;
        int i3;
        int i4;
        int i5;
        float f3;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        boolean z3;
        arp arpVar = this.h;
        if (!arpVar.i) {
            return;
        }
        arp arpVar2 = this.i;
        if (!arpVar2.i) {
            return;
        }
        ard ardVar = this.d.U;
        boolean z4 = ardVar instanceof are ? ((are) ardVar).c : false;
        int i10 = arpVar2.f - arpVar.f;
        int size = this.a.size();
        int i11 = 0;
        while (true) {
            i = 8;
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((arx) this.a.get(i11)).d.ah != 8) {
                break;
            } else {
                i11++;
            }
        }
        int i12 = size - 1;
        int i13 = i12;
        while (true) {
            if (i13 < 0) {
                i13 = -1;
                break;
            } else if (((arx) this.a.get(i13)).d.ah != 8) {
                break;
            } else {
                i13--;
            }
        }
        int i14 = 0;
        while (true) {
            if (i14 >= 2) {
                z = z4;
                f = 0.0f;
                f2 = 0.0f;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                break;
            }
            i3 = 0;
            int i15 = 0;
            f = 0.0f;
            int i16 = 0;
            int i17 = 0;
            f2 = 0.0f;
            while (i15 < size) {
                arx arxVar = (arx) this.a.get(i15);
                ard ardVar2 = arxVar.d;
                if (ardVar2.ah != i) {
                    i17++;
                    if (i15 > 0 && i15 >= i11) {
                        i3 += arxVar.h.e;
                    }
                    arq arqVar = arxVar.e;
                    int i18 = arqVar.f;
                    z2 = z4;
                    int i19 = i3;
                    boolean z5 = arxVar.j != 3;
                    if (z5) {
                        int i20 = this.f;
                        if (i20 == 0) {
                            if (!ardVar2.h.e.i) {
                                return;
                            }
                        } else if (i20 == 1 && !ardVar2.i.e.i) {
                            return;
                        }
                        z3 = z5;
                    } else {
                        z3 = z5;
                        if (arxVar.c == 1 && i14 == 0) {
                            i18 = arqVar.m;
                            i16++;
                        } else if (arqVar.i) {
                        }
                        z3 = true;
                    }
                    if (z3) {
                        i3 = i19 + i18;
                    } else {
                        i16++;
                        float f4 = ardVar2.al[this.f];
                        if (f4 >= 0.0f) {
                            f2 += f4;
                        }
                        i3 = i19;
                    }
                    if (i15 < i12 && i15 < i13) {
                        i3 += -arxVar.i.e;
                    }
                } else {
                    z2 = z4;
                }
                i15++;
                z4 = z2;
                i = 8;
            }
            z = z4;
            if (i3 < i10 || i16 == 0) {
                i2 = i16;
                i4 = i17;
                break;
            } else {
                i14++;
                z4 = z;
                i = 8;
            }
        }
        int i21 = arpVar.f;
        if (z) {
            i21 = arpVar2.f;
        }
        float f5 = 0.5f;
        if (i3 > i10) {
            int i22 = (int) (((i3 - i10) / 2.0f) + 0.5f);
            i21 = z ? i21 + i22 : i21 - i22;
        }
        if (i2 > 0) {
            float f6 = i10 - i3;
            float f7 = (f6 / i2) + 0.5f;
            int i23 = 0;
            int i24 = 0;
            while (i23 < size) {
                arx arxVar2 = (arx) this.a.get(i23);
                float f8 = f5;
                ard ardVar3 = arxVar2.d;
                int i25 = i21;
                int i26 = i2;
                if (ardVar3.ah != 8 && arxVar2.j == 3) {
                    arq arqVar2 = arxVar2.e;
                    if (!arqVar2.i) {
                        int i27 = (int) f7;
                        if (f2 > f) {
                            i27 = (int) (((ardVar3.al[this.f] * f6) / f2) + f8);
                        }
                        if (this.f == 0) {
                            i8 = ardVar3.w;
                            i9 = ardVar3.v;
                        } else {
                            i8 = ardVar3.z;
                            i9 = ardVar3.y;
                        }
                        int iMax = Math.max(i9, arxVar2.c == 1 ? Math.min(i27, arqVar2.m) : i27);
                        if (i8 > 0) {
                            iMax = Math.min(i8, iMax);
                        }
                        if (iMax != i27) {
                            i24++;
                            i27 = iMax;
                        }
                        arqVar2.c(i27);
                    }
                }
                i23++;
                f5 = f8;
                i21 = i25;
                i2 = i26;
                i3 = i3;
                f6 = f6;
            }
            i5 = i21;
            f3 = f5;
            int i28 = i2;
            int i29 = i3;
            if (i24 > 0) {
                i2 = i28 - i24;
                int i30 = 0;
                for (int i31 = 0; i31 < size; i31++) {
                    arx arxVar3 = (arx) this.a.get(i31);
                    if (arxVar3.d.ah != 8) {
                        if (i31 > 0 && i31 >= i11) {
                            i30 += arxVar3.h.e;
                        }
                        i30 += arxVar3.e.f;
                        if (i31 < i12 && i31 < i13) {
                            i30 += -arxVar3.i.e;
                        }
                    }
                }
                i3 = i30;
            } else {
                i2 = i28;
                i3 = i29;
            }
            i7 = 2;
            if (this.b == 2 && i24 == 0) {
                i6 = 0;
                this.b = 0;
            } else {
                i6 = 0;
            }
        } else {
            i5 = i21;
            f3 = 0.5f;
            i6 = 0;
            i7 = 2;
        }
        if (i3 > i10) {
            this.b = i7;
        }
        if (i4 > 0 && i2 == 0) {
            if (i11 == i13) {
                this.b = i7;
            }
            i2 = i6;
        }
        int i32 = this.b;
        if (i32 == 1) {
            int i33 = i4 > 1 ? (i10 - i3) / (i4 - 1) : i4 == 1 ? (i10 - i3) / 2 : i6;
            if (i2 > 0) {
                i33 = i6;
            }
            int i34 = i5;
            for (int i35 = i6; i35 < size; i35++) {
                arx arxVar4 = (arx) this.a.get(z ? size - (i35 + 1) : i35);
                if (arxVar4.d.ah == 8) {
                    arxVar4.h.c(i34);
                    arxVar4.i.c(i34);
                } else {
                    if (i35 > 0) {
                        i34 = z ? i34 - i33 : i34 + i33;
                    }
                    if (i35 > 0 && i35 >= i11) {
                        i34 = z ? i34 - arxVar4.h.e : i34 + arxVar4.h.e;
                    }
                    if (z) {
                        arxVar4.i.c(i34);
                    } else {
                        arxVar4.h.c(i34);
                    }
                    arq arqVar3 = arxVar4.e;
                    int i36 = arqVar3.f;
                    if (arxVar4.j == 3 && arxVar4.c == 1) {
                        i36 = arqVar3.m;
                    }
                    if (z) {
                        i34 -= i36;
                        arxVar4.h.c(i34);
                    } else {
                        i34 += i36;
                        arxVar4.i.c(i34);
                    }
                    arxVar4.g = true;
                    if (i35 < i12 && i35 < i13) {
                        i34 = z ? i34 - (-arxVar4.i.e) : i34 + (-arxVar4.i.e);
                    }
                }
            }
            return;
        }
        if (i32 == 0) {
            int i37 = (i10 - i3) / (i4 + 1);
            if (i2 > 0) {
                i37 = i6;
            }
            int i38 = i5;
            for (int i39 = i6; i39 < size; i39++) {
                arx arxVar5 = (arx) this.a.get(z ? size - (i39 + 1) : i39);
                if (arxVar5.d.ah == 8) {
                    arxVar5.h.c(i38);
                    arxVar5.i.c(i38);
                } else {
                    int i40 = z ? i38 - i37 : i38 + i37;
                    if (i39 > 0 && i39 >= i11) {
                        i40 = z ? i40 - arxVar5.h.e : i40 + arxVar5.h.e;
                    }
                    if (z) {
                        arxVar5.i.c(i40);
                    } else {
                        arxVar5.h.c(i40);
                    }
                    arq arqVar4 = arxVar5.e;
                    int iMin = arqVar4.f;
                    if (arxVar5.j == 3 && arxVar5.c == 1) {
                        iMin = Math.min(iMin, arqVar4.m);
                    }
                    if (z) {
                        i38 = i40 - iMin;
                        arxVar5.h.c(i38);
                    } else {
                        i38 = i40 + iMin;
                        arxVar5.i.c(i38);
                    }
                    if (i39 < i12 && i39 < i13) {
                        i38 = z ? i38 - (-arxVar5.i.e) : i38 + (-arxVar5.i.e);
                    }
                }
            }
            return;
        }
        if (i32 != 2) {
            return;
        }
        int i41 = i10 - i3;
        int i42 = this.f;
        ard ardVar4 = this.d;
        float f9 = i42 == 0 ? ardVar4.ae : ardVar4.af;
        if (z) {
            f9 = 1.0f - f9;
        }
        int i43 = (int) ((i41 * f9) + f3);
        if (i43 < 0 || i2 > 0) {
            i43 = i6;
        }
        int i44 = z ? i5 - i43 : i5 + i43;
        while (true) {
            int i45 = i6;
            if (i45 >= size) {
                return;
            }
            i6 = i45 + 1;
            arx arxVar6 = (arx) this.a.get(z ? size - i6 : i45);
            if (arxVar6.d.ah == 8) {
                arxVar6.h.c(i44);
                arxVar6.i.c(i44);
            } else {
                if (i45 > 0 && i45 >= i11) {
                    i44 = z ? i44 - arxVar6.h.e : i44 + arxVar6.h.e;
                }
                if (z) {
                    arxVar6.i.c(i44);
                } else {
                    arxVar6.h.c(i44);
                }
                arq arqVar5 = arxVar6.e;
                int i46 = arqVar5.f;
                if (arxVar6.j == 3 && arxVar6.c == 1) {
                    i46 = arqVar5.m;
                }
                if (z) {
                    i44 -= i46;
                    arxVar6.h.c(i44);
                } else {
                    i44 += i46;
                    arxVar6.i.c(i44);
                }
                if (i45 < i12 && i45 < i13) {
                    i44 = z ? i44 - (-arxVar6.i.e) : i44 + (-arxVar6.i.e);
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arx arxVar = (arx) arrayList.get(i);
            sb.append('<');
            sb.append(arxVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
