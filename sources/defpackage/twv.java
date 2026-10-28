package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class twv implements agfr, awmd {
    static final Object n = new Object();
    volatile Object o = n;

    static {
        new HashMap();
    }

    protected abstract Object b();

    public final boolean c() {
        return this.o != n;
    }

    @Override // defpackage.agfr
    public final Object io() {
        Object objB = this.o;
        Object obj = n;
        if (objB == obj) {
            synchronized (this) {
                objB = this.o;
                if (objB == obj) {
                    objB = b();
                    this.o = objB;
                }
            }
        }
        return objB;
    }
}
