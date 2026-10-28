package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
class bca extends AccessibilityNodeProvider {
    final bcc a;

    public bca(bcc bccVar) {
        this.a = bccVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        bbz bbzVarCreateAccessibilityNodeInfo = this.a.createAccessibilityNodeInfo(i);
        if (bbzVarCreateAccessibilityNodeInfo == null) {
            return null;
        }
        return bbzVarCreateAccessibilityNodeInfo.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        List listFindAccessibilityNodeInfosByText = this.a.findAccessibilityNodeInfosByText(str, i);
        if (listFindAccessibilityNodeInfosByText == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = listFindAccessibilityNodeInfosByText.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((bbz) listFindAccessibilityNodeInfosByText.get(i2)).a);
        }
        return arrayList;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        bbz bbzVarFindFocus = this.a.findFocus(i);
        if (bbzVarFindFocus == null) {
            return null;
        }
        return bbzVarFindFocus.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.performAction(i, i2, bundle);
    }
}
