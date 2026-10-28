package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ywe implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ float a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ywe(Object obj, float f, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            ((ywh) this.b).b.p(this.a);
            return;
        }
        if (i == 1) {
            ((ytv) this.b).C(this.a);
            return;
        }
        abbd abbdVar = (abbd) this.b;
        abbu abbuVar = abbdVar.f;
        float f = this.a;
        if (abbuVar != null) {
            try {
                abbuVar.f(f);
            } catch (abbx e) {
                abbdVar.l(e);
            }
        }
    }
}
