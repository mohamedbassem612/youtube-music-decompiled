package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pjh extends awpg {
    Object a;
    Object b;
    Object c;
    Object d;
    /* synthetic */ Object e;
    final /* synthetic */ pjv f;
    int g;
    pcv h;
    pka i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjh(pjv pjvVar, awoq awoqVar) {
        super(awoqVar);
        this.f = pjvVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.h(null, null, null, null, this);
    }
}
