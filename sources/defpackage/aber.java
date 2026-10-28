package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aber {
    public final /* synthetic */ Object a;

    public aber(Object obj) {
        this.a = obj;
    }

    public final void a(aazk aazkVar) {
        boolean[] zArr;
        int i = (int) aazkVar.a;
        abes abesVar = (abes) this.a;
        if (i != abesVar.r) {
            abesVar.r = i;
            ajdz ajdzVar = abesVar.i;
            if (ajdzVar != null) {
                abesVar.h();
                if (ajdzVar.d.size() != 0) {
                    aqmh aqmhVar = null;
                    int i2 = -1;
                    ajdw ajdwVar = null;
                    for (int i3 = 0; i3 < abesVar.n.size(); i3++) {
                        ajdw ajdwVar2 = (ajdw) abesVar.n.get(i3);
                        long j = ajdwVar2.c;
                        long j2 = i;
                        if (j <= j2 && ajdwVar2.d > j2 && (ajdwVar == null || j > ajdwVar.c)) {
                            i2 = i3;
                            ajdwVar = ajdwVar2;
                        }
                    }
                    if (i2 != abesVar.l) {
                        abesVar.l = i2;
                        abesVar.m = ajdwVar;
                        if (ajdwVar != null) {
                            abel abelVar = abesVar.u;
                            int i4 = ajdwVar.b;
                            String str = (i4 & 16) != 0 ? ajdwVar.f : null;
                            String str2 = (i4 & 32) != 0 ? ajdwVar.g : null;
                            abelVar.f.setText(str);
                            abelVar.g.setText(str2);
                            abelVar.d(null);
                            if ((ajdwVar.b & SemanticState.Focused) != 0 && (aqmhVar = ajdwVar.i) == null) {
                                aqmhVar = aqmh.a;
                            }
                            abesVar.h = abesVar.a(aawb.L(aqmhVar, 40), new abem(abesVar));
                            abesVar.d.a(ajdwVar.k);
                        }
                    }
                    ajdw ajdwVar3 = abesVar.m;
                    if (ajdwVar3 == null) {
                        abesVar.c(true);
                        return;
                    }
                    if (abesVar.i()) {
                        abesVar.c(true);
                    } else {
                        if (!abesVar.j() || abesVar.o || (zArr = abesVar.k) == null) {
                            return;
                        }
                        abesVar.g(true, true, zArr[abesVar.l] ? 0 : ajdwVar3.e);
                    }
                }
            }
        }
    }

    public final avmn[] b(abvn abvnVar) {
        int i = 1;
        avlh avlhVarI = ((avlh) abvnVar.r().f).i(aawb.y(abvnVar.X(), 8192L)).i(new abwr(i));
        int i2 = 8;
        if ((abvnVar.g().g.c(19, 45624289L, 0L) & 1) != 0) {
            avlhVarI = avlhVarI.x(new yqz(i2));
        }
        int i3 = 0;
        int i4 = 4;
        avmn avmnVarAl = avlhVarI.al(new aawl(new abgd(this, 6), "COP2", 0), new abeq(i4));
        Object obj = this.a;
        int i5 = 7;
        avmn avmnVarAk = ((avlh) ((ahsm) ((abge) obj).Y.a).c).ak(new abhb(obj, i5));
        avlh avlhVar = (avlh) abvnVar.r().a;
        avlh avlhVar2 = (avlh) abvnVar.r().i;
        int i6 = 3;
        int i7 = 13;
        return new avmn[]{avlhVar.i(aawb.y(abvnVar.X(), 8192L)).i(new abwr(i)).al(new aawl(new avni() { // from class: abgc
            @Override // defpackage.avni
            public final void a(Object obj2) {
                boolean z;
                wjf wjfVar;
                aazj aazjVar = (aazj) obj2;
                boolean z2 = aazjVar.i && (wjfVar = aazjVar.b) != null && wjfVar.W();
                abob abobVar = aazjVar.a;
                wjf wjfVar2 = aazjVar.b;
                if (wjfVar2 != null) {
                    if (wjfVar2.f().ac()) {
                        wjf wjfVar3 = aazjVar.c;
                        if (wjfVar3 != null && wjfVar3.P() && abobVar.a(abob.e, abob.f, abob.d)) {
                            abobVar = abob.i;
                        }
                    } else if (wjfVar2.f().av() && abobVar.a(abob.e, abob.f, abob.d)) {
                        abobVar = abob.i;
                    }
                }
                aber aberVar = this.a;
                boolean zC = abobVar.c(abob.c);
                Object obj3 = aberVar.a;
                abge abgeVar = (abge) obj3;
                abgeVar.E = zC;
                abgeVar.G = abobVar == abob.j;
                abob abobVar2 = abob.a;
                if (abobVar == abobVar2) {
                    abgeVar.I = null;
                    abgeVar.J = abobVar2;
                    abgeVar.E = false;
                    abgeVar.H = false;
                    abgeVar.F = false;
                    abgeVar.G = false;
                    abgeVar.M = 0L;
                    abgeVar.N = 0L;
                    abgeVar.O = 0L;
                    abgeVar.P = 0L;
                    abgeVar.Q = 0L;
                    abgeVar.K = null;
                    abgeVar.y.l();
                    abgeVar.T = Optional.empty();
                    abgeVar.j(new abgi(abgh.a, false));
                    abgeVar.k(false);
                    synchronized (abgeVar.R) {
                        ((abge) obj3).S = null;
                    }
                } else {
                    abge abgeVar2 = (abge) aberVar.a;
                    if (!abgeVar2.E || abobVar.b()) {
                        abgeVar2.j(abgeVar2.x.X() ? new abgi(abgh.b, true) : new abgi(abgh.c, true));
                    } else if (abobVar == abob.d || abobVar.a(abob.e, abob.g)) {
                        abgeVar2.j(new abgi(abgh.c, false));
                    } else if (abobVar == abob.j) {
                        abgeVar2.j(new abgi(abgh.f, false));
                    }
                }
                if (abobVar.d()) {
                    abge abgeVar3 = (abge) aberVar.a;
                    abgeVar3.H = false;
                    abgeVar3.j(new abgi(abgh.b, false));
                    abgeVar3.k(true);
                }
                abge abgeVar4 = (abge) aberVar.a;
                abgeVar4.J = abobVar;
                abgeVar4.I = aazjVar;
                abgeVar4.m();
                vxz vxzVar = abgeVar4.W;
                abgeVar4.y.u((abobVar.c(abob.g) || (vxzVar != null && vxzVar.l(99, 45461656L, false) && abgeVar4.C && abobVar.a(abob.c)) || abge.q(aazjVar)) && (!(z = aazjVar.i) || (z && z2)) && !abgeVar4.o());
                abgeVar4.l();
            }
        }, "COP", 1), new abeq(i4)), avmnVarAl, avlhVar2.i(aawb.y(abvnVar.X(), 8192L)).i(new abwr(i)).al(new aawl(new abgd(this, i), "COP", 2), new abeq(i4)), ((avlh) abvnVar.r().p).i(aawb.y(abvnVar.X(), 8192L)).i(new abwr(i)).al(new abgd(this, i3), new abeq(i4)), ((avlh) abvnVar.r().n).i(aawb.y(abvnVar.X(), 8192L)).i(new abwr(i)).al(new abgd(this, 2), new abeq(i4)), abvnVar.ao().b().i(aawb.y(abvnVar.X(), 8192L)).i(new abwr(i3)).al(new abgd(this, i6), new abeq(i4)), abvnVar.R().i(aawb.y(abvnVar.X(), 8192L)).i(new abwr(i)).al(new abgd(this, i4), new abeq(i4)), abvnVar.C().W(new xee(i7)).ak(new abgd(this, 5)), avmnVarAk, avlh.I(((avlh) abvnVar.r().l).p().W(new vvb(new aawe(i7), i5)), abvnVar.F().H(new zze(this, abvnVar, i6))).r(new xee(14)).i(new abwr(i)).al(new aawi(this, 20), new abeq(i4))};
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    public final void c() {
        this.a.io();
    }

    @tcc
    public void handlePlayerGeometryEvent(aaxo aaxoVar) {
        abes abesVar = (abes) this.a;
        abesVar.g = aaxoVar.b;
        if (abesVar.i()) {
            return;
        }
        if (abesVar.o != abesVar.j()) {
            if (abesVar.j()) {
                ajdw ajdwVar = abesVar.m;
                if (ajdwVar != null) {
                    abesVar.g(false, false, ajdwVar.e);
                }
            } else {
                abesVar.c(false);
            }
        }
        abesVar.h();
    }

    @tcc
    public void handleVideoStageEvent(aazj aazjVar) {
        abob abobVar = aazjVar.a;
        boolean zH = abobVar.h();
        abes abesVar = (abes) this.a;
        abesVar.q = zH;
        int iOrdinal = abobVar.ordinal();
        if (iOrdinal == 0) {
            abesVar.f();
            abesVar.e();
            return;
        }
        if (iOrdinal == 4) {
            wjf wjfVar = aazjVar.c;
            if (wjfVar != null) {
                abesVar.d(abes.b(wjfVar), aazjVar.h);
                return;
            }
            return;
        }
        if (iOrdinal == 7) {
            abesVar.d(abes.b(aazjVar.b), aazjVar.g);
        } else {
            if (iOrdinal != 8 || abesVar.f) {
                return;
            }
            abesVar.d(abes.b(aazjVar.b), aazjVar.g);
        }
    }

    @tcc
    public void handleVideoTimeEvent(aazk aazkVar) {
        if (((abes) this.a).e.bB(2L)) {
            return;
        }
        a(aazkVar);
    }

    public /* synthetic */ aber(Object obj, byte[] bArr) {
        this.a = obj;
    }
}
