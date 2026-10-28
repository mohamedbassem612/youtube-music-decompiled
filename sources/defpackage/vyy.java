package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class vyy extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ vza b;
    int c;
    aiqi d;
    axfi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyy(vza vzaVar, awoq awoqVar) {
        super(awoqVar);
        this.b = vzaVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
