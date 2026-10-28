package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ifl extends awpg {
    boolean a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ ifn d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifl(ifn ifnVar, awoq awoqVar) {
        super(awoqVar);
        this.d = ifnVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(false, null, this);
    }
}
