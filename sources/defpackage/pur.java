package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class pur extends awpg {
    Object a;
    Object b;
    Object c;
    Object d;
    boolean e;
    /* synthetic */ Object f;
    final /* synthetic */ pux g;
    int h;
    String i;
    aiaz j;
    plx k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pur(pux puxVar, awoq awoqVar) {
        super(awoqVar);
        this.g = puxVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(null, null, null, false, this);
    }
}
