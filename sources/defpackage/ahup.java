package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahup implements ahul {
    public static final agsn a = agsn.h("xRPC");
    public static final AtomicInteger b = new AtomicInteger();
    public final Executor c;
    public final ahcx d;
    private final agkz e;

    public ahup(ahum ahumVar) {
        this.c = ahumVar.a;
        this.d = new afgi(new afkb(new afgi(ahumVar, 11), ahumVar.c), 12);
        this.e = ahumVar.e.g();
    }

    @Override // defpackage.ahul
    public final ListenableFuture a(ahuu ahuuVar) {
        ListenableFuture listenableFutureG;
        afuu afuuVarC = afwt.c(208, "Http Request");
        try {
            agkz agkzVar = this.e;
            agkz agkzVar2 = ahuuVar.i;
            if (agkzVar2.isEmpty() && agkzVar.isEmpty()) {
                listenableFutureG = ahng.n(ahuuVar);
            } else {
                agjz agjzVar = new agjz(4);
                agqr it = agkzVar.iterator();
                while (it.hasNext()) {
                    agjzVar.h(ahng.s(((ahux) it.next()).a(), MoreExecutors.directExecutor()));
                }
                agqr it2 = agkzVar2.iterator();
                while (it2.hasNext()) {
                    agjzVar.h(ahng.s(((ahux) it2.next()).a(), MoreExecutors.directExecutor()));
                }
                listenableFutureG = ahno.aA(agjzVar.g()).g(new aeqk(ahuuVar, 20), MoreExecutors.directExecutor());
            }
            ListenableFuture listenableFutureF = ahcs.f(listenableFutureG, afwl.d(new aekb(this, 17)), MoreExecutors.directExecutor());
            afuuVarC.a(listenableFutureF);
            afuuVarC.close();
            return listenableFutureF;
        } catch (Throwable th) {
            try {
                afuuVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
