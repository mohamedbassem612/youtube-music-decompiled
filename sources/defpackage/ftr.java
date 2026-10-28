package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.facebook.litho.ComponentTree;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ftr extends qa {
    public ftl a;
    public np b;
    private final fqv c;
    private View d;
    private int e;

    public ftr(fqv fqvVar) {
        super((byte[]) null);
        this.e = -1;
        this.c = fqvVar;
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) throws Throwable {
        fqv fqvVar = this.c;
        frj frjVar = ((fsy) fqvVar).e;
        int iC = frjVar.c();
        if (iC != -1) {
            int i3 = iC;
            while (true) {
                if (i3 < 0) {
                    i3 = -1;
                    break;
                } else if (fqvVar.f(i3)) {
                    break;
                } else {
                    i3--;
                }
            }
            ComponentTree componentTreeA = fqvVar.a(iC);
            View view = this.d;
            if (view != null && componentTreeA != null && view != componentTreeA.getLithoView()) {
                view.setTranslationY(0.0f);
                this.d = null;
            }
            if (i3 == -1 || componentTreeA == null) {
                this.a.p();
                this.e = -1;
                return;
            }
            if (iC == i3) {
                fjw lithoView = componentTreeA.getLithoView();
                if (lithoView == null) {
                    gzj.br(2, "First visible sticky header item is null, RV.hasPendingAdapterUpdates: " + this.a.l.as() + ", first visible component: " + componentTreeA.g() + ", hasMounted: " + componentTreeA.t + ", isReleased: " + componentTreeA.z());
                } else {
                    int i4 = i3 + 1;
                    if (!fqvVar.g(i4) || !fqvVar.f(i4)) {
                        lithoView.setTranslationY(-lithoView.getTop());
                    }
                }
                this.d = lithoView;
                this.a.p();
                this.e = -1;
                return;
            }
            int iMin = 0;
            if (this.a.k.getVisibility() == 8 || i3 != this.e) {
                ComponentTree componentTreeA2 = fqvVar.a(i3);
                ftl ftlVar = this.a;
                if (componentTreeA2.getLithoView() != null) {
                    fjw lithoView2 = componentTreeA2.getLithoView();
                    lithoView2.B = lithoView2.w;
                }
                ftlVar.k.K(componentTreeA2, true);
                ftlVar.q(ftlVar.getWidth());
                fjw fjwVar = this.a.k;
                fjwVar.setVisibility(0);
                boolean z = fjwVar.v;
                fjwVar.D();
            } else if (this.a.k.w == null && i == 0 && i2 == 0) {
                boolean z2 = fna.a;
            }
            int iE = frjVar.e();
            while (iC <= iE) {
                if (fqvVar.f(iC)) {
                    iMin = Math.min((this.b.findViewByPosition(iC).getTop() - this.a.k.getBottom()) + this.a.getPaddingTop(), 0);
                    break;
                }
                iC++;
            }
            this.a.k.setTranslationY(iMin);
            this.e = i3;
        }
    }
}
