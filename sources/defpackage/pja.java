package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pja extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pjb b;
    int c;
    pot d;
    String e;
    pbf f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pja(pjb pjbVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pjbVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
