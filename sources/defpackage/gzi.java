package defpackage;

import android.content.ComponentName;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gzi {
    public static final agkj a = agkj.j(new ComponentName("com.google.android.apps.youtube.music", "com.google.android.apps.youtube.music.activities.MusicActivity"), new ComponentName("com.google.android.apps.youtube.music", "com.google.android.apps.youtube.music.activities.InternalMusicActivity"));
    public static final agkz b = new agqj(new ComponentName("com.google.android.apps.youtube.music", "com.google.android.apps.youtube.music.activities.InternalMusicActivity"));
    public static final agkz c = new agqj(new ComponentName("com.google.android.apps.youtube.music", "com.google.android.apps.youtube.music.activities.MusicActivity"));

    public static agkj a() {
        agkh agkhVar = new agkh(4);
        agkh agkhVar2 = new agkh(4);
        agkhVar2.e("com.google.android.libraries.youtube.mdx.tvsignin.keyAuthCode", new agqj(String.class));
        agkhVar2.e("com.google.android.libraries.youtube.mdx.tvsignin.keyScreenId", new agqj(String.class));
        agkhVar2.e("com.google.android.libraries.youtube.mdx.tvsignin.keyAppStatusUri", new agqj(String.class));
        agkhVar2.e("com.google.android.libraries.youtube.mdx.tvsignin.keyAccountEmail", new agqj(String.class));
        agkhVar2.e("com.google.android.libraries.youtube.mdx.tvsignin.keyExitType", new agqj(Integer.class));
        agkhVar2.e("com.google.android.libraries.youtube.mdx.tvsignin.requestType", new agqj(Integer.class));
        agkhVar2.e("com.google.android.libraries.youtube.mdx.tvsignin.keyError", new agqj(String.class));
        agkhVar2.e("com.google.android.libraries.youtube.mdx.tvsignin.keyLoungeDeviceId", new agqj(String.class));
        agkhVar2.e("com.google.android.library.youtube.mdx.tvsignin.signInProtocol", new agqj(Integer.class));
        agkhVar2.e("parent_tools_result", new agqj(Parcelable.class));
        agkhVar2.e("familyChanged", new agqj(Boolean.class));
        agkhVar2.e("android.speech.extra.RESULTS", new agqj(ArrayList.class));
        agkhVar2.e("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN", new agqj(byte[].class));
        agkhVar2.e("com.google.android.gms.wallet.firstparty.EXTRA_CLIENT_CALLBACK_DATA_TOKEN", new agqj(byte[].class));
        agkhVar2.e("com.google.android.gms.wallet.firstparty.EXTRA_ANALYTICS_PROTO", new agqj(byte[].class));
        agkhVar2.e("com.google.android.gms.wallet.firstparty.EXTRA_SERVER_ANALYTICS_TOKEN", new agqj(byte[].class));
        agkj agkjVarD = agkhVar2.d(true);
        agkh agkhVar3 = new agkh(4);
        agkhVar3.e("_ACTION_ANY", agkjVarD);
        agkhVar.e(new ComponentName("com.google.android.apps.youtube.music", "com.google.android.apps.youtube.music.activities.MusicActivity"), agkhVar3.d(true));
        return agkhVar.d(true);
    }

    public static agkj b() {
        agkh agkhVar = new agkh(4);
        agpn agpnVarA = agpn.a(8, new Object[]{"Waze.fromWaze", new agqj(Boolean.class), "com.google.android.apps.youtube.music.mediabrowser.consent.CONSENT_DIALOG_INTENT_ACTION", new agqj(Boolean.class), "referring_app_name", new agqj(String.class), "referrer", new agqj(String.class), "media_client_name", new agqj(String.class), "widget_key", new agqj(String.class), "com.google.android.libraries.androidatgoogle.widget.logging.TAP", new agqj(String.class), "com.google.android.libraries.androidatgoogle.widget.logging.WIDGET_NAME", new agqj(String.class)}, null);
        agkh agkhVar2 = new agkh(4);
        agkh agkhVar3 = new agkh(4);
        agkhVar3.i(agpnVarA);
        agkhVar3.e("COACTIVITY_START_INFO", new agqj(byte[].class));
        agkhVar2.e("android.intent.action.MAIN", agkhVar3.d(true));
        agkh agkhVar4 = new agkh(4);
        agkhVar4.i(agpnVarA);
        agkhVar4.e("query", new agqj(String.class));
        agkhVar2.e("android.intent.action.SEARCH", agkhVar4.d(true));
        agkh agkhVar5 = new agkh(4);
        agkhVar5.i(agpnVarA);
        agkhVar5.e("android.intent.extra.artist", new agqj(String.class));
        agkhVar5.e("android.intent.extra.title", new agqj(String.class));
        agkhVar5.e("android.intent.extra.album", new agqj(String.class));
        agkhVar5.e("android.intent.extra.genre", new agqj(String.class));
        agkhVar5.e("android.intent.extra.playlist", new agqj(String.class));
        agkhVar5.e("android.intent.extra.radio_channel", new agqj(String.class));
        agkhVar5.e("query", new agqj(String.class));
        agkhVar2.e("android.media.action.MEDIA_PLAY_FROM_SEARCH", agkhVar5.d(true));
        agkhVar2.e("_ACTION_ANY", agpnVarA);
        agkhVar.e(new ComponentName("com.google.android.apps.youtube.music", "com.google.android.apps.youtube.music.activities.MusicActivity"), agkhVar2.d(true));
        agkhVar.e(new ComponentName("com.google.android.apps.youtube.music", "com.google.android.apps.youtube.music.activities.MusicServiceDeepLinkActivity"), agkj.j("_ACTION_ANY", agkj.j("android.intent.extra.REFERRER", new agqj(String.class))));
        return agkhVar.d(true);
    }
}
