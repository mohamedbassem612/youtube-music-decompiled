package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xtc extends axx {
    final /* synthetic */ xtd a;

    public xtc(xtd xtdVar) {
        this.a = xtdVar;
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        if (view instanceof TextView) {
            String string = ((Context) this.a.b).getString(R.string.stop_casting_button_content_description, ((TextView) view).getText());
            bbzVar.O(string);
            bbzVar.z(string);
        }
    }
}
