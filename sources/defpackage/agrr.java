package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class agrr {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    protected agrr() {
    }

    protected abstract Object a();

    public final Object b(agrp agrpVar, agta agtaVar) {
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj = concurrentHashMap.get(agrpVar);
        if (obj != null) {
            return obj;
        }
        Object objA = a();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(agrpVar, objA);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int i = ((agrk) agtaVar).b;
        agrq agrqVar = null;
        for (int i2 = 0; i2 < i; i2++) {
            if (agrj.f.equals(agtaVar.c(i2))) {
                Object objE = agtaVar.e(i2);
                if (objE instanceof agrv) {
                    if (agrqVar == null) {
                        agrqVar = new agrq(this, agrpVar, 0);
                    }
                    ((agrv) objE).a();
                }
            }
        }
        return objA;
    }
}
