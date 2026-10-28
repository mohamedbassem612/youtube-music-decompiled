package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tbt {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/common/eventbus/EventBus");
    static final Object b = new Object();
    private static final tbs[] j = {new tby(), new tcb()};
    private static final taq n = new taq();
    final Map c;
    final Map d;
    final Map e;
    final Map f;
    public final ReadWriteLock g;
    public final szu h;
    public final boolean i;
    private final Executor k;
    private final tbs[] l;
    private final mbc m;

    /* JADX WARN: Type inference failed for: r9v1, types: [awmd, java.lang.Object] */
    public tbt(Executor executor, mbc mbcVar, Optional optional) {
        optional.isPresent();
        szu szuVar = (szu) Optional.ofNullable((szu) optional.get().io()).orElse(null);
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        taq taqVar = n;
        tbs[] tbsVarArr = j;
        executor.getClass();
        this.k = executor;
        this.c = new HashMap(SemanticState.Hidden);
        this.d = new txy(new hwf(this));
        this.g = reentrantReadWriteLock;
        this.m = mbcVar;
        this.h = szuVar;
        taqVar.getClass();
        tbsVarArr.getClass();
        this.l = tbsVarArr;
        boolean z = szuVar != null;
        this.i = z;
        if (z) {
            this.e = new HashMap(aguu.k(SemanticState.Hidden));
            this.f = new txy(new hwf(this));
        } else {
            this.e = null;
            this.f = null;
        }
    }

    private final void n(Object obj, Class cls, tbv tbvVar) {
        if (!this.i || !tbvVar.b.b()) {
            tym.W(this.c, cls, tbvVar);
            tym.W(this.d, obj, tbvVar);
            return;
        }
        Map map = this.e;
        map.getClass();
        tym.W(map, cls, tbvVar);
        Map map2 = this.f;
        map2.getClass();
        tym.W(map2, obj, tbvVar);
    }

    public final tbv a(Object obj, Class cls, tbu tbuVar) {
        return b(obj, cls, b, tbuVar);
    }

    public final tbv b(Object obj, Class cls, Object obj2, tbu tbuVar) {
        obj2.getClass();
        tbv tbvVar = new tbv(obj, cls, obj2, tbuVar);
        this.g.writeLock().lock();
        try {
            n(obj, cls, tbvVar);
            return tbvVar;
        } finally {
            this.g.writeLock().unlock();
        }
    }

    public final void c(Object obj) {
        d(b, obj, false);
    }

    public final void d(Object obj, Object obj2, boolean z) {
        obj2.getClass().getSimpleName();
        mbc mbcVar = this.m;
        if (mbcVar != null && (obj2 instanceof tcd)) {
            tcd tcdVar = (tcd) obj2;
            if (!tcdVar.f()) {
                tcdVar.e(mbcVar.b());
            }
        }
        Runnable runnableI = afwl.i(new tbr(this, obj, obj2));
        if (a.x() && z) {
            runnableI.run();
        } else {
            this.k.execute(runnableI);
        }
    }

    public final void e(Object obj) {
        d(b, obj, true);
    }

    public final void f(Object obj) {
        obj.getClass();
        g(obj, obj.getClass());
    }

    public final void g(Object obj, Class cls) {
        i(obj, cls, b);
    }

    public final void h(Object obj, Object obj2) {
        i(obj, obj.getClass(), obj2);
    }

    public final void i(Object obj, Class cls, Object obj2) {
        cls.getClass();
        obj2.getClass();
        if (!cls.isAssignableFrom(obj.getClass())) {
            throw new IllegalArgumentException("clazz must be a superclass of target");
        }
        tbs[] tbsVarArr = this.l;
        int length = tbsVarArr.length;
        for (int i = 0; i < 2; i++) {
            tbv[] tbvVarArrA = tbsVarArr[i].a(obj, cls, obj2);
            if (tbvVarArrA != null && (tbvVarArrA.length) > 0) {
                this.g.writeLock().lock();
                for (tbv tbvVar : tbvVarArrA) {
                    try {
                        n(obj, tbvVar.a, tbvVar);
                    } catch (Throwable th) {
                        this.g.writeLock().unlock();
                        throw th;
                    }
                }
                this.g.writeLock().unlock();
                return;
            }
        }
        throw new IllegalArgumentException(a.cs(obj, "target ", " could not be registered!"));
    }

    public final void j(Collection collection) {
        this.g.writeLock().lock();
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                tbv tbvVar = (tbv) it.next();
                m(tbvVar);
                Object objA = tbvVar.a();
                if (objA != null) {
                    Map map = this.d;
                    if (tym.X(map, objA, tbvVar)) {
                        tym.Y(map, objA);
                    } else {
                        continue;
                    }
                }
            }
            this.g.writeLock().unlock();
        } catch (Throwable th) {
            this.g.writeLock().unlock();
            throw th;
        }
    }

    public final void k(tbv... tbvVarArr) {
        j(Arrays.asList(tbvVarArr));
    }

    public final void l(Object obj) {
        Lock lockWriteLock;
        Set set;
        if (obj != null) {
            ReadWriteLock readWriteLock = this.g;
            readWriteLock.writeLock().lock();
            try {
                Map map = this.d;
                if (!map.containsKey(obj) || (set = (Set) map.remove(obj)) == null || set.isEmpty()) {
                    lockWriteLock = readWriteLock.writeLock();
                } else {
                    j(set);
                    lockWriteLock = this.g.writeLock();
                }
                lockWriteLock.unlock();
            } catch (Throwable th) {
                this.g.writeLock().unlock();
                throw th;
            }
        }
    }

    public final void m(tbv tbvVar) {
        Map map = this.c;
        Class cls = tbvVar.a;
        if (tym.X(map, cls, tbvVar)) {
            tym.Y(map, cls);
        }
    }
}
