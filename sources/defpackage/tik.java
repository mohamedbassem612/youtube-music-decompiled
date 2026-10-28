package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tik extends awpg {
    Object a;
    Object b;
    boolean c;
    /* synthetic */ Object d;
    final /* synthetic */ tir e;
    int f;
    String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tik(tir tirVar, awoq awoqVar) {
        super(awoqVar);
        this.e = tirVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.h(null, null, null, false, false, this);
    }
}
