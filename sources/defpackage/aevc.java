package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aevc implements AccessibilityManager.TouchExplorationStateChangeListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ View a;
    public final /* synthetic */ ast b;

    public /* synthetic */ aevc(ast astVar, View view, int i) {
        this.$cid = i;
        this.b = astVar;
        this.a = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        if (this.$cid != 0) {
            if (z) {
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.b;
                if (hideBottomViewOnScrollBehavior.q()) {
                    hideBottomViewOnScrollBehavior.r(this.a);
                    return;
                }
                return;
            }
            return;
        }
        if (z) {
            HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.b;
            if (hideViewOnScrollBehavior.q()) {
                hideViewOnScrollBehavior.r(this.a);
            }
        }
    }
}
