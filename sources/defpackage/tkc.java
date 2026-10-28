package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tkc extends awpg {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ tkd d;
    int e;
    tmr f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkc(tkd tkdVar, awoq awoqVar) {
        super(awoqVar);
        this.d = tkdVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.h(null, null, null, this);
    }
}
