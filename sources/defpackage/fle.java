package defpackage;

import android.os.Looper;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fle implements fvu {
    public static final fjf b;
    public static fjf c;
    public final ThreadPoolExecutor a;

    static {
        fnc.a();
        boolean z = fna.a;
        b = new fjf(2, 2, 5);
    }

    public fle(fjf fjfVar) {
        this.a = new fjg(fjfVar.a, fjfVar.b, fjfVar.c);
    }

    public static fvu d() {
        boolean z = fna.a;
        if (fna.p) {
            return new fvt(Looper.getMainLooper());
        }
        return c != null ? flc.a : fld.a;
    }

    @Override // defpackage.fvu
    public final void a(Runnable runnable) {
        this.a.remove(runnable);
    }

    @Override // defpackage.fvu
    public final void c(Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            throw new RuntimeException("Cannot execute layout calculation task; ".concat(e.toString()));
        }
    }

    @Override // defpackage.fvu
    public final void b() {
    }
}
