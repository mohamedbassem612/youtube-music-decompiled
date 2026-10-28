package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jgr extends axx {
    final /* synthetic */ jgs a;

    public jgr(jgs jgsVar) {
        this.a = jgsVar;
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        bbzVar.k(new bby(null, R.id.custom_action_remove_from_queue, this.a.a.getString(R.string.custom_action_remove_from_queue_description), null, null));
    }

    @Override // defpackage.axx
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i != R.id.custom_action_remove_from_queue) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        jgs jgsVar = this.a;
        jgsVar.b.kk(jgsVar.j);
        return true;
    }
}
