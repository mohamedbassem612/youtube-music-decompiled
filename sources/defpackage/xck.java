package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xck extends View {
    public wwt a;
    private final Runnable b;

    public xck(Context context) {
        super(context);
        this.b = new wvr(this, 18, null);
        setImportantForAccessibility(2);
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        post(this.b);
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        onConfigurationChanged(getContext().getResources().getConfiguration());
    }
}
