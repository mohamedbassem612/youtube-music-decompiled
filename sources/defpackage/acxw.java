package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class acxw implements PopupWindow.OnDismissListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ acxw(acxx acxxVar, acyb acybVar, int i) {
        this.$cid = i;
        this.a = acxxVar;
        this.b = acybVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, java.lang.Object] */
    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            ViewTreeObserver viewTreeObserver = ((kw) obj).d.getViewTreeObserver();
            if (viewTreeObserver != 0) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.b);
                return;
            }
            return;
        }
        acxx acxxVar = (acxx) obj;
        if (this.b == acxxVar.g) {
            acxxVar.g = null;
        }
    }

    public acxw(kw kwVar, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, int i) {
        this.$cid = i;
        this.a = kwVar;
        this.b = onGlobalLayoutListener;
    }
}
