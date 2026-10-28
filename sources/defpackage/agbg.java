package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class agbg implements ahcy {
    private final /* synthetic */ int $cid;

    public /* synthetic */ agbg(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return ahng.n(((asii) obj).toByteArray());
        }
        if (i == 1) {
            return ahng.n(((aseg) obj).toByteArray());
        }
        if (i != 2) {
            return i != 3 ? ahng.n(((aigv) obj).toByteArray()) : ahng.n(((ashx) obj).toByteArray());
        }
        return ahng.n(((ashz) obj).toByteArray());
    }
}
