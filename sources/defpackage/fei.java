package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class fei implements fem {
    protected final View a;
    private final ahto b;

    public fei(View view) {
        if (view == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.a = view;
        this.b = new ahto(view);
    }

    protected abstract void c();

    @Override // defpackage.fem
    public final fdx d() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof fdx) {
            return (fdx) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // defpackage.fem
    public final void f(fdx fdxVar) {
        this.a.setTag(R.id.glide_custom_view_target_tag, fdxVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    @Override // defpackage.fem
    public final void g(fed fedVar) {
        ahto ahtoVar = this.b;
        int iP = ahtoVar.p();
        int iO = ahtoVar.o();
        if (ahto.r(iP, iO)) {
            fedVar.d(iP, iO);
            return;
        }
        ?? r0 = ahtoVar.b;
        if (!r0.contains(fedVar)) {
            r0.add(fedVar);
        }
        if (ahtoVar.c == null) {
            ViewTreeObserver viewTreeObserver = ((View) ahtoVar.a).getViewTreeObserver();
            ahtoVar.c = new feh(ahtoVar);
            viewTreeObserver.addOnPreDrawListener(ahtoVar.c);
        }
    }

    @Override // defpackage.fem
    public final void gG(Drawable drawable) {
        this.b.q();
        c();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.fem
    public final void h(fed fedVar) {
        this.b.b.remove(fedVar);
    }

    public final String toString() {
        return "Target for: ".concat(this.a.toString());
    }

    @Override // defpackage.fcz
    public final void k() {
    }

    @Override // defpackage.fcz
    public final void l() {
    }

    @Override // defpackage.fcz
    public final void m() {
    }

    @Override // defpackage.fem
    public final void e(Drawable drawable) {
    }
}
