package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xig implements Executor {
    private final tag a;

    public xig(tag tagVar) {
        this.a = tagVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.b(tai.b, runnable);
    }
}
