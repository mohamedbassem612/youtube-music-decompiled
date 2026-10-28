package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class irf {
    public static final agkj a;
    public static final agkj b;
    public static final agkj c;

    static {
        agkh agkhVar = new agkh(4);
        agkhVar.e(gzn.PRIVACY_PREFS_FRAGMENT, Integer.valueOf(R.string.pref_privacy_and_data_controls_title));
        agkhVar.e(gzn.ADVANCED_PREFS_FRAGMENT, Integer.valueOf(R.string.pref_advanced));
        agkhVar.e(gzn.OFFLINE_PREFS_FRAGMENT, Integer.valueOf(R.string.settings_header_downloads_and_storage));
        agkhVar.e(gzn.GENERAL_SETTINGS_FRAGMENT, Integer.valueOf(R.string.settings_general_title));
        agkhVar.e(gzn.PLAYBACK_SETTINGS_FRAGMENT, Integer.valueOf(R.string.settings_header_playback));
        agkhVar.e(gzn.DATA_SAVING_SETTINGS_FRAGMENT, Integer.valueOf(R.string.settings_header_data_saving));
        agkhVar.e(gzn.NOTIFICATIONS_SETTINGS_FRAGMENT, Integer.valueOf(R.string.settings_header_notifications));
        agkhVar.e(gzn.RECOMMENDATIONS_SETTINGS_FRAGMENT, Integer.valueOf(R.string.settings_header_recommendations));
        agkhVar.e(gzn.ABOUT_SETTINGS_FRAGMENT, Integer.valueOf(R.string.settings_header_about_youtube_music));
        agkhVar.e(gzn.RESTRICTED_MODE_SETTINGS_FRAGMENT, Integer.valueOf(R.string.settings_header_restricted_mode));
        gzn gznVar = gzn.SETTINGS_HEADERS_FRAGMENT;
        Integer numValueOf = Integer.valueOf(R.string.settings);
        agkhVar.e(gznVar, numValueOf);
        agkhVar.e(gzn.DRILL_DOWN_SETTINGS_FRAGMENT, numValueOf);
        a = agkhVar.d(true);
        agkh agkhVar2 = new agkh(4);
        agkhVar2.e("music_settings_privacy", gzn.PRIVACY_PREFS_FRAGMENT);
        agkhVar2.e("music_settings_advanced", gzn.ADVANCED_PREFS_FRAGMENT);
        agkhVar2.e("music_settings_offline", gzn.OFFLINE_PREFS_FRAGMENT);
        agkhVar2.e("music_settings_data_saving", gzn.DATA_SAVING_SETTINGS_FRAGMENT);
        agkhVar2.e("music_settings_playback", gzn.PLAYBACK_SETTINGS_FRAGMENT);
        b = agkhVar2.d(true);
        agkh agkhVar3 = new agkh(4);
        agkhVar3.e(aprv.SETTING_CAT_MUSIC_PRIVACY, gzn.PRIVACY_PREFS_FRAGMENT);
        c = agkhVar3.d(true);
    }

    public static Intent a(Context context, gzn gznVar, ajwo ajwoVar, vxz vxzVar) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.apps.youtube.music.settings.SettingsCompatActivity");
        intent.putExtra(":android:show_fragment", gznVar.n);
        intent.putExtra(":android:no_headers", true);
        Integer num = (Integer) a.get(gznVar);
        if (num != null) {
            intent.putExtra(":android:show_fragment_title", num.intValue());
        }
        if (vxzVar.l(229, 45775088L, false) && !(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (ajwoVar != null) {
            intent.putExtra("navigation_endpoint", ajwoVar.toByteArray());
        }
        return intent;
    }
}
