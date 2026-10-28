package defpackage;

import j$.util.Objects;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class rjg {
    public final HashSet a;

    public rjg(qup qupVar, qup qupVar2, short[] sArr) {
        this(qupVar, qupVar2, (byte[]) null);
        quy quyVar = (quy) qupVar.b;
        quy quyVar2 = (quy) qupVar2.b;
        if (quyVar.k.equals(quyVar2.k) && quyVar.l.equals(quyVar2.l) && quyVar.m == quyVar2.m && quyVar.n == quyVar2.n && quyVar.o.equals(quyVar2.o) && quyVar.p.equals(quyVar2.p) && quyVar.q.equals(quyVar2.q)) {
            int i = quyVar.O;
            int i2 = quyVar2.O;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && quyVar.r.equals(quyVar2.r) && quyVar.s == quyVar2.s && quyVar.t == quyVar2.t && quyVar.u == quyVar2.u && quyVar.v.equals(quyVar2.v) && quyVar.w == quyVar2.w && quyVar.x.equals(quyVar2.x) && quyVar.y.equals(quyVar2.y) && quyVar.z.equals(quyVar2.z) && quyVar.A.equals(quyVar2.A) && quyVar.F == quyVar2.F && quyVar.B == quyVar2.B && quyVar.C.equals(quyVar2.C) && quyVar.D.equals(quyVar2.D) && quyVar.G == quyVar2.G && quyVar.H == quyVar2.H && quyVar.I == quyVar2.I && quyVar.J == quyVar2.J && quyVar.K == quyVar2.K && quyVar.L == quyVar2.L && quyVar.M == quyVar2.M && aguu.v(quyVar.N, quyVar2.N)) {
                return;
            }
        }
        a(rjf.n);
    }

    private static void c(rjq rjqVar) {
        if (rjqVar instanceof qvu) {
        } else if (rjqVar instanceof qup) {
        }
    }

    public final void a(rjf rjfVar) {
        this.a.add(rjfVar);
    }

    public final boolean b(rjf rjfVar) {
        return this.a.contains(rjfVar);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005f  */
    protected rjg(qup qupVar, qup qupVar2, byte[] bArr) {
        this((rjq) qupVar, (rjq) qupVar2);
        rjp rjpVar = (rjp) qupVar.b;
        rjp rjpVar2 = (rjp) qupVar2.b;
        if (rjpVar.i() != rjpVar2.i()) {
            a(rjf.h);
        }
        if (rjpVar.m().equals(rjpVar2.m()) && rjpVar.d() == rjpVar2.d() && rjpVar.j().equals(rjpVar2.j()) && rjpVar.l().equals(rjpVar2.l())) {
            int iO = rjpVar.o();
            int iO2 = rjpVar2.o();
            if (iO == 0) {
                throw null;
            }
            if (iO != iO2) {
                a(rjf.i);
            }
        } else {
            a(rjf.i);
        }
        if (!rjpVar.l().equals(rjpVar2.l())) {
            a(rjf.j);
        }
        if (rjpVar.f() != rjpVar2.f()) {
            a(rjf.k);
        }
        if (rjpVar.h() != rjpVar2.h()) {
            a(rjf.l);
        }
        if (Objects.equals(null, null)) {
            return;
        }
        a(rjf.i);
        a(rjf.k);
    }

    public rjg(qup qupVar, qup qupVar2, char[] cArr) {
        this(qupVar, qupVar2, (byte[]) null);
        quv quvVar = (quv) qupVar.b;
        quv quvVar2 = (quv) qupVar2.b;
        if (quvVar.k.getClass() != quvVar2.k.getClass()) {
            a(rjf.m);
            return;
        }
        qwr qwrVar = quvVar.k;
        if (qwrVar instanceof qwt) {
            qwr qwrVar2 = quvVar2.k;
            if (!(qwrVar2 instanceof qwt) || ((qwt) qwrVar).a.equals(((qwt) qwrVar2).a)) {
                return;
            }
            a(rjf.m);
        }
    }

    public rjg(rck rckVar, rck rckVar2) {
        this((rjq) rckVar, (rjq) rckVar2);
        agyz.d(rckVar.j(), rckVar2.j()).a(new itl(3)).forEach(new rcp(this, 17));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0073  */
    public rjg(rjq rjqVar, rjq rjqVar2) {
        this.a = new HashSet();
        if (rjqVar.it() != rjqVar2.it()) {
            a(rjf.a);
        }
        if (!rjqVar.ir().equals(rjqVar2.ir()) || !rjqVar.iu().equals(rjqVar2.iu())) {
            a(rjf.b);
        }
        if (rjqVar.is().size() == rjqVar2.is().size()) {
            agyz agyzVarD = agyz.d(rjqVar.is(), rjqVar2.is());
            rjm rjmVar = rjm.a;
            rjmVar.getClass();
            if (agyzVarD.a(new ito(rjmVar, 3)).anyMatch(new rej(5))) {
                a(rjf.t);
            }
        } else {
            a(rjf.t);
        }
        if (rjqVar.is().isEmpty() != rjqVar2.is().isEmpty()) {
            a(rjf.u);
        }
        c(rjqVar);
        c(rjqVar2);
        if (Objects.equals(null, null)) {
            return;
        }
        a(rjf.C);
    }

    public rjg(qup qupVar, qup qupVar2, float[] fArr) {
        this(qupVar, qupVar2, (byte[]) null);
        agyz agyzVarD = agyz.d(((rco) qupVar).f, ((rco) qupVar2).f);
        gpd gpdVar = new gpd(this, 6);
        agyx agyxVar = new agyx((agyy) agyzVarD);
        while (agyxVar.a()) {
            gpdVar.accept(agyxVar.a.a, agyxVar.b.a);
        }
    }

    public rjg(qup qupVar, qup qupVar2, int[] iArr) {
        this(qupVar, qupVar2, (byte[]) null);
        qux quxVar = (qux) qupVar.b;
        qux quxVar2 = (qux) qupVar2.b;
        if (!quxVar.p().equals(quxVar2.p())) {
            a(rjf.o);
        }
        if (Objects.equals(quxVar.l, quxVar2.l) && Objects.equals(quxVar.m, quxVar2.m)) {
            return;
        }
        a(rjf.p);
    }

    public rjg(qup qupVar, qup qupVar2) {
        this((rjq) qupVar, (rjq) qupVar2);
        qur qurVar = (qur) qupVar.b;
        qur qurVar2 = (qur) qupVar2.b;
        if (!qurVar.b.equals(qurVar2.b)) {
            a(rjf.c);
        }
        if (!qurVar.c.equals(qurVar2.c) || !qupVar.d.equals(qupVar2.d)) {
            a(rjf.d);
        }
        if (qurVar.e != qurVar2.e) {
            a(rjf.e);
        }
        if (((quq) qurVar).a != ((quq) qurVar2).a || !Objects.equals(null, null)) {
            a(rjf.f);
        }
        if (qurVar.d != qurVar2.d) {
            a(rjf.g);
        }
    }

    public rjg(rct rctVar, rct rctVar2) {
        this((rjq) rctVar, (rjq) rctVar2);
        agyz.d(rctVar.e, rctVar2.e).a(new itl(5)).forEach(new rme(this, 1));
    }

    public rjg(qup qupVar, qup qupVar2, boolean[] zArr) {
        this(qupVar, qupVar2, (byte[]) null);
        quz quzVar = (quz) qupVar.b;
        quz quzVar2 = (quz) qupVar2.b;
        if (!quzVar.k.equals(quzVar2.k)) {
            a(rjf.q);
        }
        if (!quzVar.l.equals(quzVar2.l) || !qupVar.d.equals(qupVar2.d)) {
            a(rjf.r);
        }
        if (quzVar.n != quzVar2.n) {
            a(rjf.s);
        }
    }
}
