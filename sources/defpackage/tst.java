package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tst extends axx {
    final /* synthetic */ AccessibilityLayerLayout a;

    public tst(AccessibilityLayerLayout accessibilityLayerLayout) {
        this.a = accessibilityLayerLayout;
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        this.a.a();
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
    }

    @Override // defpackage.axx
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        AccessibilityLayerLayout accessibilityLayerLayout = this.a;
        boolean z = false;
        if (!accessibilityLayerLayout.c(view)) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams.width == layoutParams2.width && layoutParams.height == layoutParams2.height) {
            z = true;
        }
        accessibilityEvent.setFullScreen(z);
        hhb hhbVar = accessibilityLayerLayout.f;
        if (hhbVar != null && (accessibilityEvent.getEventType() & 1) == 1) {
            jin jinVar = (jin) ((get) hhbVar.a).aw.io();
            if (twb.c(jinVar.a)) {
                jinVar.b();
            }
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
