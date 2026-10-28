package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sgb implements zzi {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/ads/macros/AppStatsMacrosConverter");
    private final mbc b;
    private final tun c;
    private final String d;
    private final tfq e;
    private final dov g;

    public sgb(rsi rsiVar, mbc mbcVar, tun tunVar, tfq tfqVar, dov dovVar) {
        this.d = "a.".concat(String.valueOf(rsiVar.e));
        this.b = mbcVar;
        this.c = true != rsiVar.h ? null : tunVar;
        this.e = tfqVar;
        this.g = dovVar;
    }

    @Override // defpackage.zzi
    public final String a(Uri uri, String str) {
        Integer num = (Integer) sfz.a.get(str);
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 12) {
            tfq tfqVar = this.e;
            return tfqVar != null ? String.valueOf(tfqVar.a()) : "0";
        }
        if (iIntValue == 25) {
            tun tunVar = this.c;
            if (tunVar == null) {
                ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/ads/macros/AppStatsMacrosConverter", "convertMacro", 59, "AppStatsMacrosConverter.java")).t("userPresenceTracker is not supported and should not expect receiving LACT macro");
                return "-1";
            }
            long jB = tunVar.c.b();
            long j = tunVar.a;
            return String.valueOf(j != -1 ? jB - j : -1L);
        }
        if (iIntValue == 31) {
            return this.d;
        }
        if (iIntValue == 33) {
            AudioManager audioManager = (AudioManager) ((Context) this.g.a).getSystemService("audio");
            return Integer.toString(Math.round((audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3)) * 100.0f));
        }
        if (iIntValue == 34) {
            return Long.toString(this.b.f().toEpochMilli());
        }
        return null;
    }

    @Override // defpackage.zzi
    public final String b() {
        return "sgb";
    }
}
