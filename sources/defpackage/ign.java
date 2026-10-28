package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ign extends awpg {
    public boolean a;
    public boolean b;
    public /* synthetic */ Object c;
    public int d;
    final /* synthetic */ axfd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ign(axfd axfdVar, awoq awoqVar) {
        super(awoqVar);
        this.e = axfdVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.e.ag(null, false, false, this);
    }
}
