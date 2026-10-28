package defpackage;

import java.util.EnumMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lgc {
    public final EnumMap a;

    public lgc(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(lgg.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    public final void a(lgg lggVar, int i) {
        lgb lgbVar = lgb.UNSET;
        if (i == -30) {
            lgbVar = lgb.TCF;
        } else if (i == -20) {
            lgbVar = lgb.API;
        } else if (i == -10) {
            lgbVar = lgb.MANIFEST;
        } else if (i == 0) {
            lgbVar = lgb.API;
        } else if (i == 30) {
            lgbVar = lgb.INITIALIZATION;
        }
        this.a.put(lggVar, lgbVar);
    }

    public final void b(lgg lggVar, lgb lgbVar) {
        this.a.put(lggVar, lgbVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("1");
        for (lgg lggVar : lgg.values()) {
            lgb lgbVar = (lgb) this.a.get(lggVar);
            if (lgbVar == null) {
                lgbVar = lgb.UNSET;
            }
            sb.append(lgbVar.k);
        }
        return sb.toString();
    }

    public lgc() {
        this.a = new EnumMap(lgg.class);
    }
}
