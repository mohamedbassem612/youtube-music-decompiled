package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awid extends AtomicReference {
    private static final long serialVersionUID = 2404266111789071508L;
    private Object a;

    public awid(Object obj) {
        this.a = obj;
    }

    public final awid a() {
        return (awid) get();
    }

    public final Object b() {
        Object obj = this.a;
        this.a = null;
        return obj;
    }

    public awid() {
    }
}
