package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class psv extends awpg {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ psw d;
    int e;
    plx f;
    ahud g;
    ahud h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psv(psw pswVar, awoq awoqVar) {
        super(awoqVar);
        this.d = pswVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, null, null, null, this);
    }
}
