package defpackage;

import internal.J.N;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acgm implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;

    public /* synthetic */ acgm(long j, ArrayList arrayList, int i) {
        this.$cid = i;
        this.a = j;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            ((acgn) this.b).d(false, false, false, this.a);
        } else {
            if (i == 1) {
                ((acfx) this.b).i(this.a);
                return;
            }
            Object obj = this.b;
            if (i != 2) {
                ((axkr) obj).b.mObserver.onNetworkSoonToDisconnect(this.a);
            } else {
                N.Ml5G_GLY(this.a, obj);
            }
        }
    }

    public /* synthetic */ acgm(acfx acfxVar, long j, int i) {
        this.$cid = i;
        this.b = acfxVar;
        this.a = j;
    }

    public acgm(axkr axkrVar, long j, int i) {
        this.$cid = i;
        this.a = j;
        this.b = axkrVar;
    }
}
