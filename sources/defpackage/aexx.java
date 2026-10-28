package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aexx extends axx {
    final /* synthetic */ CheckableImageButton a;

    public aexx(CheckableImageButton checkableImageButton) {
        this.a = checkableImageButton;
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a.a);
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        CheckableImageButton checkableImageButton = this.a;
        bbzVar.s(checkableImageButton.b);
        bbzVar.u(checkableImageButton.a);
    }
}
