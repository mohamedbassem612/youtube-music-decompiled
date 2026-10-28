package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class agkn {
    Map a;

    public agjv d(int i) {
        aguu.ag(i, "expectedSize");
        return new agjz(i);
    }

    public final agkp e() {
        Map map = this.a;
        if (map == null) {
            return agir.a;
        }
        agia<Map.Entry> agiaVar = new agia((agif) map);
        if (agiaVar.isEmpty()) {
            return agir.a;
        }
        agkh agkhVar = new agkh(agiaVar.size());
        int i = 0;
        for (Map.Entry entry : agiaVar) {
            Object key = entry.getKey();
            agke agkeVarG = ((agjz) entry.getValue()).g();
            agkhVar.e(key, agkeVarG);
            i += ((agpi) agkeVarG).d;
        }
        return new agkg(agkhVar.d(true), i);
    }

    final Map f() {
        Map map = this.a;
        if (map != null) {
            return map;
        }
        agif agifVar = new agif();
        this.a = agifVar;
        return agifVar;
    }

    public final void g(Object obj, Object obj2) {
        aguu.af(obj, obj2);
        agjv agjvVarD = (agjv) f().get(obj);
        if (agjvVarD == null) {
            agjvVarD = d(4);
            f().put(obj, agjvVarD);
        }
        agjvVarD.c(obj2);
    }

    public final void h(Object obj, Iterable iterable) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(aguu.N(iterable)));
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            agjv agjvVarD = (agjv) f().get(obj);
            if (agjvVarD == null) {
                agjvVarD = d(i(iterable));
                f().put(obj, agjvVarD);
            }
            while (it.hasNext()) {
                Object next = it.next();
                aguu.af(obj, next);
                agjvVarD.c(next);
            }
        }
    }

    public int i(Iterable iterable) {
        if (iterable instanceof Collection) {
            return Math.max(4, ((Collection) iterable).size());
        }
        return 4;
    }
}
