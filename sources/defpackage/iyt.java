package defpackage;

import android.R;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iyt extends gr {
    qr a;
    public final jjm b;

    public iyt(Context context, int i, jjm jjmVar) {
        super(context, i);
        this.b = jjmVar;
    }

    @Override // defpackage.gr, defpackage.qg, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 29 && (window = getWindow()) != null) {
            window.setNavigationBarColor(getContext().getColor(R.color.transparent));
        }
        this.a = new iys(this, this.b != null);
        getOnBackPressedDispatcher().c(this, this.a);
    }

    @Override // defpackage.gr, defpackage.qg, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(view);
        if (Build.VERSION.SDK_INT >= 29) {
            view.setSystemUiVisibility(1792);
        }
    }
}
