package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aeef extends View.AccessibilityDelegate {
    final /* synthetic */ aeei a;

    public aeef(aeei aeeiVar) {
        this.a = aeeiVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        new bbz(accessibilityNodeInfo).a.setTraversalBefore(this.a.a);
    }
}
