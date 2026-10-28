package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xnx {
    static final /* synthetic */ awsj[] a = {new awrf(xnx.class, "dialDeviceFinder", "getDialDeviceFinder()Lcom/google/android/libraries/youtube/mdx/discovery/DialDeviceFinder;"), new awrf(xnx.class, "startupStateManager", "getStartupStateManager()Lcom/google/android/libraries/youtube/common/startup/StartupStateManager;")};
    public static final /* synthetic */ int h = 0;
    public final awut b;
    public final boolean c;
    public final Object d;
    public boolean e;
    public final Set f;
    public final awmi g;
    private final aunn i;
    private final awmd j;

    public xnx(aunn aunnVar, awmd awmdVar, tqj tqjVar, awut awutVar) {
        aunnVar.getClass();
        awmdVar.getClass();
        tqjVar.getClass();
        awutVar.getClass();
        this.b = awutVar;
        this.i = aunnVar;
        this.j = awmdVar;
        int i = tqr.a;
        boolean zK = tqjVar.k(1073830918);
        this.c = zK;
        this.d = new Object();
        this.e = !zK;
        this.f = new LinkedHashSet();
        if (!zK) {
            b();
        }
        this.g = new awmp(new ebk(this, 20));
    }

    public final tre a() {
        a[1].getClass();
        return (tre) this.j.io();
    }

    public final xnv b() {
        a[0].getClass();
        return (xnv) this.i.io();
    }

    public final void c(xnw xnwVar) {
        b().c(xnwVar.a, true);
    }

    public final void d() {
        synchronized (this.d) {
            if (!this.e) {
                this.e = true;
                Set set = this.f;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    c((xnw) it.next());
                }
                set.clear();
            }
        }
    }
}
