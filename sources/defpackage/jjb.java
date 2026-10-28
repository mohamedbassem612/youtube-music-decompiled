package defpackage;

import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jjb implements god, jjj {
    private static final String[] a = {"TAGmusic_onboarding_genre_selection", "TAGmusic_language_selection"};
    private final dd b;
    private final vxe c;
    private final awmd d;
    private final aunn e;

    public jjb(dd ddVar, vxe vxeVar, awmd awmdVar, aunn aunnVar) {
        this.b = ddVar;
        this.c = vxeVar;
        this.d = awmdVar;
        this.e = aunnVar;
    }

    private final Optional g() {
        String[] strArr = a;
        for (int i = 0; i < 2; i++) {
            cc ccVarG = this.b.g(strArr[i]);
            if (ccVarG != null && ccVarG.isResumed() && (ccVarG instanceof jjf)) {
                return Optional.of((jjf) ccVarG);
            }
        }
        return Optional.empty();
    }

    private final void h(hek hekVar) {
        if (g().isPresent()) {
            return;
        }
        if (!f()) {
            WatchWhileLayout watchWhileLayout = (WatchWhileLayout) this.d.io();
            if (watchWhileLayout != null) {
                watchWhileLayout.z();
            }
            aunn aunnVar = this.e;
            if (((abvk) aunnVar.io()).X()) {
                ((abvk) aunnVar.io()).aq(false, 1);
            }
        }
        jjf jjfVar = new jjf();
        hekVar.i("TAGmusic_language_selection");
        jjfVar.a = hekVar;
        dd ddVar = this.b;
        av avVar = new av(ddVar);
        avVar.q(R.id.fragment_container, jjfVar, "TAGmusic_language_selection");
        avVar.o("TAGmusic_language_selection");
        avVar.a(false, true);
        ddVar.ah();
    }

    public final void a(boolean z) {
        String[] strArr = a;
        for (int i = 0; i < 2; i++) {
            cc ccVarG = this.b.g(strArr[i]);
            if (ccVarG instanceof jiy) {
                try {
                    ((jiy) ccVarG).a();
                } catch (jjk unused) {
                    agrx agrxVar = agso.a;
                }
            }
        }
        dd ddVar = this.b;
        bp bpVar = (bp) ddVar.g("FEmusic_tastebuilder");
        if (bpVar != null) {
            bpVar.dismiss();
        }
        String[] strArr2 = a;
        boolean zAe = false;
        for (int i2 = 0; i2 < 2; i2++) {
            zAe |= ddVar.ae(strArr2[i2], -1, 1);
        }
        for (int i3 = 0; i3 < 2; i3++) {
            cc ccVarG2 = ddVar.g(strArr2[i3]);
            if (ccVarG2 != null) {
                av avVar = new av(ddVar);
                avVar.l(ccVarG2);
                avVar.e();
                zAe = true;
            }
        }
        if (zAe) {
            ((abvk) this.e.io()).D();
            if (z) {
                this.c.c(vxh.a("FEmusic_home"), agkj.j("force_refresh", Boolean.TRUE));
            }
        }
    }

    @Override // defpackage.god
    public final cc b() {
        return this.b.g("TAGmusic_language_selection");
    }

    @Override // defpackage.god
    public final void c() {
        Optional optionalG = g();
        if (optionalG.isPresent()) {
            ((jjf) optionalG.get()).e();
        }
    }

    @Override // defpackage.god
    public final void d(hek hekVar) {
        if (!(hekVar instanceof heh)) {
            if (hekVar instanceof jjt) {
                h(hekVar);
                return;
            }
            return;
        }
        heh hehVar = (heh) hekVar;
        int iOrdinal = hehVar.g.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            if (hehVar.m() && hehVar.f().equals("TAGmusic_language_selection")) {
                return;
            }
            h(hehVar);
            return;
        }
        if (iOrdinal == 2) {
            Optional optionalG = g();
            if (optionalG.isPresent()) {
                ((jjf) optionalG.get()).d();
                return;
            } else {
                if (hehVar.m() && hehVar.f().equals("TAGmusic_language_selection")) {
                    return;
                }
                h(hehVar);
                agrx agrxVar = agso.a;
                return;
            }
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                Optional optionalG2 = g();
                if (optionalG2.isPresent()) {
                    ((jjf) optionalG2.get()).e();
                    return;
                } else {
                    if (hehVar.m() && hehVar.f().equals("TAGmusic_language_selection")) {
                        return;
                    }
                    agrx agrxVar2 = agso.a;
                    return;
                }
            }
            return;
        }
        Optional optionalG3 = g();
        if (!optionalG3.isPresent()) {
            if (hehVar.m() && hehVar.f().equals("TAGmusic_language_selection")) {
                return;
            }
            agrx agrxVar3 = agso.a;
            return;
        }
        jjf jjfVar = (jjf) optionalG3.get();
        hek hekVar2 = jjfVar.a;
        if (hekVar2 instanceof heh) {
            elq elqVarF = jjfVar.f();
            String str = ((heh) hekVar2).i;
            if (str != null) {
                ((LoadingFrameLayout) elqVarF.a).f(str, false, false, false);
            }
        }
    }

    @Override // defpackage.jjj
    public final void e() {
        a(true);
    }

    public final boolean f() {
        dd ddVar = this.b;
        return (ddVar.g("TAGmusic_onboarding_genre_selection") == null && ddVar.g("TAGmusic_language_selection") == null) ? false : true;
    }
}
