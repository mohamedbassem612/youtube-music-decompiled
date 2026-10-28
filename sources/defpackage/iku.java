package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class iku extends awpk implements awqn {
    public /* synthetic */ Object a;
    public /* synthetic */ Object b;
    public /* synthetic */ int c;
    public /* synthetic */ boolean d;
    public final /* synthetic */ iky e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iku(iky ikyVar, awoq awoqVar) {
        super(5, awoqVar);
        this.e = ikyVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        atqp.j(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        String str = (String) obj2;
        return new ild(str, iky.a(str), (String) obj3, this.c, this.d);
    }
}
