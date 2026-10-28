package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jpx extends axx {
    final /* synthetic */ WatchWhileLayout a;

    public jpx(WatchWhileLayout watchWhileLayout) {
        this.a = watchWhileLayout;
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        WatchWhileLayout watchWhileLayout = this.a;
        if (watchWhileLayout.bC) {
            return;
        }
        bbzVar.k(new bby(null, R.id.custom_action_maximize_player_page, watchWhileLayout.getContext().getString(R.string.custom_action_maximize_player_page), null, null));
    }

    @Override // defpackage.axx
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i == R.id.custom_action_dismiss_player_page) {
            this.a.z();
            return true;
        }
        if (i != R.id.custom_action_maximize_player_page) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        this.a.C();
        return true;
    }
}
