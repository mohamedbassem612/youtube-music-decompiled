package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bgi extends awpg {
    public Object a;
    public /* synthetic */ Object b;
    public int c;
    public axfi d;
    final /* synthetic */ ayq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgi(ayq ayqVar, awoq awoqVar) {
        super(awoqVar);
        this.e = ayqVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.e.f(null, this);
    }
}
