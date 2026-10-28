package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class axaj extends awpg {
    Object a;
    Object b;
    Object c;
    /* synthetic */ Object d;
    final /* synthetic */ axak e;
    int f;
    axam g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axaj(axak axakVar, awoq awoqVar) {
        super(awoqVar);
        this.e = axakVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return axak.e(this.e, null, this);
    }
}
