package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ozs extends awpg {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ ozu d;
    int e;
    aiff f;
    ahza g;
    int h;
    plx i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozs(ozu ozuVar, awoq awoqVar) {
        super(awoqVar);
        this.d = ozuVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.j(null, null, null, 0, null, this);
    }
}
