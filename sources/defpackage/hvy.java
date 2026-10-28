package defpackage;

import android.view.View;
import android.widget.Button;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hvy extends axx {
    final /* synthetic */ hvz a;
    final /* synthetic */ aesp b;

    public hvy(hvz hvzVar, aesp aespVar) {
        this.b = aespVar;
        this.a = hvzVar;
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        bbzVar.v(Button.class.getName());
        bbzVar.k(new bby(null, 16, this.a.a(this.b.r()), null, null));
    }
}
