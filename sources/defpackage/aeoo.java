package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeoo implements aeoq {
    public final String a;
    public final AtomicInteger b = new AtomicInteger(0);
    private final Executor c;
    private ListenableFuture d;

    public aeoo(String str, Executor executor) {
        this.a = str;
        this.c = executor;
        new File(str);
    }

    public static void c(List list) throws IOException {
        Process processExec = Runtime.getRuntime().exec((String[]) list.toArray(new String[list.size()]));
        if (processExec.waitFor() == 0) {
            return;
        }
        String str = new String(agyi.b(processExec.getErrorStream()));
        throw new IOException("Could not execute " + list.toString() + " because: " + str);
    }

    @Override // defpackage.aeoq
    public final ListenableFuture a(aeom aeomVar, Object obj, aeow aeowVar) {
        return ahcs.e(ahno.aq(new wan(aeowVar, obj, 17, null), this.c), new afiq(this, aeomVar, 1), MoreExecutors.directExecutor());
    }

    public final void b(agfr agfrVar) {
        this.d = ahno.aq(new afgi(agfrVar, 1), this.c);
    }

    public final void d() {
        ListenableFuture listenableFuture = this.d;
        if (listenableFuture == null || listenableFuture.isDone()) {
            return;
        }
        try {
            this.d.get();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException unused2) {
        }
    }

    @Override // defpackage.aeoq
    public final ListenableFuture e(aeom aeomVar) {
        return ahcs.e(ahno.aq(new wan(this, aeomVar, 18), this.c), new acpb(aeomVar, 19), MoreExecutors.directExecutor());
    }
}
