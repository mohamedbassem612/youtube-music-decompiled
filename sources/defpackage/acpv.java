package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acpv {
    public final awku a;
    public final awku b;
    public final awku c;
    public final awku d;
    public final awku e;
    public final avmm f;
    public acpu g;
    public final acmx h;
    public final aeid i;
    public final hno j;
    private final wbz k;
    private final zwh l;
    private final avmb m;
    private final aunn n;
    private final aunn o;
    private final aunn p;
    private final awmd q;
    private avmn r;
    private avlh s;

    public acpv(wbz wbzVar, zwh zwhVar, avmb avmbVar, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, acmx acmxVar, hno hnoVar, awmd awmdVar, aeid aeidVar) {
        wbzVar.getClass();
        zwhVar.getClass();
        avmbVar.getClass();
        aunnVar.getClass();
        aunnVar2.getClass();
        aunnVar3.getClass();
        acmxVar.getClass();
        hnoVar.getClass();
        aeidVar.getClass();
        this.k = wbzVar;
        this.l = zwhVar;
        this.m = avmbVar;
        this.n = aunnVar;
        this.o = aunnVar2;
        this.p = aunnVar3;
        this.h = acmxVar;
        this.j = hnoVar;
        this.q = awmdVar;
        this.i = aeidVar;
        Boolean bool = Boolean.FALSE;
        this.a = awku.aC(bool);
        this.b = awku.aC(bool);
        this.c = awku.aC(bool);
        this.d = awku.aC(Boolean.TRUE);
        this.e = awku.aC(bool);
        this.f = new avmm();
        this.g = new acpu(false, true);
        this.s = avlh.G(bool);
    }

    public final void a() {
        if (this.r != null) {
            twu.d("ReelAutoAdvanceController", 4, "Cancelled auto advance timer", null);
        }
        Object obj = this.r;
        if (obj != null) {
            awka.f((AtomicReference) obj);
        }
        this.r = null;
    }

    public final void b(long j) {
        avlh avlhVarN;
        if (this.j.l() && c()) {
            a();
            achf achfVar = new achf(9);
            acoo acooVar = new acoo(this, 2);
            twu.d("ReelAutoAdvanceController", 4, a.cf(j, "Started auto advance timer for ", "ms"), null);
            Object objIo = this.q.io();
            objIo.getClass();
            adif adifVar = (adif) objIo;
            avlh avlhVarG = this.s;
            if (j <= 0) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a.bS(j, "Timer duration must be positive, got "));
                int i = avlh.a;
                avlhVarN = new avtk(new avog(illegalArgumentException));
                avnn avnnVar = atqp.j;
            } else {
                if (avlhVarG == null) {
                    avlhVarG = avlh.G(Boolean.FALSE);
                }
                avlhVarN = avlh.n(new acql(j, avlhVarG, adifVar, 2));
            }
            this.r = avlhVarN.L(this.m).am(new acpf(new achf(14), 10), new acpf(achfVar, 11), new vtu(acooVar, 16));
        }
    }

    public final boolean c() {
        return this.g.a;
    }

    public final void d(avgj avgjVar) {
        avlb avlbVarT;
        avmm avmmVar = this.f;
        if (avmmVar.a() <= 0) {
            wby wbyVarB = this.k.e(this.l.hw());
            int i = 4;
            int i2 = 2;
            if (this.j.k()) {
                avzc avzcVar = new avzc(wbyVarB.g("/youtube/app/reel_auto_advance_toggle_entity_key"));
                avnn avnnVar = atqp.o;
                avlbVarT = avzcVar.c(new acpr(new acjn(wbyVarB, 18), i)).t(new acpq(new achf(13), 2));
            } else {
                avlbVarT = avlb.e();
            }
            avlr avlrVarX = avlbVarT.z(wbyVarB.k("/youtube/app/reel_auto_advance_toggle_entity_key")).K(new acpr(new acjn(this, 19), 0)).x(new acpf(new acjn(this, 17), 9));
            avla avlaVar = avla.e;
            avlh avlhVarG = avlrVarX.g(avlaVar);
            avlh avlhVarH = ((avlh) ((vor) this.n.io()).w.c).H(new acpr(new achf(11), i2));
            avlh avlhVarG2 = ((acvd) this.o.io()).a.H().g(avlaVar);
            int i3 = 3;
            avlh avlhVarG3 = ((avlr) ((adif) this.p.io()).a).K(new acpr(new achf(12), i3)).g(avlaVar);
            awku awkuVar = this.d;
            this.s = avlh.g(avlhVarH, awkuVar, avlhVarG3, new acnc(new acps(), 2));
            awku awkuVar2 = this.a;
            awku awkuVar3 = this.b;
            awku awkuVar4 = this.c;
            awku awkuVar5 = this.e;
            avnz avnzVar = new avnz(new acpt(), 0);
            axso[] axsoVarArr = {avlhVarG, avlhVarH, awkuVar2, avlhVarG2, awkuVar3, awkuVar4, awkuVar, avlhVarG3, awkuVar5};
            int i4 = avlh.a;
            avoj.a(i4, "bufferSize");
            avrz avrzVar = new avrz(axsoVarArr, avnzVar, i4);
            avnn avnnVar2 = atqp.j;
            avmmVar.c(avrzVar.p().x(new acpq(new acjn(this, 20), 0)).L(this.m).al(new acpf(new acjo(this, avgjVar, i3), 7), new acpf(new achf(10), 8)));
        }
    }
}
