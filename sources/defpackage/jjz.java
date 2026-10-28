package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jjz extends View.AccessibilityDelegate {
    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.getText().add(view.getContentDescription());
        }
    }
}
