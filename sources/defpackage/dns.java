package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dns extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ dnv c;
    int d;
    String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dns(dnv dnvVar, awoq awoqVar) {
        super(awoqVar);
        this.c = dnvVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
