package defpackage;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aevt extends axx {
    final /* synthetic */ aevw a;

    public aevt(aevw aevwVar) {
        this.a = aevwVar;
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        if (!this.a.d) {
            bbzVar.A(false);
        } else {
            bbzVar.j(1048576);
            bbzVar.A(true);
        }
    }

    @Override // defpackage.axx
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            aevw aevwVar = this.a;
            if (aevwVar.d) {
                aevwVar.cancel();
                return true;
            }
            i = 1048576;
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
