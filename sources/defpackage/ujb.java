package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ujb {
    public volatile boolean a;
    public final Object b;
    public final Object c;

    public ujb() {
        this.b = new Object();
        this.c = new afv();
        this.a = false;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [awut, java.lang.Object] */
    public final ListenableFuture a(Map map) {
        return awrc.ac(awro.r(this.c, awov.a, 1, new pvn(map, this, (awoq) null, 3)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [bec, java.lang.Object] */
    public final Object b(ujc ujcVar, awoq awoqVar) throws Throwable {
        uix uixVar;
        if (awoqVar instanceof uix) {
            uixVar = (uix) awoqVar;
            int i = uixVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uixVar.c = i - Integer.MIN_VALUE;
            } else {
                uixVar = new uix(this, awoqVar);
            }
        } else {
            uixVar = new uix(this, awoqVar);
        }
        Object objO = uixVar.a;
        awox awoxVar = awox.a;
        int i2 = uixVar.c;
        if (i2 == 0) {
            atqp.j(objO);
            awzc awzcVarB = this.b.b();
            uixVar.d = ujcVar;
            uixVar.c = 1;
            objO = awqx.o(awzcVarB, uixVar);
            if (objO == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ujcVar = uixVar.d;
            atqp.j(objO);
        }
        uje ujeVar = (uje) objO;
        int iOrdinal = ujcVar.ordinal();
        if (iOrdinal == 1) {
            Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(ujeVar.d);
            mapUnmodifiableMap.getClass();
            return mapUnmodifiableMap;
        }
        if (iOrdinal == 2) {
            Map mapUnmodifiableMap2 = DesugarCollections.unmodifiableMap(ujeVar.e);
            mapUnmodifiableMap2.getClass();
            return mapUnmodifiableMap2;
        }
        if (iOrdinal == 3) {
            Map mapUnmodifiableMap3 = DesugarCollections.unmodifiableMap(ujeVar.f);
            mapUnmodifiableMap3.getClass();
            return mapUnmodifiableMap3;
        }
        if (iOrdinal != 4) {
            return awnp.a;
        }
        Map mapUnmodifiableMap4 = DesugarCollections.unmodifiableMap(ujeVar.g);
        mapUnmodifiableMap4.getClass();
        return mapUnmodifiableMap4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [bec, java.lang.Object] */
    public final Object c(awoq awoqVar) {
        uiy uiyVar;
        if (awoqVar instanceof uiy) {
            uiyVar = (uiy) awoqVar;
            int i = uiyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uiyVar.c = i - Integer.MIN_VALUE;
            } else {
                uiyVar = new uiy(this, awoqVar);
            }
        } else {
            uiyVar = new uiy(this, awoqVar);
        }
        Object objO = uiyVar.a;
        awox awoxVar = awox.a;
        int i2 = uiyVar.c;
        if (i2 == 0) {
            atqp.j(objO);
            awzc awzcVarB = this.b.b();
            uiyVar.c = 1;
            objO = awqx.o(awzcVarB, uiyVar);
            if (objO == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objO);
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((uje) objO).c);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [bec, java.lang.Object] */
    public final Object d(awoq awoqVar) {
        uiz uizVar;
        if (awoqVar instanceof uiz) {
            uizVar = (uiz) awoqVar;
            int i = uizVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uizVar.c = i - Integer.MIN_VALUE;
            } else {
                uizVar = new uiz(this, awoqVar);
            }
        } else {
            uizVar = new uiz(this, awoqVar);
        }
        Object objO = uizVar.a;
        awox awoxVar = awox.a;
        int i2 = uizVar.c;
        if (i2 == 0) {
            atqp.j(objO);
            awzc awzcVarB = this.b.b();
            uizVar.c = 1;
            objO = awqx.o(awzcVarB, uizVar);
            if (objO == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objO);
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((uje) objO).b);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [bec, java.lang.Object] */
    public final Object e(Map map, awoq awoqVar) throws Throwable {
        uja ujaVar;
        if (awoqVar instanceof uja) {
            ujaVar = (uja) awoqVar;
            int i = ujaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ujaVar.c = i - Integer.MIN_VALUE;
            } else {
                ujaVar = new uja(this, awoqVar);
            }
        } else {
            ujaVar = new uja(this, awoqVar);
        }
        Object obj = ujaVar.a;
        awox awoxVar = awox.a;
        int i2 = ujaVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            ?? r5 = this.b;
            pbs pbsVar = new pbs(map, (awoq) null, 4);
            ujaVar.c = 1;
            if (r5.a(pbsVar, ujaVar) == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        return awmy.a;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    public final boolean f(String str) {
        boolean zContainsKey;
        synchronized (this.b) {
            zContainsKey = this.c.containsKey(str);
        }
        return zContainsKey;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final void g(String str) {
        synchronized (this.b) {
            List list = (List) this.c.get(str);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (list.size() <= 0) {
                this.a = true;
            } else {
                uu uuVar = ((ua) list.get(0)).a;
                throw null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    public final Set h(String str, String str2) {
        synchronized (this.b) {
            List list = (List) this.c.get(str);
            if (list == null) {
                return Collections.EMPTY_SET;
            }
            afx afxVar = new afx(0);
            ed.d(str, str2);
            if (list.size() <= 0) {
                return afxVar;
            }
            vm vmVar = ((ua) list.get(0)).e;
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final void i(String str, String str2) {
        synchronized (this.b) {
            List list = (List) this.c.get(str);
            if (list == null || list.isEmpty()) {
                return;
            }
            ed.d(str, str2);
            if (list.size() <= 0) {
                this.a = true;
            } else {
                vm vmVar = ((ua) list.get(0)).e;
                throw null;
            }
        }
    }

    public ujb(bec becVar, awut awutVar) {
        becVar.getClass();
        awutVar.getClass();
        this.b = becVar;
        this.c = awutVar;
        this.a = true;
    }
}
