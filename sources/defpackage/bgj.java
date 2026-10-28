package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bgj extends awpg {
    public Object a;
    public boolean b;
    public boolean c;
    public /* synthetic */ Object d;
    public int e;
    public axfi f;
    final /* synthetic */ ayq g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgj(ayq ayqVar, awoq awoqVar) {
        super(awoqVar);
        this.g = ayqVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.g.g(null, this);
    }
}
