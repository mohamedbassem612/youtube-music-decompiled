package defpackage;

import j$.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ajm extends ajc implements Map, java.util.Map, awrp {
    public static final ajm b = new ajm(ajg.a);

    @Override // defpackage.ajc, defpackage.awng, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof ahm) {
            super.containsKey((ahm) obj);
        }
        return false;
    }

    @Override // defpackage.awng, java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj instanceof aiv) {
            return super.containsValue((aiv) obj);
        }
        return false;
    }

    public final Object d(ahm ahmVar) {
        return ahs.g(this, ahmVar);
    }

    @Override // defpackage.ajc, defpackage.awng, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof ahm) {
            super.get((ahm) obj);
        }
        return null;
    }

    @Override // defpackage.awng, java.util.Map, j$.util.Map, java.util.HashMap
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return obj instanceof ahm ? (aiv) Map.CC.$default$getOrDefault(this, (ahm) obj, (aiv) obj2) : obj2;
    }
}
