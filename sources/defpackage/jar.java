package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jar extends pp {
    private final jav a;

    public jar(jav javVar) {
        this.a = javVar;
    }

    @Override // defpackage.pp
    public final float a(oh ohVar) {
        adma admaVar = ((admf) ohVar).s;
        if (admaVar instanceof ize) {
            return ((ize) admaVar).a();
        }
        return 0.5f;
    }

    @Override // defpackage.pp
    public final void d(RecyclerView recyclerView, oh ohVar) {
        adma admaVar = ((admf) ohVar).s;
        if (admaVar instanceof ize) {
            ize izeVar = (ize) admaVar;
            if (izeVar.b() != 0) {
                izeVar.c();
            }
        }
        if (admaVar instanceof iyv) {
            iyv iyvVar = (iyv) admaVar;
            if (iyvVar.f() != 0) {
                iyvVar.h();
            }
        }
    }

    @Override // defpackage.pp
    public final void e(Canvas canvas, RecyclerView recyclerView, oh ohVar, float f, float f2, int i, boolean z) {
        adma admaVar = ((admf) ohVar).s;
        if (admaVar instanceof iyw) {
            ((iyw) admaVar).j(canvas, recyclerView, ohVar, f, f2, i, z);
        }
    }

    @Override // defpackage.pp
    public final void f(RecyclerView recyclerView, oh ohVar, int i, oh ohVar2, int i2, int i3, int i4) {
        super.f(recyclerView, ohVar, i, ohVar2, i2, i3, i4);
        adma admaVar = ((admf) ohVar).s;
        if (admaVar instanceof iyv) {
        }
    }

    @Override // defpackage.pp
    public final boolean h(RecyclerView recyclerView, oh ohVar, oh ohVar2) {
        if (!(ohVar instanceof admf) || !(ohVar2 instanceof admf)) {
            return false;
        }
        adma admaVar = ((admf) ohVar).s;
        if (!(admaVar instanceof iyv)) {
            return false;
        }
        int iB = ohVar.b();
        int iB2 = ohVar2.b();
        if (iB == -1 || iB2 == -1) {
            return false;
        }
        jav javVar = this.a;
        Object objD = javVar.j.d(iB);
        if (objD == null) {
            return false;
        }
        iyv iyvVar = (iyv) admaVar;
        adma admaVar2 = ((admf) ohVar2).s;
        if (!(admaVar2 instanceof iyv) || ((iyv) admaVar2).f() == 0) {
            return false;
        }
        advc advcVarE = javVar.e(objD);
        if (!(advcVarE instanceof iyx)) {
            return false;
        }
        iyx iyxVar = (iyx) advcVarE;
        int iG = iyvVar.g();
        if (iG >= 0) {
            iyxVar.e(iB - iG, iB2 - iG);
        } else {
            iyxVar.j(objD, iB2 - iB);
        }
        return true;
    }

    @Override // defpackage.pp
    public final int i(oh ohVar) {
        if (!(ohVar instanceof admf)) {
            return 0;
        }
        adma admaVar = ((admf) ohVar).s;
        int iB = admaVar instanceof ize ? ((ize) admaVar).b() : 0;
        int iF = admaVar instanceof iyv ? ((iyv) admaVar).f() : 0;
        return (iF << 16) | iB | iF | (iB << 8);
    }

    @Override // defpackage.pp
    public final void n(oh ohVar) {
        adma admaVar = ((admf) ohVar).s;
        if (admaVar instanceof iyv) {
        }
    }

    @Override // defpackage.pp
    public final void o(oh ohVar) {
        int iB = ohVar.b();
        if (iB != -1) {
            adma admaVar = ((admf) ohVar).s;
            if (admaVar instanceof ize) {
                ((ize) admaVar).d();
            }
            jav javVar = this.a;
            Object objD = javVar.j.d(iB);
            advc advcVarE = javVar.e(objD);
            if (advcVarE instanceof adwk) {
                ((adwk) advcVarE).l(objD);
            }
        }
    }

    @Override // defpackage.pp
    public final void p(oh ohVar) {
        adma admaVar = ((admf) ohVar).s;
        if (admaVar instanceof iyw) {
            ((iyw) admaVar).k();
        }
    }

    @Override // defpackage.pp
    public final void q(oh ohVar) {
        admf admfVar = (admf) ohVar;
        if (ohVar != null) {
            adma admaVar = admfVar.s;
            if (admaVar instanceof iyw) {
                ((iyw) admaVar).l();
            }
        }
    }

    @Override // defpackage.pp
    public final void k() {
    }

    @Override // defpackage.pp
    public final void l() {
    }
}
