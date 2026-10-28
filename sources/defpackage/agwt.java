package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agwt extends agvu implements agwx {
    final agws a;
    long b;
    private final agwj c;

    public agwt(ahqj ahqjVar) {
        Map mapO;
        Object obj = ahqjVar.a;
        Integer num = 10;
        num.getClass();
        int iOrdinal = ((agwj) obj).a.ordinal();
        if (iOrdinal == 0) {
            mapO = aguu.o(10);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2) {
                if (iOrdinal == 3) {
                    throw new UnsupportedOperationException("This ordering does not define a comparator.");
                }
                throw new AssertionError();
            }
            mapO = new LinkedHashMap(aguu.k(10));
        }
        this.a = new agws(mapO);
        ahno.J(true, "Not true that %s is non-negative.", 0L);
        this.b = 0L;
        this.c = (agwj) ahqjVar.b;
    }

    @Override // defpackage.agvs
    protected final long a() {
        return this.b;
    }

    @Override // defpackage.agvu, defpackage.agvs, defpackage.agwu
    public final /* bridge */ /* synthetic */ Iterable b(Object obj) {
        throw null;
    }

    @Override // defpackage.agvv, defpackage.agwn
    public final Set e() {
        return new agwr(this.a);
    }

    @Override // defpackage.agvv
    public final Set f(Object obj) {
        return d(new agwc(g(obj)), obj);
    }

    public final agwh g(Object obj) {
        agwh agwhVar = (agwh) this.a.a(obj);
        if (agwhVar != null) {
            return agwhVar;
        }
        obj.getClass();
        throw new IllegalArgumentException(a.cs(obj, "Node ", " is not an element of this graph."));
    }

    public final agwh h(Object obj) {
        ArrayList arrayList;
        agwi agwiVar = this.c.a;
        int iOrdinal = agwiVar.ordinal();
        if (iOrdinal == 0) {
            arrayList = null;
        } else {
            if (iOrdinal != 1) {
                throw new AssertionError(agwiVar);
            }
            arrayList = new ArrayList();
        }
        agwh agwhVar = new agwh(new HashMap(4, 1.0f), arrayList);
        agws agwsVar = this.a;
        agwsVar.d();
        ahno.O(agwsVar.a.put(obj, agwhVar) == null);
        return agwhVar;
    }

    @Override // defpackage.agwx
    public final Object i(Object obj, Object obj2) {
        Object obj3;
        agwh agwhVar = (agwh) this.a.a(obj);
        if (agwhVar == null || (obj3 = agwhVar.b.get(obj2)) == agwh.a) {
            obj3 = null;
        } else if (obj3 instanceof agwg) {
            obj3 = ((agwg) obj3).a;
        }
        if (obj3 != null) {
            return obj3;
        }
        return null;
    }

    @Override // defpackage.agwx
    public final void j() {
    }
}
