package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class avmp extends AtomicReference implements avmn {
    private static final long serialVersionUID = 6537757548749041217L;

    public avmp(Object obj) {
        super(obj);
    }

    protected abstract void a(Object obj);

    @Override // defpackage.avmn
    public final void dispose() {
        Object andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        a(andSet);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return get() == null;
    }
}
