package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pdo extends awpg {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ aczl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdo(aczl aczlVar, awoq awoqVar) {
        super(awoqVar);
        this.c = aczlVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.r(this);
    }
}
