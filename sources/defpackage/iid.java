package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.youtube.music.player.widget.gm3.FlipWidgetProvider;
import com.google.android.apps.youtube.music.player.widget.gm3.NowPlayingWidgetProvider;
import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class iid extends NowPlayingWidgetProvider {
    private volatile boolean a = false;
    private final Object h = new Object();

    @Override // defpackage.iif, defpackage.ihf
    public final void a(Context context) {
        if (this.a) {
            return;
        }
        synchronized (this.h) {
            if (!this.a) {
                ((ihv) CommonApis.j(context)).dT((FlipWidgetProvider) this);
                this.a = true;
            }
        }
    }

    @Override // defpackage.iif, defpackage.ihe, defpackage.ihf, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a(context);
        super.onReceive(context, intent);
    }
}
