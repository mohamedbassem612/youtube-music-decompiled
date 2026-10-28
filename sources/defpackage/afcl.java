package defpackage;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class afcl extends axx {
    final /* synthetic */ afcr a;

    public afcl(afcr afcrVar) {
        this.a = afcrVar;
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        bbzVar.j(1048576);
        bbzVar.A(true);
    }

    @Override // defpackage.axx
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i != 1048576) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        this.a.e(3);
        return true;
    }
}
