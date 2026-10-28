package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eas implements ear {
    public final Map a = new LinkedHashMap();

    @Override // defpackage.ear
    public final boolean a(eek eekVar) {
        throw null;
    }

    @Override // defpackage.ear
    public final dov b(eek eekVar) {
        return (dov) this.a.remove(eekVar);
    }

    @Override // defpackage.ear
    public final dov c(eek eekVar) {
        Map map = this.a;
        Object dovVar = map.get(eekVar);
        if (dovVar == null) {
            dovVar = new dov(eekVar);
            map.put(eekVar, dovVar);
        }
        return (dov) dovVar;
    }
}
