package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pyx extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ pyy c;
    int d;
    pot e;
    pbf f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pyx(pyy pyyVar, awoq awoqVar) {
        super(awoqVar);
        this.c = pyyVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
