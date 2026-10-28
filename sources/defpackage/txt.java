package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class txt implements txv {
    private final /* synthetic */ int $cid;

    public txt(int i) {
        this.$cid = i;
    }

    @Override // defpackage.txv
    public final Object a(Map.Entry entry) {
        return this.$cid != 0 ? entry.getKey() : ((txw) entry).c;
    }
}
