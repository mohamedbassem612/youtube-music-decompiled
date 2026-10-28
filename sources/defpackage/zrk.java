package defpackage;

import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class zrk implements zrj {
    private final SortedMap a = new TreeMap();
    private final boolean b;

    public zrk(boolean z) {
        this.b = z;
    }

    private final agxk c() {
        if (!this.b) {
            int i = agxm.b;
            return agxl.a.f();
        }
        int i2 = agxm.b;
        int i3 = agxw.a;
        return new agxv();
    }

    @Override // defpackage.zrj
    public final String a() {
        SortedMap sortedMap = this.a;
        agxk agxkVarC = c();
        Iterator it = sortedMap.values().iterator();
        while (it.hasNext()) {
            agxkVarC.h(((agxi) it.next()).e());
            agxkVarC.j("/");
        }
        return agxkVarC.o().toString();
    }

    @Override // defpackage.zrj
    public final void b(String str, String str2) {
        agxk agxkVarC = c();
        agxkVarC.j(str);
        agxkVarC.j(":");
        if (str2 == null) {
            str2 = "null";
        }
        agxkVarC.j(str2);
        this.a.put(str, agxkVarC.o());
    }
}
