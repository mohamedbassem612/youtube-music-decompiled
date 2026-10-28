package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uuy extends uux {
    private final long a;

    /* JADX WARN: Illegal instructions before constructor call */
    public uuy(long j) {
        aihl aihlVar = aufn.b;
        aihlVar.getClass();
        super(aihlVar);
        this.a = j;
    }

    @Override // defpackage.uux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        aufn aufnVar = (aufn) obj;
        if (aufnVar != null) {
            if (aufnVar.d != this.a) {
                return aufnVar;
            }
        }
        return null;
    }
}
