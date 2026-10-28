package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mgt implements avnd {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mgt(mgv mgvVar, String str, Bitmap bitmap, nrv nrvVar, int i) {
        this.$cid = i;
        this.a = mgvVar;
        this.b = str;
        this.c = bitmap;
        this.d = nrvVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, wjf] */
    /* JADX WARN: Type inference failed for: r6v3, types: [awqk, java.lang.Object] */
    @Override // defpackage.avnd
    public final void a() {
        int i = this.$cid;
        if (i == 0) {
            Object obj = this.d;
            Object obj2 = this.c;
            ((mgv) this.a).d((String) this.b, (Bitmap) obj2, (nrv) obj);
            return;
        }
        if (i != 1) {
            Object obj3 = this.d;
            Object obj4 = this.c;
            ((mgv) this.a).d((String) this.b, (Bitmap) obj4, (nrv) obj3);
            return;
        }
        aawr.a(this.b, new acgt(null, this.a, 4, (acgv) this.d, ((ieq) this.c).e));
    }

    public /* synthetic */ mgt(wjf wjfVar, acgv acgvVar, ieq ieqVar, awqk awqkVar, int i) {
        this.$cid = i;
        this.a = wjfVar;
        this.d = acgvVar;
        this.c = ieqVar;
        this.b = awqkVar;
    }
}
