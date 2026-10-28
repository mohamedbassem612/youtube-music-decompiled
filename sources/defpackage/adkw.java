package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adkw extends adkv {
    @Override // defpackage.adkv
    protected final /* bridge */ /* synthetic */ ViewGroup a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ae(0));
        frameLayout.setId(View.generateViewId());
        return frameLayout;
    }
}
