package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pbn extends awpg {
    public /* synthetic */ Object a;
    public int b;
    public pkx c;
    final /* synthetic */ grj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbn(grj grjVar, awoq awoqVar) {
        super(awoqVar);
        this.d = grjVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.h(null, this);
    }
}
