package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abhj extends View.AccessibilityDelegate {
    final /* synthetic */ abhk a;

    protected abhj(abhk abhkVar) {
        this.a = abhkVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(SeekBar.class.getName());
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(this.a.r());
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setContentDescription(this.a.r());
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        if (view.isEnabled()) {
            accessibilityNodeInfo.addAction(SemanticState.Obscured);
            accessibilityNodeInfo.addAction(SemanticState.Multiline);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        long jMax;
        if (!view.isEnabled()) {
            return false;
        }
        if (!super.performAccessibilityAction(view, i, bundle)) {
            if (i != 4096 && i != 8192) {
                return false;
            }
            abhk abhkVar = this.a;
            long jP = abhkVar.p() / 20;
            if (i == 4096) {
                jMax = Math.min(abhkVar.k.g(), abhkVar.a() + jP);
                abhkVar.l = jMax;
            } else {
                jMax = Math.max(abhkVar.k.h(), abhkVar.a() - jP);
                abhkVar.l = jMax;
            }
            abhkVar.m.a(3, jMax);
            abhkVar.e();
            abhkVar.invalidate();
            view.sendAccessibilityEvent(4);
        }
        return true;
    }
}
