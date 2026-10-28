package defpackage;

import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iov implements jab {
    private static final agrf b = agrf.h("com/google/android/apps/youtube/music/settings/TwoPaneSettingsController");
    public final cf a;

    public iov(cf cfVar) {
        this.a = cfVar;
    }

    private final cc d(dd ddVar, gzn gznVar) {
        cj cjVarJ = ddVar.j();
        this.a.getClassLoader();
        return cjVarJ.b(gznVar.n);
    }

    private final void e() {
        View viewFindViewById = this.a.findViewById(R.id.root_view);
        if (viewFindViewById != null) {
            bcs bcsVar = new bcs(this, 5);
            int i = bac.a;
            azs.c(viewFindViewById, bcsVar);
            viewFindViewById.requestApplyInsets();
        }
    }

    @Override // defpackage.jab
    public final int a() {
        return R.layout.two_pane_preference_activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jab
    public final void b(cc ccVar, String str, CharSequence charSequence) {
        cf cfVar = this.a;
        dd supportFragmentManager = cfVar.getSupportFragmentManager();
        if (!tuk.s(supportFragmentManager)) {
            ((agrc) ((agrc) b.c().i(agso.a, "TwoPaneSettingsCtlr")).k("com/google/android/apps/youtube/music/settings/TwoPaneSettingsController", "showFragment", 53, "TwoPaneSettingsController.java")).t("Unable to show preference fragment.");
            return;
        }
        gzn gznVar = gzn.SETTINGS_HEADERS_FRAGMENT;
        if (str.equals(gznVar.n)) {
            av avVar = new av(supportFragmentManager);
            avVar.q(R.id.headers_container, ccVar, null);
            avVar.q(R.id.content, d(supportFragmentManager, gzn.GENERAL_SETTINGS_FRAGMENT), null);
            avVar.e();
        } else if (supportFragmentManager.f(R.id.headers_container) == null) {
            av avVar2 = new av(supportFragmentManager);
            avVar2.q(R.id.headers_container, d(supportFragmentManager, gznVar), null);
            avVar2.q(R.id.content, ccVar, null);
            avVar2.e();
        } else {
            av avVar3 = new av(supportFragmentManager);
            avVar3.q(R.id.content, ccVar, null);
            avVar3.e();
        }
        cc ccVarF = supportFragmentManager.f(R.id.content);
        if (ccVarF != null) {
            ((ion) cfVar).hC(ccVarF);
        }
        e();
    }

    @Override // defpackage.jab
    public final void c() {
        e();
    }
}
