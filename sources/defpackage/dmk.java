package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dmk extends awpg {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ ci c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmk(ci ciVar, awoq awoqVar) {
        super(awoqVar);
        this.c = ciVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.y(null, this);
    }
}
