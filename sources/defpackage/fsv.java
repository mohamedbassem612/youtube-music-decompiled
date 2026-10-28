package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fsv extends nh {
    public final /* synthetic */ fsy a;

    public fsv(fsy fsyVar) {
        this.a = fsyVar;
        t(((fsy) fsyVar.U.a).k);
    }

    @Override // defpackage.nh
    public final int a() {
        return this.a.b.size();
    }

    @Override // defpackage.nh
    public final int b(int i) {
        fsy fsyVar = this.a;
        ftg ftgVarD = ((fqh) fsyVar.b.get(i)).d();
        if (ftgVarD.l()) {
            return fsyVar.Q.c;
        }
        fsk fskVar = fsyVar.d;
        return fskVar != null ? ((aebn) fskVar).b.b(i) : ftgVarD.b();
    }

    @Override // defpackage.nh
    public final long c(int i) {
        return ((fqh) ((fsy) this.a.U.a).b.get(i)).b;
    }

    @Override // defpackage.nh
    public final oh e(ViewGroup viewGroup, int i) {
        fsr fsrVar;
        hhb hhbVar = this.a.U;
        fsy fsyVar = (fsy) hhbVar.a;
        fth fthVar = fsyVar.Q;
        fpu fpuVarA = fthVar.a(i);
        if (i == fthVar.c) {
            return new fsr(new fjw(fsyVar.g), true);
        }
        fsk fskVar = fsyVar.d;
        if (fskVar != null) {
            return ((aebn) fskVar).b.e(viewGroup, i);
        }
        if (fpuVarA != null) {
            Context context = fsyVar.g.a;
            try {
                fsrVar = new fsr(fpuVarA.a(), false);
            } catch (IllegalArgumentException e) {
                Class<?> cls = fpuVarA.getClass();
                Class<?> enclosingClass = cls.getEnclosingClass();
                throw new IllegalArgumentException("createView() may not return null from :".concat(String.valueOf(enclosingClass == null ? cls.getCanonicalName() : enclosingClass.getCanonicalName())), e);
            }
        } else {
            fsy fsyVar2 = (fsy) hhbVar.a;
            fpu fpuVarA2 = fsyVar2.Q.a(i);
            Context context2 = fsyVar2.g.a;
            fsrVar = new fsr(fpuVarA2.a(), false);
        }
        return fsrVar;
    }

    @Override // defpackage.nh
    public final void o(oh ohVar, int i) throws Throwable {
        AutoCloseable plgVar;
        int i2 = fjs.a;
        fsy fsyVar = this.a;
        fqh fqhVar = (fqh) fsyVar.b.get(i);
        ftg ftgVarD = fqhVar.d();
        if (ftgVarD.l()) {
            fjw fjwVar = (fjw) ohVar.a;
            fjwVar.L(fsyVar.o);
            int iQ = fsyVar.q(fqhVar);
            int iP = fsyVar.p(fqhVar);
            if (!fqhVar.s(iQ, iP)) {
                boolean z = fna.a;
                fqhVar.i(fsyVar.g, iQ, iP, new fkw());
            }
            boolean z2 = fsyVar.e.i() == 1;
            if (fsyVar.q && fsyVar.y && fqhVar.t()) {
                fqhVar.g();
                if (fqhVar.a() > fsyVar.r()) {
                    synchronized (this) {
                        fsy fsyVar2 = this.a;
                        fsyVar2.O(fsyVar2.B.a);
                        fsyVar2.N();
                    }
                }
            }
            int size = -1;
            int size2 = View.MeasureSpec.getMode(iQ) == 1073741824 ? View.MeasureSpec.getSize(iQ) : z2 ? -1 : -2;
            if (View.MeasureSpec.getMode(iP) == 1073741824) {
                size = View.MeasureSpec.getSize(iP);
            } else if (z2) {
                size = -2;
            }
            if (ohVar instanceof fsr) {
                ftgVarD.j();
                fjwVar.setLayoutParams(new fsw(size2, size, iQ, iP));
            }
            fjwVar.K(fqhVar.b(), true);
            fsy fsyVar3 = this.a;
            if (fsyVar3.e.j().isItemPrefetchEnabled()) {
                fqhVar.b().r(new Rect(0, 0, View.MeasureSpec.getSize(iQ), View.MeasureSpec.getSize(iP)), false);
            }
            fjwVar.post(new fsu(fjwVar, 0));
            fqhVar.d().o();
            abgn abgnVar = fsyVar3.S;
            if (abgnVar != null) {
                aebp aebpVar = (aebp) abgnVar.a;
                for (admb admbVar : aebpVar.c.a) {
                    if (admbVar instanceof admn) {
                        ((admn) admbVar).b();
                    }
                }
                View view = ohVar.a;
                if (aebpVar.a.k && (view instanceof fjw)) {
                    fjw fjwVar2 = (fjw) view;
                    fqh fqhVarU = aebpVar.b.u(i);
                    if (fqhVarU != null) {
                        aebpVar.h.put(fjwVar2, fqhVarU);
                    }
                }
            }
        } else {
            fsk fskVar = this.a.d;
            if (fskVar != null) {
                admf admfVar = (admf) ohVar;
                ahud ahudVar = (ahud) ((aebn) fskVar).c.io();
                if (afty.o()) {
                    plgVar = new plg(3);
                } else {
                    afty.l();
                    plgVar = afty.o() ? new plg(4) : new aftb(((afvq) ahudVar.b).a(167, "LithoRecyclerViewSectionListControllerBinder#onBindViewHolder"), 3);
                }
                try {
                    ((aebn) fskVar).b.o(admfVar, i);
                    plgVar.close();
                } catch (Throwable th) {
                    try {
                        plgVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        fqhVar.b();
        if (ohVar instanceof fsr) {
            fsr fsrVar = (fsr) ohVar;
            int i3 = fsr.u;
            if (!fsrVar.s) {
                fpt fptVarD = ftgVarD.d();
                fsrVar.t = fptVarD;
                View view2 = fsrVar.a;
                fptVarD.a();
            }
        }
        boolean z3 = fna.a;
    }

    @Override // defpackage.nh
    public final void q(oh ohVar) {
        if ((ohVar instanceof fsr) || ((fsy) this.a.U.a).d == null) {
            return;
        }
        int i = fsi.a;
    }

    @Override // defpackage.nh
    public final void r(oh ohVar) {
        if ((ohVar instanceof fsr) || ((fsy) this.a.U.a).d == null) {
            return;
        }
        int i = fsi.a;
    }

    @Override // defpackage.nh
    public final void s(oh ohVar) {
        fsy fsyVar = this.a;
        if (ohVar instanceof fsr) {
            fsr fsrVar = (fsr) ohVar;
            int i = fsr.u;
            if (!fsrVar.s) {
                fpt fptVar = fsrVar.t;
            } else if (fsrVar.C() != null) {
                fjw fjwVarC = fsrVar.C();
                fjwVarC.K(null, true);
                fjwVarC.L(null);
            }
        } else {
            ((aebn) ((fsy) fsyVar.U.a).d).b.s((admf) ohVar);
        }
        abgn abgnVar = fsyVar.S;
        if (abgnVar != null) {
            View view = ohVar.a;
            aebp aebpVar = (aebp) abgnVar.a;
            if (aebpVar.a.k && (view instanceof fjw)) {
                fjw fjwVar = (fjw) view;
                fqh fqhVar = (fqh) aebpVar.h.remove(fjwVar);
                avg.e(view.getContext()).execute(afwl.i(new aasv(abgnVar, fjwVar, fjwVar.w, fqhVar, 12)));
            }
        }
    }
}
