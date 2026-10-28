package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class fek extends feo implements feu {
    private Animatable c;

    public fek(ImageView imageView) {
        super(imageView);
    }

    private final void q(Object obj) {
        if (!(obj instanceof Animatable)) {
            this.c = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.c = animatable;
        animatable.start();
    }

    private final void r(Object obj) {
        i(obj);
        q(obj);
    }

    @Override // defpackage.fef, defpackage.fem
    public void a(Drawable drawable) {
        r(null);
        n(drawable);
    }

    @Override // defpackage.fem
    public void b(Object obj, fev fevVar) {
        if (fevVar == null || !fevVar.a(obj, this)) {
            r(obj);
        } else {
            q(obj);
        }
    }

    @Override // defpackage.fef, defpackage.fem
    public void e(Drawable drawable) {
        r(null);
        n(drawable);
    }

    @Override // defpackage.fef, defpackage.fem
    public void gG(Drawable drawable) {
        this.b.l();
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
        r(null);
        n(drawable);
    }

    protected abstract void i(Object obj);

    @Override // defpackage.feu
    public final Drawable j() {
        return ((ImageView) this.a).getDrawable();
    }

    @Override // defpackage.fef, defpackage.fcz
    public final void l() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.fef, defpackage.fcz
    public final void m() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // defpackage.feu
    public final void n(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }
}
