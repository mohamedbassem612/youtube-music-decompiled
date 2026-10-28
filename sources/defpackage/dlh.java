package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dlh extends axx {
    final /* synthetic */ dli a;

    public dlh(dli dliVar) {
        this.a = dliVar;
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        dli dliVar = this.a;
        dliVar.d.onInitializeAccessibilityNodeInfo(view, bbzVar);
        RecyclerView recyclerView = dliVar.c;
        int iC = recyclerView.c(view);
        nh nhVar = recyclerView.m;
        if (nhVar instanceof dlb) {
            ((dlb) nhVar).B(iC);
        }
    }

    @Override // defpackage.axx
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.a.d.performAccessibilityAction(view, i, bundle);
    }
}
