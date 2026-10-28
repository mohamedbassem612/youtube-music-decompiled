package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xlj {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/background/MdxBackgroundPlaybackStatusNotificationPresenter");
    public final auy b;
    public final Context c;
    public xlg d;
    public final xlh e;
    public final Optional f;
    public xxj g;
    private final int h;
    private boolean i;
    private final BroadcastReceiver j = new xli(this);

    public xlj(auy auyVar, Context context, int i, xlh xlhVar, Optional optional) {
        this.b = auyVar;
        this.c = context;
        this.h = i;
        this.e = xlhVar;
        this.f = optional;
    }

    public final Intent a(String str, xgt xgtVar) {
        Intent intent = new Intent(str).setClass(this.c, xli.class);
        if (xgtVar != null) {
            intent.putExtra("INTERACTION_SCREEN", xgtVar);
        }
        return intent;
    }

    public final atr b(boolean z, xgt xgtVar) {
        Context context = this.c;
        atr atrVar = new atr(context, null);
        atrVar.q(this.h);
        atrVar.z = tzk.n(context, R.attr.ytStaticBrandRed).orElse(context.getColor(R.color.yt_youtube_red));
        atrVar.p(0, 0, z);
        atrVar.w = true;
        atrVar.e(16, true);
        atrVar.l = 0;
        atrVar.n(qof.a(context, 0, a("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.DISMISSED", xgtVar), 1275068416, 0));
        atrVar.E = "generic_notifications";
        return atrVar;
    }

    public final void c() {
        this.g = null;
        this.b.a(null, 6);
        e();
    }

    public final void d() {
        if (this.i) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.RETRY");
        intentFilter.addAction("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.HELP");
        intentFilter.addAction("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.CANCEL");
        intentFilter.addAction("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.DISMISSED");
        avg.f(this.c, this.j, intentFilter, null, 4);
        this.i = true;
    }

    public final void e() {
        if (this.i) {
            this.c.unregisterReceiver(this.j);
            this.i = false;
        }
    }
}
