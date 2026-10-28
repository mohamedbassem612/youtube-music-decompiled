package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class oj extends axx {
    final RecyclerView a;
    public final oi b;

    public oj(RecyclerView recyclerView) {
        this.a = recyclerView;
        axx axxVarA = a();
        if (axxVarA == null || !(axxVarA instanceof oi)) {
            this.b = new oi(this);
        } else {
            this.b = (oi) axxVarA;
        }
    }

    public axx a() {
        return this.b;
    }

    final boolean b() {
        return this.a.as();
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        np npVar;
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || b() || (npVar = ((RecyclerView) view).n) == null) {
            return;
        }
        npVar.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        np npVar;
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        if (b() || (npVar = this.a.n) == null) {
            return;
        }
        npVar.onInitializeAccessibilityNodeInfo(bbzVar);
    }

    @Override // defpackage.axx
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        np npVar;
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (b() || (npVar = this.a.n) == null) {
            return false;
        }
        return npVar.performAccessibilityAction(i, bundle);
    }
}
