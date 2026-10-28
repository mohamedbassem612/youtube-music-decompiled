package defpackage;

import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aebm implements ViewTreeObserver.OnPreDrawListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    private final Object b;

    public aebm(qig qigVar, View view, int i) {
        this.$cid = i;
        this.a = qigVar;
        this.b = new AtomicReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.$cid;
        Object obj = this.b;
        if (i != 0) {
            View view = (View) ((AtomicReference) obj).getAndSet(null);
            if (view != null) {
                try {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    Handler handlerA = qpj.a();
                    Object obj2 = this.a;
                    handlerA.postAtFrontOfQueue(new mbo(obj2, 10));
                    qpj.a().post(new mbo(obj2, 11));
                } catch (RuntimeException unused) {
                }
            }
        } else {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) obj).get();
            if (recyclerView != null) {
                ((aebp) this.a).g(recyclerView);
            }
        }
        return true;
    }

    public aebm(aebp aebpVar, RecyclerView recyclerView, int i) {
        this.$cid = i;
        this.a = aebpVar;
        this.b = new WeakReference(recyclerView);
    }
}
