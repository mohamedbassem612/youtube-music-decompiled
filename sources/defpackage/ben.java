package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ben extends awpg {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    final /* synthetic */ air g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ben(air airVar, awoq awoqVar) {
        super(awoqVar);
        this.g = airVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.g.emit(null, this);
    }
}
