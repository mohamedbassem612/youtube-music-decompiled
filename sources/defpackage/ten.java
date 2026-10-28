package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ten extends awpg {
    Object a;
    Object b;
    int c;
    /* synthetic */ Object d;
    final /* synthetic */ teq e;
    int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ten(teq teqVar, awoq awoqVar) {
        super(awoqVar);
        this.e = teqVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
