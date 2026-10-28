package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tjt extends awpg {
    Object a;
    boolean b;
    boolean c;
    /* synthetic */ Object d;
    final /* synthetic */ tkd e;
    int f;
    String g;
    tmr h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjt(tkd tkdVar, awoq awoqVar) {
        super(awoqVar);
        this.e = tkdVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, null, null, false, false, this);
    }
}
