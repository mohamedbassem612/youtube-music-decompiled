package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class iza extends axx {
    final /* synthetic */ izd a;

    public iza(izd izdVar) {
        this.a = izdVar;
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        if (this.a.d != null) {
            bbzVar.k(bby.a);
        }
    }

    @Override // defpackage.axx
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().clear();
            accessibilityEvent.getText().add(view.getResources().getString(R.string.chip_selected_a11y_text));
        }
    }

    @Override // defpackage.axx
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        izd izdVar = this.a;
        if (izdVar.d != null) {
            izdVar.e();
        }
        if (izdVar.e != null) {
            izdVar.d();
        }
        return true;
    }
}
