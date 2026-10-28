package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bjy {
    private static volatile int a = 100;

    final boolean a(Object obj, bid bidVar, int i) throws bja {
        int i2 = bidVar.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            d(obj, i3, bidVar.k());
            return true;
        }
        if (i4 == 1) {
            bjz bjzVar = (bjz) obj;
            bjzVar.e((i3 << 3) | 1, Long.valueOf(bidVar.j()));
            return true;
        }
        if (i4 == 2) {
            ((bjz) obj).e((i3 << 3) | 2, bidVar.o());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new bja("Protocol message end-group tag did not match expected tag.");
            }
            if (i4 != 5) {
                throw new biz();
            }
            ((bjz) obj).e((i3 << 3) | 5, Integer.valueOf(bidVar.e()));
            return true;
        }
        int i5 = i3 << 3;
        bjz bjzVar2 = new bjz();
        int i6 = i + 1;
        if (i6 >= a) {
            throw new bja("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (bidVar.c() != Integer.MAX_VALUE && a(bjzVar2, bidVar, i6)) {
        }
        if ((i5 | 4) != bidVar.b) {
            throw new bja("Protocol message end-group tag did not match expected tag.");
        }
        bjzVar2.d();
        ((bjz) obj).e(i5 | 3, bjzVar2);
        return true;
    }

    public final bjz b(Object obj) {
        bjz bjzVarC = c(obj);
        if (bjzVarC != bjz.a) {
            return bjzVarC;
        }
        bjz bjzVar = new bjz();
        f(obj, bjzVar);
        return bjzVar;
    }

    public final bjz c(Object obj) {
        return ((bis) obj).unknownFields;
    }

    public final /* bridge */ /* synthetic */ void d(Object obj, int i, long j) {
        ((bjz) obj).e(i << 3, Long.valueOf(j));
    }

    public final void e(Object obj) {
        c(obj).d();
    }

    public final void f(Object obj, bjz bjzVar) {
        ((bis) obj).unknownFields = bjzVar;
    }
}
