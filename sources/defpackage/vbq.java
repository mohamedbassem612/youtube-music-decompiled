package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class vbq {
    public boolean a;
    public final Object b;
    public final Object c;
    public Object d;

    public vbq() {
        this.c = new agjz(4);
        this.b = new agjz(4);
        this.a = false;
    }

    final void a() {
        ((ImageView) this.b).setImageDrawable((Drawable) this.c);
        this.a = false;
    }

    final void b() {
        Object obj = this.d;
        if (obj == null) {
            a();
        } else {
            ((ImageView) this.b).setImageDrawable((Drawable) obj);
            this.a = true;
        }
    }

    final void c(Drawable drawable) {
        this.d = drawable;
        if (this.a) {
            b();
        }
    }

    public final qok d() {
        this.d.getClass();
        return new qok(((Boolean) this.d).booleanValue(), this.a, ((agjz) this.c).g(), ((agjz) this.b).g());
    }

    public final void e(qom qomVar) {
        this.d.getClass();
        ((agjz) this.c).h(qomVar);
    }

    public final void f() {
        ahno.P(this.d == null, "A SourcePolicy can only set internal() or external() once.");
        this.d = Boolean.FALSE;
    }

    public vbq(anl anlVar) {
        this.c = anlVar;
        this.a = true;
        this.b = new HashMap();
    }

    public vbq(ImageView imageView, Drawable drawable, Drawable drawable2) {
        this.b = imageView;
        this.c = drawable;
        this.d = drawable2;
        imageView.setImageDrawable(drawable);
    }
}
