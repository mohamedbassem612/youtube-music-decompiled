package defpackage;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qsi {
    public final SQLiteDatabase a;
    public final Executor b;
    public volatile boolean c = false;
    public final hwe d;
    private final Executor e;

    public qsi(SQLiteDatabase sQLiteDatabase, Executor executor, Executor executor2, hwe hweVar) {
        this.a = sQLiteDatabase;
        this.b = executor;
        this.e = executor2;
        this.d = hweVar;
    }

    public final ListenableFuture a(qsx qsxVar) {
        b();
        afuy afuyVar = afux.a;
        omr omrVar = new omr(this.a);
        afuu afuuVarD = afwt.d(31, "Transaction", afuyVar, true);
        try {
            qsg qsgVar = new qsg(this, qsxVar, omrVar);
            long j = afwl.a;
            ahev ahevVar = new ahev(new ahcz(afty.c(false), qsgVar, 1));
            this.e.execute(ahevVar);
            ahevVar.addListener(new lph(ahevVar, omrVar, 14, (char[]) null), MoreExecutors.directExecutor());
            afuuVarD.a(ahevVar);
            afuuVarD.close();
            return ahevVar;
        } catch (Throwable th) {
            try {
                afuuVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b() {
        if (this.c) {
            throw new IllegalStateException("Already closed");
        }
    }
}
