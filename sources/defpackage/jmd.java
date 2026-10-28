package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jmd extends axx {
    final /* synthetic */ jmg a;

    public jmd(jmg jmgVar) {
        this.a = jmgVar;
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        bbzVar.v(View.class.getName());
        bbzVar.k(new bby(null, 16, this.a.getString(R.string.accessibility_action_dismiss_dialog_sheet), null, null));
    }

    @Override // defpackage.axx
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        this.a.q();
        return true;
    }
}
