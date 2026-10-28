package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tkb extends awpk implements awqk {
    final /* synthetic */ tkd a;
    final /* synthetic */ awrm b;
    final /* synthetic */ Throwable c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkb(tkd tkdVar, awrm awrmVar, Throwable th, awoq awoqVar) {
        super(2, awoqVar);
        this.a = tkdVar;
        this.b = awrmVar;
        this.c = th;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        tkb tkbVar = new tkb(this.a, this.b, this.c, awoqVar);
        tkbVar.d = obj;
        return tkbVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((tkb) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        atqp.j(obj);
        awut awutVar = (awut) this.d;
        awrm awrmVar = this.b;
        tkd tkdVar = this.a;
        tkdVar.i(awutVar, new ysb(awrmVar, tkdVar, this.c, (awoq) null, 1));
        return awmy.a;
    }
}
