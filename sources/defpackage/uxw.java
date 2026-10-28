package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uxw extends tud {
    final /* synthetic */ View a;
    final /* synthetic */ uxx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxw(uxx uxxVar, String str, View view) {
        super(str);
        this.a = view;
        this.b = uxxVar;
    }

    @Override // defpackage.tud
    protected final void a() {
        View view = this.a;
        if (view.getWidth() > 0) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ObjectAnimator duration = ObjectAnimator.ofInt((Object) null, "scrollX", (view.getLeft() - (this.b.b / 2)) + (view.getWidth() / 2)).setDuration(225L);
            duration.setInterpolator(new bnn());
            duration.start();
        }
    }
}
