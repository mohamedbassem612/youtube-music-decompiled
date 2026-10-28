package defpackage;

import com.google.android.apps.youtube.music.settings.fragment.PrivacyPrefsFragmentCompat;
import j$.lang.Iterable$EL;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ipr implements ios {
    public final PrivacyPrefsFragmentCompat a;
    public final woh b;
    public final xeu c;
    public final zwb d;
    public final Executor e;
    public final syn f;
    private final iol g;
    private final hfx h;
    private final vxz i;

    public ipr(PrivacyPrefsFragmentCompat privacyPrefsFragmentCompat, woh wohVar, xeu xeuVar, iol iolVar, zwb zwbVar, syn synVar, hfx hfxVar, vxz vxzVar, Executor executor) {
        this.a = privacyPrefsFragmentCompat;
        this.b = wohVar;
        this.c = xeuVar;
        this.g = iolVar;
        this.d = zwbVar;
        this.f = synVar;
        this.h = hfxVar;
        this.i = vxzVar;
        this.e = executor;
    }

    @Override // defpackage.ios
    public final void onSettingsLoaded() {
        apqt apqtVarL;
        PrivacyPrefsFragmentCompat privacyPrefsFragmentCompat = this.a;
        if (!privacyPrefsFragmentCompat.isAdded() || privacyPrefsFragmentCompat.getActivity() == null || (apqtVarL = ((iot) privacyPrefsFragmentCompat.getActivity()).l(aprv.SETTING_CAT_MUSIC_PRIVACY)) == null) {
            return;
        }
        this.g.a(privacyPrefsFragmentCompat, apqtVarL.d);
        if (this.i.l(5, 45671827L, false)) {
            Set set = this.h.h;
            synchronized (set) {
            }
            Iterable$EL.forEach(set, new hsk(this, 15));
        }
    }
}
