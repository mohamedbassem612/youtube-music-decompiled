package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pvp extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pvr b;
    int c;
    pkx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvp(pvr pvrVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pvrVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(0L, this);
    }
}
