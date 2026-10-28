package defpackage;

import androidx.preference.PreferenceCategory;
import com.google.android.apps.youtube.music.settings.fragment.RestrictedModeSettingsFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ipw {
    public final RestrictedModeSettingsFragment a;
    public final iol b;
    public final woh c;
    public final xeu d;
    public PreferenceCategory e;
    private final jkp f;

    public ipw(RestrictedModeSettingsFragment restrictedModeSettingsFragment, iol iolVar, jkp jkpVar, woh wohVar, xeu xeuVar) {
        this.a = restrictedModeSettingsFragment;
        this.b = iolVar;
        this.f = jkpVar;
        this.c = wohVar;
        this.d = xeuVar;
    }

    public final void a(CharSequence charSequence) {
        PreferenceCategory preferenceCategory = this.e;
        if (preferenceCategory == null || preferenceCategory.ag(charSequence)) {
            return;
        }
        this.e.ag(this.f.b(charSequence.toString()));
    }
}
