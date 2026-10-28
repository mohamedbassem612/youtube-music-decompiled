package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hym implements hyi {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/player/controls/NerdStatsBottomSheetButtonController");
    public final cf b;
    public final adyj c;
    private final tpq d;
    private final agfr e;

    public hym(cf cfVar, tpq tpqVar) {
        tpqVar.getClass();
        this.d = tpqVar;
        adyj adyjVar = new adyj(cfVar, cfVar.getResources().getString(R.string.setting_nerd_stats));
        this.c = adyjVar;
        aduk adukVar = new aduk(cfVar, R.drawable.yt_outline_statistics_graph_vd_theme_24);
        adukVar.d(R.color.quantum_grey600);
        Drawable drawableA = adukVar.a();
        this.b = cfVar;
        adyjVar.f = drawableA;
        this.e = aguu.al(new cbr(this, 9));
        ListenableFuture listenableFutureA = tpqVar.a();
        hyl hylVar = new hyl(this, 0);
        hyl hylVar2 = new hyl(this, 2);
        Executor executor = taf.a;
        boc lifecycle = cfVar.getLifecycle();
        bob bobVar = bob.b;
        taq.d();
        tac tacVar = new tac(bobVar, lifecycle, hylVar2, hylVar);
        Executor executor2 = taf.a;
        long j = afwl.a;
        listenableFutureA.addListener(new ahei(listenableFutureA, new afwj(afty.c(false), tacVar, 0)), executor2);
    }

    @Override // defpackage.hyi
    public final anfv a() {
        if (((atpu) this.d.c()).d) {
            return (anfv) this.e.io();
        }
        return null;
    }
}
