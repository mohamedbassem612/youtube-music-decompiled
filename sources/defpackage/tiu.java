package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tiu implements tjj {
    private final tic a;
    private final Map b = new LinkedHashMap();

    public tiu(tic ticVar) {
        this.a = ticVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [awuz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [awuz, java.lang.Object] */
    @Override // defpackage.tjj
    public final Object a(String str, tns tnsVar, Function0 function0, awoq awoqVar) {
        boolean z;
        tji tjiVar;
        tid tidVarA = this.a.a(str, tnsVar);
        synchronized (this) {
            Map map = this.b;
            Object tldVar = map.get(tidVarA);
            if (tldVar == null) {
                tldVar = new tld(tnsVar, (awuz) function0.invoke(), new ArrayList());
                map.put(tidVarA, tldVar);
                z = false;
            } else {
                z = true;
            }
            tld tldVar2 = (tld) tldVar;
            if (z) {
                tldVar2.a.add(tnsVar);
            }
            tjiVar = new tji(tldVar2.b, z);
        }
        return tjiVar;
    }

    @Override // defpackage.tjj
    public final Object b(String str, tns tnsVar, awoq awoqVar) {
        tid tidVarA = this.a.a(str, tnsVar);
        synchronized (this) {
        }
        return awmy.a;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.tjj
    public final List c(String str, tns tnsVar) {
        List listAp;
        tid tidVarA = this.a.a(str, tnsVar);
        synchronized (this) {
            tld tldVar = (tld) this.b.get(tidVarA);
            listAp = tldVar == null ? awno.a : atqq.ap(tldVar.a);
        }
        return listAp;
    }
}
