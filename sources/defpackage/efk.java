package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class efk implements dzp {
    public final Map a;
    public final Object b;
    private final awut c;
    private final awuq d;
    private final axfd e;

    /* JADX WARN: Type inference failed for: r0v0, types: [awut, java.lang.Object] */
    public efk(axfd axfdVar) {
        this.e = axfdVar;
        ?? r0 = axfdVar.c;
        r0.getClass();
        this.c = r0;
        Object obj = axfdVar.b;
        obj.getClass();
        this.d = (awuq) obj;
        this.a = new LinkedHashMap();
        this.b = new Object();
    }

    @Override // defpackage.dzp
    public final void a(Runnable runnable) {
        synchronized (this.b) {
            awwd awwdVar = (awwd) this.a.remove(runnable);
            if (awwdVar != null) {
                awwdVar.p(null);
            }
        }
    }

    @Override // defpackage.dzp
    public final void b(long j, Runnable runnable) {
        synchronized (this.b) {
            Map map = this.a;
            awwd awwdVar = (awwd) map.remove(runnable);
            if (awwdVar != null) {
                awwdVar.p(null);
            }
            map.put(runnable, awro.t(this.c, this.d, 0, new efj(j, runnable, this, null), 2));
        }
    }
}
