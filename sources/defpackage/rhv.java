package defpackage;

import j$.util.Optional;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rhv implements rhw {
    public rft a;
    public Semaphore b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    @Override // defpackage.rib
    public final /* synthetic */ Optional a() {
        return Optional.empty();
    }

    @Override // defpackage.rib
    public final void c(rfs rfsVar) {
        rft rftVar = this.a;
        if (rftVar != null) {
            rftVar.a(rfsVar);
        }
    }

    @Override // defpackage.rhw
    public final void d(Semaphore semaphore) {
        this.b = semaphore;
    }

    @Override // defpackage.rib
    public final void e(rft rftVar) {
        this.a = rftVar;
    }

    public final void f(boolean z) {
        this.c.set(z);
    }

    @Override // defpackage.rib
    public final boolean g() {
        return this.c.get();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.rib
    public final /* synthetic */ void iF(long j) {
    }
}
