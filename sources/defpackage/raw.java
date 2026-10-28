package defpackage;

import android.graphics.PointF;
import app.rive.semantics.SemanticState;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class raw extends rae {
    final /* synthetic */ rax a;
    private final agdy b = new rah();
    private final agdy c = new rai();
    private final agdy d = new rag();
    private final agdy e = new raj();
    private final agdy f = new ral();
    private final agdy g = new rak();
    private final agdy h = new rap();
    private final agdy i = new rao();
    private final agdy j = new ran();
    private final agdy k = new raf();
    private final agdy l = new ram();
    private final agdy m = new rav(this);

    public raw(rax raxVar) {
        this.a = raxVar;
    }

    @Override // defpackage.rae
    public final void a(quy quyVar, aihf aihfVar) {
        float fD = Math.signum(quyVar.I) == 1.0f ? nqx.d(quyVar.I, this.a.a.b()) : this.a.a.a() * 0.0f;
        float fD2 = Math.signum(quyVar.G) == 1.0f ? nqx.d(quyVar.G, this.a.a.b()) : this.a.a.a() * 0.0f;
        float fD3 = Math.signum(quyVar.H) == 1.0f ? nqx.d(quyVar.H, this.a.a.b()) : this.a.a.a() * 0.0f;
        aihf aihfVarCreateBuilder = atrq.a.createBuilder();
        int i = quyVar.c;
        aihfVarCreateBuilder.copyOnWrite();
        atrq atrqVar = (atrq) aihfVarCreateBuilder.instance;
        atrqVar.b |= 8;
        atrqVar.f = i;
        aihfVarCreateBuilder.copyOnWrite();
        atrq atrqVar2 = (atrq) aihfVarCreateBuilder.instance;
        atrqVar2.b |= 4;
        atrqVar2.e = fD;
        aihfVarCreateBuilder.copyOnWrite();
        atrq atrqVar3 = (atrq) aihfVarCreateBuilder.instance;
        atrqVar3.b |= 1;
        atrqVar3.c = fD2;
        aihfVarCreateBuilder.copyOnWrite();
        atrq atrqVar4 = (atrq) aihfVarCreateBuilder.instance;
        atrqVar4.b |= 2;
        atrqVar4.d = fD3;
        atrp atrpVar = (atrp) this.k.b(quyVar.L);
        aihfVarCreateBuilder.copyOnWrite();
        atrq atrqVar5 = (atrq) aihfVarCreateBuilder.instance;
        atrqVar5.g = atrpVar.d;
        atrqVar5.b |= 64;
        atrq atrqVar6 = (atrq) aihfVarCreateBuilder.build();
        aihfVar.copyOnWrite();
        atrx atrxVar = (atrx) aihfVar.instance;
        atrx atrxVar2 = atrx.a;
        atrqVar6.getClass();
        atrxVar.r = atrqVar6;
        atrxVar.b |= 32768;
    }

    @Override // defpackage.rae
    public final void b(quy quyVar, aihf aihfVar) {
        int i = quyVar.n;
        aihfVar.copyOnWrite();
        atrx atrxVar = (atrx) aihfVar.instance;
        atrx atrxVar2 = atrx.a;
        atrxVar.b |= 8;
        atrxVar.f = i;
    }

    @Override // defpackage.rae
    public final void c(quy quyVar, aihf aihfVar) {
        atrr atrrVar = (atrr) this.l.b(quyVar.M);
        aihfVar.copyOnWrite();
        atrx atrxVar = (atrx) aihfVar.instance;
        atrx atrxVar2 = atrx.a;
        atrxVar.v = atrrVar.e;
        atrxVar.b |= 524288;
    }

    @Override // defpackage.rae
    public final void d(quy quyVar, aihf aihfVar) {
        boolean z = quyVar.J;
        aihfVar.copyOnWrite();
        atrx atrxVar = (atrx) aihfVar.instance;
        atrx atrxVar2 = atrx.a;
        atrxVar.b |= 16;
        atrxVar.g = z;
    }

    @Override // defpackage.rae
    public final void e(quy quyVar, aihf aihfVar) {
        float fD = nqx.d(quyVar.m, this.a.a.b());
        aihfVar.copyOnWrite();
        atrx atrxVar = (atrx) aihfVar.instance;
        atrx atrxVar2 = atrx.a;
        atrxVar.b |= 2;
        atrxVar.d = fD;
    }

    @Override // defpackage.rae
    public final void f(quy quyVar, aihf aihfVar) {
        atqy atqyVar = (atqy) this.d.b(quyVar.q);
        aihfVar.copyOnWrite();
        atrx atrxVar = (atrx) aihfVar.instance;
        atrx atrxVar2 = atrx.a;
        atrxVar.k = atqyVar.d;
        atrxVar.b |= SemanticState.Hidden;
    }

    @Override // defpackage.rae
    public final void g(quy quyVar, aihf aihfVar) {
        atqz atqzVar = (atqz) this.b.b(quyVar.o);
        aihfVar.copyOnWrite();
        atrx atrxVar = (atrx) aihfVar.instance;
        atrx atrxVar2 = atrx.a;
        atrxVar.i = atqzVar.k;
        atrxVar.b |= 64;
    }

    @Override // defpackage.rae
    public final void h(quy quyVar, aihf aihfVar) {
        atra atraVar = (atra) this.c.b(quyVar.p);
        aihfVar.copyOnWrite();
        atrx atrxVar = (atrx) aihfVar.instance;
        atrx atrxVar2 = atrx.a;
        atrxVar.j = atraVar.k;
        atrxVar.b |= SemanticState.Focused;
    }

    @Override // defpackage.rae
    public final void i(quy quyVar, aihf aihfVar) {
        float f = quyVar.K;
        raq raqVar = this.a.a;
        float fD = nqx.d(f, raqVar.b());
        float fMax = Math.max(raqVar.b().getWidth() - (fD + fD), 0.0f);
        aihfVar.copyOnWrite();
        atrx atrxVar = (atrx) aihfVar.instance;
        atrx atrxVar2 = atrx.a;
        atrxVar.b |= 32;
        atrxVar.h = fMax;
    }

    @Override // defpackage.rae
    public final void j(quy quyVar, aihf aihfVar) {
        atrh atrhVar = (atrh) this.e.b(quyVar.r);
        aihfVar.copyOnWrite();
        atrx atrxVar = (atrx) aihfVar.instance;
        atrx atrxVar2 = atrx.a;
        atrxVar.l = atrhVar.e;
        atrxVar.b |= SemanticState.LiveRegion;
    }

    @Override // defpackage.rae
    public final void k(quy quyVar, aihf aihfVar) {
        atrj atrjVar = (atrj) this.f.b(quyVar.x);
        aihfVar.copyOnWrite();
        atrx atrxVar = (atrx) aihfVar.instance;
        atrx atrxVar2 = atrx.a;
        atrxVar.o = atrjVar.e;
        atrxVar.b |= SemanticState.Obscured;
    }

    @Override // defpackage.rae
    public final void l(quy quyVar, aihf aihfVar) {
        agke agkeVar = quyVar.N;
        int size = agkeVar.size();
        for (int i = 0; i < size; i++) {
            qwc qwcVar = (qwc) agkeVar.get(i);
            aihf aihfVarCreateBuilder = atrv.a.createBuilder();
            String strE = qwcVar.e();
            aihfVarCreateBuilder.copyOnWrite();
            atrv atrvVar = (atrv) aihfVarCreateBuilder.instance;
            strE.getClass();
            atrvVar.b |= 1;
            atrvVar.c = strE;
            Optional optionalD = qwcVar.d();
            hqc hqcVar = new hqc(this, aihfVarCreateBuilder, 15);
            if (true == optionalD.isPresent()) {
                Object obj = optionalD.get();
                Object obj2 = hqcVar.a;
                Object obj3 = hqcVar.b;
                aihf aihfVarU = ((raw) obj2).u((qwf) obj);
                aihf aihfVar2 = (aihf) obj3;
                aihfVar2.copyOnWrite();
                atrv atrvVar2 = (atrv) aihfVar2.instance;
                atrw atrwVar = (atrw) aihfVarU.build();
                atrwVar.getClass();
                atrvVar2.d = atrwVar;
                atrvVar2.b |= 2;
            }
            long jA = ahbt.a(qwcVar.b());
            aihfVarCreateBuilder.copyOnWrite();
            atrv atrvVar3 = (atrv) aihfVarCreateBuilder.instance;
            atrvVar3.b |= 4;
            atrvVar3.e = jA;
            long jA2 = ahbt.a(qwcVar.a());
            aihfVarCreateBuilder.copyOnWrite();
            atrv atrvVar4 = (atrv) aihfVarCreateBuilder.instance;
            atrvVar4.b |= 8;
            atrvVar4.f = jA2;
            Optional optionalC = qwcVar.c();
            hqc hqcVar2 = new hqc(this, aihfVarCreateBuilder, 16);
            if (true == optionalC.isPresent()) {
                Object obj4 = optionalC.get();
                Object obj5 = hqcVar2.a;
                Object obj6 = hqcVar2.b;
                aihf aihfVarU2 = ((raw) obj5).u((qwf) obj4);
                aihf aihfVar3 = (aihf) obj6;
                aihfVar3.copyOnWrite();
                atrv atrvVar5 = (atrv) aihfVar3.instance;
                atrw atrwVar2 = (atrw) aihfVarU2.build();
                atrwVar2.getClass();
                atrvVar5.g = atrwVar2;
                atrvVar5.b |= 16;
            }
            aihfVar.copyOnWrite();
            atrx atrxVar = (atrx) aihfVar.instance;
            atrv atrvVar6 = (atrv) aihfVarCreateBuilder.build();
            atrx atrxVar2 = atrx.a;
            atrvVar6.getClass();
            aiie aiieVar = atrxVar.u;
            if (!aiieVar.c()) {
                atrxVar.u = aihn.mutableCopy(aiieVar);
            }
            atrxVar.u.add(atrvVar6);
        }
    }

    @Override // defpackage.rae
    public final void m(quy quyVar, aihf aihfVar) {
        int i = quyVar.s;
        aihfVar.copyOnWrite();
        atrx atrxVar = (atrx) aihfVar.instance;
        atrx atrxVar2 = atrx.a;
        atrxVar.b |= SemanticState.ReadOnly;
        atrxVar.m = i;
    }

    @Override // defpackage.rae
    public final void n(quy quyVar, aihf aihfVar) {
        qwe qweVar = quyVar.v;
        if (qweVar == null) {
            qweVar = qwe.b;
        }
        atri atriVar = (atri) this.g.b(qweVar);
        aihfVar.copyOnWrite();
        atrx atrxVar = (atrx) aihfVar.instance;
        atrx atrxVar2 = atrx.a;
        atrxVar.s = atriVar.e;
        atrxVar.b |= 65536;
    }

    @Override // defpackage.rae
    public final void o(quy quyVar, aihf aihfVar) {
        float f = quyVar.w;
        aihfVar.copyOnWrite();
        atrx atrxVar = (atrx) aihfVar.instance;
        atrx atrxVar2 = atrx.a;
        atrxVar.b |= 131072;
        atrxVar.t = f;
    }

    @Override // defpackage.rae
    public final void p(quy quyVar, aihf aihfVar) {
        float fA;
        if (Math.signum(quyVar.u) == 1.0f) {
            fA = nqx.d(quyVar.u, this.a.a.b());
        } else {
            fA = this.a.a.a() * quyVar.t;
        }
        aihfVar.copyOnWrite();
        atrx atrxVar = (atrx) aihfVar.instance;
        atrx atrxVar2 = atrx.a;
        atrxVar.b |= SemanticState.Modal;
        atrxVar.n = fA;
    }

    @Override // defpackage.rae
    public final void q(quy quyVar, aihf aihfVar) {
        String str = quyVar.k;
        aihfVar.copyOnWrite();
        atrx atrxVar = (atrx) aihfVar.instance;
        atrx atrxVar2 = atrx.a;
        str.getClass();
        atrxVar.b |= 1;
        atrxVar.c = str;
    }

    @Override // defpackage.rae
    public final void r(quy quyVar, aihf aihfVar) {
        aihf aihfVarCreateBuilder = atry.a.createBuilder();
        atru atruVar = (atru) this.h.b(quyVar.y);
        aihfVarCreateBuilder.copyOnWrite();
        atry atryVar = (atry) aihfVarCreateBuilder.instance;
        atryVar.c = atruVar.f;
        atryVar.b |= 1;
        atrt atrtVar = (atrt) this.i.b(quyVar.z);
        aihfVarCreateBuilder.copyOnWrite();
        atry atryVar2 = (atry) aihfVarCreateBuilder.instance;
        atryVar2.d = atrtVar.g;
        atryVar2.b |= 2;
        atrs atrsVar = (atrs) this.j.b(quyVar.A);
        aihfVarCreateBuilder.copyOnWrite();
        atry atryVar3 = (atry) aihfVarCreateBuilder.instance;
        atryVar3.e = atrsVar.d;
        atryVar3.b |= 4;
        float f = quyVar.F;
        aihfVarCreateBuilder.copyOnWrite();
        atry atryVar4 = (atry) aihfVarCreateBuilder.instance;
        atryVar4.b |= 8;
        atryVar4.f = f;
        aihfVar.copyOnWrite();
        atrx atrxVar = (atrx) aihfVar.instance;
        atry atryVar5 = (atry) aihfVarCreateBuilder.build();
        atrx atrxVar2 = atrx.a;
        atryVar5.getClass();
        atrxVar.p = atryVar5;
        atrxVar.b |= SemanticState.Multiline;
    }

    @Override // defpackage.rae
    public final void s(quy quyVar, aihf aihfVar) {
        float f = quyVar.C.x;
        raq raqVar = this.a.a;
        float fA = f * raqVar.a();
        float fA2 = quyVar.C.y * raqVar.a();
        PointF pointF = quyVar.D;
        if (Math.signum(pointF.x) != 0.0f || Math.signum(pointF.y) != 0.0f) {
            fA = nqx.d(pointF.x, raqVar.b());
            fA2 = nqx.d(pointF.y, raqVar.b());
        }
        double d = quyVar.E;
        float fA3 = (float) (((double) raqVar.a()) * 0.0d);
        aihf aihfVarCreateBuilder = atrz.a.createBuilder();
        int i = quyVar.B;
        aihfVarCreateBuilder.copyOnWrite();
        atrz atrzVar = (atrz) aihfVarCreateBuilder.instance;
        atrzVar.b |= 1;
        atrzVar.c = i;
        aihf aihfVarCreateBuilder2 = aims.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        aims aimsVar = (aims) aihfVarCreateBuilder2.instance;
        aimsVar.b |= 1;
        aimsVar.c = fA;
        aihfVarCreateBuilder2.copyOnWrite();
        aims aimsVar2 = (aims) aihfVarCreateBuilder2.instance;
        aimsVar2.b |= 2;
        aimsVar2.d = fA2;
        aihfVarCreateBuilder.copyOnWrite();
        atrz atrzVar2 = (atrz) aihfVarCreateBuilder.instance;
        aims aimsVar3 = (aims) aihfVarCreateBuilder2.build();
        aimsVar3.getClass();
        atrzVar2.d = aimsVar3;
        atrzVar2.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        atrz atrzVar3 = (atrz) aihfVarCreateBuilder.instance;
        atrzVar3.b |= 4;
        atrzVar3.e = fA3;
        aihfVar.copyOnWrite();
        atrx atrxVar = (atrx) aihfVar.instance;
        atrz atrzVar4 = (atrz) aihfVarCreateBuilder.build();
        atrx atrxVar2 = atrx.a;
        atrzVar4.getClass();
        atrxVar.q = atrzVar4;
        atrxVar.b |= 16384;
    }

    @Override // defpackage.rae
    public final void t(quy quyVar, aihf aihfVar) {
        String str = quyVar.l;
        aihfVar.copyOnWrite();
        atrx atrxVar = (atrx) aihfVar.instance;
        atrx atrxVar2 = atrx.a;
        str.getClass();
        atrxVar.b |= 4;
        atrxVar.e = str;
    }

    public final aihf u(qwf qwfVar) {
        aihf aihfVarCreateBuilder = atrw.a.createBuilder();
        int iE = qwfVar.e();
        aihfVarCreateBuilder.copyOnWrite();
        atrw atrwVar = (atrw) aihfVarCreateBuilder.instance;
        atrwVar.b |= 1;
        atrwVar.c = iE;
        if (!qwfVar.k().isEmpty()) {
            String strK = qwfVar.k();
            aihfVarCreateBuilder.copyOnWrite();
            atrw atrwVar2 = (atrw) aihfVarCreateBuilder.instance;
            strK.getClass();
            atrwVar2.b |= 2;
            atrwVar2.d = strK;
        }
        if (qwfVar.b() > 0.0f) {
            float fD = nqx.d(qwfVar.b(), this.a.a.b());
            aihfVarCreateBuilder.copyOnWrite();
            atrw atrwVar3 = (atrw) aihfVarCreateBuilder.instance;
            atrwVar3.b |= 4;
            atrwVar3.e = fD;
        }
        atqz atqzVar = (atqz) this.b.b(qwfVar.h());
        aihfVarCreateBuilder.copyOnWrite();
        atrw atrwVar4 = (atrw) aihfVarCreateBuilder.instance;
        atrwVar4.f = atqzVar.k;
        atrwVar4.b |= 8;
        atqy atqyVar = (atqy) this.d.b(qwfVar.g());
        aihfVarCreateBuilder.copyOnWrite();
        atrw atrwVar5 = (atrw) aihfVarCreateBuilder.instance;
        atrwVar5.g = atqyVar.d;
        atrwVar5.b |= 16;
        atru atruVar = (atru) this.h.b(qwfVar.j());
        aihfVarCreateBuilder.copyOnWrite();
        atrw atrwVar6 = (atrw) aihfVarCreateBuilder.instance;
        atrwVar6.h = atruVar.f;
        atrwVar6.b |= 32;
        if (qwfVar.d() != 0) {
            aihf aihfVarCreateBuilder2 = atrq.a.createBuilder();
            int iD = qwfVar.d();
            aihfVarCreateBuilder2.copyOnWrite();
            atrq atrqVar = (atrq) aihfVarCreateBuilder2.instance;
            atrqVar.b |= 8;
            atrqVar.f = iD;
            float fD2 = nqx.d(qwfVar.a(), this.a.a.b());
            aihfVarCreateBuilder2.copyOnWrite();
            atrq atrqVar2 = (atrq) aihfVarCreateBuilder2.instance;
            atrqVar2.b |= 4;
            atrqVar2.e = fD2;
            aihfVarCreateBuilder.copyOnWrite();
            atrw atrwVar7 = (atrw) aihfVarCreateBuilder.instance;
            atrq atrqVar3 = (atrq) aihfVarCreateBuilder2.build();
            atrqVar3.getClass();
            atrwVar7.i = atrqVar3;
            atrwVar7.b |= 64;
        }
        if (qwfVar.f() != 0 && qwfVar.c() > 0.0f) {
            int iF = qwfVar.f();
            aihfVarCreateBuilder.copyOnWrite();
            atrw atrwVar8 = (atrw) aihfVarCreateBuilder.instance;
            atrwVar8.b |= SemanticState.Focused;
            atrwVar8.j = iF;
            float fD3 = nqx.d(qwfVar.c(), this.a.a.b());
            aihfVarCreateBuilder.copyOnWrite();
            atrw atrwVar9 = (atrw) aihfVarCreateBuilder.instance;
            atrwVar9.b |= SemanticState.Hidden;
            atrwVar9.k = fD3;
        }
        if (qwfVar.i().d() != 0) {
            atrz atrzVar = (atrz) this.m.b(qwfVar.i());
            aihfVarCreateBuilder.copyOnWrite();
            atrw atrwVar10 = (atrw) aihfVarCreateBuilder.instance;
            atrzVar.getClass();
            atrwVar10.l = atrzVar;
            atrwVar10.b |= SemanticState.LiveRegion;
        }
        return aihfVarCreateBuilder;
    }
}
