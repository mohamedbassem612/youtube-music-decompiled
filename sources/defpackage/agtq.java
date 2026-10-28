package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agtq extends agtr {
    private final Map a;

    public agtq(agta agtaVar, agta agtaVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e(linkedHashMap, agtaVar);
        e(linkedHashMap, agtaVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((agrx) entry.getKey()).b) {
                entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.a = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    private static void e(Map map, agta agtaVar) {
        for (int i = 0; i < agtaVar.b(); i++) {
            agrx agrxVarC = agtaVar.c(i);
            Object obj = map.get(agrxVarC);
            if (agrxVarC.b) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(agrxVarC, arrayList);
                }
                arrayList.add(agrxVarC.c(agtaVar.e(i)));
            } else {
                map.put(agrxVarC, agrxVarC.c(agtaVar.e(i)));
            }
        }
    }

    @Override // defpackage.agtr
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.agtr
    public final Object b(agrx agrxVar) {
        aguu.f(!agrxVar.b, "key must be single valued");
        Object obj = this.a.get(agrxVar);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.agtr
    public final Set c() {
        return this.a.keySet();
    }

    @Override // defpackage.agtr
    public final void d(agth agthVar, Object obj) {
        for (Map.Entry entry : this.a.entrySet()) {
            agrx agrxVar = (agrx) entry.getKey();
            Object value = entry.getValue();
            if (agrxVar.b) {
                agthVar.b(agrxVar, ((List) value).iterator(), obj);
            } else {
                agthVar.a(agrxVar, value, obj);
            }
        }
    }
}
