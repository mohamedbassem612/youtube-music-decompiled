package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class fgz extends axx {
    final /* synthetic */ fha a;

    public fgz(fha fhaVar) {
        this.a = fhaVar;
    }

    @Override // defpackage.axx
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return super/*bdl*/.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super/*bdl*/.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        super/*bdl*/.onInitializeAccessibilityNodeInfo(view, bbzVar);
    }

    @Override // defpackage.axx
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super/*bdl*/.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.axx
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return super/*bdl*/.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.axx
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return super/*bdl*/.performAccessibilityAction(view, i, bundle);
    }

    @Override // defpackage.axx
    public final void sendAccessibilityEvent(View view, int i) {
        super/*bdl*/.sendAccessibilityEvent(view, i);
    }

    @Override // defpackage.axx
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        super/*bdl*/.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
