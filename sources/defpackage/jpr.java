package defpackage;

import android.view.View;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jpr extends aevq {
    final /* synthetic */ WatchWhileLayout a;

    public jpr(WatchWhileLayout watchWhileLayout) {
        this.a = watchWhileLayout;
    }

    @Override // defpackage.aevq
    public final void a(View view, float f) {
        if (f > 0.0f) {
            this.a.I(hww.i, 1.0f - f);
        } else if (f < 0.0f) {
            this.a.I(hww.l, 1.0f);
        }
        this.a.aK.I(4);
    }

    @Override // defpackage.aevq
    public final void b(View view, int i) {
        akuj akujVar;
        WatchWhileLayout watchWhileLayout = this.a;
        watchWhileLayout.T();
        if (i != 3) {
            if (i == 4) {
                watchWhileLayout.aJ.H(false);
                watchWhileLayout.I(hww.b, 1.0f);
            } else if (i == 5) {
                watchWhileLayout.I(hww.a, 1.0f);
            }
        } else if (((vor) watchWhileLayout.l.io()).I()) {
            if (watchWhileLayout.ai() || (watchWhileLayout.bV.l(164, 45673420L, false) && (akujVar = watchWhileLayout.bG) != null && new aihx(akujVar.r, akuj.a).contains(akua.ENGAGEMENT_PANEL_SNAP_STATE_BELOW_THE_PLAYER))) {
                watchWhileLayout.I(hww.c, 0.0f);
            } else {
                watchWhileLayout.I(hww.f, 1.0f);
            }
        } else if (watchWhileLayout.bH.isEmpty()) {
            watchWhileLayout.I(hww.c, 0.0f);
        } else {
            watchWhileLayout.aK.I(((Integer) watchWhileLayout.bH.get()).intValue());
        }
        if (watchWhileLayout.bH.isEmpty()) {
            watchWhileLayout.aK.I(4);
        }
    }
}
