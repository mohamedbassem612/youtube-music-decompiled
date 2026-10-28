package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aadx implements aarp {
    public final /* synthetic */ aady a;

    public aadx(aady aadyVar) {
        this.a = aadyVar;
    }

    private final void m(String str) {
        aady aadyVar = this.a;
        aaqx aaqxVar = (aaqx) aadyVar.j.io();
        if (aaqxVar.c().contains(str)) {
            aadyVar.o(aaqxVar.b().a());
        }
    }

    @Override // defpackage.aarp
    public final void a(aamw aamwVar) {
        if (!aarq.l(aamwVar) || aamwVar.i) {
            return;
        }
        aamb aambVar = aamwVar.f;
        aady aadyVar = this.a;
        String strE = aarq.e(aambVar);
        aaew aaewVar = (aaew) aadyVar.h.io();
        aaewVar.X(strE, aamwVar);
        aaewVar.S(strE, aamg.ACTIVE);
        if (aaewVar.ag(strE) == 0) {
            aaewVar.V(strE, aadyVar.b.f().toEpochMilli());
        }
        aadyVar.m(strE);
        m(strE);
    }

    @Override // defpackage.aarp
    public final void d(aamw aamwVar) {
        if (!aarq.l(aamwVar) || aamwVar.i) {
            return;
        }
        aamb aambVar = aamwVar.f;
        aady aadyVar = this.a;
        String strE = aarq.e(aambVar);
        aaew aaewVar = (aaew) aadyVar.h.io();
        aaewVar.X(strE, aamwVar);
        aaewVar.S(strE, aamg.PAUSED);
        aadyVar.m(strE);
        m(strE);
    }

    @Override // defpackage.aarp
    public final void e(aamw aamwVar) {
        if (!aarq.l(aamwVar) || aamwVar.i) {
            return;
        }
        aady aadyVar = this.a;
        aadyVar.g.execute(new aadw(this, aamwVar, 0));
    }

    @Override // defpackage.aarp
    public final void f(aamw aamwVar) {
        if (!aarq.l(aamwVar) || aamwVar.i) {
            return;
        }
        aamb aambVar = aamwVar.f;
        aady aadyVar = this.a;
        String strE = aarq.e(aambVar);
        if (aadyVar.m) {
            ((aaew) aadyVar.h.io()).X(strE, null);
        }
        aaqz aaqzVarB = ((aaqx) aadyVar.j.io()).b();
        synchronized (aaqzVarB.c) {
            String strE2 = aarq.e(aambVar);
            if (aaqzVarB.b.remove(strE2)) {
                aaqzVarB.a.e(strE2);
                aaqzVarB.d = null;
            }
        }
        m(strE);
    }

    @Override // defpackage.aarp
    public final void g() {
        this.a.g.execute(new aadm(this, 6));
    }

    @Override // defpackage.aarp
    public final void h(aamw aamwVar) {
        if (!aarq.l(aamwVar) || aamwVar.i) {
            return;
        }
        aamb aambVar = aamwVar.f;
        aady aadyVar = this.a;
        String strE = aarq.e(aambVar);
        aaew aaewVar = (aaew) aadyVar.h.io();
        aaewVar.X(strE, aamwVar);
        aaewVar.S(strE, aamg.ACTIVE);
        aadyVar.m(strE);
        m(strE);
    }

    @Override // defpackage.aarp
    public final void k(aamw aamwVar, aogv aogvVar, aamg aamgVar) {
        if (aamwVar.i) {
            return;
        }
        aamb aambVar = aamwVar.f;
        long j = aarq.a;
        int iB = aambVar.b("transfer_type", 0);
        if (aarq.l(aamwVar)) {
            aady aadyVar = this.a;
            aadyVar.g.execute(new aasv(this, aamwVar, aamgVar, aogvVar, 1));
        } else if (iB == 2) {
            String strE = aarq.e(aambVar);
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            ((aaew) this.a.h.io()).q(strE);
        }
    }

    @Override // defpackage.aarp
    public final void l(aamw aamwVar) {
        aady aadyVar = this.a;
        if (aadyVar.o.l(18, 45631007L, false)) {
            return;
        }
        aadyVar.n.y(new aaig(aarq.e(aamwVar.f)));
    }

    @Override // defpackage.aarp
    public final void c() {
    }

    @Override // defpackage.aarp
    public final void b(aamw aamwVar) {
    }

    @Override // defpackage.aarp
    public final void i(aamw aamwVar) {
    }

    @Override // defpackage.aarp
    public final void j(aamw aamwVar) {
    }
}
