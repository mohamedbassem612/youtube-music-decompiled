package defpackage;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xht implements xhk {
    private final mbc a;
    private final tqj b;
    private final aunn c;
    private final long d;
    private final boolean e;
    private final ConcurrentHashMap f;
    private final ConcurrentLinkedDeque g;
    private final ConcurrentHashMap h;

    public xht(mbc mbcVar, tqj tqjVar, aunn aunnVar) {
        mbcVar.getClass();
        tqjVar.getClass();
        aunnVar.getClass();
        this.a = mbcVar;
        this.b = tqjVar;
        this.c = aunnVar;
        int i = tqr.a;
        int iA = tqjVar.a(1074943064);
        this.e = tqjVar.k(1073829793);
        this.d = TimeUnit.SECONDS.toMillis(iA);
        this.f = new ConcurrentHashMap();
        this.g = new ConcurrentLinkedDeque();
        this.h = new ConcurrentHashMap();
    }

    private final synchronized void e(xgt xgtVar) {
        long jB = this.a.b();
        String str = xgtVar.c;
        if (str == null || str.length() == 0) {
            str = xgtVar.a;
        } else {
            xhr xhrVar = (xhr) this.f.get(str);
            if (xhrVar != null) {
                str = xhrVar.b.c;
            }
        }
        String str2 = xgtVar.a;
        str2.getClass();
        str.getClass();
        xhs xhsVar = new xhs(str2, jB, str);
        xhr xhrVar2 = new xhr(xgtVar, xhsVar, false);
        ConcurrentHashMap concurrentHashMap = this.f;
        concurrentHashMap.put(str2, xhrVar2);
        ConcurrentLinkedDeque concurrentLinkedDeque = this.g;
        concurrentLinkedDeque.add(xhsVar);
        boolean z = this.e;
        ConcurrentHashMap concurrentHashMap2 = this.h;
        if (z) {
            xhs xhsVar2 = (xhs) concurrentHashMap2.get(xhsVar.c);
            if (xhsVar2 != null) {
                String str3 = xhsVar.a;
                String str4 = xhsVar2.a;
                if (!awrc.c(str4, str3)) {
                    ConcurrentMap.EL.computeIfPresent(concurrentHashMap, str4, new ito(new akm(4), 6));
                }
            }
        } else {
            xhs xhsVar3 = (xhs) concurrentHashMap2.get(xhsVar.c);
            if (xhsVar3 != null) {
                String str5 = xhsVar.a;
                String str6 = xhsVar3.a;
                if (!awrc.c(str6, str5)) {
                    ConcurrentMap.EL.computeIfPresent(concurrentHashMap, str6, new ito(new akm(5), 7));
                }
            }
        }
        ConcurrentHashMap concurrentHashMap3 = this.h;
        concurrentHashMap3.put(xhsVar.c, xhsVar);
        while (true) {
            xhs xhsVar4 = (xhs) concurrentLinkedDeque.peekFirst();
            if (xhsVar4 == null || jB - xhsVar4.b <= this.d) {
                break;
            }
            concurrentLinkedDeque.removeFirst();
            String str7 = xhsVar4.a;
            xhr xhrVar3 = (xhr) concurrentHashMap.get(str7);
            if (xhrVar3 != null && awrc.c(xhsVar4, xhrVar3.b)) {
                concurrentHashMap.remove(str7);
                String str8 = xhsVar4.c;
                if (awrc.c((xhs) concurrentHashMap3.get(str8), xhsVar4)) {
                    concurrentHashMap3.remove(str8);
                }
            }
        }
    }

    @Override // defpackage.xhk
    public final xgt a(String str) {
        str.getClass();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        xhr xhrVar = (xhr) this.f.get(str);
        xgt xgtVar = xhrVar != null ? xhrVar.a : null;
        if (xgtVar != null) {
            return xgtVar;
        }
        if (this.e) {
            return ((xhk) this.c.io()).a(str);
        }
        return null;
    }

    @Override // defpackage.xhk
    public final xgt b(String str) {
        xgt xgtVar;
        str.getClass();
        ConcurrentHashMap concurrentHashMap = this.f;
        xhr xhrVar = (xhr) concurrentHashMap.get(str);
        if (xhrVar != null) {
            xhs xhsVar = (xhs) this.h.get(xhrVar.b.c);
            if (xhsVar != null) {
                xhr xhrVar2 = (xhr) concurrentHashMap.get(xhsVar.a);
                return (xhrVar2 == null || (xgtVar = xhrVar2.a) == null) ? xhrVar.a : xgtVar;
            }
        } else if (this.e) {
            return ((xhk) this.c.io()).b(str);
        }
        return null;
    }

    @Override // defpackage.xhk
    public final synchronized void c(xgt xgtVar) {
        xgtVar.getClass();
        boolean z = this.e;
        if (z && !xgtVar.h()) {
            ((xhk) this.c.io()).c(xgtVar);
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.f;
        String str = xgtVar.a;
        xhr xhrVar = (xhr) concurrentHashMap.get(str);
        if ((xhrVar != null ? xhrVar.a : null) == null) {
            return;
        }
        if (z) {
            concurrentHashMap.put(str, xhr.a(xhrVar, true, 2));
            return;
        }
        ConcurrentHashMap concurrentHashMap2 = this.h;
        xhs xhsVar = xhrVar.b;
        concurrentHashMap.put(str, awrc.c((xhs) concurrentHashMap2.get(xhsVar.c), xhsVar) ? xhr.a(xhrVar, true, 3) : xhr.a(xhrVar, true, 2));
    }

    @Override // defpackage.xhk
    public final void d(xgt xgtVar) {
        if (!this.e || xgtVar.h()) {
            e(xgtVar);
        } else {
            ((xhk) this.c.io()).d(xgtVar);
        }
    }
}
