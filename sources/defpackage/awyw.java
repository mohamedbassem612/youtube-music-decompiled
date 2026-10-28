package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awyw extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ awyx c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awyw(awyx awyxVar, awoq awoqVar) {
        super(awoqVar);
        this.c = awyxVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
