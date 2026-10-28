package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axnc {
    public final AtomicReference a;
    public final AtomicReference b;
    public final AtomicReference c;
    public final axnh d;

    public axnc(axnh axnhVar) {
        axnb axnbVar = axnb.a;
        this.a = new AtomicReference(axnbVar);
        this.b = new AtomicReference(axnbVar);
        this.c = new AtomicReference(axnd.a);
        this.d = axnhVar;
    }

    public final void a(axnb axnbVar) {
        this.b.set(axnbVar);
    }

    public final void b(axnb axnbVar) {
        this.a.set(axnbVar);
    }

    public final void c(axnd axndVar) {
        if (this.c.getAndSet(axndVar) != axnd.a) {
            throw new IllegalStateException("Winner is already set");
        }
    }
}
