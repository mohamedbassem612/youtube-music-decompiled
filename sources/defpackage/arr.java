package defpackage;

import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class arr {
    public static final arl a = new arl();
    public static int b = 0;
    public static int c = 0;

    public static void a(int i, ard ardVar, asc ascVar, boolean z) {
        arc arcVar;
        arc arcVar2;
        float f;
        boolean z2;
        boolean z3;
        arc arcVar3;
        arc arcVar4;
        if (ardVar.n) {
            return;
        }
        boolean z4 = true;
        b++;
        if (!(ardVar instanceof are) && ardVar.J() && c(ardVar)) {
            are.X(ardVar, ascVar, new arl());
        }
        arc arcVarK = ardVar.K(2);
        arc arcVarK2 = ardVar.K(4);
        int iA = arcVarK.a();
        int iA2 = arcVarK2.a();
        HashSet<arc> hashSet = arcVarK.a;
        if (hashSet != null && arcVarK.c) {
            for (arc arcVar5 : hashSet) {
                int i2 = i + 1;
                ard ardVar2 = arcVar5.d;
                boolean zC = c(ardVar2);
                if (ardVar2.J() && zC) {
                    f = 0.0f;
                    are.X(ardVar2, ascVar, new arl());
                } else {
                    f = 0.0f;
                }
                arc arcVar6 = ardVar2.J;
                if ((arcVar5 == arcVar6 && (arcVar4 = ardVar2.L.e) != null && arcVar4.c) || (arcVar5 == ardVar2.L && (arcVar3 = arcVar6.e) != null && arcVar3.c)) {
                    z3 = z4;
                    z2 = z3;
                } else {
                    z2 = z4;
                    z3 = false;
                }
                if (ardVar2.M() != 3 || zC) {
                    if (!ardVar2.J()) {
                        if (arcVar5 == arcVar6 && ardVar2.L.e == null) {
                            int iB = arcVar6.b() + iA;
                            ardVar2.v(iB, ardVar2.j() + iB);
                            a(i2, ardVar2, ascVar, z);
                        } else {
                            arc arcVar7 = ardVar2.L;
                            if (arcVar5 == arcVar7 && arcVar6.e == null) {
                                int iB2 = iA - arcVar7.b();
                                ardVar2.v(iB2 - ardVar2.j(), iB2);
                                a(i2, ardVar2, ascVar, z);
                            } else if (z3 && !ardVar2.H()) {
                                e(i2, ascVar, ardVar2, z);
                            }
                        }
                    }
                } else if (ardVar2.M() == 3 && ardVar2.w >= 0 && ardVar2.v >= 0 && ((ardVar2.ah == 8 || (ardVar2.s == 0 && ardVar2.X == f)) && !ardVar2.H() && z3 && !ardVar2.H())) {
                    f(i2, ardVar, ascVar, ardVar2, z);
                }
                z4 = z2;
            }
        }
        boolean z5 = z4;
        if (ardVar instanceof arg) {
            return;
        }
        HashSet<arc> hashSet2 = arcVarK2.a;
        if (hashSet2 != null && arcVarK2.c) {
            for (arc arcVar8 : hashSet2) {
                int i3 = i + 1;
                ard ardVar3 = arcVar8.d;
                boolean zC2 = c(ardVar3);
                if (ardVar3.J() && zC2) {
                    are.X(ardVar3, ascVar, new arl());
                }
                arc arcVar9 = ardVar3.J;
                boolean z6 = ((arcVar8 == arcVar9 && (arcVar2 = ardVar3.L.e) != null && arcVar2.c) || (arcVar8 == ardVar3.L && (arcVar = arcVar9.e) != null && arcVar.c)) ? z5 : false;
                if (ardVar3.M() != 3 || zC2) {
                    if (!ardVar3.J()) {
                        if (arcVar8 == arcVar9 && ardVar3.L.e == null) {
                            int iB3 = arcVar9.b() + iA2;
                            ardVar3.v(iB3, ardVar3.j() + iB3);
                            a(i3, ardVar3, ascVar, z);
                        } else {
                            arc arcVar10 = ardVar3.L;
                            if (arcVar8 == arcVar10 && arcVar9.e == null) {
                                int iB4 = iA2 - arcVar10.b();
                                ardVar3.v(iB4 - ardVar3.j(), iB4);
                                a(i3, ardVar3, ascVar, z);
                            } else if (z6 && !ardVar3.H()) {
                                e(i3, ascVar, ardVar3, z);
                            }
                        }
                    }
                } else if (ardVar3.M() == 3 && ardVar3.w >= 0 && ardVar3.v >= 0 && (ardVar3.ah == 8 || (ardVar3.s == 0 && ardVar3.X == 0.0f))) {
                    if (!ardVar3.H() && z6 && !ardVar3.H()) {
                        f(i3, ardVar, ascVar, ardVar3, z);
                    }
                }
            }
        }
        ardVar.n = z5;
    }

    public static void b(int i, ard ardVar, asc ascVar) {
        arc arcVar;
        arc arcVar2;
        arc arcVar3;
        arc arcVar4;
        arc arcVar5;
        if (ardVar.o) {
            return;
        }
        c++;
        if (!(ardVar instanceof are) && ardVar.J() && c(ardVar)) {
            are.X(ardVar, ascVar, new arl());
        }
        arc arcVarK = ardVar.K(3);
        arc arcVarK2 = ardVar.K(5);
        int iA = arcVarK.a();
        int iA2 = arcVarK2.a();
        HashSet<arc> hashSet = arcVarK.a;
        if (hashSet != null && arcVarK.c) {
            for (arc arcVar6 : hashSet) {
                int i2 = i + 1;
                ard ardVar2 = arcVar6.d;
                boolean zC = c(ardVar2);
                if (ardVar2.J() && zC) {
                    are.X(ardVar2, ascVar, new arl());
                }
                arc arcVar7 = ardVar2.K;
                boolean z = (arcVar6 == arcVar7 && (arcVar5 = ardVar2.M.e) != null && arcVar5.c) || (arcVar6 == ardVar2.M && (arcVar4 = arcVar7.e) != null && arcVar4.c);
                if (ardVar2.N() != 3 || zC) {
                    if (!ardVar2.J()) {
                        if (arcVar6 == arcVar7 && ardVar2.M.e == null) {
                            int iB = arcVar7.b() + iA;
                            ardVar2.w(iB, ardVar2.h() + iB);
                            b(i2, ardVar2, ascVar);
                        } else {
                            arc arcVar8 = ardVar2.M;
                            if (arcVar6 == arcVar8 && arcVar7.e == null) {
                                int iB2 = iA - arcVar8.b();
                                ardVar2.w(iB2 - ardVar2.h(), iB2);
                                b(i2, ardVar2, ascVar);
                            } else if (z && !ardVar2.I()) {
                                g(i2, ascVar, ardVar2);
                            }
                        }
                    }
                } else if (ardVar2.N() == 3 && ardVar2.z >= 0 && ardVar2.y >= 0 && (ardVar2.ah == 8 || (ardVar2.t == 0 && ardVar2.X == 0.0f))) {
                    if (!ardVar2.I() && z && !ardVar2.I()) {
                        h(i2, ardVar, ascVar, ardVar2);
                    }
                }
            }
        }
        if (ardVar instanceof arg) {
            return;
        }
        HashSet<arc> hashSet2 = arcVarK2.a;
        if (hashSet2 != null && arcVarK2.c) {
            for (arc arcVar9 : hashSet2) {
                int i3 = i + 1;
                ard ardVar3 = arcVar9.d;
                boolean zC2 = c(ardVar3);
                if (ardVar3.J() && zC2) {
                    are.X(ardVar3, ascVar, new arl());
                }
                arc arcVar10 = ardVar3.K;
                boolean z2 = (arcVar9 == arcVar10 && (arcVar3 = ardVar3.M.e) != null && arcVar3.c) || (arcVar9 == ardVar3.M && (arcVar2 = arcVar10.e) != null && arcVar2.c);
                if (ardVar3.N() != 3 || zC2) {
                    if (ardVar3.J()) {
                        continue;
                    } else if (arcVar9 == arcVar10 && ardVar3.M.e == null) {
                        int iB3 = arcVar10.b() + iA2;
                        ardVar3.w(iB3, ardVar3.h() + iB3);
                        b(i3, ardVar3, ascVar);
                    } else {
                        arc arcVar11 = ardVar3.M;
                        if (arcVar9 == arcVar11 && arcVar10.e == null) {
                            int iB4 = iA2 - arcVar11.b();
                            ardVar3.w(iB4 - ardVar3.h(), iB4);
                            b(i3, ardVar3, ascVar);
                        } else if (z2 && !ardVar3.I()) {
                            g(i3, ascVar, ardVar3);
                        }
                    }
                } else if (ardVar3.N() == 3 && ardVar3.z >= 0 && ardVar3.y >= 0 && (ardVar3.ah == 8 || (ardVar3.t == 0 && ardVar3.X == 0.0f))) {
                    if (!ardVar3.I() && z2 && !ardVar3.I()) {
                        h(i3, ardVar, ascVar, ardVar3);
                    }
                }
            }
        }
        arc arcVarK3 = ardVar.K(6);
        if (arcVarK3.a != null && arcVarK3.c) {
            int iA3 = arcVarK3.a();
            for (arc arcVar12 : arcVarK3.a) {
                int i4 = i + 1;
                ard ardVar4 = arcVar12.d;
                boolean zC3 = c(ardVar4);
                if (ardVar4.J() && zC3) {
                    are.X(ardVar4, ascVar, new arl());
                }
                if (ardVar4.N() != 3 || zC3) {
                    if (!ardVar4.J() && arcVar12 == (arcVar = ardVar4.N)) {
                        int iB5 = arcVar12.b() + iA3;
                        if (ardVar4.F) {
                            int i5 = iB5 - ardVar4.ab;
                            int i6 = ardVar4.W + i5;
                            ardVar4.aa = i5;
                            ardVar4.K.e(i5);
                            ardVar4.M.e(i6);
                            arcVar.e(iB5);
                            ardVar4.m = true;
                        }
                        b(i4, ardVar4, ascVar);
                    }
                }
            }
        }
        ardVar.o = true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    public static boolean c(ard ardVar) {
        boolean z;
        boolean z2;
        int iM = ardVar.M();
        int iN = ardVar.N();
        ard ardVar2 = ardVar.U;
        if (ardVar2 == null) {
            ardVar2 = null;
        }
        if (ardVar2 != null) {
            ardVar2.M();
            ardVar2.N();
        }
        if (iM == 1 || ardVar.e() || iM == 2) {
            z = true;
        } else {
            if (iM == 3) {
                if (ardVar.s != 0 || ardVar.X != 0.0f || !ardVar.F(0)) {
                }
                z = true;
            } else {
                if (iM == 3) {
                }
                z = false;
            }
            if (ardVar.s == 1 && ardVar.G(0, ardVar.j())) {
                z = true;
            } else {
                z = false;
            }
        }
        if (iN == 1 || ardVar.f() || iN == 2) {
            z2 = true;
        } else {
            if (iN == 3) {
                if (ardVar.t != 0 || ardVar.X != 0.0f || !ardVar.F(1)) {
                }
                z2 = true;
            } else {
                if (iN == 3) {
                }
                z2 = false;
            }
            if (ardVar.t == 1 && ardVar.G(1, ardVar.h())) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (ardVar.X <= 0.0f) {
            if (z || !z2) {
            }
        } else if (!z && !z2) {
            z = false;
            z2 = false;
            return z ? false : false;
        }
        return true;
    }

    public static void d(ara araVar, asc ascVar, int i, boolean z) {
        if (araVar.c()) {
            if (i == 0) {
                a(1, araVar, ascVar, z);
            } else {
                b(1, araVar, ascVar);
            }
        }
    }

    private static void e(int i, asc ascVar, ard ardVar, boolean z) {
        float f = ardVar.ae;
        arc arcVar = ardVar.J;
        int iA = arcVar.e.a();
        arc arcVar2 = ardVar.L;
        int iA2 = arcVar2.e.a();
        int iB = arcVar.b() + iA;
        int iB2 = iA2 - arcVar2.b();
        if (iA == iA2) {
            f = 0.5f;
        } else {
            iA = iB;
            iA2 = iB2;
        }
        int iJ = ardVar.j();
        int i2 = (iA2 - iA) - iJ;
        if (iA > iA2) {
            i2 = (iA - iA2) - iJ;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iA;
        int i4 = i3 + iJ;
        if (iA > iA2) {
            i4 = i3 - iJ;
        }
        ardVar.v(i3, i4);
        a(i + 1, ardVar, ascVar, z);
    }

    private static void f(int i, ard ardVar, asc ascVar, ard ardVar2, boolean z) {
        float f = ardVar2.ae;
        arc arcVar = ardVar2.J;
        int iA = arcVar.e.a() + arcVar.b();
        arc arcVar2 = ardVar2.L;
        int iA2 = arcVar2.e.a() - arcVar2.b();
        if (iA2 >= iA) {
            int iJ = ardVar2.j();
            int i2 = iA2 - iA;
            if (ardVar2.ah != 8) {
                int i3 = ardVar2.s;
                if (i3 == 2) {
                    iJ = (int) (ardVar2.ae * 0.5f * (ardVar instanceof are ? ardVar.j() : ardVar.U.j()));
                } else if (i3 == 0) {
                    iJ = i2;
                }
                iJ = Math.max(ardVar2.v, iJ);
                int i4 = ardVar2.w;
                if (i4 > 0) {
                    iJ = Math.min(i4, iJ);
                }
            }
            int i5 = iA + ((int) ((f * (i2 - iJ)) + 0.5f));
            ardVar2.v(i5, iJ + i5);
            a(i + 1, ardVar2, ascVar, z);
        }
    }

    private static void g(int i, asc ascVar, ard ardVar) {
        float f = ardVar.af;
        arc arcVar = ardVar.K;
        int iA = arcVar.e.a();
        arc arcVar2 = ardVar.M;
        int iA2 = arcVar2.e.a();
        int iB = arcVar.b() + iA;
        int iB2 = iA2 - arcVar2.b();
        if (iA == iA2) {
            f = 0.5f;
        } else {
            iA = iB;
            iA2 = iB2;
        }
        int iH = ardVar.h();
        int i2 = (iA2 - iA) - iH;
        if (iA > iA2) {
            i2 = (iA - iA2) - iH;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iA + i3;
        int i5 = i4 + iH;
        if (iA > iA2) {
            i4 = iA - i3;
            i5 = i4 - iH;
        }
        ardVar.w(i4, i5);
        b(i + 1, ardVar, ascVar);
    }

    private static void h(int i, ard ardVar, asc ascVar, ard ardVar2) {
        float f = ardVar2.af;
        arc arcVar = ardVar2.K;
        int iA = arcVar.e.a() + arcVar.b();
        arc arcVar2 = ardVar2.M;
        int iA2 = arcVar2.e.a() - arcVar2.b();
        if (iA2 >= iA) {
            int iH = ardVar2.h();
            int i2 = iA2 - iA;
            if (ardVar2.ah != 8) {
                int i3 = ardVar2.t;
                if (i3 == 2) {
                    iH = (int) (f * 0.5f * (ardVar instanceof are ? ardVar.h() : ardVar.U.h()));
                } else if (i3 == 0) {
                    iH = i2;
                }
                iH = Math.max(ardVar2.y, iH);
                int i4 = ardVar2.z;
                if (i4 > 0) {
                    iH = Math.min(i4, iH);
                }
            }
            int i5 = iA + ((int) ((f * (i2 - iH)) + 0.5f));
            ardVar2.w(i5, iH + i5);
            b(i + 1, ardVar2, ascVar);
        }
    }
}
