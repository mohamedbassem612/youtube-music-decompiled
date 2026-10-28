package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class awma implements avlk, avmn {
    final AtomicReference f = new AtomicReference();

    @Override // defpackage.avmn
    public final void dispose() {
        awka.f(this.f);
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        AtomicReference atomicReference = this.f;
        if (a.ap(atomicReference, axsqVar)) {
            ((axsq) atomicReference.get()).ko(Long.MAX_VALUE);
            return;
        }
        axsqVar.kj();
        if (atomicReference.get() != awka.CANCELLED) {
            atqp.z(getClass());
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.f.get() == awka.CANCELLED;
    }
}
