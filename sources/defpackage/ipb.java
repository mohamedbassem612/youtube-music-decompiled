package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceCategory;
import com.google.android.apps.youtube.music.settings.fragment.DataSavingSettingsFragment;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ipb {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/settings/fragment/DataSavingSettingsFragmentPeer");
    public final DataSavingSettingsFragment b;
    public final SharedPreferences c;
    public final hvs d;
    public final jkp e;
    public final xgn f;
    public final iqp g;
    public PreferenceCategory h;
    public final hbf i;
    public final jnm j;
    public final axfd k;

    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [awmd, java.lang.Object] */
    public ipb(DataSavingSettingsFragment dataSavingSettingsFragment, SharedPreferences sharedPreferences, axfd axfdVar, hvs hvsVar, jnm jnmVar, jkp jkpVar, hbf hbfVar, ahgb ahgbVar) {
        this.b = dataSavingSettingsFragment;
        this.c = sharedPreferences;
        this.k = axfdVar;
        this.d = hvsVar;
        this.j = jnmVar;
        this.e = jkpVar;
        this.i = hbfVar;
        Context context = (Context) ahgbVar.c.io();
        context.getClass();
        syn synVar = (syn) ahgbVar.e.io();
        synVar.getClass();
        zwb zwbVar = (zwb) ahgbVar.d.io();
        zwbVar.getClass();
        Executor executor = (Executor) ahgbVar.b.io();
        executor.getClass();
        jkp jkpVar2 = (jkp) ahgbVar.a.io();
        jkpVar2.getClass();
        this.g = new iqp(context, dataSavingSettingsFragment, synVar, zwbVar, executor, jkpVar2);
        this.f = dataSavingSettingsFragment.getActivity() instanceof xgm ? ((xgm) dataSavingSettingsFragment.getActivity()).hB() : null;
    }

    public final void a(String str) {
        PreferenceCategory preferenceCategory = this.h;
        if (preferenceCategory != null) {
            ahno.O(preferenceCategory.ag(str));
        }
    }
}
