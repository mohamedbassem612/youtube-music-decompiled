package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class o extends c3 {
    public static x0 v(a aVar, Spliterator spliterator) {
        j$.desugar.sun.nio.fs.o oVar = new j$.desugar.sun.nio.fs.o((byte) 29);
        n nVar = new n((byte) 0);
        return new x0((Collection) new l2(a4.REFERENCE, new n((byte) 1), nVar, oVar, (byte) 1).b(aVar, spliterator));
    }

    @Override // j$.util.stream.a
    public final t0 l(a aVar, Spliterator spliterator, IntFunction intFunction) {
        if (z3.DISTINCT.p(aVar.f)) {
            return aVar.c(spliterator, false, intFunction);
        }
        if (z3.ORDERED.p(aVar.f)) {
            return v(aVar, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        new u(new j$.nio.file.y(atomicBoolean, concurrentHashMap, (byte) 8), false).b(aVar, spliterator);
        Collection collectionKeySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(collectionKeySet);
            hashSet.add(null);
            collectionKeySet = hashSet;
        }
        return new x0(collectionKeySet);
    }

    @Override // j$.util.stream.a
    public final Spliterator m(a aVar, Spliterator spliterator) {
        if (z3.DISTINCT.p(aVar.f)) {
            return aVar.u(spliterator);
        }
        return z3.ORDERED.p(aVar.f) ? v(aVar, spliterator).spliterator() : new h4(aVar.u(spliterator), new ConcurrentHashMap());
    }

    @Override // j$.util.stream.a
    public final g3 o(int i, g3 g3Var) {
        g3Var.getClass();
        if (z3.DISTINCT.p(i)) {
            return g3Var;
        }
        return z3.SORTED.p(i) ? new l(g3Var) : new m(g3Var);
    }
}
