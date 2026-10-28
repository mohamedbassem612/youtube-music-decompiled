package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pnd extends awpg {
    Object a;
    Object b;
    Object c;
    /* synthetic */ Object d;
    final /* synthetic */ png e;
    int f;
    String g;
    plx h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pnd(png pngVar, awoq awoqVar) {
        super(awoqVar);
        this.e = pngVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, this);
    }
}
