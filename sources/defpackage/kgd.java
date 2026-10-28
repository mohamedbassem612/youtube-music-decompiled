package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import app.rive.semantics.SemanticState;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kgd extends View.AccessibilityDelegate {
    final /* synthetic */ CastSeekBar a;

    public kgd(CastSeekBar castSeekBar) {
        this.a = castSeekBar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(SeekBar.class.getName());
        CastSeekBar castSeekBar = this.a;
        accessibilityEvent.setItemCount(castSeekBar.a.b);
        castSeekBar.a();
        accessibilityEvent.setCurrentItemIndex(0);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        if (view.isEnabled()) {
            accessibilityNodeInfo.addAction(SemanticState.Obscured);
            accessibilityNodeInfo.addAction(SemanticState.Multiline);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (!view.isEnabled()) {
            return false;
        }
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (i != 4096 && i != 8192) {
            return false;
        }
        CastSeekBar castSeekBar = this.a;
        int i2 = castSeekBar.a.b;
        castSeekBar.a();
        boolean z = castSeekBar.a.f;
        return false;
    }
}
