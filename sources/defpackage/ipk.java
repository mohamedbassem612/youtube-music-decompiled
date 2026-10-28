package defpackage;

import android.content.Context;
import androidx.preference.ListPreference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.settings.fragment.OfflineSettingsFragmentCompat;
import com.google.android.apps.youtube.music.ui.preference.SeekBarPreference;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ipk extends ipl {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/settings/fragment/OfflineSettingsFragmentCompatPeer");
    public final abxv A;
    public final syn B;
    public final abfv C;
    public final xsc D;
    public final jnm E;
    public final abfv F;
    private final aaqg H;
    public final OfflineSettingsFragmentCompat b;
    public final Context c;
    public final hnq d;
    public final hlp e;
    public final xeu f;
    public final jkp g;
    public final jkx h;
    public final aauk i;
    public final aany j;
    public final zwb k;
    public final Executor l;
    public xgn m;
    public TwoStatePreference n;
    public TwoStatePreference o;
    public SeekBarPreference p;
    public ListPreference q;
    public ListPreference r;
    public TwoStatePreference s;
    public TwoStatePreference t;
    public final hnz u;
    public final aanb v;
    public final tqa w;
    public final aatx x;
    public final vxz y;
    public final vxz z;

    public ipk(OfflineSettingsFragmentCompat offlineSettingsFragmentCompat, Context context, hnq hnqVar, hlp hlpVar, abxv abxvVar, hnz hnzVar, aanb aanbVar, xeu xeuVar, jkp jkpVar, jnm jnmVar, tqa tqaVar, jkx jkxVar, aauk aaukVar, aaqg aaqgVar, abfv abfvVar, aatx aatxVar, abfv abfvVar2, vxz vxzVar, vxz vxzVar2, aany aanyVar, zwb zwbVar, syn synVar, Executor executor, xsc xscVar) {
        this.b = offlineSettingsFragmentCompat;
        this.c = context;
        this.d = hnqVar;
        this.e = hlpVar;
        this.A = abxvVar;
        this.u = hnzVar;
        this.v = aanbVar;
        this.f = xeuVar;
        this.g = jkpVar;
        this.E = jnmVar;
        this.w = tqaVar;
        this.h = jkxVar;
        this.i = aaukVar;
        this.H = aaqgVar;
        this.F = abfvVar;
        this.x = aatxVar;
        this.C = abfvVar2;
        this.y = vxzVar;
        this.z = vxzVar2;
        this.j = aanyVar;
        this.k = zwbVar;
        this.B = synVar;
        this.l = executor;
        this.D = xscVar;
    }

    public final void a(atpr atprVar) {
        if (atprVar == null) {
            atprVar = this.H.s();
        }
        this.p.C = true != atprVar.equals(atpr.UNMETERED_WIFI) ? R.layout.auto_offline_tracks_5g_preference : R.layout.auto_offline_tracks_preference;
        this.e.g(!atprVar.equals(atpr.ANY));
    }
}
