package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class eoq implements eor {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Context a;

    public /* synthetic */ eoq(Context context, int i) {
        this.$cid = i;
        this.a = context;
    }

    @Override // defpackage.eor
    public final Object a() {
        int i = this.$cid;
        if (i == 0) {
            return Long.valueOf(auwp.a.io().d(this.a));
        }
        if (i != 1) {
            return i != 2 ? Double.valueOf(auwp.a.io().a(this.a)) : Long.valueOf(auwp.a.io().b(this.a));
        }
        return Long.valueOf(auwp.a.io().c(this.a));
    }
}
