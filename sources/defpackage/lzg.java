package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lzg {
    private static volatile int a = 100;

    public final lzh a(Object obj) {
        lzh lzhVarB = b(obj);
        if (lzhVarB != lzh.a) {
            return lzhVarB;
        }
        lzh lzhVar = new lzh();
        d(obj, lzhVar);
        return lzhVar;
    }

    public final lzh b(Object obj) {
        return ((lxt) obj).unknownFields;
    }

    public final void c(Object obj) {
        lzh lzhVarB = b(obj);
        if (lzhVarB.f) {
            lzhVarB.f = false;
        }
    }

    public final void d(Object obj, lzh lzhVar) {
        ((lxt) obj).unknownFields = lzhVar;
    }
}
