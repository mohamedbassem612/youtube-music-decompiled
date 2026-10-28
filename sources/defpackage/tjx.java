package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tjx extends awpg {
    Object a;
    Object b;
    boolean c;
    int d;
    /* synthetic */ Object e;
    final /* synthetic */ tkd f;
    int g;
    String h;
    String i;
    tmr j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjx(tkd tkdVar, awoq awoqVar) {
        super(awoqVar);
        this.f = tkdVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.e(null, null, null, null, false, this);
    }
}
