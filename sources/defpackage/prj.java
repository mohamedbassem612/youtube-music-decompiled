package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class prj extends awpg {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ omm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prj(omm ommVar, awoq awoqVar) {
        super(awoqVar);
        this.c = ommVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.j(this);
    }
}
