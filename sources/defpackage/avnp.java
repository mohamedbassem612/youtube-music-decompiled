package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avnp extends AtomicReference implements avmn {
    private static final long serialVersionUID = 5718521705281392066L;

    public avnp(avnh avnhVar) {
        super(avnhVar);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnh avnhVar;
        if (get() == null || (avnhVar = (avnh) getAndSet(null)) == null) {
            return;
        }
        try {
            avnhVar.a();
        } catch (Exception e) {
            avkz.a(e);
            atqp.n(e);
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return get() == null;
    }
}
