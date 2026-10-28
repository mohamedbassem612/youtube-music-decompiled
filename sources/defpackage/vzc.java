package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vzc extends awpg {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ aesp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vzc(aesp aespVar, awoq awoqVar) {
        super(awoqVar);
        this.c = aespVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.c(this);
    }
}
