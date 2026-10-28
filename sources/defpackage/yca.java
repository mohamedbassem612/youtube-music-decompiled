package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class yca extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ ycd b;
    int c;
    String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yca(ycd ycdVar, awoq awoqVar) {
        super(awoqVar);
        this.b = ycdVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(null, null, this);
    }
}
