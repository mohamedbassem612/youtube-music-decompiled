package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ara extends arh {
    public int a = 0;
    public boolean b = true;
    public int c = 0;
    boolean d = false;

    public final int a() {
        int i = this.a;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00de  */
    /* JADX WARN: Code duplicated, block: B:72:0x00df A[DONT_INVERT, PHI: r14
      0x00df: PHI (r14v8 boolean) = (r14v2 boolean), (r14v9 boolean) binds: [B:69:0x00da, B:71:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x00e7  */
    @Override // defpackage.ard
    public final void b(aqu aquVar, boolean z) {
        boolean z2;
        int i;
        int i2;
        int i3;
        arc[] arcVarArr = this.R;
        arc arcVar = this.J;
        arcVarArr[0] = arcVar;
        arc arcVar2 = this.K;
        int i4 = 2;
        arcVarArr[2] = arcVar2;
        arc arcVar3 = this.L;
        arcVarArr[1] = arcVar3;
        arc arcVar4 = this.M;
        arcVarArr[3] = arcVar4;
        int i5 = 0;
        while (true) {
            int length = arcVarArr.length;
            if (i5 >= 6) {
                break;
            }
            arc arcVar5 = arcVarArr[i5];
            arcVar5.h = aquVar.b(arcVar5);
            i5++;
        }
        int i6 = this.a;
        if (i6 < 0 || i6 >= 4) {
            return;
        }
        arc arcVar6 = arcVarArr[i6];
        if (!this.d) {
            c();
        }
        if (this.d) {
            this.d = false;
            int i7 = this.a;
            if (i7 == 0 || i7 == 1) {
                aquVar.f(arcVar.h, this.Z);
                aquVar.f(arcVar3.h, this.Z);
                return;
            } else {
                if (i7 == 2 || i7 == 3) {
                    aquVar.f(arcVar2.h, this.aa);
                    aquVar.f(arcVar4.h, this.aa);
                    return;
                }
                return;
            }
        }
        int i8 = 0;
        while (true) {
            if (i8 >= this.as) {
                z2 = false;
                break;
            }
            ard ardVar = this.ar[i8];
            if ((this.b || ardVar.d()) && ((((i2 = this.a) == 0 || i2 == 1) && ardVar.M() == 3 && ardVar.J.e != null && ardVar.L.e != null) || (((i3 = this.a) == 2 || i3 == 3) && ardVar.N() == 3 && ardVar.K.e != null && ardVar.M.e != null))) {
                z2 = true;
                break;
            }
            i8++;
        }
        boolean z3 = arcVar.f() || arcVar3.f();
        boolean z4 = arcVar2.f() || arcVar4.f();
        if (z2) {
            i = 4;
        } else {
            int i9 = this.a;
            i = 5;
            if (i9 != 0) {
                if (i9 != 2) {
                    if ((i9 == 1 || !z3) && (i9 != 3 || !z4)) {
                        i = 4;
                    }
                } else if (!z4) {
                    z4 = false;
                    if (i9 == 1) {
                        i = 4;
                    } else {
                        i = 4;
                    }
                }
            } else if (!z3) {
                i9 = 0;
                z3 = false;
                if (i9 != 2) {
                    if (i9 == 1) {
                        i = 4;
                    } else {
                        i = 4;
                    }
                } else if (!z4) {
                    z4 = false;
                    if (i9 == 1) {
                        i = 4;
                    } else {
                        i = 4;
                    }
                }
            }
        }
        int i10 = 0;
        while (i10 < this.as) {
            ard ardVar2 = this.ar[i10];
            if (this.b || ardVar2.d()) {
                arc[] arcVarArr2 = ardVar2.R;
                aqy aqyVarB = aquVar.b(arcVarArr2[this.a]);
                int i11 = this.a;
                arc arcVar7 = arcVarArr2[i11];
                arcVar7.h = aqyVarB;
                arc arcVar8 = arcVar7.e;
                int i12 = (arcVar8 == null || arcVar8.d != this) ? 0 : arcVar7.f;
                if (i11 == 0 || i11 == i4) {
                    aqy aqyVar = arcVar6.h;
                    int i13 = this.c - i12;
                    aqt aqtVarA = aquVar.a();
                    aqy aqyVarC = aquVar.c();
                    aqyVarC.e = 0;
                    aqtVarA.i(aqyVar, aqyVarB, aqyVarC, i13);
                    aquVar.e(aqtVarA);
                } else {
                    aqy aqyVar2 = arcVar6.h;
                    int i14 = this.c + i12;
                    aqt aqtVarA2 = aquVar.a();
                    aqy aqyVarC2 = aquVar.c();
                    aqyVarC2.e = 0;
                    aqtVarA2.h(aqyVar2, aqyVarB, aqyVarC2, i14);
                    aquVar.e(aqtVarA2);
                }
                aquVar.m(arcVar6.h, aqyVarB, this.c + i12, i);
            }
            i10++;
            i4 = 2;
        }
        int i15 = this.a;
        if (i15 == 0) {
            aquVar.m(arcVar3.h, arcVar.h, 0, 8);
            aquVar.m(arcVar.h, this.U.L.h, 0, 4);
            aquVar.m(arcVar.h, this.U.J.h, 0, 0);
            return;
        }
        if (i15 == 1) {
            aquVar.m(arcVar.h, arcVar3.h, 0, 8);
            aquVar.m(arcVar.h, this.U.J.h, 0, 4);
            aquVar.m(arcVar.h, this.U.L.h, 0, 0);
        } else if (i15 == 2) {
            aquVar.m(arcVar4.h, arcVar2.h, 0, 8);
            aquVar.m(arcVar2.h, this.U.M.h, 0, 4);
            aquVar.m(arcVar2.h, this.U.K.h, 0, 0);
        } else if (i15 == 3) {
            aquVar.m(arcVar2.h, arcVar4.h, 0, 8);
            aquVar.m(arcVar2.h, this.U.K.h, 0, 4);
            aquVar.m(arcVar2.h, this.U.M.h, 0, 0);
        }
    }

    public final boolean c() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.as;
            if (i4 >= i) {
                break;
            }
            ard ardVar = this.ar[i4];
            if ((this.b || ardVar.d()) && ((((i2 = this.a) == 0 || i2 == 1) && !ardVar.e()) || (((i3 = this.a) == 2 || i3 == 3) && !ardVar.f()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.as; i5++) {
            ard ardVar2 = this.ar[i5];
            if (this.b || ardVar2.d()) {
                if (!z2) {
                    int i6 = this.a;
                    if (i6 == 0) {
                        iMax = ardVar2.K(2).a();
                    } else if (i6 == 1) {
                        iMax = ardVar2.K(4).a();
                    } else if (i6 == 2) {
                        iMax = ardVar2.K(3).a();
                    } else if (i6 == 3) {
                        iMax = ardVar2.K(5).a();
                    }
                }
                int i7 = this.a;
                if (i7 == 0) {
                    iMax = Math.min(iMax, ardVar2.K(2).a());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, ardVar2.K(4).a());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, ardVar2.K(3).a());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, ardVar2.K(5).a());
                }
                z2 = true;
            }
        }
        int i8 = iMax + this.c;
        int i9 = this.a;
        if (i9 == 0 || i9 == 1) {
            v(i8, i8);
        } else {
            w(i8, i8);
        }
        this.d = true;
        return true;
    }

    @Override // defpackage.ard
    public final boolean d() {
        return true;
    }

    @Override // defpackage.ard
    public final boolean e() {
        return this.d;
    }

    @Override // defpackage.ard
    public final boolean f() {
        return this.d;
    }

    @Override // defpackage.ard
    public final String toString() {
        String strConcat = "[Barrier] " + this.ai + " {";
        for (int i = 0; i < this.as; i++) {
            ard ardVar = this.ar[i];
            if (i > 0) {
                strConcat = strConcat.concat(", ");
            }
            strConcat = strConcat.concat(String.valueOf(ardVar.ai));
        }
        return strConcat.concat("}");
    }
}
