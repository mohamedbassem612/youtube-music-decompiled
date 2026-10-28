package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Collectors;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gpw extends wkc {
    public final Map a;

    public gpw(tmo tmoVar) {
        super(tmoVar);
        this.a = new ConcurrentHashMap();
    }

    @Override // defpackage.wkc
    protected final String a(wlu wluVar) {
        return wluVar instanceof woo ? gzj.a((woo) wluVar) : "";
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, twi] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.wkc, defpackage.wmt
    public final void b(Collection collection) {
        super.b(collection);
        for (kyr kyrVar : this.a.values()) {
            Collection collection2 = (Collection) j$.util.Collection.EL.stream(kyrVar.a).filter(new gnh(collection, 2)).collect(Collectors.toCollection(new hcd(1)));
            if (!collection2.isEmpty()) {
                kyrVar.b.a(collection2);
            }
        }
    }
}
