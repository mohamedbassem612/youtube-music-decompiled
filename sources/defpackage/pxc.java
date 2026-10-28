package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pxc extends awpg {
    public /* synthetic */ Object a;
    public int b;
    public pkx c;
    final /* synthetic */ zzx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxc(pxd pxdVar, awoq awoqVar) {
        super(awoqVar);
        this.d = (zzx) pxdVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return nqw.c(this.d, null, this);
    }
}
