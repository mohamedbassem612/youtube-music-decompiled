package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahhr implements ahgc {
    private final Map a;
    private final Map b;

    public ahhr(Map map, Map map2, Map map3, Map map4) {
        this.a = DesugarCollections.unmodifiableMap(new HashMap(map));
        DesugarCollections.unmodifiableMap(new HashMap(map2));
        this.b = DesugarCollections.unmodifiableMap(new HashMap(map3));
        DesugarCollections.unmodifiableMap(new HashMap(map4));
    }

    @Override // defpackage.ahgc
    public final ahfv a(ahgb ahgbVar, ahgj ahgjVar) throws GeneralSecurityException {
        Map map = this.b;
        Object obj = ahgbVar.a;
        ahhs ahhsVar = (ahhs) map.get(obj);
        if (ahhsVar != null) {
            return ahhsVar.a(ahgbVar, ahgjVar);
        }
        throw new GeneralSecurityException(a.bT((String) obj, "No Key Parser for requested key type ", " available"));
    }

    @Override // defpackage.ahgc
    public final ahgb b(ahfv ahfvVar, ahgj ahgjVar) throws GeneralSecurityException {
        Map map = this.a;
        Class<?> cls = ahfvVar.getClass();
        ahht ahhtVar = (ahht) map.get(cls);
        if (ahhtVar != null) {
            return ahhtVar.a(ahfvVar, ahgjVar);
        }
        throw new GeneralSecurityException(enb.b(cls, "No Key serializer for ", " available"));
    }
}
