package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awie implements avos {
    private final AtomicReference a = new AtomicReference();
    private final AtomicReference b = new AtomicReference();

    public awie() {
        awid awidVar = new awid();
        e(awidVar);
        d(awidVar);
    }

    final awid a() {
        return (awid) this.a.get();
    }

    @Override // defpackage.avot
    public final void c() {
        while (km() != null && !i()) {
        }
    }

    final awid d(awid awidVar) {
        return (awid) this.a.getAndSet(awidVar);
    }

    final void e(awid awidVar) {
        this.b.lazySet(awidVar);
    }

    @Override // defpackage.avot
    public final boolean i() {
        return ((awid) this.b.get()) == a();
    }

    @Override // defpackage.avot
    public final boolean j(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        awid awidVar = new awid(obj);
        d(awidVar).lazySet(awidVar);
        return true;
    }

    @Override // defpackage.avos, defpackage.avot
    public final Object km() {
        awid awidVarA;
        awid awidVar = (awid) this.b.get();
        awid awidVarA2 = awidVar.a();
        if (awidVarA2 != null) {
            Object objB = awidVarA2.b();
            e(awidVarA2);
            return objB;
        }
        if (awidVar == a()) {
            return null;
        }
        do {
            awidVarA = awidVar.a();
        } while (awidVarA == null);
        Object objB2 = awidVarA.b();
        e(awidVarA);
        return objB2;
    }
}
