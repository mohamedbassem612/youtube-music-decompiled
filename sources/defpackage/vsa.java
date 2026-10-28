package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vsa extends vrk {
    final Optional d;
    final tbt e;
    private LoadingFrameLayout f = null;

    public vsa(Optional optional, tbt tbtVar) {
        this.d = optional;
        this.e = tbtVar;
    }

    private final void p() {
        if (this.f == null) {
            Optional optional = this.d;
            if (optional.isPresent()) {
                this.f = (LoadingFrameLayout) ((vrz) optional.get()).a();
            }
        }
    }

    @Override // defpackage.vox
    public final void c() {
        vrl vrlVar = new vrl(this, 3);
        Optional optional = this.d;
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            ((vsa) vrlVar.a).e.l((vrz) obj);
        }
    }

    @Override // defpackage.vrk, defpackage.vro
    public final /* bridge */ /* synthetic */ void j(Object obj, boolean z, adxd adxdVar) {
        aovg aovgVar = (aovg) obj;
        super.j(aovgVar, z, adxdVar);
        p();
        LoadingFrameLayout loadingFrameLayout = this.f;
        if (aovgVar != null) {
            Optional optional = this.d;
            if (!optional.isPresent() || loadingFrameLayout == null) {
                return;
            }
            ((vrz) optional.get()).b();
            ((vrz) optional.get()).c();
            loadingFrameLayout.a();
        }
    }

    @Override // defpackage.vro
    public final View k() {
        p();
        LoadingFrameLayout loadingFrameLayout = this.f;
        loadingFrameLayout.getClass();
        return loadingFrameLayout;
    }

    @Override // defpackage.vro
    public final agev l() {
        return agdf.a;
    }

    @Override // defpackage.vro
    public final agev m() {
        return agdf.a;
    }

    @Override // defpackage.vro
    public final void q() {
        vrl vrlVar = new vrl(this, 2);
        Optional optional = this.d;
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            ((vsa) vrlVar.a).e.f((vrz) obj);
        }
    }

    @Override // defpackage.vro
    public final boolean s() {
        return false;
    }

    @Override // defpackage.vro
    public final boolean t() {
        return false;
    }

    @Override // defpackage.adwm
    public final boolean v(String str, int i, Runnable runnable) {
        return false;
    }

    @Override // defpackage.vox
    public final void b() {
    }

    @Override // defpackage.vox
    public final void d() {
    }

    @Override // defpackage.vox
    public final void f() {
    }

    @Override // defpackage.vro
    public final void hP() {
    }

    @Override // defpackage.vro
    public final void o() {
    }

    @Override // defpackage.vro
    public final void r() {
    }

    @Override // defpackage.vro
    public final void n(acjx acjxVar) {
    }
}
