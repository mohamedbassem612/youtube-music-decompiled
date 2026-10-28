package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tim extends awpg {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    boolean f;
    boolean g;
    /* synthetic */ Object h;
    final /* synthetic */ tir i;
    int j;
    tit k;
    awrm l;
    awrm m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tim(tir tirVar, awoq awoqVar) {
        super(awoqVar);
        this.i = tirVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.j(null, null, null, null, false, false, this);
    }
}
