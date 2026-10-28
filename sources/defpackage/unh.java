package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.creation.editor.ShortsPlayerView;
import com.google.android.libraries.youtube.creation.editor.ShortsPlayerViewContainer;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class unh implements uvw {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/editor/image/ImageEditorController");
    public final umf A;
    public final uvx B;
    public final vjf C;
    public unn D;
    public final vxz E;
    public final roq F;
    public final roq G;
    public final xpl H;
    final ukd b;
    public final uxj c;
    public final ulp d;
    public final uwb e;
    public final ShortsPlayerView f;
    public final ShortsPlayerViewContainer g;
    public final cc h;
    public final ulx i;
    public final und j;
    public final vfq k;
    public final ahey l;
    public final Executor m;
    public final View n;
    public final aefv o;
    public final aeew p;
    public final Context q;
    public final wbz r;
    public final zwh s;
    public final ukp t;
    public final vjn u;
    public final uof v;
    public final View w;
    public final unf y;
    public final ViewTreeObserver.OnGlobalLayoutListener x = new ung(this, getClass().getSimpleName());
    public boolean z = true;

    /* JADX WARN: Code duplicated, block: B:12:0x0103  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r13v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [awmd, java.lang.Object] */
    public unh(aehs aehsVar, uxj uxjVar, ulp ulpVar, awmd awmdVar, cc ccVar, uvx uvxVar, und undVar, vfq vfqVar, aefv aefvVar, aeew aeewVar, ahey aheyVar, Executor executor, umf umfVar, uwb uwbVar, roq roqVar, Map map, vxz vxzVar, vjn vjnVar, vjf vjfVar, uof uofVar, Context context, Map map2, wbz wbzVar, zwh zwhVar, ukp ukpVar, View view, roq roqVar2, unf unfVar) {
        ulx ulxVarA;
        this.A = umfVar;
        this.t = ukpVar;
        this.w = view;
        this.v = uofVar;
        ShortsPlayerView shortsPlayerView = (ShortsPlayerView) view.findViewById(R.id.shorts_edit_player_view);
        this.f = shortsPlayerView;
        this.g = (ShortsPlayerViewContainer) view.findViewById(R.id.shorts_edit_player_view_wrapper);
        this.n = view.findViewById(R.id.spinner_view_container);
        this.G = roqVar;
        una unaVar = new una(shortsPlayerView.d, Optional.empty(), ccVar.getResources().getColor(R.color.shorts_edit_guideline_positional_color), ccVar.getResources().getColor(R.color.shorts_edit_guideline_rotational_color), roqVar.a);
        this.h = ccVar;
        this.B = uvxVar;
        this.c = uxjVar;
        this.d = ulpVar;
        this.j = undVar;
        this.k = vfqVar;
        this.p = aeewVar;
        this.o = aefvVar;
        this.l = aheyVar;
        this.m = executor;
        this.e = uwbVar;
        this.E = vxzVar;
        this.u = vjnVar;
        this.C = vjfVar;
        this.q = context;
        this.F = roqVar2;
        this.r = wbzVar;
        this.s = zwhVar;
        this.y = unfVar;
        ulx ulxVar = (ulx) map.get(a());
        ulxVar.getClass();
        if (unfVar == null) {
            ulxVarA = ulxVar;
        } else if (vxzVar.m(32, 45637389L) && !unfVar.j) {
            ulv ulvVar = new ulv(ulxVar);
            ulvVar.b(unfVar.b);
            ulxVarA = ulvVar.a();
        } else if (unfVar.j) {
            ulv ulvVar2 = new ulv(ulxVar);
            ulvVar2.c(false);
            ulvVar2.e = 1;
            ulvVar2.b(-1.0f);
            ulxVarA = ulvVar2.a();
        } else {
            ulxVarA = ulxVar;
        }
        this.i = ulxVarA;
        umi umiVar = new umi();
        Optional optionalEmpty = Optional.empty();
        umt umtVar = (umt) map2.get(a());
        umtVar.getClass();
        ufs ufsVarA = a();
        Executor executor2 = (Executor) aehsVar.i.io();
        executor2.getClass();
        uvz uvzVar = (uvz) aehsVar.g.io();
        ukp ukpVar2 = (ukp) aehsVar.a.io();
        ukpVar2.getClass();
        umf umfVar2 = (umf) aehsVar.d.io();
        umfVar2.getClass();
        xsc xscVar = (xsc) aehsVar.h.io();
        aczl aczlVar = (aczl) aehsVar.c.io();
        xte xteVar = (xte) aehsVar.f.io();
        ((ulj) aehsVar.b.io()).getClass();
        Context context2 = (Context) aehsVar.e.io();
        context2.getClass();
        this.b = new ukd(executor2, uvzVar, ukpVar2, umfVar2, xscVar, aczlVar, xteVar, context2, new ukc(uwbVar, ulpVar, unaVar, awmdVar, view, umiVar, ulxVar, optionalEmpty, umtVar, ufsVarA));
        this.H = new xpl(shortsPlayerView.b, shortsPlayerView, (char[]) null);
    }

    @Override // defpackage.uvw
    public final void A(augy augyVar) {
        if (this.E.l(70, 45758187L, false)) {
            this.d.i();
        }
    }

    public final ufs a() {
        unf unfVar = this.y;
        return unfVar != null ? unfVar.h : ufs.CREATION_FLOW_UNKNOWN;
    }

    @Override // defpackage.uvw
    public final void v(auan auanVar) {
        if (this.z) {
            this.b.v(auanVar);
        }
    }

    @Override // defpackage.uvw
    public final void w(uxi uxiVar) {
        if (this.z) {
            this.b.w(uxiVar);
        }
    }

    @Override // defpackage.uvw
    public final void y(boolean z) {
        if (this.z) {
            this.b.y(z);
        }
    }

    @Override // defpackage.uvw
    public final void z(boolean z, boolean z2) {
        if (this.z) {
            if (!z) {
                this.d.i();
            }
            this.b.z(z, z2);
        }
    }

    @Override // defpackage.uvw
    public final void x() {
    }

    @Override // defpackage.uvw
    public final /* synthetic */ void t(uxi uxiVar) {
    }

    @Override // defpackage.uvw
    public final /* synthetic */ void u(auaj auajVar) {
    }
}
