package defpackage;

import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ruk {
    public final Object a;
    public Object b;

    public ruk() {
        this.b = null;
        this.a = new ConcurrentHashMap();
    }

    private static final void g(vxe vxeVar, ajwo ajwoVar, Map map) {
        if (vxeVar == null) {
            rmp.n(null, "Unable to resolve endpoint because commandRouter inaccessible");
        } else {
            vxeVar.c(ajwoVar, map);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, vxe] */
    public final void a(ajwo ajwoVar, Map map) {
        g(this.a, ajwoVar, map);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, vxe] */
    public final void b(ajwo ajwoVar, Map map) {
        g(this.b, ajwoVar, map);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, vxe] */
    public final void c(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                g(this.b, (ajwo) it.next(), null);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final boolean d(Collection collection) {
        boolean z;
        if (collection == null || collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            omj omjVar = (omj) this.a.get((String) it.next());
            if (omjVar != null) {
                Object obj = omjVar.a;
                qmi qmiVar = (qmi) obj;
                if (qmiVar.f) {
                    web webVar = qmiVar.h;
                    if (webVar != null && (webVar.a || webVar.g() || qmiVar.g.d())) {
                        synchronized (obj) {
                            web webVar2 = ((qmi) obj).h;
                            if (webVar2 != null && (webVar2.a || webVar2.g() || ((qmi) obj).g.d())) {
                                ((qmi) obj).h = null;
                                ((qmi) obj).j.X();
                            }
                        }
                    }
                    z = false;
                } else {
                    z = true;
                }
                z2 |= z;
            }
        }
        return z2;
    }

    public final synchronized void e(qkh qkhVar) {
        if (this.b == null) {
            this.b = mef.e(qkhVar.c, new qca(this, 11), qkhVar.b());
        }
    }

    public final zdj f(int i, ofe ofeVar) {
        Object obj = this.b;
        if (obj != null) {
            return new zdj(i, (oml) this.a, (View) obj, ofeVar);
        }
        if (ofeVar.b) {
            return new zdj(i, ofeVar);
        }
        return null;
    }

    public ruk(vxe vxeVar) {
        this.a = vxeVar;
        this.b = null;
    }

    public ruk(oml omlVar) {
        this.a = omlVar;
    }
}
