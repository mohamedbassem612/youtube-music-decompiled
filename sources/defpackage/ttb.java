package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Button;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ttb extends axx {
    @Override // defpackage.axx
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        bbzVar.v(Button.class.getName());
    }
}
