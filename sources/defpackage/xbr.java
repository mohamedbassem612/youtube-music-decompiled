package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xbr extends View.AccessibilityDelegate {
    final /* synthetic */ xcb a;
    final /* synthetic */ aqof b;

    public xbr(xcb xcbVar, aqof aqofVar) {
        this.a = xcbVar;
        this.b = aqofVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        String strValueOf = String.valueOf(this.a.x().getHint());
        alay alayVar = this.b.c;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        accessibilityNodeInfo.setText(strValueOf + ' ' + String.valueOf(ackj.k(null, alayVar, null, false)));
    }
}
