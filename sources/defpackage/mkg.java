package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mkg implements ViewTreeObserver.OnWindowFocusChangeListener {
    public View a;

    public final void a() {
        View view = this.a;
        if (view != null) {
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
            this.a = null;
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        View view;
        if (z && (view = this.a) != null) {
            mkh.a(view);
        }
        a();
    }
}
