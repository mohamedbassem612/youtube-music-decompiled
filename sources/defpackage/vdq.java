package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vdq extends awpg {
    public /* synthetic */ Object a;
    public int b;
    public aufa c;
    final /* synthetic */ ahgb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdq(ahgb ahgbVar, awoq awoqVar) {
        super(awoqVar);
        this.d = ahgbVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.s(null, this);
    }
}
