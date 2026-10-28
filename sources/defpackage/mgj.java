package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class mgj implements View.OnAttachStateChangeListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public mgj(ViewGroup viewGroup, View view, int i) {
        this.$cid = i;
        this.a = viewGroup;
        this.b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.$cid != 0) {
            ((ViewGroup) this.a).addView((View) this.b, 0);
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.$cid != 0) {
            ((ViewGroup) this.a).addView((View) this.b, 0);
            view.removeOnAttachStateChangeListener(this);
            return;
        }
        Object obj = this.b;
        synchronized (((axfd) obj).b) {
            Object obj2 = this.a;
            ((axfd) obj).X(((asqv) obj2).d);
            ((axfd) obj).c.remove(((asqv) obj2).d);
        }
        view.removeOnAttachStateChangeListener(this);
    }

    public mgj(axfd axfdVar, asqv asqvVar, int i) {
        this.$cid = i;
        this.a = asqvVar;
        this.b = axfdVar;
    }
}
