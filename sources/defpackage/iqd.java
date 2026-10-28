package defpackage;

import android.content.SharedPreferences;
import app.rive.semantics.SemanticState;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iqd {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/settings/logging/SettingsSnapshotLogger");
    public final xeu b;
    public final iqv c;
    public final Executor d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    private final SharedPreferences f;
    private final jkp g;
    private final abww h;

    public iqd(xeu xeuVar, SharedPreferences sharedPreferences, jkp jkpVar, abww abwwVar, jnm jnmVar, Executor executor) {
        this.b = xeuVar;
        this.f = sharedPreferences;
        this.g = jkpVar;
        this.h = abwwVar;
        this.c = jnmVar.c(null);
        this.d = executor;
    }

    private static int b(String str) {
        if (str == null) {
            return 1;
        }
        switch (str.hashCode()) {
            case -1955878649:
                return str.equals("Normal") ? 3 : 1;
            case -333231853:
                return str.equals("Always High") ? 5 : 1;
            case 76596:
                return str.equals("Low") ? 2 : 1;
            case 2249154:
                return str.equals("High") ? 4 : 1;
            default:
                return 1;
        }
    }

    public final aihf a() {
        jkp jkpVar = this.g;
        SharedPreferences sharedPreferences = this.f;
        boolean z = jkpVar.getBoolean(gzj.AUTOPLAY_ENABLED, true);
        boolean z2 = jkpVar.getBoolean(gzj.DONT_PLAY_VIDEO_SETTING, false);
        boolean z3 = sharedPreferences.getBoolean(gzj.STREAM_OVER_WIFI_ONLY, false);
        String string = sharedPreferences.getString(gzj.BITRATE_AUDIO_MOBILE, "Normal");
        String string2 = sharedPreferences.getString(gzj.BITRATE_AUDIO_WIFI, "Normal");
        aihf aihfVarCreateBuilder = ajeu.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ajeu ajeuVar = (ajeu) aihfVarCreateBuilder.instance;
        ajeuVar.b |= 1;
        ajeuVar.c = z3;
        aihfVarCreateBuilder.copyOnWrite();
        ajeu ajeuVar2 = (ajeu) aihfVarCreateBuilder.instance;
        ajeuVar2.b |= 2;
        ajeuVar2.d = z2;
        aihfVarCreateBuilder.copyOnWrite();
        ajeu ajeuVar3 = (ajeu) aihfVarCreateBuilder.instance;
        ajeuVar3.b |= 8;
        ajeuVar3.e = z;
        int iB = b(string);
        aihfVarCreateBuilder.copyOnWrite();
        ajeu ajeuVar4 = (ajeu) aihfVarCreateBuilder.instance;
        ajeuVar4.f = iB - 1;
        ajeuVar4.b |= 16;
        int iB2 = b(string2);
        aihfVarCreateBuilder.copyOnWrite();
        ajeu ajeuVar5 = (ajeu) aihfVarCreateBuilder.instance;
        ajeuVar5.g = iB2 - 1;
        ajeuVar5.b |= 32;
        boolean zBooleanValue = ((Boolean) this.h.o.orElse(Boolean.FALSE)).booleanValue();
        aihfVarCreateBuilder.copyOnWrite();
        ajeu ajeuVar6 = (ajeu) aihfVarCreateBuilder.instance;
        ajeuVar6.b |= SemanticState.Focused;
        ajeuVar6.h = zBooleanValue;
        return aihfVarCreateBuilder;
    }
}
