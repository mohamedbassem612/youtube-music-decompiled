package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wnt {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    private Object e;

    public wnt(List list, List list2, airo airoVar, akrq akrqVar) {
        ArrayList arrayList = new ArrayList(list.size());
        this.c = arrayList;
        arrayList.addAll(list);
        ArrayList arrayList2 = new ArrayList(list2.size());
        this.d = arrayList2;
        arrayList2.addAll(list2);
        this.b = airoVar;
        this.e = akrqVar;
    }

    public final airo a() {
        Object obj;
        if (this.b == null && (obj = this.a) != null) {
            airj airjVar = (airj) obj;
            if ((airjVar.b & 1) != 0) {
                apji apjiVar = airjVar.e;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(airp.c);
                apjiVar.c(aihlVarCheckIsLite);
                if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                    apji apjiVar2 = ((airj) this.a).e;
                    if (apjiVar2 == null) {
                        apjiVar2 = apji.a;
                    }
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(airp.c);
                    apjiVar2.c(aihlVarCheckIsLite2);
                    Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                    this.b = (airo) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                }
            }
        }
        return (airo) this.b;
    }

    public final akrq b() {
        Object obj;
        if (this.e == null && (obj = this.a) != null) {
            airj airjVar = (airj) obj;
            if ((airjVar.b & 4) != 0) {
                akrq akrqVar = airjVar.f;
                if (akrqVar == null) {
                    akrqVar = akrq.a;
                }
                this.e = akrqVar;
            }
        }
        return (akrq) this.e;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public final List c() {
        if (this.c == null) {
            Object obj = this.a;
            if (obj != null) {
                this.c = new ArrayList(((airj) obj).c.size());
                for (airi airiVar : ((airj) this.a).c) {
                    int i = airiVar.b;
                    if (i == 63434476) {
                        this.c.add(new wns(i == 63434476 ? (airg) airiVar.c : airg.a));
                    }
                }
            } else {
                this.c = Collections.EMPTY_LIST;
            }
        }
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    public final List d() {
        if (this.d == null) {
            Object obj = this.a;
            if (obj == null || ((airj) obj).d.size() == 0) {
                this.d = Collections.EMPTY_LIST;
            } else {
                this.d = new ArrayList();
                for (airh airhVar : ((airj) this.a).d) {
                    int i = airhVar.b;
                    if (i == 93418219) {
                        this.d.add((aira) airhVar.c);
                    } else if (i == 2138) {
                        this.d.add((airn) airhVar.c);
                    }
                }
            }
        }
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection] */
    public final rmi e() {
        if (this.d != null || this.c != null) {
            ?? r1 = this.e;
            if (r1 == 0) {
                throw new IllegalStateException("Property \"inflight\" has not been set");
            }
            HashSet hashSet = new HashSet((Collection) r1);
            Object obj = this.d;
            if (obj != null) {
                hashSet.addAll(obj);
            }
            ?? r2 = this.c;
            if (r2 != 0) {
                hashSet.removeAll(r2);
            }
            f(hashSet);
        }
        if (this.a == null) {
            this.b = rmv.a;
        }
        Object obj2 = this.e;
        if (obj2 == null) {
            throw new IllegalStateException("Missing required properties: inflight");
        }
        return new rmi((agkz) obj2, (rlt) this.a, (rmv) this.b);
    }

    public final void f(Set set) {
        this.e = agkz.n(set);
    }

    public wnt(airj airjVar) {
        this.a = airjVar;
    }

    public wnt() {
        this.d = null;
        this.c = null;
    }

    public wnt(rmi rmiVar) {
        this();
        this.e = rmiVar.a;
        this.a = rmiVar.b;
        this.b = rmiVar.c;
    }
}
