package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class prx extends awpg {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    boolean g;
    int h;
    /* synthetic */ Object i;
    final /* synthetic */ pse j;
    int k;
    String l;
    String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prx(pse pseVar, awoq awoqVar) {
        super(awoqVar);
        this.j = pseVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.h(null, null, null, null, false, null, null, null, this);
    }
}
