package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ihk {
    private static final agrf c = agrf.h("com/google/android/apps/youtube/music/player/widget/base/WidgetViewFactory");
    public final iwm a;
    public final Executor b;
    private final int[] d = {R.id.dislike_button, R.id.previous_button, R.id.play_pause_button, R.id.next_button, R.id.like_button, R.id.fast_forward_button, R.id.rewind_button};
    private final awmd e;
    private final adxj f;

    public ihk(awmd awmdVar, iwm iwmVar, adxj adxjVar, Executor executor) {
        this.e = awmdVar;
        this.a = iwmVar;
        this.f = adxjVar;
        this.b = executor;
    }

    public static int a(int i) {
        return avv.f(i, 255);
    }

    public static wgg b(Bundle bundle, int i) {
        if (bundle == null || !bundle.containsKey("thumbnails_proto")) {
            agrx agrxVar = agso.a;
            return null;
        }
        try {
            return new abuz((aqmh) ahng.aA(bundle, "thumbnails_proto", aqmh.a, ExtensionRegistryLite.getGeneratedRegistry())).i(i, i);
        } catch (Exception e) {
            ((agrc) ((agrc) ((agrc) c.c().i(agso.a, "Widget.ViewFactory")).j(e)).k("com/google/android/apps/youtube/music/player/widget/base/WidgetViewFactory", "getThumbnailFromBundle", (char) 417, "WidgetViewFactory.java")).t("Failed to parse ThumbnailDetails");
            return null;
        }
    }

    public static final void f(RemoteViews remoteViews, int i, boolean z) {
        remoteViews.setInt(i, "setImageAlpha", true != z ? 77 : 255);
        remoteViews.setBoolean(i, "setEnabled", z);
    }

    public static final ListenableFuture g(Context context, wgg wggVar, int i, euc eucVar) {
        esn esnVar = (esn) ((esn) erj.d(context.getApplicationContext()).b().s()).f(wggVar.a()).B(i, i);
        if (eucVar != null) {
            esnVar = (esn) esnVar.K(eucVar);
        }
        return a.bC(esnVar);
    }

    private final int h(boolean z) {
        return z ? R.drawable.quantum_gm_ic_thumb_down_vd_theme_24 : this.f.b(arqz.nO);
    }

    private final int i(boolean z) {
        return z ? R.drawable.quantum_gm_ic_thumb_up_vd_theme_24 : this.f.b(arqz.nS);
    }

    private final int j(boolean z) {
        return z ? R.drawable.quantum_ic_play_arrow_vd_theme_24 : this.f.b(arqz.bD);
    }

    private final void k(Context context, RemoteViews remoteViews, int i, PendingIntent pendingIntent, ihh ihhVar) {
        if (((jnm) this.e.io()).C()) {
            remoteViews.setOnClickPendingIntent(i, pendingIntent);
        } else {
            remoteViews.setOnClickPendingIntent(i, ihhVar.a(context));
        }
    }

    private final void l(RemoteViews remoteViews, boolean z) {
        for (int i = 0; i < 7; i++) {
            f(remoteViews, this.d[i], z);
        }
    }

    private static void m(RemoteViews remoteViews, int i, Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string != null) {
            remoteViews.setTextViewText(i, string);
        }
    }

    public final void c(Context context, RemoteViews remoteViews, Bundle bundle, int i, ihh ihhVar, boolean z, boolean z2) {
        int iB;
        PendingIntent pendingIntentB;
        boolean z3 = z;
        boolean z4 = bundle.getBoolean("isSeekFocusedVideo", false);
        l(remoteViews, true);
        e(context, remoteViews, ihhVar, z2);
        if (i == 1) {
            if (z3) {
                iB = R.drawable.quantum_ic_pause_vd_theme_24;
                z3 = true;
            } else {
                iB = this.f.b(arqz.bm);
                z3 = false;
            }
            pendingIntentB = ihhVar.b(context, "com.google.android.youtube.music.pendingintent.controller_widget_pause");
        } else if (i == 2) {
            int iJ = j(z3);
            pendingIntentB = !((jnm) this.e.io()).C() ? ihhVar.a(context) : ihhVar.b(context, "com.google.android.youtube.music.pendingintent.controller_widget_play");
            iB = iJ;
        } else if (i == 3) {
            if (z3) {
                iB = R.drawable.quantum_ic_replay_vd_theme_24;
                z3 = true;
            } else {
                iB = this.f.b(arqz.lh);
                z3 = false;
            }
            pendingIntentB = ihhVar.b(context, "com.google.android.youtube.music.pendingintent.controller_widget_replay");
        } else if (i == 4) {
            l(remoteViews, false);
            f(remoteViews, R.id.play_pause_button, true);
            boolean z5 = bundle.getBoolean("isPlaybackEnded", false);
            int iJ2 = j(z3);
            if (((jnm) this.e.io()).C()) {
                pendingIntentB = z5 ? ihhVar.b(context, "com.google.android.youtube.music.pendingintent.controller_widget_replay") : ihhVar.b(context, "com.google.android.youtube.music.pendingintent.controller_widget_play");
            } else {
                pendingIntentB = ihhVar.a(context);
            }
            iB = iJ2;
        } else if (i != 6) {
            iB = j(z3);
            pendingIntentB = ihhVar.a(context);
        } else {
            iB = this.f.b(arqz.eb);
            pendingIntentB = ihhVar.b(context, "com.google.android.youtube.music.pendingintent.controller_widget_retry");
        }
        remoteViews.setImageViewResource(R.id.play_pause_button, iB);
        remoteViews.setOnClickPendingIntent(R.id.play_pause_button, pendingIntentB);
        boolean z6 = i != 4;
        if (z6) {
            if (bundle.containsKey("likeState")) {
                ihl ihlVar = (ihl) ihl.e.get(Integer.valueOf(bundle.getInt("likeState")));
                ihlVar.getClass();
                int iB2 = z3 ? R.drawable.quantum_gm_ic_thumb_up_filled_vd_theme_24 : this.f.b(arqz.dm);
                int i2 = i(z3);
                int iB3 = z3 ? R.drawable.quantum_gm_ic_thumb_down_filled_vd_theme_24 : this.f.b(arqz.dh);
                int iH = h(z3);
                int iOrdinal = ihlVar.ordinal();
                if (iOrdinal == 0) {
                    remoteViews.setImageViewResource(R.id.like_button, i2);
                    remoteViews.setImageViewResource(R.id.dislike_button, iH);
                } else if (iOrdinal == 1) {
                    remoteViews.setImageViewResource(R.id.like_button, iB2);
                    remoteViews.setImageViewResource(R.id.dislike_button, iH);
                } else if (iOrdinal == 2) {
                    remoteViews.setImageViewResource(R.id.like_button, i2);
                    remoteViews.setImageViewResource(R.id.dislike_button, iB3);
                } else if (iOrdinal == 3) {
                    remoteViews.setImageViewResource(R.id.like_button, i2);
                    remoteViews.setImageViewResource(R.id.dislike_button, iH);
                    f(remoteViews, R.id.like_button, false);
                    f(remoteViews, R.id.dislike_button, false);
                }
            }
            if (bundle.containsKey("hasNext")) {
                f(remoteViews, R.id.next_button, bundle.getBoolean("hasNext"));
            }
            if (bundle.containsKey("hasPrev")) {
                f(remoteViews, R.id.previous_button, bundle.getBoolean("hasPrev"));
            }
        }
        int i3 = true != z4 ? 8 : 0;
        remoteViews.setViewVisibility(R.id.rewind_button, i3);
        remoteViews.setViewVisibility(R.id.fast_forward_button, i3);
        if (!z3) {
            int i4 = true != z4 ? 0 : 8;
            remoteViews.setViewVisibility(R.id.like_button, i4);
            remoteViews.setViewVisibility(R.id.dislike_button, i4);
        }
        f(remoteViews, R.id.rewind_button, z4 && z6);
        f(remoteViews, R.id.fast_forward_button, z4 && z6);
        m(remoteViews, R.id.trackname, bundle, "title");
        m(remoteViews, R.id.byline, bundle, "byline");
        remoteViews.setViewVisibility(R.id.dash, 0);
        remoteViews.setViewVisibility(R.id.byline, 0);
    }

    public final void d(Context context, RemoteViews remoteViews, ihh ihhVar, int i, int i2, int i3, boolean z) {
        l(remoteViews, false);
        if (i2 != -1) {
            remoteViews.setViewVisibility(R.id.dash, 0);
            remoteViews.setViewVisibility(R.id.byline, 0);
            remoteViews.setTextViewText(R.id.byline, context.getString(i2));
        } else {
            remoteViews.setViewVisibility(R.id.dash, 8);
            remoteViews.setViewVisibility(R.id.byline, 8);
        }
        remoteViews.setTextViewText(R.id.trackname, context.getString(i));
        remoteViews.setImageViewResource(R.id.album_art, i3);
        remoteViews.setOnClickPendingIntent(R.id.widget_right_panel, ihhVar.a(context));
        e(context, remoteViews, ihhVar, true);
        remoteViews.setImageViewResource(R.id.play_pause_button, j(z));
        remoteViews.setImageViewResource(R.id.like_button, i(z));
        remoteViews.setImageViewResource(R.id.dislike_button, h(z));
    }

    public final void e(Context context, RemoteViews remoteViews, ihh ihhVar, boolean z) {
        remoteViews.setOnClickPendingIntent(R.id.album_art, ihhVar.a(context));
        if (z) {
            remoteViews.setOnClickPendingIntent(android.R.id.background, ihhVar.a(context));
        }
        remoteViews.setOnClickPendingIntent(R.id.dislike_button, ihhVar.b(context, "com.google.android.youtube.music.pendingintent.controller_widget_dislike"));
        remoteViews.setOnClickPendingIntent(R.id.like_button, ihhVar.b(context, "com.google.android.youtube.music.pendingintent.controller_widget_like"));
        k(context, remoteViews, R.id.previous_button, ihhVar.b(context, "com.google.android.youtube.music.pendingintent.controller_widget_previous"), ihhVar);
        k(context, remoteViews, R.id.next_button, ihhVar.b(context, "com.google.android.youtube.music.pendingintent.controller_widget_next"), ihhVar);
        k(context, remoteViews, R.id.rewind_button, ihhVar.b(context, "com.google.android.youtube.music.pendingintent.controller_widget_rewind"), ihhVar);
        k(context, remoteViews, R.id.fast_forward_button, ihhVar.b(context, "com.google.android.youtube.music.pendingintent.controller_widget_forward"), ihhVar);
    }
}
