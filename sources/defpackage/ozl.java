package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ozl extends awpg {
    Object a;
    Object b;
    Object c;
    Object d;
    /* synthetic */ Object e;
    final /* synthetic */ ozu f;
    int g;
    aiey h;
    plx i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozl(ozu ozuVar, awoq awoqVar) {
        super(awoqVar);
        this.f = ozuVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.f(null, null, this);
    }
}
