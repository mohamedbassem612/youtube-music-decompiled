package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hir {
    public final Object a = new Object();
    public final Object b = new Object();
    public final Object c = new Object();
    public final Object d = new Object();
    public final Map e = new HashMap();
    public final Map f = new HashMap();
    public final Set g = new HashSet();
    public final Set h = new HashSet();
    public final Map i = new HashMap();
    private final hip j;
    private final aunn k;
    private final aunn l;
    private final Handler m;
    private final aunn n;

    public hir(hip hipVar, aunn aunnVar, aunn aunnVar2, Handler handler, aunn aunnVar3) {
        this.j = hipVar;
        this.k = aunnVar;
        this.l = aunnVar2;
        this.m = handler;
        this.n = aunnVar3;
    }

    public static boolean d(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [aunn, java.lang.Object] */
    public final hiq a(zne zneVar) {
        hiq hioVar;
        zne zneVar2;
        hiq hiqVar;
        synchronized (this.a) {
            Map map = this.e;
            if (map.containsKey(zneVar) && (hiqVar = (hiq) map.get(zneVar)) != null) {
                return hiqVar;
            }
            if (((vxz) this.n.io()).l(21, 45791927L, false)) {
                hip hipVar = (hip) this.k.io();
                Context context = (Context) hipVar.b.io();
                context.getClass();
                mbc mbcVar = (mbc) hipVar.a.io();
                mbcVar.getClass();
                ?? Io = hipVar.h.io();
                Io.getClass();
                ?? Io2 = hipVar.d.io();
                Io2.getClass();
                ?? Io3 = hipVar.f.io();
                Io3.getClass();
                ?? Io4 = hipVar.c.io();
                Io4.getClass();
                ?? Io5 = hipVar.e.io();
                Io5.getClass();
                hipVar.g.io().getClass();
                zneVar.getClass();
                zneVar2 = zneVar;
                hioVar = new hif(context, mbcVar, Io, Io2, Io3, Io4, Io5, zneVar2);
            } else {
                hip hipVar2 = this.j;
                Context context2 = (Context) hipVar2.a.io();
                context2.getClass();
                ?? Io6 = hipVar2.b.io();
                Io6.getClass();
                ?? Io7 = hipVar2.c.io();
                Io7.getClass();
                ?? Io8 = hipVar2.d.io();
                Io8.getClass();
                ?? Io9 = hipVar2.e.io();
                Io9.getClass();
                ?? Io10 = hipVar2.f.io();
                Io10.getClass();
                ?? Io11 = hipVar2.g.io();
                Io11.getClass();
                ?? Io12 = hipVar2.h.io();
                Io12.getClass();
                zneVar.getClass();
                hioVar = new hio(context2, Io6, Io7, Io8, Io9, Io10, Io11, Io12, zneVar);
                zneVar2 = zneVar;
            }
            map.put(zneVar2, hioVar);
            return hioVar;
        }
    }

    public final boolean b(zne zneVar) {
        boolean zContainsKey;
        synchronized (this.a) {
            zContainsKey = this.e.containsKey(zneVar);
        }
        return zContainsKey;
    }

    final boolean c(zne zneVar) {
        boolean z;
        synchronized (this.a) {
            Map map = this.e;
            hiq hiqVar = (hiq) map.get(zneVar);
            z = true;
            if (!this.f.containsKey(zneVar) && (!map.containsKey(zneVar) || hiqVar == null || !hiqVar.q(zneVar.a()))) {
                z = false;
            }
        }
        return z;
    }

    final boolean e(hjn hjnVar) {
        HashSet hashSet = new HashSet();
        Object obj = this.a;
        zne zneVar = hjnVar.i;
        synchronized (obj) {
            Map map = this.f;
            if (map.containsKey(zneVar)) {
                hjnVar.c(agpi.a, null);
                amzq amzqVar = (amzq) map.get(zneVar);
                if (amzqVar != null) {
                    amzp amzpVarA = amzp.a(amzqVar.c);
                    if (amzpVarA == null) {
                        amzpVarA = amzp.MEDIA_BROWSER_ERROR_CODE_UNKNOWN;
                    }
                    int i = amzpVarA.ordinal() == 1 ? 4 : 0;
                    hef hefVar = (hef) this.l.io();
                    String str = amzqVar.b;
                    boolean zIsEmpty = TextUtils.isEmpty(str);
                    Handler handler = this.m;
                    if (zIsEmpty) {
                        handler.post(new awu(hefVar, i, 7));
                    } else {
                        handler.post(new qd(hefVar, i, str, 7, (byte[]) null));
                    }
                }
            } else {
                hiq hiqVarA = a(zneVar);
                zne zneVar2 = gzl.g;
                Map map2 = this.e;
                hiq hiqVar = (hiq) map2.get(zneVar2);
                znf znfVar = hjnVar.j;
                if (hiqVar == null || !hiqVar.q(znfVar)) {
                    hashSet.add(zneVar2);
                    zne zneVar3 = gzl.f;
                    hiq hiqVar2 = (hiq) map2.get(zneVar3);
                    if (hiqVar2 == null || !hiqVar2.q(znfVar)) {
                        hashSet.add(zneVar3);
                        if (!hiqVarA.q(znfVar)) {
                            hiqVarA.d(hjnVar);
                            hashSet.add(zneVar);
                            for (zne zneVar4 : map2.keySet()) {
                                hiq hiqVar3 = (hiq) map2.get(zneVar4);
                                if (hiqVar3 != null && !hashSet.contains(zneVar4)) {
                                    if (hiqVar3.q(znfVar)) {
                                        hiqVar3.o(hjnVar);
                                    } else {
                                        hashSet.add(zneVar4);
                                    }
                                }
                            }
                            return false;
                        }
                        hiqVarA.o(hjnVar);
                    } else {
                        hiqVar2.o(hjnVar);
                        hiqVarA.i(hjnVar.a(), znfVar);
                    }
                } else {
                    hiqVar.o(hjnVar);
                    hiqVarA.i(hjnVar.a(), znfVar);
                }
            }
            return true;
        }
    }
}
