package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vjg implements ViewTreeObserver.OnWindowFocusChangeListener {
    final /* synthetic */ View a;
    final /* synthetic */ vjh b;

    public vjg(vjh vjhVar, View view) {
        this.a = view;
        this.b = vjhVar;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.b.d.getSystemService("input_method");
            View view = this.a;
            inputMethodManager.showSoftInput(view, 1);
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
    }
}
