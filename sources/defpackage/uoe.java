package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class uoe extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ uof b;
    int c;
    vfb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uoe(uof uofVar, awoq awoqVar) {
        super(awoqVar);
        this.b = uofVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
