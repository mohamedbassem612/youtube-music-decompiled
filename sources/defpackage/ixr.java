package defpackage;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ixr {
    public final View a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e = 300;
    public int f = -1;
    public Animator g;

    public ixr(View view) {
        this.a = view;
        a();
        this.b = false;
        this.c = false;
        view.setClickable(false);
        view.setOnClickListener(null);
    }

    public final void a() {
        View view = this.a;
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setVisibility(8);
    }
}
