package defpackage;

import android.view.View;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jps extends aevq {
    final /* synthetic */ WatchWhileLayout a;

    public jps(WatchWhileLayout watchWhileLayout) {
        this.a = watchWhileLayout;
    }

    @Override // defpackage.aevq
    public final void a(View view, float f) {
        WatchWhileLayout watchWhileLayout = this.a;
        if (watchWhileLayout.ak() || watchWhileLayout.aJ.F != 3) {
            return;
        }
        if (watchWhileLayout.Y() && f == 1.0f) {
            return;
        }
        if (watchWhileLayout.bW.r() && watchWhileLayout.bE.a()) {
            return;
        }
        watchWhileLayout.I(hww.j, f);
    }

    @Override // defpackage.aevq
    public final void b(View view, int i) {
        WatchWhileLayout watchWhileLayout = this.a;
        if (watchWhileLayout.ak()) {
            if (!watchWhileLayout.bW.s() || watchWhileLayout.bO.a().contains(watchWhileLayout.bE)) {
                return;
            }
            watchWhileLayout.I(hww.c, 0.0f);
            return;
        }
        watchWhileLayout.T();
        if (watchWhileLayout.aJ.F == 3) {
            if (i == 3) {
                watchWhileLayout.I(hww.e, 1.0f);
            } else if (i != 4) {
                if (i == 6 && watchWhileLayout.bW.s()) {
                    watchWhileLayout.I(hww.d, watchWhileLayout.q());
                }
            } else if ((!watchWhileLayout.bW.r() || !watchWhileLayout.bE.a()) && ((Integer) watchWhileLayout.bH.orElse(4)).intValue() == 4) {
                watchWhileLayout.I(hww.c, 0.0f);
            }
            if (watchWhileLayout.bH.isPresent() && i == ((Integer) watchWhileLayout.bH.get()).intValue()) {
                watchWhileLayout.bH = Optional.empty();
            }
        }
    }
}
