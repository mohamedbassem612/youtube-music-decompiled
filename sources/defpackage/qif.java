package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qif implements ViewTreeObserver.OnDrawListener {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ qig a;
    private final AtomicReference c;

    public qif(qig qigVar, View view) {
        this.a = qigVar;
        this.c = new AtomicReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        char[] cArr = null;
        View view = (View) this.c.getAndSet(null);
        if (view != null) {
            try {
                Handler handlerA = qpj.a();
                qig qigVar = this.a;
                handlerA.postAtFrontOfQueue(new mbo(qigVar, 8));
                qpj.a().post(new mbo(qigVar, 9));
                qpj.a().post(new lph(this, view, 12, cArr));
            } catch (RuntimeException unused) {
            }
        }
    }
}
