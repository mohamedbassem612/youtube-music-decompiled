package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acul {
    public final AtomicReference a = new AtomicReference();

    static {
        Duration.ofSeconds(8L);
    }

    public acul(trf trfVar, tqj tqjVar) {
        new AtomicReference(null);
        trfVar.c();
        int i = tqr.a;
        tqjVar.k(1073808310);
    }

    public final ListenableFuture a() {
        return (ListenableFuture) this.a.get();
    }

    public final void b() {
        zyz zyzVar = (zyz) this.a.get();
        if (zyzVar != null) {
            zyzVar.cancel(false);
        }
    }
}
