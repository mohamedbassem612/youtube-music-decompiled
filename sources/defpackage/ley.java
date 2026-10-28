package defpackage;

import android.content.Context;
import android.media.metrics.MediaMetricsManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ley implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;

    public /* synthetic */ ley(Context context, boolean z, ccm ccmVar, cfd cfdVar, int i) {
        this.$cid = i;
        this.b = context;
        this.a = z;
        this.d = ccmVar;
        this.c = cfdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            Object obj = this.d;
            lff lffVar = (lff) obj;
            lco lcoVar = lffVar.b;
            if (lcoVar == null) {
                ((ldz) obj).aT().c.a("Discarding data. Failed to set user property");
                return;
            }
            lffVar.D(lcoVar, (kry) (this.a ? null : this.c), (lbg) this.b);
            lffVar.A();
            return;
        }
        if (i != 1) {
            Object obj2 = this.c;
            lff lffVar2 = (lff) obj2;
            lco lcoVar2 = lffVar2.b;
            if (lcoVar2 == null) {
                ((ldz) obj2).aT().c.a("Discarding data. Failed to send event to service");
                return;
            } else {
                lffVar2.D(lcoVar2, (kry) (this.a ? null : this.d), (lbg) this.b);
                lffVar2.A();
                return;
            }
        }
        Context context = (Context) this.b;
        MediaMetricsManager mediaMetricsManagerM933m = qa$$ExternalSyntheticApiModelOutline0.m933m(context.getSystemService("media_metrics"));
        cfa cfaVar = mediaMetricsManagerM933m != null ? new cfa(context, mediaMetricsManagerM933m.createPlaybackSession()) : null;
        if (cfaVar == null) {
            bvx.e("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return;
        }
        if (this.a) {
            ((ccm) this.d).i(cfaVar);
        }
        ((cfd) this.c).b(cfaVar.a.getSessionId());
    }

    public ley(lff lffVar, lbg lbgVar, boolean z, lcd lcdVar, int i) {
        this.$cid = i;
        this.b = lbgVar;
        this.a = z;
        this.d = lcdVar;
        this.c = lffVar;
    }

    public ley(lff lffVar, lbg lbgVar, boolean z, lfy lfyVar, int i) {
        this.$cid = i;
        this.b = lbgVar;
        this.a = z;
        this.c = lfyVar;
        this.d = lffVar;
    }
}
