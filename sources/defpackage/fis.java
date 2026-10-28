package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fis implements fvu {
    public final Map a = new HashMap();
    private final Executor b;

    public fis(Executor executor) {
        this.b = executor;
    }

    @Override // defpackage.fvu
    public final void a(Runnable runnable) {
        Map map = this.a;
        synchronized (map) {
            map.remove(runnable);
        }
    }

    @Override // defpackage.fvu
    public final void c(Runnable runnable) {
        Map map = this.a;
        synchronized (map) {
            Integer num = (Integer) map.get(runnable);
            map.put(runnable, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
        this.b.execute(new dhr(this, runnable, 16, (int[]) null));
    }

    @Override // defpackage.fvu
    public final void b() {
    }
}
