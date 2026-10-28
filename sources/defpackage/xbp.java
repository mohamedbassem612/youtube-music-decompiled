package defpackage;

import android.view.View;
import com.google.android.apps.youtube.music.ui.preference.CustomPreferenceFragmentCompat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xbp implements ayx {
    private final /* synthetic */ int $cid;

    public /* synthetic */ xbp(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ayx
    public final bbn a(View view, bbn bbnVar) {
        if (this.$cid != 0) {
            CustomPreferenceFragmentCompat.lambda$onCreateView$0(view, bbnVar);
            return bbnVar;
        }
        view.setPadding(0, 0, 0, bbnVar.f(655).e);
        return bbn.a;
    }
}
