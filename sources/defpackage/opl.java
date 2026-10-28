package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class opl implements AutoCloseable {
    public final AtomicReference a;

    private opl(zh zhVar) {
        synchronized (zhVar) {
            if (zhVar.b == null) {
                this.a = new AtomicReference(null);
            } else {
                zhVar.a++;
                this.a = new AtomicReference(zhVar);
            }
        }
    }

    public static opl a(AutoCloseable autoCloseable) {
        return new opl(new zh(autoCloseable));
    }

    public final opl b() {
        zh zhVar = (zh) this.a.get();
        return zhVar == null ? new opl() : new opl(zhVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.AutoCloseable, java.lang.Object] */
    public final AutoCloseable c() {
        ?? r0;
        zh zhVar = (zh) this.a.get();
        if (zhVar == null) {
            throw new opk("Attempting to obtain reference to a disposed value.");
        }
        synchronized (zhVar) {
            r0 = zhVar.b;
            if (r0 == 0) {
                throw new opk("Attempting to obtain reference to a disposed value. The interior value was null, suggesting a race condtion insde of SharedCloseable.");
            }
        }
        return r0;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.AutoCloseable, java.lang.Object] */
    @Override // java.lang.AutoCloseable
    public final void close() {
        zh zhVar = (zh) this.a.getAndSet(null);
        if (zhVar != null) {
            synchronized (zhVar) {
                ?? r1 = zhVar.b;
                if (r1 == 0) {
                    return;
                }
                int i = zhVar.a - 1;
                zhVar.a = i;
                if (i == 0) {
                    zhVar.b = null;
                    r1.close();
                }
            }
        }
    }

    public final boolean d() {
        return this.a.get() == null;
    }

    private opl() {
        this.a = new AtomicReference(null);
    }
}
