package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afco implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final WeakReference a;
    private final WeakReference b;

    public afco(afcr afcrVar, View view) {
        this.b = new WeakReference(afcrVar);
        this.a = new WeakReference(view);
    }

    private final boolean b() {
        if (this.b.get() != null) {
            return false;
        }
        a();
        return true;
    }

    public final void a() {
        WeakReference weakReference = this.a;
        if (weakReference.get() != null) {
            ((View) weakReference.get()).removeOnAttachStateChangeListener(this);
            afba.B((View) weakReference.get(), this);
        }
        weakReference.clear();
        this.b.clear();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (b()) {
            return;
        }
        afcr afcrVar = (afcr) this.b.get();
        String str = afcr.c;
        boolean z = afcrVar.o;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (b()) {
            return;
        }
        afba.A(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (b()) {
            return;
        }
        afba.B(view, this);
    }
}
