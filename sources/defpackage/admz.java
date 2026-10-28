package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class admz implements admd {
    private View a;
    private View.OnClickListener b;
    private boolean c;

    public admz(View view) {
        view.getClass();
        this.a = view;
    }

    @Override // defpackage.admd
    public final View a() {
        return this.a;
    }

    @Override // defpackage.admd
    public final void b(boolean z) {
        this.c = z;
        View view = this.a;
        if (view != null) {
            view.setClickable(z);
        }
    }

    @Override // defpackage.admd
    public final void c(View view) {
        view.getClass();
        this.a = view;
        View.OnClickListener onClickListener = this.b;
        if (onClickListener != null) {
            view.setOnClickListener(onClickListener);
        }
        this.a.setClickable(this.c);
    }

    @Override // defpackage.admd
    public final void d(View.OnClickListener onClickListener) {
        this.b = onClickListener;
        View view = this.a;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    @Override // defpackage.admd
    public final void e(adly adlyVar) {
        this.a.getClass();
    }
}
