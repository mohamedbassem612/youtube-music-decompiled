package defpackage;

import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.preference.SwitchCompatPreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jad extends axx {
    final /* synthetic */ SwitchCompatPreference a;

    public jad(SwitchCompatPreference switchCompatPreference) {
        this.a = switchCompatPreference;
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        bbzVar.k(new bby(null, 16, this.a.j.getResources().getText(R.string.accessibility_switch_compact_preference_toggle), null, null));
    }
}
