package defpackage;

import android.util.Pair;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class hrb implements acwm {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Pair a;

    public hrb(Pair pair, int i) {
        this.$cid = i;
        this.a = pair;
    }

    @Override // defpackage.acwm
    public final void b() {
        int i = this.$cid;
        Pair pair = this.a;
        if (i == 0) {
            ((Runnable) pair.second).run();
        } else {
            if (pair == null || pair.second == null) {
                return;
            }
            ((Runnable) pair.second).run();
        }
    }

    @Override // defpackage.acwm
    public final void a() {
    }

    @Override // defpackage.acwm
    public final void c(boolean z) {
    }
}
