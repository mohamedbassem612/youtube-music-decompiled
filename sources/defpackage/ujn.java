package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ujn extends uhv {
    public final View b;
    public final Rect c;
    public int d;
    public boolean e;
    public final qcb f;
    private final ViewTreeObserver.OnGlobalLayoutListener g;

    public ujn(cc ccVar, View view, qcb qcbVar) {
        super(ccVar, false);
        ujm ujmVar = new ujm(this, getClass().getSimpleName());
        this.g = ujmVar;
        Rect rect = new Rect();
        this.c = rect;
        this.b = view;
        this.f = qcbVar;
        view.getWindowVisibleDisplayFrame(rect);
        this.d = rect.bottom;
        view.getViewTreeObserver().addOnGlobalLayoutListener(ujmVar);
    }

    @Override // defpackage.uhv
    protected final void g() {
        this.e = true;
    }

    @Override // defpackage.uhv
    protected final void iW() {
        this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this.g);
    }

    @Override // defpackage.uhv
    protected final void iX() {
        this.e = false;
    }
}
