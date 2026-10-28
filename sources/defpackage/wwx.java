package defpackage;

import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.ArrayDeque;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wwx {
    public static final /* synthetic */ int a = 0;
    private static final int[][] b = {new int[]{1, 60000}, new int[]{3, 600000}, new int[]{7, 3600000}};
    private final mbc c;
    private final ArrayDeque d = new ArrayDeque(8);

    public wwx(mbc mbcVar) {
        this.c = mbcVar;
    }

    public final synchronized void a() {
        ArrayDeque arrayDeque = this.d;
        if (arrayDeque.size() == 8) {
            arrayDeque.removeFirst();
        }
        arrayDeque.addLast(Long.valueOf(this.c.b()));
    }

    public final synchronized boolean b() {
        ArrayDeque arrayDeque = this.d;
        if (arrayDeque.isEmpty()) {
            return false;
        }
        final long jB = this.c.b();
        int[][] iArr = b;
        for (int i = 0; i < 3; i++) {
            int[] iArr2 = iArr[i];
            int i2 = iArr2[0];
            final int i3 = iArr2[1];
            if (Collection.EL.stream(arrayDeque).filter(new Predicate() { // from class: www
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public final /* synthetic */ Predicate mo841negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int i4 = wwx.a;
                    return jB - ((Long) obj).longValue() <= ((long) i3);
                }
            }).count() > i2) {
                return true;
            }
        }
        return false;
    }
}
