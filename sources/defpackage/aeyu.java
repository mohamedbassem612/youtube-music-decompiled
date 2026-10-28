package defpackage;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class aeyu {
    private OnBackInvokedCallback a;

    public OnBackInvokedCallback a(aeyt aeytVar) {
        aeytVar.getClass();
        return new pa(aeytVar, 4);
    }

    public void b(aeyt aeytVar, View view, boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (this.a != null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        OnBackInvokedCallback onBackInvokedCallbackA = a(aeytVar);
        this.a = onBackInvokedCallbackA;
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, onBackInvokedCallbackA);
    }

    public void c(View view) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (this.a == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.a);
        this.a = null;
    }

    final boolean d() {
        return this.a != null;
    }
}
