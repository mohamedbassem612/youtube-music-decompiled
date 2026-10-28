package defpackage;

import java.net.ProxySelector;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avfn implements agfr {
    private final /* synthetic */ int $cid;

    public avfn(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agfr
    public final /* synthetic */ Object io() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? ProxySelector.getDefault() : new admz();
        }
        return new agfp();
    }
}
