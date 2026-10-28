package defpackage;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dz extends ea {
    private final afjq j;

    /* JADX WARN: Illegal instructions before constructor call */
    public dz(int i, int i2, afjq afjqVar) {
        Object obj = afjqVar.d;
        obj.getClass();
        super(i, i2, (cc) obj);
        this.j = afjqVar;
    }

    @Override // defpackage.ea
    public final void a() {
        super.a();
        this.a.mTransitioning = false;
        this.j.i();
    }

    @Override // defpackage.ea
    public final void b() {
        if (this.e) {
            return;
        }
        super.b();
        int i = this.i;
        if (i != 2) {
            if (i == 3) {
                Object obj = this.j.d;
                obj.getClass();
                View viewRequireView = ((cc) obj).requireView();
                if (dd.aa(2)) {
                    Objects.toString(viewRequireView.findFocus());
                    Objects.toString(viewRequireView);
                    Objects.toString(obj);
                }
                viewRequireView.clearFocus();
                return;
            }
            return;
        }
        afjq afjqVar = this.j;
        Object obj2 = afjqVar.d;
        obj2.getClass();
        cc ccVar = (cc) obj2;
        View viewFindFocus = ccVar.mView.findFocus();
        if (viewFindFocus != null) {
            ccVar.setFocusedView(viewFindFocus);
            if (dd.aa(2)) {
                Objects.toString(viewFindFocus);
                Objects.toString(obj2);
            }
        }
        View viewRequireView2 = this.a.requireView();
        if (viewRequireView2.getParent() == null) {
            if (dd.aa(2)) {
                Objects.toString(obj2);
                Objects.toString(viewRequireView2);
            }
            afjqVar.f();
            viewRequireView2.setAlpha(0.0f);
        }
        if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
            if (dd.aa(2)) {
                Objects.toString(viewRequireView2);
            }
            viewRequireView2.setVisibility(4);
        }
        viewRequireView2.setAlpha(ccVar.getPostOnViewCreatedAlpha());
        if (dd.aa(2)) {
            ccVar.getPostOnViewCreatedAlpha();
        }
    }
}
