package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bdk extends bcc {
    final /* synthetic */ bdl a;

    public bdk(bdl bdlVar) {
        this.a = bdlVar;
    }

    @Override // defpackage.bcc
    public final bbz createAccessibilityNodeInfo(int i) {
        return bbz.d(this.a.obtainAccessibilityNodeInfo(i));
    }

    @Override // defpackage.bcc
    public final bbz findFocus(int i) {
        bdl bdlVar = this.a;
        int i2 = i == 2 ? bdlVar.mAccessibilityFocusedVirtualViewId : bdlVar.mKeyboardFocusedVirtualViewId;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return createAccessibilityNodeInfo(i2);
    }

    @Override // defpackage.bcc
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.performAction(i, i2, bundle);
    }
}
