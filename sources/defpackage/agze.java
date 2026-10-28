package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agze extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ agzf b;
    int c;
    axfi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agze(agzf agzfVar, awoq awoqVar) {
        super(awoqVar);
        this.b = agzfVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
