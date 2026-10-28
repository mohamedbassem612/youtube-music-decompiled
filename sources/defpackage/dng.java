package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dng extends awpg {
    int a;
    int b;
    int c;
    /* synthetic */ Object d;
    final /* synthetic */ dnl e;
    int f;
    String g;
    String[] h;
    dnv i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dng(dnl dnlVar, awoq awoqVar) {
        super(awoqVar);
        this.e = dnlVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, 0, this);
    }
}
