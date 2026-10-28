package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class vyz extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ vza c;
    int d;
    String e;
    axfi f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyz(vza vzaVar, awoq awoqVar) {
        super(awoqVar);
        this.c = vzaVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, null, this);
    }
}
