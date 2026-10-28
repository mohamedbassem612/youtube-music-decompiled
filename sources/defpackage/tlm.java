package defpackage;

import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tlm implements tks {
    public final AtomicReference a = new AtomicReference(null);
    private final SettableFuture b;
    private final tns c;

    public tlm(final SettableFuture settableFuture, tns tnsVar) {
        this.b = settableFuture;
        this.c = tnsVar;
        settableFuture.addListener(new Runnable() { // from class: tll
            @Override // java.lang.Runnable
            public final void run() {
                if (settableFuture.isCancelled()) {
                    AtomicReference atomicReference = this.a.a;
                    if (atomicReference.get() != null) {
                        ((UrlRequest) atomicReference.get()).cancel();
                    }
                }
            }
        }, MoreExecutors.directExecutor());
    }

    @Override // defpackage.tks
    public final void a(tns tnsVar, tnx tnxVar) {
        SettableFuture settableFuture = this.b;
        if (settableFuture.isCancelled()) {
            return;
        }
        if (tnxVar.h()) {
            settableFuture.set(tnxVar);
        } else {
            settableFuture.setException(tnxVar.a().a);
        }
    }

    @Override // defpackage.tks
    public final void b(UrlRequest urlRequest) {
        this.a.set(urlRequest);
    }

    @Override // defpackage.tks
    public final boolean c() {
        return this.c.D() || this.b.isCancelled();
    }

    @Override // defpackage.tks
    public final void d() {
        SettableFuture settableFuture = this.b;
        if (!settableFuture.isCancelled()) {
            settableFuture.cancel(true);
        }
        this.c.w();
    }
}
