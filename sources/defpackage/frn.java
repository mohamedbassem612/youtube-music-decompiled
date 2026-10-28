package defpackage;

import android.view.ViewTreeObserver;
import com.facebook.litho.widget.LithoScrollView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class frn implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ int a;
    final /* synthetic */ LithoScrollView b;

    public frn(LithoScrollView lithoScrollView, int i) {
        this.a = i;
        this.b = lithoScrollView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        LithoScrollView lithoScrollView = this.b;
        lithoScrollView.setScrollY(this.a);
        ViewTreeObserver viewTreeObserver = lithoScrollView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        return true;
    }
}
