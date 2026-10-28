package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acrv implements zza {
    public final zza a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    public acrv(zza zzaVar) {
        this.a = zzaVar;
    }

    private final void d(Runnable runnable) {
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        runnable.run();
    }

    @Override // defpackage.tnh
    public final void a(Object obj) {
        d(new acnp(this, obj, 8));
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        d(new acnp(this, toeVar, 9, null));
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
