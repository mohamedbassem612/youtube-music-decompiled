package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agwm extends agvt implements agwn {
    public final agwt a;

    public agwm(ahqj ahqjVar) {
        this.a = new agwt(ahqjVar);
    }

    @Override // defpackage.agvs
    protected final long a() {
        return new agvr(this.a).size();
    }

    @Override // defpackage.agvt, defpackage.agvs, defpackage.agwu
    public final /* bridge */ /* synthetic */ Iterable b(Object obj) {
        throw null;
    }

    @Override // defpackage.agvv, defpackage.agwn
    public final Set e() {
        return this.a.e();
    }

    @Override // defpackage.agvv
    public final Set f(Object obj) {
        return this.a.f(obj);
    }

    public final void g(Object obj) {
        obj.getClass();
        agwt agwtVar = this.a;
        if (agwtVar.a.e(obj)) {
            return;
        }
        agwtVar.h(obj);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a4  */
    public final void i(Object obj, Object obj2) {
        int i;
        boolean z;
        List list;
        agwo agwoVar = agwo.EDGE_EXISTS;
        obj.getClass();
        obj2.getClass();
        ahno.K(!obj.equals(obj2), "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", obj);
        agwt agwtVar = this.a;
        agws agwsVar = agwtVar.a;
        agwh agwhVarH = (agwh) agwsVar.a(obj);
        if (agwhVarH == null) {
            agwhVarH = agwtVar.h(obj);
        }
        Map map = agwhVarH.b;
        Object objPut = map.put(obj2, agwoVar);
        if (objPut == null) {
            objPut = null;
        } else if (objPut instanceof agwg) {
            map.put(obj2, new agwg(agwoVar));
            objPut = ((agwg) objPut).a;
        } else if (objPut == agwh.a) {
            map.put(obj2, new agwg(agwoVar));
            objPut = null;
        }
        if (objPut == null) {
            int i2 = agwhVarH.e + 1;
            agwhVarH.e = i2;
            ahno.I(i2 > 0, "Not true that %s is positive.", i2);
            List list2 = agwhVarH.c;
            if (list2 != null) {
                list2.add(new agwe(obj2));
            }
        }
        Object obj3 = objPut != null ? objPut : null;
        agwh agwhVarH2 = (agwh) agwsVar.a(obj2);
        if (agwhVarH2 == null) {
            agwhVarH2 = agwtVar.h(obj2);
        }
        Map map2 = agwhVarH2.b;
        Object obj4 = agwh.a;
        Object objPut2 = map2.put(obj, obj4);
        if (objPut2 == null) {
            i = agwhVarH2.d + 1;
            agwhVarH2.d = i;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            ahno.I(z, "Not true that %s is positive.", i);
            list = agwhVarH2.c;
            if (list != null) {
                list.add(new agwd(obj));
            }
        } else if (objPut2 instanceof agwg) {
            map2.put(obj, objPut2);
        } else if (objPut2 != obj4) {
            map2.put(obj, new agwg(objPut2));
            i = agwhVarH2.d + 1;
            agwhVarH2.d = i;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            ahno.I(z, "Not true that %s is positive.", i);
            list = agwhVarH2.c;
            if (list != null) {
                list.add(new agwd(obj));
            }
        }
        if (obj3 == null) {
            long j = agwtVar.b + 1;
            agwtVar.b = j;
            ahno.J(j > 0, "Not true that %s is positive.", j);
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    public final void j(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        agwt agwtVar = this.a;
        agws agwsVar = agwtVar.a;
        agwh agwhVar = (agwh) agwsVar.a(obj);
        agwh agwhVar2 = (agwh) agwsVar.a(obj2);
        if (agwhVar == null || agwhVar2 == null || agwhVar.a(obj2) == null) {
            return;
        }
        agwhVar2.b(obj);
        long j = agwtVar.b - 1;
        agwtVar.b = j;
        ahno.J(((j > 0L ? 1 : (j == 0L ? 0 : -1)) ^ (-1)) >>> 31, "Not true that %s is non-negative.", j);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    public final void k(Object obj) {
        obj.getClass();
        agwt agwtVar = this.a;
        agws agwsVar = agwtVar.a;
        agwh agwhVar = (agwh) agwsVar.a(obj);
        if (agwhVar != null) {
            agke agkeVarN = agke.n(new agwc(agwhVar));
            int size = agkeVarN.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = agkeVarN.get(i);
                agwh agwhVar2 = (agwh) agwsVar.c(obj2);
                agwhVar2.getClass();
                agwhVar2.b(obj);
                agwhVar.a(obj2).getClass();
                agwtVar.b--;
            }
            agke agkeVarN2 = agke.n(new agvz(agwhVar));
            int size2 = agkeVarN2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Object obj3 = agkeVarN2.get(i2);
                agwh agwhVar3 = (agwh) agwsVar.c(obj3);
                agwhVar3.getClass();
                ahno.O(agwhVar3.a(obj) != null);
                agwhVar.b(obj3);
                agwtVar.b--;
            }
            agwsVar.d();
            agwsVar.a.remove(obj);
            long j = agwtVar.b;
            ahno.J(((j > 0L ? 1 : (j == 0L ? 0 : -1)) ^ (-1)) >>> 31, "Not true that %s is non-negative.", j);
        }
    }

    @Override // defpackage.agwn
    public final void h() {
    }
}
