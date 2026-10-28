package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class abpl implements abok {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ abpl(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.abok
    public final void a() {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            avnr.b((AtomicReference) obj);
        } else {
            ((tmn) obj).w();
        }
    }
}
