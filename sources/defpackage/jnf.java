package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jnf extends View.AccessibilityDelegate {
    final /* synthetic */ int a;

    public jnf(int i) {
        this.a = i;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Rect rect = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect);
        rect.offset(0, -this.a);
        accessibilityNodeInfo.setBoundsInScreen(rect);
    }
}
