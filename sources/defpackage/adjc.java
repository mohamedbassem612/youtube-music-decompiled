package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adjc implements fem {
    public final aqmh a;
    public final adhr b;
    private final adht c;
    private final fek d;
    private final adhu e;
    private final mbc f;
    private boolean g = false;

    public adjc(fek fekVar, adhr adhrVar, aqmh aqmhVar, adhu adhuVar, adht adhtVar, mbc mbcVar) {
        this.d = fekVar;
        this.b = adhrVar;
        this.a = aqmhVar;
        this.e = adhuVar;
        this.c = adhtVar;
        this.f = mbcVar;
    }

    private final void j(ImageView imageView) {
        this.g = true;
        adht adhtVar = this.c;
        if (adhtVar != null) {
            adhtVar.a(imageView);
        }
        this.e.g(imageView, this.b, this.a);
    }

    @Override // defpackage.fem
    public final void a(Drawable drawable) {
        fek fekVar = this.d;
        View view = fekVar.a;
        if (!this.g) {
            j((ImageView) view);
        }
        fekVar.a(drawable);
        adht adhtVar = this.c;
        if (adhtVar != null) {
            adhtVar.c();
        }
        this.e.e((ImageView) view, this.b, this.a);
    }

    @Override // defpackage.fem
    public final void b(Object obj, fev fevVar) {
        fek fekVar = this.d;
        View view = fekVar.a;
        if (!this.g) {
            j((ImageView) view);
        }
        this.f.b();
        fekVar.b(obj, fevVar);
        adht adhtVar = this.c;
        if (adhtVar != null) {
            adhtVar.b((ImageView) view);
        }
        this.e.i(this);
    }

    @Override // defpackage.fem
    public final fdx d() {
        return this.d.d();
    }

    @Override // defpackage.fem
    public final void e(Drawable drawable) {
        fek fekVar = this.d;
        fekVar.e(drawable);
        j((ImageView) fekVar.a);
    }

    @Override // defpackage.fem
    public final void f(fdx fdxVar) {
        this.d.p(fdxVar);
    }

    @Override // defpackage.fem
    public final void g(fed fedVar) {
        this.d.g(fedVar);
    }

    @Override // defpackage.fem
    public final void gG(Drawable drawable) {
        fek fekVar = this.d;
        fekVar.gG(drawable);
        adht adhtVar = this.c;
        if (adhtVar != null) {
            adhtVar.d();
        }
        this.e.f((ImageView) fekVar.a, this.b, this.a);
    }

    @Override // defpackage.fem
    public final void h(fed fedVar) {
        this.d.h(fedVar);
    }

    public final ImageView i() {
        return (ImageView) this.d.a;
    }

    @Override // defpackage.fcz
    public final void l() {
        this.d.l();
    }

    @Override // defpackage.fcz
    public final void m() {
        this.d.m();
    }

    @Override // defpackage.fcz
    public final void k() {
    }
}
