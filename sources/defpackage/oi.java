package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oi extends axx {
    final oj a;
    public final Map b = new WeakHashMap();

    public oi(oj ojVar) {
        this.a = ojVar;
    }

    @Override // defpackage.axx
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        axx axxVar = (axx) this.b.get(view);
        return axxVar != null ? axxVar.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.axx
    public final bcc getAccessibilityNodeProvider(View view) {
        axx axxVar = (axx) this.b.get(view);
        return axxVar != null ? axxVar.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        axx axxVar = (axx) this.b.get(view);
        if (axxVar != null) {
            axxVar.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        np npVar;
        oj ojVar = this.a;
        if (ojVar.b() || (npVar = ojVar.a.n) == null) {
            super.onInitializeAccessibilityNodeInfo(view, bbzVar);
            return;
        }
        npVar.onInitializeAccessibilityNodeInfoForItem(view, bbzVar);
        axx axxVar = (axx) this.b.get(view);
        if (axxVar != null) {
            axxVar.onInitializeAccessibilityNodeInfo(view, bbzVar);
        } else {
            super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        }
    }

    @Override // defpackage.axx
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        axx axxVar = (axx) this.b.get(view);
        if (axxVar != null) {
            axxVar.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // defpackage.axx
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        axx axxVar = (axx) this.b.get(viewGroup);
        return axxVar != null ? axxVar.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.axx
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        oj ojVar = this.a;
        if (!ojVar.b()) {
            RecyclerView recyclerView = ojVar.a;
            if (recyclerView.n != null) {
                axx axxVar = (axx) this.b.get(view);
                if (axxVar == null ? !super.performAccessibilityAction(view, i, bundle) : !axxVar.performAccessibilityAction(view, i, bundle)) {
                    return recyclerView.n.performAccessibilityActionForItem(view, i, bundle);
                }
                return true;
            }
        }
        return super.performAccessibilityAction(view, i, bundle);
    }

    @Override // defpackage.axx
    public final void sendAccessibilityEvent(View view, int i) {
        axx axxVar = (axx) this.b.get(view);
        if (axxVar != null) {
            axxVar.sendAccessibilityEvent(view, i);
        } else {
            super.sendAccessibilityEvent(view, i);
        }
    }

    @Override // defpackage.axx
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        axx axxVar = (axx) this.b.get(view);
        if (axxVar != null) {
            axxVar.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        } else {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }
}
