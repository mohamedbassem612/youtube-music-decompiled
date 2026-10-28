package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class feo extends fef {
    public final View a;
    public final afwv b;

    public feo(View view) {
        if (view == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.a = view;
        this.b = new afwv(view);
    }

    @Override // defpackage.fef, defpackage.fem
    public final fdx d() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof fdx) {
            return (fdx) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // defpackage.fef, defpackage.fem
    public final void f(fdx fdxVar) {
        p(fdxVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    @Override // defpackage.fem
    public void g(fed fedVar) {
        afwv afwvVar = this.b;
        int iK = afwvVar.k();
        int iJ = afwvVar.j();
        if (afwv.m(iK, iJ)) {
            fedVar.d(iK, iJ);
            return;
        }
        ?? r0 = afwvVar.a;
        if (!r0.contains(fedVar)) {
            r0.add(fedVar);
        }
        if (afwvVar.b == null) {
            ViewTreeObserver viewTreeObserver = ((View) afwvVar.c).getViewTreeObserver();
            afwvVar.b = new fen(afwvVar);
            viewTreeObserver.addOnPreDrawListener(afwvVar.b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.fem
    public final void h(fed fedVar) {
        this.b.a.remove(fedVar);
    }

    public final View o() {
        return this.a;
    }

    public final void p(Object obj) {
        this.a.setTag(R.id.glide_custom_view_target_tag, obj);
    }

    public final String toString() {
        return "Target for: ".concat(this.a.toString());
    }
}
