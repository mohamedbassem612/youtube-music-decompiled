package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afog extends bpi {
    public final boy a;
    public final affd b;
    public final aunt c;
    public final aupf d;
    public final Object e = new Object();
    public volatile Object f;
    public final ahpu g;

    public afog(boy boyVar, ahpu ahpuVar, affd affdVar, aunt auntVar, aupf aupfVar) {
        this.a = boyVar;
        this.g = ahpuVar;
        this.b = affdVar;
        this.c = auntVar;
        this.d = aupfVar;
    }

    @Override // defpackage.bpi
    public final void d() {
        auod auodVarB;
        synchronized (this.e) {
            auodVarB = this.f != null ? ((afof) atqp.a(this.f, afof.class)).b() : null;
        }
        if (auodVarB != null) {
            auodVarB.a();
        }
    }
}
