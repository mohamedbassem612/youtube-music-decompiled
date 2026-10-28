package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.youtube.music.player.widget.base.PendingIntentReceiver;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ihh {
    private static final agkj a = agkj.m(gzo.FREE_FORM, maq.YTM_FREEFORM, gzo.LEGACY, maq.YTM_NOW_PLAYING_LEGACY, gzo.NOW_PLAYING, maq.YTM_NOW_PLAYING, gzo.FLIP, maq.YTM_FLIP);
    private final String b;

    public ihh(String str) {
        this.b = str;
    }

    private final Intent d(Context context, String str) {
        Intent intent = new Intent(str);
        intent.putExtra("widget_key", this.b);
        intent.setClass(context, PendingIntentReceiver.class);
        return intent;
    }

    public final PendingIntent a(Context context) {
        gzo gzoVar;
        Intent className = new Intent().setClassName(context, "com.google.android.apps.youtube.music.activities.InternalMusicActivity");
        String str = this.b;
        className.putExtra("widget_key", str);
        agkj agkjVar = a;
        gzo[] gzoVarArrValues = gzo.values();
        int length = gzoVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                gzoVar = null;
                break;
            }
            gzoVar = gzoVarArrValues[i];
            if (gzoVar.e.equals(str)) {
                break;
            }
            i++;
        }
        maq maqVar = (maq) agkjVar.get(gzoVar);
        if (maqVar != null) {
            ConcurrentHashMap concurrentHashMap = maj.a;
            className.getClass();
            className.putExtra("com.google.android.libraries.androidatgoogle.widget.logging.WIDGET_NAME", maqVar.ar);
            className.putExtra("com.google.android.libraries.androidatgoogle.widget.logging.TAP", "YTM Album Art");
            className.putExtra("com.google.android.libraries.androidatgoogle.widget.logging.SERVICE_ID", -1);
        }
        return qof.b(context, 0, className, 67108864);
    }

    public final PendingIntent b(Context context, String str) {
        return qof.a(context, 0, d(context, str), 67108864, 0);
    }

    public final PendingIntent c(Context context, ajwo ajwoVar, int i) {
        Bundle bundle = new Bundle();
        ahng.aG(bundle, "command_bundle_key", ajwoVar);
        Intent intentD = d(context, "com.google.android.youtube.music.action.play");
        intentD.setClassName(context, "com.google.android.apps.youtube.music.activities.InternalMusicActivity").setFlags(335544320).addCategory("android.intent.category.LAUNCHER").putExtra("intent_extra_command_bundle", bundle);
        return qof.b(context, i, intentD, 67108864);
    }
}
