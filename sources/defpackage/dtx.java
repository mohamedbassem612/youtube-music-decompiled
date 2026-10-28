package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dtx extends axx {
    final /* synthetic */ duc a;

    public dtx(duc ducVar) {
        this.a = ducVar;
    }

    private final boolean a() {
        dts dtsVar = this.a.b;
        return dtsVar != null && dtsVar.g() > 1;
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        duc ducVar;
        dts dtsVar;
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        accessibilityEvent.setScrollable(a());
        if (accessibilityEvent.getEventType() != 4096 || (dtsVar = (ducVar = this.a).b) == null) {
            return;
        }
        accessibilityEvent.setItemCount(dtsVar.g());
        accessibilityEvent.setFromIndex(ducVar.c);
        accessibilityEvent.setToIndex(ducVar.c);
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        bbzVar.v("androidx.viewpager.widget.ViewPager");
        bbzVar.L(a());
        duc ducVar = this.a;
        if (ducVar.canScrollHorizontally(1)) {
            bbzVar.j(SemanticState.Obscured);
        }
        if (ducVar.canScrollHorizontally(-1)) {
            bbzVar.j(SemanticState.Multiline);
        }
    }

    @Override // defpackage.axx
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (i == 4096) {
            duc ducVar = this.a;
            if (ducVar.canScrollHorizontally(1)) {
                ducVar.l(ducVar.c + 1);
                return true;
            }
        } else if (i == 8192) {
            duc ducVar2 = this.a;
            if (ducVar2.canScrollHorizontally(-1)) {
                ducVar2.l(ducVar2.c - 1);
                return true;
            }
        }
        return false;
    }
}
