package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axek extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ axel b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axek(axel axelVar, awoq awoqVar) {
        super(awoqVar);
        this.b = axelVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.O(this);
    }
}
