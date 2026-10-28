package defpackage;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import com.google.android.apps.youtube.music.settings.fragment.PlaybackSettingsFragment;
import com.google.android.apps.youtube.music.ui.preference.SliderPreference;
import com.google.android.apps.youtube.music.ui.preference.SwitchCompatPreference;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ipo implements ios {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/settings/fragment/PlaybackSettingsFragmentPeer");
    private static final agkz i = agkz.t(aprw.MUSIC_DYNAMIC_QUEUE, aprw.MUSIC_VOLUME_NORMALIZATION, aprw.MUSIC_DEFAULT_LOUDNESS_TARGET_ENABLED, aprw.ENABLE_CROSS_DEVICE_QUEUE_RESTORATION_ON_SHARED_DEVICE, aprw.MUSIC_CROSSFADE_ENABLED);
    public final PlaybackSettingsFragment b;
    public final abvn c;
    public final xgn d;
    public final jkp e;
    public PreferenceCategory f;
    public final vxz g;
    public final aazo h;
    private final iol j;
    private final bog k;
    private final Executor l;
    private final jnm m;

    public ipo(PlaybackSettingsFragment playbackSettingsFragment, aazo aazoVar, iol iolVar, abvn abvnVar, jnm jnmVar, bog bogVar, Executor executor, jkp jkpVar, vxz vxzVar) {
        this.b = playbackSettingsFragment;
        this.h = aazoVar;
        this.c = abvnVar;
        this.j = iolVar;
        this.m = jnmVar;
        this.k = bogVar;
        this.l = executor;
        this.e = jkpVar;
        this.g = vxzVar;
        xgm xgmVar = (xgm) playbackSettingsFragment.getActivity();
        this.d = xgmVar != null ? xgmVar.hB() : null;
    }

    public final void a(CharSequence charSequence) {
        PreferenceCategory preferenceCategory = this.f;
        if (preferenceCategory != null) {
            preferenceCategory.ag(charSequence);
        }
    }

    public final void b() {
        apqt apqtVarL;
        int i2;
        PlaybackSettingsFragment playbackSettingsFragment = this.b;
        PreferenceCategory preferenceCategory = (PreferenceCategory) playbackSettingsFragment.findPreference("pref_key_dynamic_queue");
        if (preferenceCategory != null) {
            preferenceCategory.p();
        }
        iot iotVar = (iot) playbackSettingsFragment.getActivity();
        if (iotVar == null || (apqtVarL = iotVar.l(aprv.SETTING_CAT_MUSIC_TOP_LEVEL)) == null || preferenceCategory == null) {
            return;
        }
        Iterator it = apqtVarL.d.iterator();
        byte[] bArr = null;
        apqu apquVar = null;
        apqu apquVar2 = null;
        while (true) {
            i2 = 2;
            if (!it.hasNext()) {
                break;
            }
            apqu apquVar3 = (apqu) it.next();
            if ((apquVar3.b & 16) != 0) {
                apre apreVar = apquVar3.g;
                if (apreVar == null) {
                    apreVar = apre.a;
                }
                aprw aprwVarA = aprw.a(apreVar.c);
                if (aprwVarA == null) {
                    aprwVarA = aprw.SETTING_ITEM_ID_UNKNOWN;
                }
                if (aprwVarA == aprw.MUSIC_CROSSFADE_DURATION) {
                    apquVar2 = apquVar3;
                }
            }
            if ((apquVar3.b & 2) != 0) {
                agkz agkzVar = i;
                apqs apqsVar = apquVar3.d;
                if (apqsVar == null) {
                    apqsVar = apqs.a;
                }
                aprw aprwVarA2 = aprw.a(apqsVar.c);
                if (aprwVarA2 == null) {
                    aprwVarA2 = aprw.SETTING_ITEM_ID_UNKNOWN;
                }
                if (agkzVar.contains(aprwVarA2)) {
                    apqs apqsVar2 = apquVar3.d;
                    if (apqsVar2 == null) {
                        apqsVar2 = apqs.a;
                    }
                    aprw aprwVarA3 = aprw.a(apqsVar2.c);
                    if (aprwVarA3 == null) {
                        aprwVarA3 = aprw.SETTING_ITEM_ID_UNKNOWN;
                    }
                    if (aprwVarA3 == aprw.MUSIC_CROSSFADE_ENABLED) {
                        apquVar = apquVar3;
                    } else {
                        Preference preferenceB = this.j.b(apquVar3);
                        if (preferenceB != null) {
                            preferenceCategory.ah(preferenceB);
                        }
                    }
                }
            }
        }
        if (apquVar == null || apquVar2 == null) {
            return;
        }
        jnm jnmVar = this.m;
        bog bogVar = this.k;
        iol iolVar = this.j;
        iqv iqvVarC = jnmVar.c(bogVar);
        apqs apqsVar3 = apquVar.d;
        if (apqsVar3 == null) {
            apqsVar3 = apqs.a;
        }
        ListenableFuture listenableFutureB = iqvVarC.b();
        ipn ipnVar = new ipn(iqvVarC, 3);
        Context context = iolVar.d;
        SwitchCompatPreference switchCompatPreference = new SwitchCompatPreference(context);
        if ((apqsVar3.b & 32) != 0) {
            alay alayVar = apqsVar3.d;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            switchCompatPreference.Q(ackj.k(null, alayVar, null, false));
        }
        switchCompatPreference.L(!apqsVar3.g);
        switchCompatPreference.n = ipnVar;
        idw idwVar = new idw(apqsVar3, switchCompatPreference, 11, bArr);
        Executor executor = iolVar.a;
        ListenableFuture listenableFutureAr = ahno.ar(listenableFutureB, idwVar, executor);
        apre apreVar2 = apquVar2.g;
        if (apreVar2 == null) {
            apreVar2 = apre.a;
        }
        ListenableFuture listenableFutureA = iqvVarC.a();
        ipn ipnVar2 = new ipn(iqvVarC, i2);
        int seconds = (int) iqn.a.toSeconds();
        int seconds2 = (int) iqn.b.toSeconds();
        qcb qcbVar = new qcb(this, bArr);
        SliderPreference sliderPreference = new SliderPreference(context, null, null);
        if ((apreVar2.b & 2) != 0) {
            alay alayVar2 = apreVar2.d;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            sliderPreference.Q(ackj.k(null, alayVar2, null, false));
        }
        if (seconds >= seconds2) {
            throw new IllegalArgumentException(a.bQ(seconds2, seconds, "min must be less than max: min=", ", max="));
        }
        sliderPreference.b = Integer.valueOf(seconds);
        sliderPreference.c = Integer.valueOf(seconds2);
        sliderPreference.d = 1;
        sliderPreference.l(sliderPreference.a);
        sliderPreference.d();
        sliderPreference.f = qcbVar;
        sliderPreference.n(qcbVar.q(sliderPreference.a));
        sliderPreference.n = ipnVar2;
        ListenableFuture listenableFutureAr2 = ahno.ar(listenableFutureA, new iii(sliderPreference, 6), executor);
        taf.k(bogVar, ahno.av(listenableFutureAr, listenableFutureAr2).k(new uf(listenableFutureAr, listenableFutureAr2, 19, bArr), this.l), new igt(8), new iny(preferenceCategory, 5));
    }

    @Override // defpackage.ios
    public final void onSettingsLoaded() {
        if (this.g.l(248, 45805953L, false)) {
            PlaybackSettingsFragment playbackSettingsFragment = this.b;
            if (!playbackSettingsFragment.isAdded() || playbackSettingsFragment.getActivity() == null) {
                return;
            }
            b();
        }
    }
}
