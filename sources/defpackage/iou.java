package defpackage;

import android.text.TextUtils;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iou implements jab {
    private static final agrf a = agrf.h("com/google/android/apps/youtube/music/settings/SinglePaneSettingsController");
    private final cf b;

    public iou(cf cfVar) {
        this.b = cfVar;
    }

    @Override // defpackage.jab
    public final int a() {
        return R.layout.preference_activity;
    }

    @Override // defpackage.jab
    public final void b(cc ccVar, String str, CharSequence charSequence) {
        dd supportFragmentManager = this.b.getSupportFragmentManager();
        if (!tuk.s(supportFragmentManager)) {
            ((agrc) ((agrc) a.c().i(agso.a, "SinglePaneSettingsCtlr")).k("com/google/android/apps/youtube/music/settings/SinglePaneSettingsController", "showFragment", 47, "SinglePaneSettingsController.java")).t("Unable to show preference fragment.");
            return;
        }
        av avVar = new av(supportFragmentManager);
        avVar.q(R.id.content, ccVar, null);
        if (!TextUtils.isEmpty(charSequence)) {
            avVar.n = 0;
            avVar.o = charSequence;
        }
        avVar.o(str);
        if (avVar.j()) {
            return;
        }
        avVar.a(false, true);
        supportFragmentManager.ah();
    }

    @Override // defpackage.jab
    public final void c() {
    }
}
