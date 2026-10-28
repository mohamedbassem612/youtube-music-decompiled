package defpackage;

import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.preference.ProtoDataStoreSwitchCompatPreferences;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class izz extends axx {
    final /* synthetic */ ProtoDataStoreSwitchCompatPreferences a;

    public izz(ProtoDataStoreSwitchCompatPreferences protoDataStoreSwitchCompatPreferences) {
        this.a = protoDataStoreSwitchCompatPreferences;
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        view.getClass();
        bbzVar.getClass();
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        CharSequence text = this.a.j.getResources().getText(R.string.accessibility_switch_compact_preference_toggle);
        text.getClass();
        bbzVar.k(new bby(null, 16, text, null, null));
    }
}
