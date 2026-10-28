package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dnn extends awpg {
    /* synthetic */ Object a;
    int b;
    Object c;
    final /* synthetic */ dno d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnn(dno dnoVar, awoq awoqVar) {
        super(awoqVar);
        this.d = dnoVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
