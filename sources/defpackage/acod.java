package defpackage;

import android.util.Size;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class acod extends tud {
    final /* synthetic */ boolean a = false;
    final /* synthetic */ float b = 0.0f;
    final /* synthetic */ acoi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acod(acoi acoiVar, String str, boolean z, float f) {
        super(str);
        this.c = acoiVar;
    }

    @Override // defpackage.tud
    protected final void a() {
        acoi acoiVar = this.c;
        View view = acoiVar.bb;
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (view.getWidth() <= 0 || view.getHeight() <= 0 || view.getWidth() == acoiVar.bL.getWidth() || view.getHeight() == acoiVar.bL.getHeight()) {
                return;
            }
            acoiVar.bL = new Size(view.getWidth(), view.getHeight());
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }
}
