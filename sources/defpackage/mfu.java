package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mfu {
    public bog a;
    private final Handler b = new Handler(Looper.getMainLooper());
    private final Runnable c = new mga(this, 1);
    private final bnu d = new adp(this, 3);
    private elr e;

    private final void c(elr elrVar) {
        this.e = elrVar;
        Handler handler = this.b;
        Runnable runnable = this.c;
        handler.removeCallbacks(runnable);
        bog bogVar = this.a;
        if (bogVar != null) {
            bogVar.getLifecycle().c(this.d);
            this.a = null;
        }
        if (this.e != null) {
            handler.postDelayed(runnable, 5000L);
            bog bogVarC = bou.c((View) this.e.a);
            if (bogVarC != null) {
                this.a = bogVarC;
                bogVarC.getLifecycle().b(this.d);
            }
        }
    }

    public final synchronized void a(View view) {
        c(view != null ? new elr(view) : null);
    }

    public final synchronized void b(View view) {
        c(new elr(view));
    }
}
