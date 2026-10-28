package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ujd {
    public final Map a = new HashMap();
    public final Map b;
    final Map c;
    final Map d;
    public ujc e;
    ListenableFuture f;
    public final ujb g;

    public ujd(ujb ujbVar) {
        for (ujc ujcVar : ujc.values()) {
            this.a.put(ujcVar, new ConcurrentHashMap());
        }
        this.b = new ConcurrentHashMap();
        this.g = ujbVar;
        this.d = new HashMap();
        this.c = new HashMap();
        this.e = ujc.UNKNOWN;
        this.f = null;
        for (ujc ujcVar2 : ujc.values()) {
            this.d.put(ujcVar2, Boolean.FALSE);
        }
        for (ujc ujcVar3 : ujc.values()) {
            this.c.put(Integer.valueOf(ujcVar3.f), 0);
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [awut, java.lang.Object] */
    public final ListenableFuture a() {
        ListenableFuture listenableFuture = this.f;
        if (listenableFuture != null) {
            return listenableFuture;
        }
        ArrayList arrayList = new ArrayList();
        ujb ujbVar = this.g;
        pvn pvnVar = new pvn(this.b, ujbVar, (awoq) null, 4, (byte[]) null);
        ?? r7 = ujbVar.c;
        arrayList.add(awrc.ac(awro.r(r7, awov.a, 1, pvnVar)));
        arrayList.add(ujbVar.a(this.c));
        for (ujc ujcVar : ujc.values()) {
            Map map = (Map) this.a.get(ujcVar);
            map.getClass();
            ujcVar.getClass();
            arrayList.add(awrc.ac(awro.r(r7, awov.a, 1, new qbq(map, ujbVar, ujcVar, (awoq) null, 3))));
        }
        ListenableFuture listenableFutureO = ahng.o(ahng.k(arrayList));
        this.f = listenableFutureO;
        return listenableFutureO;
    }

    public final boolean b() {
        Integer num = (Integer) this.c.get(Integer.valueOf(this.e.f));
        num.getClass();
        return num.intValue() == 0;
    }
}
