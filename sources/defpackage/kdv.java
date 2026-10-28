package defpackage;

import android.content.Context;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kdv extends azs {
    public static final khn a = new khn("MRDiscoveryCallback", (String) null);
    private final hee f;
    public final Map c = DesugarCollections.synchronizedMap(new HashMap());
    public final LinkedHashSet d = new LinkedHashSet();
    private final Set e = DesugarCollections.synchronizedSet(new LinkedHashSet());
    public final kdu b = new kdu(this);

    public kdv(Context context) {
        this.f = new hee(context, null);
    }

    public final void H() {
        this.d.size();
        khn.e();
        String.valueOf(this.c.keySet());
        khn.e();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            I();
        } else {
            new afkg(Looper.getMainLooper(), (byte[]) null).post(new kcx(this, 4));
        }
    }

    public final void I() {
        hee heeVar = this.f;
        heeVar.e(this);
        LinkedHashSet<String> linkedHashSet = this.d;
        synchronized (linkedHashSet) {
            for (String str : linkedHashSet) {
                heg hegVar = new heg((char[]) null);
                hegVar.m(kro.x(str));
                did didVarK = hegVar.k();
                Map map = this.c;
                if (((kyr) map.get(str)) == null) {
                    map.put(str, new kyr(didVarK));
                }
                kro.x(str);
                khn.e();
                heeVar.f(didVarK, this);
            }
        }
        String.valueOf(this.c.keySet());
        khn.e();
    }

    public final void J() {
        this.f.e(this);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Collection] */
    public final void K(dii diiVar, boolean z) {
        boolean zAdd;
        khn khnVar = a;
        khn.e();
        Map map = this.c;
        synchronized (map) {
            String.valueOf(map.keySet());
            khn.e();
            zAdd = false;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                kyr kyrVar = (kyr) entry.getValue();
                if (diiVar.p((did) kyrVar.b)) {
                    if (z) {
                        khn.e();
                        zAdd = ((LinkedHashSet) kyrVar.a).add(diiVar);
                        if (!zAdd) {
                            khnVar.d("Route " + diiVar.toString() + " already exists for appId " + str, new Object[0]);
                        }
                    } else {
                        khn.e();
                        zAdd = ((LinkedHashSet) kyrVar.a).remove(diiVar);
                        if (!zAdd) {
                            khnVar.d("Route " + diiVar.toString() + " already removed from appId " + str, new Object[0]);
                        }
                    }
                }
            }
        }
        if (zAdd) {
            khn.e();
            synchronized (this.e) {
                HashMap map2 = new HashMap();
                Map map3 = this.c;
                synchronized (map3) {
                    try {
                        for (String str2 : map3.keySet()) {
                            kyr kyrVar2 = (kyr) map3.get(ahno.af(str2));
                            Set setN = kyrVar2 == null ? agpr.a : agkz.n(kyrVar2.a);
                            if (!setN.isEmpty()) {
                                map2.put(str2, setN);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                agkj.h(map2);
                Iterator it = this.e.iterator();
                while (it.hasNext()) {
                    ((kcp) it.next()).a();
                }
            }
        }
    }

    @Override // defpackage.azs
    public final void x(dii diiVar) {
        khn.e();
        K(diiVar, true);
    }

    @Override // defpackage.azs
    public final void y(dii diiVar) {
        khn.e();
        K(diiVar, true);
    }

    @Override // defpackage.azs
    public final void z(dii diiVar) {
        khn.e();
        K(diiVar, false);
    }
}
