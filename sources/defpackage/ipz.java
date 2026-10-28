package defpackage;

import android.view.LayoutInflater;
import com.google.android.apps.youtube.music.settings.fragment.SettingsHeadersFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ipz {
    public final SettingsHeadersFragment a;
    public final vxe b;
    public final zwb c;
    public final vxz d;
    public final vxz e;
    public final omj f;
    public final axfd g;

    public ipz(SettingsHeadersFragment settingsHeadersFragment, axfd axfdVar, vxe vxeVar, zwb zwbVar, omj omjVar, vxz vxzVar, vxz vxzVar2) {
        this.a = settingsHeadersFragment;
        this.g = axfdVar;
        this.b = vxeVar;
        this.c = zwbVar;
        this.f = omjVar;
        this.d = vxzVar;
        this.e = vxzVar2;
    }

    public final iot a() {
        LayoutInflater.Factory activity = this.a.getActivity();
        if (activity instanceof iot) {
            return (iot) activity;
        }
        return null;
    }

    public final void b(CharSequence charSequence) {
        ahno.O(this.a.getPreferenceScreen().ag(charSequence));
    }
}
