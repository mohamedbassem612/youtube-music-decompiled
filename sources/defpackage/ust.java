package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ust {
    public final auhs a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final Map f;

    public ust(auhs auhsVar, Map map, Map map2) {
        this.a = auhsVar;
        this.b = map;
        this.c = map2;
        aiie aiieVar = auhsVar.d;
        aiieVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(awro.f(atqq.u(atqq.N(aiieVar, 10)), 16));
        for (Object obj : aiieVar) {
            linkedHashMap.put(Long.valueOf(((augy) obj).e), obj);
        }
        this.d = linkedHashMap;
        aiie aiieVar2 = this.a.e;
        aiieVar2.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(awro.f(atqq.u(atqq.N(aiieVar2, 10)), 16));
        for (Object obj2 : aiieVar2) {
            linkedHashMap2.put(Long.valueOf(((aufa) obj2).e), obj2);
        }
        this.e = linkedHashMap2;
        aiie aiieVar3 = this.a.n;
        aiieVar3.getClass();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(awro.f(atqq.u(atqq.N(aiieVar3, 10)), 16));
        for (Object obj3 : aiieVar3) {
            String str = ((akcw) obj3).e;
            str.getClass();
            linkedHashMap3.put(str, obj3);
        }
        this.f = linkedHashMap3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ust) {
            ust ustVar = (ust) obj;
            if (awrc.c(this.a, ustVar.a) && awrc.c(this.b, ustVar.b) && awrc.c(this.c, ustVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "CompositionContext(composition=" + this.a + ", segmentDecorations=" + this.b + ", videoIdAssetSources=" + this.c + ')';
    }
}
