package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bfb extends awpg {
    boolean a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ bfp d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfb(bfp bfpVar, awoq awoqVar) {
        super(awoqVar);
        this.d = bfpVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.h(false, null, this);
    }
}
