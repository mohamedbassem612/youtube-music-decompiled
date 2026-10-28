package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Looper;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gat {
    public Object a;
    public Object b;

    public gat(ConnectivityManager connectivityManager) {
        if (connectivityManager != null) {
            gas gasVar = new gas(this);
            this.b = gasVar;
            try {
                connectivityManager.registerDefaultNetworkCallback(gasVar);
            } catch (RuntimeException unused) {
                synchronized (gat.class) {
                    this.a = null;
                }
            }
        }
    }

    public static gat a(Context context) {
        if (context != null) {
            return new gat((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized fiq b(Object obj) {
        ?? r0 = this.b;
        if (r0 == 0 || !r0.containsKey(obj)) {
            return null;
        }
        return (fiq) this.b.get(obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized void c() {
        ?? r0 = this.b;
        if (r0 != 0) {
            r0.clear();
        }
        ?? r1 = this.a;
        if (r1 != 0) {
            r1.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final void d(fiq fiqVar) {
        synchronized (this) {
            if (this.b == null) {
                this.b = new HashMap();
            }
            if (this.a == null) {
                this.a = new HashMap();
            }
            this.b.put(fiqVar.d, fiqVar);
        }
    }

    public final /* bridge */ /* synthetic */ afoy e() {
        atqq.b(this.a, auor.class);
        atqq.b(this.b, aupf.class);
        return new gjy();
    }

    public final kmy f() {
        if (this.b == null) {
            this.b = new kro();
        }
        if (this.a == null) {
            this.a = Looper.getMainLooper();
        }
        return new kmy((kro) this.b, (Looper) this.a);
    }

    public gat() {
    }
}
