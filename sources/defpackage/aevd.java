package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aevd implements View.OnAttachStateChangeListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ ast a;

    public aevd(ast astVar, int i) {
        this.$cid = i;
        this.a = astVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        int i = this.$cid;
        ast astVar = this.a;
        if (i != 0) {
            HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) astVar;
            AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = hideBottomViewOnScrollBehavior.c;
            if (touchExplorationStateChangeListener == null || (accessibilityManager2 = hideBottomViewOnScrollBehavior.b) == null) {
                return;
            }
            accessibilityManager2.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
            hideBottomViewOnScrollBehavior.c = null;
            return;
        }
        HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) astVar;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener2 = hideViewOnScrollBehavior.c;
        if (touchExplorationStateChangeListener2 == null || (accessibilityManager = hideViewOnScrollBehavior.b) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener2);
        hideViewOnScrollBehavior.c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
