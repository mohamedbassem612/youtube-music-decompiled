package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ihy implements iis {
    private static final agrf c = agrf.h("com/google/android/apps/youtube/music/player/widget/gm3/FlipWidgetUiRenderer");
    public final ihk a;
    public final ihh b = new ihh(gzo.FLIP.e);
    private final iim d;

    public ihy(ihk ihkVar, iim iimVar) {
        this.a = ihkVar;
        this.d = iimVar;
    }

    @Override // defpackage.iis
    public final void a(Context context, int i, int i2, Bundle bundle) {
        e(context, i, bundle, i2);
    }

    @Override // defpackage.iis
    public final /* synthetic */ void b(Context context, int[] iArr, int i, Bundle bundle) {
        hna.q(this, context, iArr, i, bundle);
    }

    public final void c(Context context, Queue queue, RemoteViews remoteViews) {
        for (int i = 0; i < 5; i++) {
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.flip_widget_recent_track);
            iik iikVar = (iik) queue.poll();
            if (iikVar == null) {
                iim.i(remoteViews2, false);
            } else {
                iim.i(remoteViews2, true);
                int iAU = a.aU(iikVar.b().g);
                if (iAU != 0 && iAU == 2) {
                    remoteViews2.setInt(R.id.widget_icon, "setBackgroundResource", android.R.color.transparent);
                }
                remoteViews2.setImageViewBitmap(R.id.widget_icon, iikVar.a());
                remoteViews2.setContentDescription(R.id.widget_icon, iikVar.b().c);
                ajwo ajwoVar = iikVar.b().f;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                remoteViews2.setOnClickPendingIntent(R.id.widget_icon, this.b.c(context, ajwoVar, ajwoVar.hashCode()));
            }
            remoteViews.addView(R.id.track_container, remoteViews2);
        }
    }

    public final void d(final Context context, int i, final Bundle bundle, final int i2, final Bitmap bitmap, final List list) {
        agrx agrxVar = agso.a;
        RemoteViews remoteViewsE = mdu.e(context, AppWidgetManager.getInstance(context), i, new awqg() { // from class: ihx
            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                int i3;
                Context context2 = context;
                RemoteViews remoteViews = new RemoteViews(context2.getPackageName(), R.layout.flip_app_widget_now_playing_initial);
                remoteViews.removeAllViews(R.id.widget_play_history_container);
                remoteViews.setViewVisibility(R.id.widget_play_history_container, 0);
                RemoteViews remoteViews2 = new RemoteViews(context2.getPackageName(), R.layout.flip_widget_recent_track_container);
                remoteViews2.setViewLayoutMarginDimen(R.id.track_container, 3, R.dimen.flex_window_recently_played_row_one_bottom_margin);
                ArrayDeque arrayDeque = new ArrayDeque(list);
                ihy ihyVar = this.a;
                ihyVar.c(context2, arrayDeque, remoteViews2);
                remoteViews.addView(R.id.widget_play_history_container, remoteViews2);
                RemoteViews remoteViews3 = new RemoteViews(context2.getPackageName(), R.layout.flip_widget_recent_track_container);
                remoteViews3.setViewLayoutMarginDimen(R.id.track_container, 3, R.dimen.flex_window_recently_played_row_two_bottom_margin);
                ihyVar.c(context2, arrayDeque, remoteViews3);
                remoteViews.addView(R.id.widget_play_history_container, remoteViews3);
                Bundle bundle2 = bundle;
                if (bundle2 == null || (i3 = i2) == 5) {
                    agrx agrxVar2 = agso.a;
                    ihyVar.a.d(context2, remoteViews, ihyVar.b, R.string.widget_track_default_state, R.string.widget_byline_default_state, R.drawable.widget_default_icon, true);
                } else {
                    Bitmap bitmap2 = bitmap;
                    ihyVar.a.c(context2, remoteViews, bundle2, i3, ihyVar.b, true, true);
                    if (bitmap2 != null) {
                        remoteViews.setImageViewBitmap(R.id.album_art, bitmap2);
                    }
                }
                return remoteViews;
            }
        });
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        if (appWidgetManager != null) {
            appWidgetManager.updateAppWidget(i, remoteViewsE);
        }
    }

    public final void e(Context context, int i, Bundle bundle, int i2) {
        int i3;
        if (bundle == null) {
            i3 = i2;
        } else {
            if (i2 != 5) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.flex_window_large_album_art_size);
                iim iimVar = this.d;
                ListenableFuture listenableFutureD = iimVar.d(context, bundle, dimensionPixelSize);
                ListenableFuture listenableFutureC = iimVar.c(context, bundle, dimensionPixelSize);
                taf.j(ahno.av(listenableFutureC, listenableFutureD).k(new iij(this, listenableFutureD, listenableFutureC, context, i, bundle, i2, 1), MoreExecutors.directExecutor()), new ihw(0));
                return;
            }
            i3 = 5;
        }
        d(context, i, bundle, i3, null, agpi.a);
    }

    public final /* synthetic */ void g(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, Context context, int i, Bundle bundle, int i2) {
        agke agkeVar;
        Bitmap bitmap;
        try {
            agkeVar = (agke) Collection.EL.stream((List) ahng.v(listenableFuture)).filter(new hud(15)).collect(aghu.a);
        } catch (CancellationException | ExecutionException unused) {
            agkeVar = agpi.a;
        }
        try {
            bitmap = (Bitmap) ahng.v(listenableFuture2);
        } catch (CancellationException | ExecutionException unused2) {
            bitmap = null;
        }
        d(context, i, bundle, i2, bitmap, agkeVar);
    }
}
