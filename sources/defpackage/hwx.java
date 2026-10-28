package defpackage;

import android.view.View;
import android.widget.Button;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hwx extends axx {
    final /* synthetic */ aunn a;
    final /* synthetic */ hwy b;

    public hwx(hwy hwyVar, aunn aunnVar) {
        this.a = aunnVar;
        this.b = hwyVar;
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        bbzVar.v(Button.class.getName());
        bbzVar.k(new bby(null, 16, this.b.a(((jan) this.a.io()).a()), null, null));
    }
}
