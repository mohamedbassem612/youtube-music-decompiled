package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abgo {
    public final /* synthetic */ Object a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [axso, java.lang.Object] */
    public abgo(ahsm ahsmVar, xhz xhzVar) {
        this.a = ahsmVar;
        avlh avlhVarP = ((avlh) ahsmVar.c).ac(ahsmVar.b, new mkw(xhzVar, 5)).p();
        if (ahsmVar.a) {
            return;
        }
        avlhVarP.ax().c();
    }

    public final avmn[] a(abvn abvnVar) {
        return new avmn[]{((avlh) abvnVar.r().b).al(new abgd(this, 9), new abeq(5)), ((avlh) abvnVar.r().p).ak(new abgd(this, 10))};
    }

    public final avlr b(String str) {
        return ((avlr) ((ahud) this.a).b).B(new acpq(str, 6)).K(new adhc(4));
    }

    @tcc
    public void onFormatStreamChange(yvu yvuVar) {
        if (yno.cw(yvuVar.j)) {
            abgp abgpVar = (abgp) this.a;
            abgpVar.m = yvuVar.c;
            abgpVar.n = yvuVar.f;
            abgpVar.s = yvuVar.o;
            if (abgpVar.w) {
                abgm abgmVar = abgpVar.a;
                abgmVar.q(abgpVar.m);
                abgmVar.c(abgpVar.n);
                abgmVar.h(abgpVar.s);
            }
        }
    }

    @tcc
    public void onVideoStage(aazj aazjVar) {
        agev agevVarI;
        afvn afvnVarB = aawb.b(aazjVar, "NSOP");
        try {
            abob abobVar = aazjVar.a;
            int iOrdinal = abobVar.ordinal();
            if (iOrdinal == 4 || iOrdinal == 7) {
                wjf wjfVar = aazjVar.c;
                if (wjfVar != null) {
                    Object obj = this.a;
                    ((abgp) obj).h = wjfVar.G();
                    ((abgp) obj).i = aazjVar.h;
                    ((abgp) obj).j = abgp.o(((abgp) obj).i);
                } else {
                    wjf wjfVar2 = aazjVar.b;
                    Object obj2 = this.a;
                    if (wjfVar2 != null) {
                        ((abgp) obj2).h = wjfVar2.G();
                        ((abgp) obj2).i = aazjVar.g;
                        ((abgp) obj2).j = abgp.o(((abgp) obj2).i);
                    } else {
                        ((abgp) obj2).h = null;
                    }
                }
                if (!abobVar.h()) {
                    wjfVar = aazjVar.b;
                }
                wja wjaVarG = wjfVar == null ? null : wjfVar.g();
                Object obj3 = this.a;
                ((abgp) obj3).o = wjaVarG != null ? wjaVarG.g() : null;
                abvn abvnVar = ((abgp) obj3).g;
                if (abvnVar.g().aW()) {
                    boolean z = aazjVar.i;
                    if (wjaVarG == null) {
                        agevVarI = agdf.a;
                    } else {
                        amwn amwnVar = wjaVarG.l;
                        boolean z2 = false;
                        if (abvnVar.g().g.l(448, 45806133L, false)) {
                            boolean zY = wjfVar.Y();
                            if (z) {
                                z2 = true;
                            } else if (!zY) {
                                agevVarI = agdf.a;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (wjaVarG.K()) {
                                arrayList.add("Windowed");
                            }
                            arrayList.add(abgp.j(amwnVar));
                            if (z2) {
                                arrayList.add("Live");
                            } else {
                                arrayList.add("Post-Live");
                            }
                            if (wjfVar.P()) {
                                arrayList.add("DAI");
                            }
                            agevVarI = arrayList.isEmpty() ? agdf.a : agev.i(new ager(" ").b(arrayList));
                        } else {
                            agevVarI = !z ? agdf.a : agev.h(abgp.j(amwnVar));
                        }
                    }
                    ((abgp) obj3).p = agevVarI;
                }
                Object objIo = ((abgp) obj3).f.io();
                ((abgp) obj3).k = ((yve) objIo).b;
                ((abgp) obj3).l = ((yve) objIo).a;
                if (((abgp) obj3).w) {
                    ((abgp) obj3).m();
                }
            }
            afvnVarB.close();
        } catch (Throwable th) {
            try {
                afvnVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public /* synthetic */ abgo(ahud ahudVar) {
        this.a = ahudVar;
    }

    public abgo(abgp abgpVar) {
        this.a = abgpVar;
    }
}
