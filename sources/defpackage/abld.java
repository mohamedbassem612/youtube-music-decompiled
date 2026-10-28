package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class abld implements avnn {
    private final /* synthetic */ int $cid;

    public /* synthetic */ abld(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avnn
    public final Object a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return ((aazq) obj).b.ar();
        }
        if (i == 1) {
            return (wgi) ((Optional) obj).get();
        }
        if (i == 2) {
            return ((aazq) obj).b.A();
        }
        if (i != 3) {
            return i != 4 ? Boolean.valueOf(((atpl) obj).u) : aawb.u(((aazq) obj).b);
        }
        return ((aazq) obj).b.ar();
    }
}
