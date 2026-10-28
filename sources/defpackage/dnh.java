package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dnh extends awpg {
    int a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ dnl d;
    int e;
    String f;
    String[] g;
    dnv h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnh(dnl dnlVar, awoq awoqVar) {
        super(awoqVar);
        this.d = dnlVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.d(null, 0, this);
    }
}
