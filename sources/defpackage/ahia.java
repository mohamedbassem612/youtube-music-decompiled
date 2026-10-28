package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahia implements ahgc {
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public ahia(acqf acqfVar) {
        this.a = new HashMap((Map) acqfVar.c);
        this.b = new HashMap((Map) acqfVar.d);
        this.c = new HashMap((Map) acqfVar.a);
        this.d = new HashMap((Map) acqfVar.b);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [ahgy, java.lang.Object] */
    @Override // defpackage.ahgc
    public final ahfv a(ahgb ahgbVar, ahgj ahgjVar) throws GeneralSecurityException {
        Map map = this.b;
        Object obj = ahgbVar.a;
        if (map.containsKey(obj)) {
            return ((ahha) map.get(obj)).b.a(ahgbVar, ahgjVar);
        }
        throw new GeneralSecurityException(a.bT((String) obj, "No Key Parser for requested key type ", " available"));
    }

    @Override // defpackage.ahgc
    public final ahgb b(ahfv ahfvVar, ahgj ahgjVar) {
        return c(ahfvVar, ahgjVar);
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [ahgz, java.lang.Object] */
    public final ahgb c(ahfv ahfvVar, ahgj ahgjVar) throws GeneralSecurityException {
        Map map = this.a;
        if (map.containsKey(ahfvVar.getClass())) {
            return ((ahha) map.get(ahfvVar.getClass())).b.a(ahfvVar, ahgjVar);
        }
        throw new GeneralSecurityException("No Key serializer for " + String.valueOf(ahfvVar.getClass()) + " available");
    }
}
