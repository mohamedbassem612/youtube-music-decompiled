package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tzj extends ahch {
    public final AtomicReference a = new AtomicReference();

    public final void c() {
        avmn avmnVar = (avmn) this.a.getAndSet(null);
        if (avmnVar != null) {
            avmnVar.dispose();
        }
    }

    @Override // defpackage.ahch
    protected final void gH() {
        if (isCancelled()) {
            c();
        }
    }
}
