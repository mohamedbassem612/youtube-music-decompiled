package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aenr {
    public volatile String a;
    public final awmd b;
    public aeno c;
    public volatile awmi d = new awmp(new acoo(this, 17));
    public final Set e;
    public volatile boolean f;
    public volatile boolean g;
    public final AtomicBoolean h;
    private final awmi i;

    public aenr(String str, awmd awmdVar, awmd awmdVar2, aeno aenoVar) {
        this.a = str;
        this.b = awmdVar2;
        this.c = aenoVar;
        this.i = new awmp(new acoo(awmdVar, 16));
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        keySetViewNewKeySet.add(this.a);
        keySetViewNewKeySet.getClass();
        this.e = keySetViewNewKeySet;
        this.h = new AtomicBoolean(false);
    }

    public final xfq a() {
        Object objA = this.i.a();
        objA.getClass();
        return (xfq) objA;
    }

    public final xih b() {
        Object objA = this.d.a();
        objA.getClass();
        return (xih) objA;
    }

    public final void c(int i) {
        this.c.g = i;
    }

    public final boolean d() {
        return this.h.compareAndSet(false, true);
    }

    public final String toString() {
        return "PageContext {pageId = " + this.a + ", navigationInfo = " + this.c + '}';
    }
}
