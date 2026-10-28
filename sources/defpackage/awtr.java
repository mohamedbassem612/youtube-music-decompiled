package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awtr {
    private static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(awtr.class, Object.class, "a");
    public volatile Object a;
    private final awro c;

    public awtr(Object obj, awro awroVar) {
        this.c = awroVar;
        this.a = obj;
    }

    public final Object a(Object obj) {
        Object andSet = b.getAndSet(this, obj);
        if (this.c != awts.a) {
            Objects.toString(obj);
            Objects.toString(andSet);
        }
        return andSet;
    }

    public final void b(Object obj) {
        b.lazySet(this, obj);
        if (this.c != awts.a) {
            Objects.toString(obj);
        }
    }

    public final void c(Object obj) {
        this.a = obj;
        if (this.c != awts.a) {
            Objects.toString(obj);
        }
    }

    public final boolean d(Object obj, Object obj2) {
        boolean zAA = a.aA(b, this, obj, obj2);
        if (!zAA || this.c == awts.a) {
            return zAA;
        }
        Objects.toString(obj);
        Objects.toString(obj2);
        return true;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
