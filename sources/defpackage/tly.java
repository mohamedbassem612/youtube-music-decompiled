package defpackage;

import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tly implements tgz {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ tly(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awwd, java.lang.Object] */
    @Override // defpackage.tgz
    public final void a() {
        int i = this.$cid;
        ?? r1 = this.a;
        if (i != 0) {
            r1.p(null);
        } else {
            ((UrlRequest) r1).cancel();
        }
    }
}
