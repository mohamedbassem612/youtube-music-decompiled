package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adph extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ adpi c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adph(adpi adpiVar, awoq awoqVar) {
        super(awoqVar);
        this.c = adpiVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return adpi.b(this.c, null, this);
    }
}
