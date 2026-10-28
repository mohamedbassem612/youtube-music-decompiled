package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hzy implements aaqk {
    private final aaqj a;
    private final Map b = new HashMap();

    public hzy(aaqj aaqjVar) {
        this.a = aaqjVar;
    }

    @Override // defpackage.aaqk
    public final synchronized aamh a(abnl abnlVar) {
        aaqk aaqkVarA;
        Map map = this.b;
        String strU = abnlVar.u();
        aaqkVarA = (aaqk) map.get(strU);
        if (aaqkVarA == null) {
            aaqkVarA = this.a.a(strU, abnlVar.w());
            map.put(strU, aaqkVarA);
        }
        return aaqkVarA.a(abnlVar);
    }

    @Override // defpackage.aaqk
    public final synchronized List b(abnl abnlVar) {
        aaqk aaqkVarA;
        String strU = abnlVar != null ? abnlVar.u() : "";
        Map map = this.b;
        aaqkVarA = (aaqk) map.get(strU);
        if (aaqkVarA == null) {
            aaqkVarA = this.a.a(strU, abnlVar != null ? abnlVar.w() : "");
            map.put(strU, aaqkVarA);
        }
        return aaqkVarA.b(abnlVar);
    }
}
