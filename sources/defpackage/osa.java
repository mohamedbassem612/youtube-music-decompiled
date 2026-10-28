package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class osa extends axx {
    final /* synthetic */ asuy a;

    public osa(asuy asuyVar) {
        this.a = asuyVar;
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        bbzVar.F(this.a.aT());
    }
}
