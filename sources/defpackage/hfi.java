package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class hfi extends ttb {
    @Override // defpackage.ttb, defpackage.axx
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 4) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }
}
