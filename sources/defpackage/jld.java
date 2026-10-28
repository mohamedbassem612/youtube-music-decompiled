package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jld implements View.OnAttachStateChangeListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public jld(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.$cid;
        if (i == 0) {
            int i2 = bac.a;
            ((View) this.a).requestApplyInsets();
            return;
        }
        if (i == 1) {
            View view2 = (View) this.a;
            view2.removeOnAttachStateChangeListener(this);
            int i3 = bac.a;
            view2.requestApplyInsets();
            return;
        }
        if (i == 2) {
            ((abkk) this.a).a.d(new xgj(xhb.b(28244)));
        } else {
            RecyclerView recyclerView = (RecyclerView) view;
            aebp aebpVar = (aebp) this.a;
            aebpVar.e(recyclerView);
            aebpVar.g(recyclerView);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.$cid;
        if (i == 0 || i == 1) {
            return;
        }
        if (i == 2) {
            abkk abkkVar = (abkk) this.a;
            abkkVar.c.removeCallbacks(abkkVar.f);
        } else {
            RecyclerView recyclerView = (RecyclerView) view;
            aebp aebpVar = (aebp) this.a;
            aebpVar.i(recyclerView);
            aebpVar.h(recyclerView);
        }
    }
}
