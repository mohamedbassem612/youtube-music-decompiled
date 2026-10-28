package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vtr extends axx {
    final /* synthetic */ Context a;

    public vtr(Context context) {
        this.a = context;
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        bbzVar.k(new bby(null, 16, this.a.getString(R.string.accessibility_collapse_text), null, null));
    }
}
