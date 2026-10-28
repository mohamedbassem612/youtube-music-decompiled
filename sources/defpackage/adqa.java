package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adqa extends awpg {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public /* synthetic */ Object h;
    public int i;
    final /* synthetic */ acfz j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adqa(acfz acfzVar, awoq awoqVar) {
        super(awoqVar);
        this.j = acfzVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.i |= Integer.MIN_VALUE;
        return this.j.ah(null, null, null, null, null, this);
    }
}
