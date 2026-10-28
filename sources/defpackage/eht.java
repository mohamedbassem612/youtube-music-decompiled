package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eht extends FutureTask {
    private ehu a;

    public eht(ehu ehuVar, Callable callable) {
        super(callable);
        this.a = ehuVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        try {
            if (!isCancelled()) {
                try {
                    ehu ehuVar = this.a;
                    ehs ehsVar = (ehs) get();
                    Executor executor = ehu.a;
                    ehuVar.b(ehsVar);
                } catch (InterruptedException | ExecutionException e) {
                    ehu ehuVar2 = this.a;
                    ehs ehsVar2 = new ehs(e);
                    Executor executor2 = ehu.a;
                    ehuVar2.b(ehsVar2);
                }
            }
        } finally {
            this.a = null;
        }
    }
}
