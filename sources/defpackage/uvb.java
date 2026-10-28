package defpackage;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uvb extends uux {
    private final long a;

    /* JADX WARN: Illegal instructions before constructor call */
    public uvb(long j) {
        aihl aihlVar = auge.b;
        aihlVar.getClass();
        super(aihlVar);
        this.a = j;
    }

    @Override // defpackage.uux
    public final /* synthetic */ Object a(Object obj) {
        LinkedHashMap linkedHashMap;
        Map mapUnmodifiableMap;
        auge augeVar = (auge) obj;
        if (augeVar == null || (mapUnmodifiableMap = DesugarCollections.unmodifiableMap(augeVar.c)) == null) {
            linkedHashMap = null;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
                Long l = (Long) entry.getKey();
                long j = this.a;
                if (l == null || l.longValue() != j) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(atqq.u(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                Object key = entry2.getKey();
                augd augdVar = (augd) entry2.getValue();
                augdVar.getClass();
                aihf builder = augdVar.toBuilder();
                builder.getClass();
                aiko aikoVarK = atqn.k(builder);
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry3 : aikoVarK.a()) {
                    if (((Number) entry3.getKey()).longValue() != this.a) {
                        linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                    }
                }
                atqn.k(builder);
                builder.copyOnWrite();
                ((augd) builder.instance).a().clear();
                atqn.k(builder);
                builder.copyOnWrite();
                ((augd) builder.instance).a().putAll(linkedHashMap4);
                linkedHashMap3.put(key, atqn.l(builder));
            }
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                if (((augd) entry4.getValue()).b.size() > 0) {
                    linkedHashMap.put(entry4.getKey(), entry4.getValue());
                }
            }
        }
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            return null;
        }
        aihf builder2 = augeVar.toBuilder();
        builder2.getClass();
        atqn.m(builder2);
        builder2.copyOnWrite();
        ((auge) builder2.instance).a().clear();
        atqn.m(builder2);
        builder2.copyOnWrite();
        ((auge) builder2.instance).a().putAll(linkedHashMap);
        return atqn.n(builder2);
    }
}
