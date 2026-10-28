package defpackage;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cjj implements bvh {
    private final /* synthetic */ int $cid;

    public /* synthetic */ cjj(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [cjy, java.lang.Object] */
    @Override // defpackage.bvh
    public final void a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ((aae) obj).o();
            return;
        }
        if (i == 1) {
            ((aae) obj).p(3);
            return;
        }
        if (i == 2) {
            ((eol) obj).b.a();
            return;
        }
        if (i == 3) {
            ((ExecutorService) obj).shutdown();
            return;
        }
        if (i == 4) {
            ((aae) obj).r();
        } else if (i != 5) {
            ((aae) obj).s(new auq(new aaf((byte[]) null)));
        } else {
            ((aae) obj).o();
        }
    }
}
