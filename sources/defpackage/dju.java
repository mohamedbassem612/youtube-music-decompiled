package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dju extends djp {
    private final OnBackInvokedDispatcher a;
    private final int b;
    private final OnBackInvokedCallback e;
    private boolean f;

    public dju(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.a = onBackInvokedDispatcher;
        this.b = i;
        this.e = Build.VERSION.SDK_INT == 33 ? new pa(this, 2) : new djt(this);
    }

    @Override // defpackage.djp
    protected final void c(boolean z) {
        boolean z2 = this.f;
        if (z) {
            if (z2) {
                return;
            }
            this.a.registerOnBackInvokedCallback(this.b, this.e);
            this.f = true;
            return;
        }
        if (z2) {
            this.a.unregisterOnBackInvokedCallback(this.e);
            this.f = false;
        }
    }
}
