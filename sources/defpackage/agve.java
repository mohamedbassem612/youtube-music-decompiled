package defpackage;

import j$.util.DesugarCollections;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agve extends agvd {
    public static final Map c;
    private final agsq d;

    static {
        EnumMap enumMap = new EnumMap(agsq.class);
        for (agsq agsqVar : agsq.values()) {
            agve[] agveVarArr = new agve[10];
            for (int i = 0; i < 10; i++) {
                agveVarArr[i] = new agve(i, agsqVar, agsr.a);
            }
            enumMap.put(agsqVar, agveVarArr);
        }
        c = DesugarCollections.unmodifiableMap(enumMap);
    }

    public agve(int i, agsq agsqVar, agsr agsrVar) {
        super(agsrVar, i);
        agsqVar.getClass();
        this.d = agsqVar;
        if (agsrVar.c()) {
            return;
        }
        int i2 = agsqVar.l;
        i2 = agsrVar.d() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        agsrVar.f(sb);
        sb.append((char) i2);
    }

    @Override // defpackage.agvd
    public final void a(agvh agvhVar, Object obj) {
        agvhVar.d(obj, this.d, this.b);
    }
}
