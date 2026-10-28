package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vdp extends awpg {
    public Object a;
    public /* synthetic */ Object b;
    public int c;
    final /* synthetic */ ahgb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdp(ahgb ahgbVar, awoq awoqVar) {
        super(awoqVar);
        this.d = ahgbVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.r(null, this);
    }
}
