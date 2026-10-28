package defpackage;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ihe extends ihf {
    private static final agrf a = agrf.h("com/google/android/apps/youtube/music/player/widget/base/BaseWidgetProvider");
    public aunn b;
    public aunn c;
    public aunn d;
    public aunn e;
    protected final ihh f = new ihh(c());
    private AppWidgetManager g;
    private SharedPreferences h;

    private final void g(Context context, boolean z) {
        SharedPreferences sharedPreferences = this.h;
        if (sharedPreferences == null) {
            sharedPreferences = context.getSharedPreferences("PlaybackWidgetPreferences", 0);
            this.h = sharedPreferences;
        }
        sharedPreferences.edit().putBoolean("IsWidgetEnabled", z).apply();
    }

    private final void h(Context context, int[] iArr, int i, Bundle bundle) {
        if (iArr != null) {
            if (i == 0) {
                agrx agrxVar = agso.a;
                i = 5;
            }
            for (int i2 : iArr) {
                agrx agrxVar2 = agso.a;
                d(context, i2, bundle, i);
            }
        }
    }

    public abstract String c();

    public abstract void d(Context context, int i, Bundle bundle, int i2);

    @Override // android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
        super.onDisabled(context);
        g(context, false);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        super.onEnabled(context);
        g(context, true);
    }

    @Override // defpackage.ihf, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        if ("com.google.android.apps.music.player.widget.FORCE_WIDGET_PROVIDER_REFRESH".equals(intent.getAction()) && ((vxz) this.c.io()).l(119, 45824215L, false)) {
            ((agrc) ((agrc) a.c().i(agso.a, "Widget.BaseProvider")).k("com/google/android/apps/youtube/music/player/widget/base/BaseWidgetProvider", "onReceive", 112, "BaseWidgetProvider.java")).t("Direct widget rendering is enabled, ignoring FORCE_WIDGET_PROVIDER_REFRESH_ACTION.");
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("metadata");
        if (bundleExtra != null) {
            agrx agrxVar = agso.a;
            intent.getIntExtra("playerState", -1);
            bundleExtra.getString("title");
        } else {
            agrx agrxVar2 = agso.a;
            intent.getIntExtra("playerState", -1);
        }
        if (this.g == null) {
            this.g = AppWidgetManager.getInstance(context);
        }
        if ("com.google.android.apps.music.player.widget.FORCE_WIDGET_PROVIDER_REFRESH".equals(intent.getAction())) {
            h(context, intent.getIntArrayExtra("appWidgetIds"), intent.getIntExtra("playerState", 5), intent.getBundleExtra("metadata"));
            return;
        }
        try {
            PendingIntent pendingIntentB = this.f.b(context, "com.google.android.youtube.music.pendingintent.controller_widget_request_data");
            if (pendingIntentB != null) {
                pendingIntentB.send();
            }
        } catch (PendingIntent.CanceledException unused) {
        }
    }

    @Override // defpackage.mam, android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        context.getClass();
        appWidgetManager.getClass();
        iArr.getClass();
        super.e().b(b(), context, iArr, mam.f());
        agrx agrxVar = agso.a;
        try {
            PendingIntent pendingIntentB = this.f.b(context, "com.google.android.youtube.music.pendingintent.controller_widget_request_data");
            if (pendingIntentB != null) {
                pendingIntentB.send();
            }
        } catch (PendingIntent.CanceledException unused) {
        }
        int iF = ihr.f(((acdq) this.b.io()).b());
        acdq acdqVar = (acdq) this.b.io();
        ihs ihsVar = (ihs) this.d.io();
        iir iirVar = (iir) this.e.io();
        Bundle bundle = new Bundle();
        bundle.putCharSequence("title", acdqVar.u());
        bundle.putCharSequence("byline", acdqVar.t());
        bundle.putBoolean("hasNext", acdqVar.B());
        bundle.putBoolean("hasPrev", acdqVar.C());
        bundle.putInt("likeState", ihsVar.b.f);
        bundle.putBoolean("isSeekFocusedVideo", acdqVar.D());
        ahng.aG(bundle, "thumbnails_proto", acdqVar.L().l());
        iirVar.a(bundle);
        h(context, iArr, iF, bundle);
    }
}
