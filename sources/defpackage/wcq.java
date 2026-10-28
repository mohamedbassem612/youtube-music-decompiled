package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wcq implements wct {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ wcu a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wcq(wcu wcuVar, int i, Object obj, int i2) {
        this.$cid = i2;
        this.a = wcuVar;
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.wct
    public final void a(omr omrVar) {
        int i = this.$cid;
        wcu wcuVar = this.a;
        if (i != 0) {
            wcuVar.b(omrVar);
            tzk.R(omrVar, this.b);
            omrVar.i(" ? ");
            wcuVar.c(omrVar, this.c);
            return;
        }
        wcuVar.b(omrVar);
        tzk.R(omrVar, this.b);
        omrVar.i(" ? ");
        wcuVar.c(omrVar, this.c);
    }
}
