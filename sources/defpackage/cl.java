package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cl implements View.OnAttachStateChangeListener {
    final /* synthetic */ cm a;
    final /* synthetic */ afjq b;

    public cl(cm cmVar, afjq afjqVar) {
        this.a = cmVar;
        this.b = afjqVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        afjq afjqVar = this.b;
        afjqVar.i();
        ViewGroup viewGroup = (ViewGroup) ((cc) afjqVar.d).mView.getParent();
        viewGroup.getClass();
        dl dlVarAn = this.a.a.an();
        dlVarAn.getClass();
        dl.c(viewGroup, dlVarAn).f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
