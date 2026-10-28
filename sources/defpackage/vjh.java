package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class vjh extends vjj implements vin {
    public static final String a = "vjh";
    protected final vjf b;
    private ViewTreeObserver.OnWindowFocusChangeListener h;

    public vjh(Activity activity, xpl xplVar, zf zfVar, Optional optional, vjf vjfVar) {
        super(activity, xplVar, zfVar, optional);
        this.b = vjfVar;
    }

    public final void e(View view) {
        view.setEnabled(true);
        view.requestFocus();
        if (view.hasWindowFocus()) {
            ((InputMethodManager) this.d.getSystemService("input_method")).showSoftInput(view, 1);
            return;
        }
        if (this.h == null) {
            this.h = new vjg(this, view);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = this.h;
            onWindowFocusChangeListener.getClass();
            viewTreeObserver.addOnWindowFocusChangeListener(onWindowFocusChangeListener);
        }
    }

    public final void ja(View view) {
        view.setEnabled(false);
        ((InputMethodManager) this.d.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 2);
        if (this.h != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = this.h;
            onWindowFocusChangeListener.getClass();
            viewTreeObserver.removeOnWindowFocusChangeListener(onWindowFocusChangeListener);
            this.h = null;
        }
    }
}
