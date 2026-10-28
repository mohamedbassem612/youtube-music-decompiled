package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ozm extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ ozu c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozm(ozu ozuVar, awoq awoqVar) {
        super(awoqVar);
        this.c = ozuVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
