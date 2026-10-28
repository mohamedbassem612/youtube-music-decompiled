package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aeee extends qa {
    final /* synthetic */ aeei a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeee(aeei aeeiVar) {
        super((byte[]) null);
        this.a = aeeiVar;
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        if (i2 == 0) {
            aeei aeeiVar = this.a;
            boolean z = aeeiVar.r;
            aeeiVar.r = false;
            if (!z && aeeiVar.q != aeeiVar.i()) {
                return;
            }
        }
        this.a.h();
    }

    @Override // defpackage.qa
    public final void fO(RecyclerView recyclerView, int i) {
        if (i == 0) {
            aeei aeeiVar = this.a;
            aeeiVar.d();
            aeea aeeaVar = aeeiVar.d;
            int iQ = aeeaVar.q();
            if (aedi.c(iQ, 32)) {
                aeeh aeehVar = aeeiVar.g;
                if (aeehVar.e || aeehVar.f) {
                    return;
                }
                RecyclerView recyclerView2 = aeeiVar.a;
                View viewB = aeeiVar.b(recyclerView2.n);
                if (viewB != null) {
                    float f = aeeiVar.f;
                    float fA = aeeiVar.a(iQ, viewB, f);
                    if (fA <= 0.0f || fA >= 1.0f) {
                        return;
                    }
                    aeehVar.b = aeeaVar.r();
                    aeehVar.a = fA < 0.5f ? (int) f : 0;
                    recyclerView2.n.startSmoothScroll(aeehVar);
                }
            }
        }
    }
}
