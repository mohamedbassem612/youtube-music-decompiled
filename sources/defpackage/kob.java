package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class kob extends kot implements DialogInterface.OnCancelListener {
    protected volatile boolean a;
    protected final AtomicReference b;
    protected final klt c;
    private final Handler d;

    public kob(kou kouVar, klt kltVar) {
        super(kouVar);
        this.b = new AtomicReference(null);
        this.d = new afkg(Looper.getMainLooper(), (byte[]) null);
        this.c = kltVar;
    }

    private static final int o(aami aamiVar) {
        if (aamiVar == null) {
            return -1;
        }
        return aamiVar.a;
    }

    public final void a(klo kloVar, int i) {
        aami aamiVar = new aami(kloVar, i);
        if (a.ap(this.b, aamiVar)) {
            this.d.post(new koa(this, aamiVar, 0));
        }
    }

    public final void b(klo kloVar, int i) {
        this.b.set(null);
        f(kloVar, i);
    }

    public final void c() {
        this.b.set(null);
        g();
    }

    @Override // defpackage.kot
    public final void d(int i, int i2, Intent intent) {
        aami aamiVar = (aami) this.b.get();
        if (i != 1) {
            if (i == 2) {
                int iL = this.c.l(l());
                if (iL == 0) {
                    c();
                    return;
                } else {
                    if (aamiVar == null) {
                        return;
                    }
                    if (((klo) aamiVar.b).c == 18 && iL == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            c();
            return;
        } else if (i2 == 0) {
            if (aamiVar != null) {
                b(new klo(1, intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, ((klo) aamiVar.b).toString(), null, null), o(aamiVar));
                return;
            }
            return;
        }
        if (aamiVar != null) {
            b((klo) aamiVar.b, aamiVar.a);
        }
    }

    @Override // defpackage.kot
    public final void e(Bundle bundle) {
        if (bundle != null) {
            this.b.set(bundle.getBoolean("resolving_error", false) ? new aami(new klo(1, bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"), null, null, null), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    protected abstract void f(klo kloVar, int i);

    protected abstract void g();

    @Override // defpackage.kot
    public final void h(Bundle bundle) {
        aami aamiVar = (aami) this.b.get();
        if (aamiVar != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", aamiVar.a);
            klo kloVar = (klo) aamiVar.b;
            bundle.putInt("failed_status", kloVar.c);
            bundle.putParcelable("failed_resolution", kloVar.a());
        }
    }

    @Override // defpackage.kot
    public void i() {
        this.a = true;
    }

    @Override // defpackage.kot
    public void j() {
        this.a = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        b(new klo(1, 13, null, null, null, null), o((aami) this.b.get()));
    }
}
