package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class php extends awpg {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    /* synthetic */ Object f;
    final /* synthetic */ pic g;
    int h;
    aut i;
    ozj j;
    String k;
    plx l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public php(pic picVar, awoq awoqVar) {
        super(awoqVar);
        this.g = picVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.e(null, null, null, null, this);
    }
}
