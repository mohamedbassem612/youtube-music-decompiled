package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pde extends awpg {
    int a;
    long b;
    boolean c;
    boolean d;
    boolean e;
    /* synthetic */ Object f;
    final /* synthetic */ pdf g;
    int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pde(pdf pdfVar, awoq awoqVar) {
        super(awoqVar);
        this.g = pdfVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, 0, 0L, false, false, false, this);
    }
}
