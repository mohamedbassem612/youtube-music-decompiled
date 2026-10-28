package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bpi {
    private final wmy a = new wmy();

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Collection] */
    public final void s(AutoCloseable autoCloseable) {
        wmy wmyVar = this.a;
        if (wmyVar != null) {
            if (wmyVar.a) {
                wmy.b(autoCloseable);
                return;
            }
            synchronized (wmyVar.b) {
                wmyVar.d.add(autoCloseable);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public final void t() {
        wmy wmyVar = this.a;
        if (wmyVar != null && !wmyVar.a) {
            wmyVar.a = true;
            synchronized (wmyVar.b) {
                Iterator it = wmyVar.c.values().iterator();
                while (it.hasNext()) {
                    wmy.b((AutoCloseable) it.next());
                }
                ?? r0 = wmyVar.d;
                Iterator it2 = r0.iterator();
                while (it2.hasNext()) {
                    wmy.b((AutoCloseable) it2.next());
                }
                r0.clear();
            }
        }
        d();
    }

    protected void d() {
    }
}
