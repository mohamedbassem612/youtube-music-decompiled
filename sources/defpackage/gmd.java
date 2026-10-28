package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class gmd extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ gmj c;
    int d;
    Class e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmd(gmj gmjVar, awoq awoqVar) {
        super(awoqVar);
        this.c = gmjVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
