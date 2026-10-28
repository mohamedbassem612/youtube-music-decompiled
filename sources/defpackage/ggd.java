package defpackage;

import android.R;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ggd {
    public boolean a;
    public int b;
    private final View c;

    public ggd(View view) {
        view.getClass();
        this.c = view;
        this.b = view.getResources().getInteger(R.integer.config_mediumAnimTime);
        bac.x(view).o();
        view.setAlpha(1.0f);
        this.a = false;
    }

    public final void a() {
        if (this.a) {
            return;
        }
        View view = this.c;
        if (view.getVisibility() == 0) {
            bac.x(view).o();
            ci ciVarX = bac.x(view);
            ciVarX.q(0.0f);
            ciVarX.r(this.b);
            ciVarX.x();
            ciVarX.t(new ggc(this));
            ciVarX.p();
        }
    }

    public final void b() {
        if (this.a || this.c.getVisibility() != 0) {
            View view = this.c;
            bac.x(view).o();
            view.setAlpha(0.0f);
            view.setVisibility(0);
            ci ciVarX = bac.x(view);
            ciVarX.q(1.0f);
            ciVarX.r(this.b);
            ciVarX.x();
            ciVarX.t(null);
            ciVarX.p();
        }
    }
}
