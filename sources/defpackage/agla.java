package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agla extends agkn {
    public final aglc a() {
        Map map = this.a;
        if (map == null) {
            return agis.a;
        }
        agia<Map.Entry> agiaVar = new agia((agif) map);
        if (agiaVar.isEmpty()) {
            return agis.a;
        }
        agkh agkhVar = new agkh(agiaVar.size());
        int size = 0;
        for (Map.Entry entry : agiaVar) {
            Object key = entry.getKey();
            agkz agkzVarN = agkz.n(((agkx) entry.getValue()).g());
            if (!agkzVarN.isEmpty()) {
                agkhVar.e(key, agkzVarN);
                size += agkzVarN.size();
            }
        }
        return new aglc(agkhVar.d(true), size, null);
    }

    public final void b(Object obj, Object obj2) {
        super.g(obj, obj2);
    }

    public final void c(Object obj, Object... objArr) {
        super.h(obj, Arrays.asList(objArr));
    }

    @Override // defpackage.agkn
    public final agjv d(int i) {
        aguu.ag(i, "expectedSize");
        return new agkx(i);
    }

    @Override // defpackage.agkn
    public final int i(Iterable iterable) {
        if (iterable instanceof Set) {
            return Math.max(4, ((Set) iterable).size());
        }
        return 4;
    }
}
