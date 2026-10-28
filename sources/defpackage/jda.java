package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jda extends axx {
    @Override // defpackage.axx
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        view.setClickable(false);
        view.setLongClickable(false);
    }
}
