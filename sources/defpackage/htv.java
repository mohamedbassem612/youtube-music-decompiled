package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class htv extends awpg {
    int a;
    int b;
    boolean c;
    /* synthetic */ Object d;
    final /* synthetic */ hub e;
    int f;
    String g;
    atr h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htv(hub hubVar, awoq awoqVar) {
        super(awoqVar);
        this.e = hubVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.e(null, null, 0, false, null, this);
    }
}
