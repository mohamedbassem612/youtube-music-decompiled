package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lgy extends FutureTask implements Comparable {
    final boolean a;
    final /* synthetic */ lha b;
    private final long c;
    private final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lgy(lha lhaVar, Callable callable, boolean z) {
        super(callable);
        this.b = lhaVar;
        long andIncrement = lha.a.getAndIncrement();
        this.c = andIncrement;
        this.d = "Task exception on worker thread";
        this.a = z;
        if (andIncrement == Long.MAX_VALUE) {
            lhaVar.aT().c.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        lgy lgyVar = (lgy) obj;
        boolean z = lgyVar.a;
        boolean z2 = this.a;
        if (z2 == z) {
            long j = this.c;
            long j2 = lgyVar.c;
            if (j >= j2) {
                if (j > j2) {
                    return 1;
                }
                this.b.aT().d.b("Two tasks share the same index. index", Long.valueOf(j));
                return 0;
            }
        } else if (!z2) {
            return 1;
        }
        return -1;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.b.aT().c.b(this.d, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lgy(lha lhaVar, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.b = lhaVar;
        long andIncrement = lha.a.getAndIncrement();
        this.c = andIncrement;
        this.d = str;
        this.a = z;
        if (andIncrement == Long.MAX_VALUE) {
            lhaVar.aT().c.a("Tasks index overflow");
        }
    }
}
