package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahhq implements ahfu {
    public final Map a;
    public final Map b;

    public ahhq(Map map, Map map2, Map map3) {
        DesugarCollections.unmodifiableMap(new HashMap(map));
        this.a = DesugarCollections.unmodifiableMap(new HashMap(map2));
        this.b = DesugarCollections.unmodifiableMap(new HashMap(map3));
    }

    @Override // defpackage.ahfu
    public final Object a(Class cls) {
        throw null;
    }
}
