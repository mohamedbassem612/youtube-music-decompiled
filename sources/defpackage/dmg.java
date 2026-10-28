package defpackage;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dmg {
    public final dmq a;
    public final dnl b;
    public final Map c;
    public final ReentrantLock d;
    public final AtomicInteger e;
    public final Function0 f;
    public final Function0 g;
    public final Object h;
    public we i;
    private final Map j;
    private final Map k;
    private final String[] l;

    public dmg(dmq dmqVar, Map map, Map map2, String... strArr) {
        this.a = dmqVar;
        this.j = map;
        this.k = map2;
        this.l = strArr;
        dnl dnlVar = new dnl(dmqVar, map, map2, strArr, dmqVar.i, new dmf(this, 0));
        this.b = dnlVar;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new AtomicInteger(0);
        this.f = new aho(4);
        this.g = new aho(5);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.h = new Object();
        dnlVar.f = new py(this, 11);
    }

    public final Object a(awoq awoqVar) {
        Object objE = this.b.e(awoqVar);
        return objE != awox.a ? awmy.a : objE;
    }

    public final void b() {
        this.b.f(this.f, this.g);
    }
}
