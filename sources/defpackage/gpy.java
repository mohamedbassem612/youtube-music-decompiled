package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gpy extends gom implements xgm, gno {
    public gnp U;

    @Override // defpackage.gno
    public final void a() {
        isi isiVar;
        if (J() || kro.M(this) || (isiVar = this.P) == null) {
            return;
        }
        isiVar.l();
        this.P.p();
    }

    @Override // defpackage.gno
    public final void b() {
        isi isiVar;
        if (J() || kro.M(this) || (isiVar = this.P) == null) {
            return;
        }
        isiVar.l();
    }

    @Override // defpackage.gnf
    protected final int c() {
        return 119505;
    }

    @Override // defpackage.gnf
    public final String f() {
        return "music_android_onboarding";
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) layoutInflater.inflate(R.layout.onboarding_browse_fragment, viewGroup, false);
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) coordinatorLayout.findViewById(R.id.browse_content);
        if (loadingFrameLayout != null) {
            this.P = this.O.s(loadingFrameLayout);
        }
        this.G.a();
        return coordinatorLayout;
    }

    @Override // defpackage.gnf
    protected final void r(heh hehVar) {
        super.m(hehVar);
        this.c.a(hvo.d(Optional.empty()));
    }

    @Override // defpackage.gnf
    protected final void s(heh hehVar) {
        super.m(hehVar);
        isi isiVar = this.P;
        if (isiVar != null) {
            isiVar.l();
            this.P.p();
        }
    }

    @Override // defpackage.gnf
    protected final void t(heh hehVar) {
        super.t(hehVar);
        isi isiVar = this.P;
        if (isiVar != null) {
            isiVar.l();
            Object obj = hehVar.h;
            if (obj != null) {
                almd almdVar = ((wfy) obj).a;
                if (this.L.h() && (almdVar.b & SemanticState.Hidden) != 0) {
                    alma almaVar = almdVar.h;
                    if (almaVar == null) {
                        almaVar = alma.a;
                    }
                    if (almaVar.b == 371777145) {
                        n();
                        this.U.e(almdVar, this, this);
                        return;
                    }
                }
                this.c.a(hvo.d(Optional.of(almdVar)));
            }
        }
    }

    @Override // defpackage.gnf
    protected final void u(heh hehVar) {
        isi isiVar = this.P;
        if (isiVar != null) {
            isiVar.l();
            this.P.p();
        }
    }

    @Override // defpackage.gnf
    protected final void w(heh hehVar) {
        D(hehVar);
    }
}
