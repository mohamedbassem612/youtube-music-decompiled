package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.youtube.music.player.widget.gm3.FreeformMusicWidgetProvider;
import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class iie extends ihe {
    private volatile boolean a = false;
    private final Object g = new Object();

    @Override // defpackage.ihf
    public final void a(Context context) {
        if (this.a) {
            return;
        }
        synchronized (this.g) {
            if (!this.a) {
                ((ihz) CommonApis.j(context)).dU((FreeformMusicWidgetProvider) this);
                this.a = true;
            }
        }
    }

    @Override // defpackage.ihe, defpackage.ihf, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a(context);
        super.onReceive(context, intent);
    }
}
