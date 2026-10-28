package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class axrl {
    private static volatile int a = 100;

    final boolean a(Object obj, axpt axptVar, int i) throws axqm {
        int i2 = axptVar.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            d(obj, i3, axptVar.k());
            return true;
        }
        if (i4 == 1) {
            axrm axrmVar = (axrm) obj;
            axrmVar.e((i3 << 3) | 1, Long.valueOf(axptVar.j()));
            return true;
        }
        if (i4 == 2) {
            ((axrm) obj).e((i3 << 3) | 2, axptVar.s());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new axqm("Protocol message end-group tag did not match expected tag.");
            }
            if (i4 != 5) {
                throw new axql();
            }
            ((axrm) obj).e((i3 << 3) | 5, Integer.valueOf(axptVar.e()));
            return true;
        }
        int i5 = i3 << 3;
        axrm axrmVar2 = new axrm();
        int i6 = i + 1;
        if (i6 >= a) {
            throw new axqm("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (axptVar.c() != Integer.MAX_VALUE && a(axrmVar2, axptVar, i6)) {
        }
        if ((i5 | 4) != axptVar.b) {
            throw new axqm("Protocol message end-group tag did not match expected tag.");
        }
        axrmVar2.d();
        ((axrm) obj).e(i5 | 3, axrmVar2);
        return true;
    }

    public final axrm b(Object obj) {
        axrm axrmVarC = c(obj);
        if (axrmVarC != axrm.a) {
            return axrmVarC;
        }
        axrm axrmVar = new axrm();
        f(obj, axrmVar);
        return axrmVar;
    }

    public final axrm c(Object obj) {
        return ((axqf) obj).unknownFields;
    }

    public final /* bridge */ /* synthetic */ void d(Object obj, int i, long j) {
        ((axrm) obj).e(i << 3, Long.valueOf(j));
    }

    public final void e(Object obj) {
        c(obj).d();
    }

    public final void f(Object obj, axrm axrmVar) {
        ((axqf) obj).unknownFields = axrmVar;
    }
}
