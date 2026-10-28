package defpackage;

import android.net.NetworkRequest;
import android.os.Build;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class foc {
    public boolean a;
    public int b;
    public final Object c;
    public Object d;

    public foc() {
        this.d = new efo(null);
        this.b = 1;
        this.c = new LinkedHashSet();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [fop, java.lang.Object] */
    final void a() {
        Object obj = this.d;
        if (obj == null || !c()) {
            return;
        }
        this.c.e(((amp) obj).a);
        this.d = null;
    }

    final boolean b() {
        int i = this.b;
        return i == 0 || i == 4 || i == 3;
    }

    public final boolean c() {
        return b() && !this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    public final dyn d() {
        Set setAw = atqq.aw(this.c);
        return new dyn((efo) this.d, this.b, this.a, false, false, false, -1L, -1L, setAw);
    }

    public final void e(NetworkRequest networkRequest, int i) {
        networkRequest.getClass();
        if (Build.VERSION.SDK_INT < 28) {
            this.b = i;
        } else {
            if (Build.VERSION.SDK_INT >= 31 && networkRequest.getNetworkSpecifier() != null) {
                throw new IllegalArgumentException("NetworkRequests with NetworkSpecifiers set aren't supported.");
            }
            this.d = new efo(networkRequest);
            this.b = 1;
        }
    }

    public final void f(int i) {
        this.b = i;
        this.d = new efo(null);
    }

    public foc(fop fopVar) {
        this.c = fopVar;
    }
}
