package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awvh implements Executor {
    public final awuq a;

    public awvh(awuq awuqVar) {
        this.a = awuqVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) throws awve {
        awuq awuqVar = this.a;
        awov awovVar = awov.a;
        try {
            if (!awuqVar.fX(awovVar)) {
                runnable.run();
                return;
            }
            awuq awuqVar2 = this.a;
            awov awovVar2 = awov.a;
            try {
                awuqVar2.a(awovVar2, runnable);
            } catch (Throwable th) {
                throw new awve(th, awuqVar2, awovVar2);
            }
        } catch (Throwable th2) {
            throw new awve(th2, awuqVar, awovVar);
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
