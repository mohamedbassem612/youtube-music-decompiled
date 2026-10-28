package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.activities.MusicActivity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fw implements qz {
    private final /* synthetic */ int $cid;
    final /* synthetic */ qe a;

    public fw(fx fxVar, int i) {
        this.$cid = i;
        this.a = fxVar;
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [afpf, java.lang.Object] */
    @Override // defpackage.qz
    public final void a(Context context) {
        int i = this.$cid;
        if (i == 0) {
            qe qeVar = this.a;
            ga delegate = ((fx) qeVar).getDelegate();
            delegate.j();
            qeVar.getSavedStateRegistry().a("androidx:appcompat");
            delegate.z();
            return;
        }
        if (i == 1) {
            ((cf) this.a).m679lambda$init$3$androidsupportv4appFragmentActivity(context);
            return;
        }
        if (i == 2) {
            qe._init_$lambda$4(this.a, context);
            return;
        }
        if (i == 3) {
            ((gea) this.a).a();
            return;
        }
        qe qeVar2 = this.a;
        if (i == 4) {
            ((gea) qeVar2).a();
        } else {
            ((MusicActivity) qeVar2).j();
            ((gea) qeVar2).generatedComponent().bQ().a();
        }
    }

    public /* synthetic */ fw(qe qeVar, int i) {
        this.$cid = i;
        this.a = qeVar;
    }
}
