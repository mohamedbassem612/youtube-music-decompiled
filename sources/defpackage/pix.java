package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pix extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ piy b;
    int c;
    piy d;
    String e;
    pot f;
    plx g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pix(piy piyVar, awoq awoqVar) {
        super(awoqVar);
        this.b = piyVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return piy.f(this.b, null, null, null, this);
    }
}
