package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rgc {
    public static final rbm f = new rbm("rgc");
    public final rjc a;
    public final rgh b;
    public final rgf c;
    public final qua d;
    public int e;
    private final Duration g;

    public rgc(rga rgaVar) {
        this.a = rgaVar.c;
        this.c = rgaVar.e;
        this.b = rgaVar.f;
        this.e = rgaVar.h;
        this.g = rgaVar.g;
        this.d = rgaVar.i;
    }

    public final rfs a(Collection collection, Collection collection2, Duration duration) throws Exception {
        boolean z = true;
        if (collection.isEmpty() && collection2.isEmpty()) {
            z = false;
        }
        ahno.G(z, "frames or instructions must not be empty");
        hlm hlmVar = new hlm(this, collection, collection2, duration, 10);
        rjc rjcVar = this.a;
        rjcVar.getClass();
        ListenableFuture listenableFutureR = ahng.r(hlmVar, new cck(rjcVar, 13));
        try {
            try {
                return (rfs) listenableFutureR.get(this.g.toMillis(), TimeUnit.MILLISECONDS);
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null || !(cause instanceof Exception)) {
                    throw e;
                }
                throw ((Exception) cause);
            }
        } catch (TimeoutException e2) {
            this.a.e(new rcu(listenableFutureR, 15));
            throw e2;
        }
    }
}
