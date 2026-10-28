package defpackage;

import androidx.preference.PreferenceCategory;
import com.google.android.apps.youtube.music.settings.fragment.GeneralSettingsFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ipf {
    public final GeneralSettingsFragment a;
    public final woh b;
    public final xeu c;
    public PreferenceCategory d;
    public final vxz e;
    public final jnj f;
    public final jnm g;
    private final jkp h;

    public ipf(GeneralSettingsFragment generalSettingsFragment, jnm jnmVar, jnj jnjVar, jkp jkpVar, woh wohVar, xeu xeuVar, vxz vxzVar) {
        this.a = generalSettingsFragment;
        this.g = jnmVar;
        this.f = jnjVar;
        this.h = jkpVar;
        this.b = wohVar;
        this.c = xeuVar;
        this.e = vxzVar;
    }

    public final void a(CharSequence charSequence) {
        PreferenceCategory preferenceCategory = this.d;
        if (preferenceCategory == null || preferenceCategory.ag(charSequence)) {
            return;
        }
        this.d.ag(this.h.b(charSequence.toString()));
    }

    public final void b() {
        a("innertube_managed_restricted_mode");
        a("innertube_safety_mode_enabled");
    }
}
