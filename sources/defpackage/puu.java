package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class puu extends awpg {
    boolean a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ pux d;
    int e;
    aiaz f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public puu(pux puxVar, awoq awoqVar) {
        super(awoqVar);
        this.d = puxVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, null, null, false, this);
    }
}
