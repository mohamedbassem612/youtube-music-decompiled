package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class dqx extends dqz {
    public volatile dra a;
    public volatile dra b;
    private final agp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqx(drc drcVar) {
        super(drcVar);
        dqr.a.incrementAndGet();
        int i = agh.a;
        this.d = new agp(6);
        long[] jArr = agv.a;
        new agu(6);
        boolean z = drcVar.e;
    }

    public dra a(long j) {
        dra draVar;
        agp agpVar = this.d;
        synchronized (agpVar) {
            Object objA = agpVar.a(j);
            if (objA == null) {
                objA = new dra(j, this);
                int iC = agpVar.c(j);
                if (iC < 0) {
                    iC = ~iC;
                }
                agpVar.b[iC] = j;
                agpVar.c[iC] = objA;
            }
            draVar = (dra) objA;
        }
        return draVar;
    }
}
