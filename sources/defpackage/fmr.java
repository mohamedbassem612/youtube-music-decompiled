package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fmr extends fms {
    private final int a;
    private final fmo b;
    private final Interpolator c;

    public fmr(int i, fmo fmoVar, Interpolator interpolator) {
        this.a = i;
        this.b = fmoVar;
        this.c = interpolator;
    }

    @Override // defpackage.fmj
    public final void c(ArrayList arrayList) {
        arrayList.add(this.b);
    }

    @Override // defpackage.fms
    protected final void m(hhb hhbVar) {
        fno fnoVar = new fno(this.a);
        fmo fmoVar = this.b;
        fmp fmpVar = fmoVar.a;
        fng fngVar = new fng(hhbVar.q(fmpVar));
        fng fngVar2 = new fng(fmoVar.b);
        fnl fnlVar = new fnl();
        Interpolator interpolator = this.c;
        if (interpolator != null) {
            fnk fnkVar = new fnk(interpolator);
            n(fnoVar, fnkVar);
            n(fnkVar, fnlVar);
        } else {
            n(fnoVar, fnlVar);
        }
        o(fngVar, fnlVar, "initial");
        o(fngVar2, fnlVar, "end");
        n(fnlVar, hhbVar.r(fmpVar));
    }
}
