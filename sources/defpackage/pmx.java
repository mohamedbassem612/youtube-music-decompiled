package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pmx extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pmz b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmx(pmz pmzVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pmzVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.h(null, null, null, null, this);
    }
}
