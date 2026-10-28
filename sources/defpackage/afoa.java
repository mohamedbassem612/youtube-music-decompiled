package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afoa extends bpi {
    public volatile Object a;
    public final auor b;
    public final aupf c;
    public final Object d = new Object();
    public afoz e;

    public afoa(Object obj, auor auorVar, aupf aupfVar) {
        this.a = obj;
        this.b = auorVar;
        this.c = aupfVar;
    }

    @Override // defpackage.bpi
    protected final void d() {
        auod auodVarA;
        synchronized (this.d) {
            afoz afozVar = this.e;
            auodVarA = afozVar != null ? ((afob) atqp.a(afozVar, afob.class)).a() : null;
        }
        if (auodVarA != null) {
            auodVarA.a();
        }
    }
}
