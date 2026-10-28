package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class gf extends bak {
    final /* synthetic */ gg a;

    public gf(gg ggVar) {
        this.a = ggVar;
    }

    @Override // defpackage.bak, defpackage.baj
    public final void a(View view) {
        gp gpVar = this.a.a;
        gpVar.q.setVisibility(8);
        PopupWindow popupWindow = gpVar.r;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (gpVar.q.getParent() instanceof View) {
            View view2 = (View) gpVar.q.getParent();
            int i = bac.a;
            view2.requestApplyInsets();
        }
        gpVar.q.i();
        gpVar.H.t(null);
        gpVar.H = null;
        ViewGroup viewGroup = gpVar.u;
        int i2 = bac.a;
        viewGroup.requestApplyInsets();
    }
}
