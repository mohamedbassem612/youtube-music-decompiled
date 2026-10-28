package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class dhk extends dhn {
    private final Object a = new Object();
    Executor k;
    dhj l;
    dhg m;
    Collection n;

    public abstract void a(String str);

    public abstract void c(String str);

    public abstract void e(List list);

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void r(dhg dhgVar, Collection collection) {
        if (dhgVar == null) {
            throw new NullPointerException("groupRoute must not be null");
        }
        synchronized (this.a) {
            Executor executor = this.k;
            if (executor != null) {
                executor.execute(new aew(this, this.l, dhgVar, collection, 7));
            } else {
                this.m = dhgVar;
                this.n = new ArrayList(collection);
            }
        }
    }

    final void s(Executor executor, dhj dhjVar) {
        synchronized (this.a) {
            try {
                if (executor == null) {
                    throw new NullPointerException("Executor shouldn't be null");
                }
                if (dhjVar == null) {
                    throw new NullPointerException("Listener shouldn't be null");
                }
                this.k = executor;
                this.l = dhjVar;
                Collection collection = this.n;
                if (collection != null && !collection.isEmpty()) {
                    dhg dhgVar = this.m;
                    Collection collection2 = this.n;
                    this.m = null;
                    this.n = null;
                    this.k.execute(new aew(this, dhjVar, dhgVar, collection2, 8));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
