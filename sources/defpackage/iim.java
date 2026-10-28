package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.RemoteViews;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iim implements iis {
    private static final agrf c = agrf.h("com/google/android/apps/youtube/music/player/widget/gm3/NowPlayingWidgetUiRenderer");
    public final ihk a;
    public final ihh b = new ihh(gzo.NOW_PLAYING.e);

    public iim(ihk ihkVar) {
        this.a = ihkVar;
    }

    public static void i(RemoteViews remoteViews, boolean z) {
        remoteViews.setInt(R.id.widget_icon, "setVisibility", true != z ? 8 : 0);
        remoteViews.setInt(R.id.widget_icon_empty, "setVisibility", true != z ? 0 : 8);
    }

    @Override // defpackage.iis
    public final void a(Context context, int i, int i2, Bundle bundle) {
        g(context, i, bundle, i2);
    }

    @Override // defpackage.iis
    public final /* synthetic */ void b(Context context, int[] iArr, int i, Bundle bundle) {
        hna.q(this, context, iArr, i, bundle);
    }

    final ListenableFuture c(Context context, Bundle bundle, int i) {
        wgg wggVarB = ihk.b(bundle, i);
        return wggVarB == null ? ahng.m(new IllegalAccessException()) : ihk.g(context, wggVarB, i, null);
    }

    final ListenableFuture d(Context context, Bundle bundle, int i) {
        List<anzs> listAD;
        ListenableFuture listenableFutureAr;
        try {
            listAD = ahng.aD(bundle, "recently_played", anzs.a, ExtensionRegistryLite.getGeneratedRegistry());
        } catch (Exception e) {
            ((agrc) ((agrc) ((agrc) c.c().i(agso.a, "Widget.NowPlayingRenderer")).j(e)).k("com/google/android/apps/youtube/music/player/widget/gm3/NowPlayingWidgetUiRenderer", "getRecentlyPlayedItemsFromBundle", (char) 544, "NowPlayingWidgetUiRenderer.java")).t("Failed to parse recently played items");
            listAD = agpi.a;
        }
        ArrayList arrayList = new ArrayList();
        for (anzs anzsVar : listAD) {
            if (anzsVar == null) {
                listenableFutureAr = ahng.m(new IllegalAccessException());
            } else {
                aqmh aqmhVar = anzsVar.e;
                if (aqmhVar == null) {
                    aqmhVar = aqmh.a;
                }
                wgg wggVarI = new abuz(aqmhVar).i(i, i);
                if (wggVarI == null) {
                    listenableFutureAr = ahng.m(new IllegalAccessException());
                } else {
                    int iAU = a.aU(anzsVar.g);
                    ezz ezzVar = null;
                    if (iAU != 0 && iAU == 2) {
                        ezzVar = new ezz();
                    }
                    listenableFutureAr = ahno.ar(ihk.g(context, wggVarI, i, ezzVar), new iii(anzsVar, 0), MoreExecutors.directExecutor());
                }
            }
            arrayList.add(listenableFutureAr);
        }
        return ahng.t(arrayList);
    }

    public final void e(Context context, int i, ArrayList arrayList, RemoteViews remoteViews) {
        for (int i2 = 0; i2 < i; i2++) {
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.widget_recent_track);
            if (arrayList.isEmpty()) {
                i(remoteViews2, false);
            } else {
                i(remoteViews2, true);
                iik iikVar = (iik) arrayList.get(0);
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
                arrayList.remove(0);
            }
            remoteViews.addView(R.id.track_container, remoteViews2);
        }
    }

    final void f(final Context context, int i, final Bundle bundle, final int i2, final Bitmap bitmap, final List list) {
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.widget_icon_size);
        final int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.widget_row_height);
        RemoteViews remoteViewsE = mdu.e(context, AppWidgetManager.getInstance(context), i, new awqg() { // from class: iih
            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                int i3;
                mar marVar = (mar) obj;
                Context context2 = context;
                RemoteViews remoteViews = new RemoteViews(context2.getPackageName(), R.layout.app_widget_now_playing);
                int dimensionPixelSize3 = marVar.a - ((int) (((double) context2.getResources().getDimensionPixelSize(R.dimen.widget_container_padding)) * 2.5d));
                int i4 = marVar.b;
                int i5 = i4 / dimensionPixelSize2;
                int i6 = dimensionPixelSize3 / dimensionPixelSize;
                float fApplyDimension = i4 / TypedValue.applyDimension(1, 110.0f, context2.getResources().getDisplayMetrics());
                double d = fApplyDimension;
                iim iimVar = this.a;
                if (d > 0.8d) {
                    if (i5 == 1) {
                        float fMin = Math.min(1.0f, fApplyDimension);
                        remoteViews.setViewLayoutHeight(R.id.widget_controls_container, fMin * 110.0f, 1);
                        float f = fMin * 73.0f;
                        remoteViews.setViewLayoutHeight(R.id.album_art, f, 1);
                        remoteViews.setViewLayoutWidth(R.id.album_art, f, 1);
                        remoteViews.setViewLayoutMargin(R.id.metadata_container, 4, 105.0f * fMin, 1);
                        remoteViews.setViewLayoutMargin(R.id.metadata_container, 5, 151.0f * fMin, 1);
                        remoteViews.setViewLayoutHeight(R.id.like_button, f, 1);
                        remoteViews.setViewLayoutMargin(R.id.like_button, 5, fMin * 97.0f, 1);
                        remoteViews.setViewLayoutHeight(R.id.play_pause_button, f, 1);
                        remoteViews.setViewLayoutWidth(R.id.play_pause_button, f, 1);
                        remoteViews.setViewLayoutMargin(R.id.play_pause_button, 5, fMin * 16.0f, 1);
                    } else if (i5 == 2 || i5 == 3) {
                        remoteViews.setViewLayoutHeight(R.id.widget_controls_container, 92.0f, 1);
                        remoteViews.setViewLayoutHeight(R.id.album_art, 60.0f, 1);
                        remoteViews.setViewLayoutWidth(R.id.album_art, 60.0f, 1);
                        remoteViews.setViewLayoutHeight(R.id.metadata_container, 60.0f, 1);
                        remoteViews.setViewLayoutMargin(R.id.metadata_container, 4, 92.0f, 1);
                        remoteViews.setViewLayoutMargin(R.id.metadata_container, 5, 138.0f, 1);
                        remoteViews.setViewLayoutHeight(R.id.like_button, 60.0f, 1);
                        remoteViews.setViewLayoutMargin(R.id.like_button, 5, 84.0f, 1);
                        remoteViews.setViewLayoutHeight(R.id.play_pause_button, 60.0f, 1);
                        remoteViews.setViewLayoutWidth(R.id.play_pause_button, 60.0f, 1);
                        remoteViews.setViewLayoutMargin(R.id.play_pause_button, 5, 16.0f, 1);
                    } else if (i5 >= 4) {
                        remoteViews.setViewLayoutHeight(R.id.widget_controls_container, 178.0f, 1);
                        remoteViews.setViewLayoutHeight(R.id.album_art, 146.0f, 1);
                        remoteViews.setViewLayoutWidth(R.id.album_art, 146.0f, 1);
                        remoteViews.setViewLayoutHeight(R.id.metadata_container, 73.0f, 1);
                        remoteViews.setViewLayoutMargin(R.id.metadata_container, 4, 178.0f, 1);
                        remoteViews.setViewLayoutMargin(R.id.metadata_container, 5, 8.0f, 1);
                        remoteViews.setViewLayoutHeight(R.id.like_button, 60.0f, 1);
                        remoteViews.setViewLayoutMargin(R.id.like_button, 5, 84.0f, 1);
                        remoteViews.setViewLayoutHeight(R.id.play_pause_button, 60.0f, 1);
                        remoteViews.setViewLayoutWidth(R.id.play_pause_button, 60.0f, 1);
                        remoteViews.setViewLayoutMargin(R.id.play_pause_button, 5, 16.0f, 1);
                    }
                    if (i6 < 5) {
                        remoteViews.setViewVisibility(R.id.like_button, 8);
                        if (i5 == 1) {
                            remoteViews.setViewLayoutMargin(R.id.metadata_container, 5, 97.0f, 1);
                        } else if (i5 == 2 || i5 == 3) {
                            remoteViews.setViewLayoutMargin(R.id.metadata_container, 5, 84.0f, 1);
                        }
                    } else {
                        remoteViews.setViewVisibility(R.id.like_button, 0);
                    }
                    int i7 = i5 - 1;
                    remoteViews.removeAllViews(R.id.widget_play_history_container);
                    if (i7 <= 0) {
                        remoteViews.setViewVisibility(R.id.widget_play_history_container, 8);
                    } else {
                        List list2 = list;
                        remoteViews.setViewVisibility(R.id.widget_play_history_container, 0);
                        RemoteViews remoteViews2 = new RemoteViews(context2.getPackageName(), R.layout.widget_recent_track_container);
                        remoteViews2.setViewLayoutMargin(R.id.track_container, 1, 4.0f, 1);
                        remoteViews2.setViewLayoutMargin(R.id.track_container, 3, 4.0f, 1);
                        ArrayList arrayList = new ArrayList(list2);
                        iimVar.e(context2, i6, arrayList, remoteViews2);
                        remoteViews.addView(R.id.widget_play_history_container, remoteViews2);
                        if (i7 != 1) {
                            RemoteViews remoteViews3 = new RemoteViews(context2.getPackageName(), R.layout.widget_recent_track_container);
                            remoteViews3.setViewLayoutHeight(R.id.track_container, 68.0f, 1);
                            remoteViews3.setViewLayoutMargin(R.id.track_container, 3, 4.0f, 1);
                            iimVar.e(context2, i6, arrayList, remoteViews3);
                            remoteViews.addView(R.id.widget_play_history_container, remoteViews3);
                        }
                    }
                } else {
                    remoteViews = new RemoteViews(context2.getPackageName(), R.layout.app_widget_now_playing_mini);
                }
                RemoteViews remoteViews4 = remoteViews;
                Bundle bundle2 = bundle;
                if (bundle2 == null || (i3 = i2) == 5) {
                    agrx agrxVar = agso.a;
                    iimVar.a.d(context2, remoteViews4, iimVar.b, R.string.widget_track_default_state, R.string.widget_byline_default_state, R.drawable.widget_default_icon, true);
                } else {
                    Bitmap bitmap2 = bitmap;
                    iimVar.a.c(context2, remoteViews4, bundle2, i3, iimVar.b, true, false);
                    if (bitmap2 != null) {
                        remoteViews4.setImageViewBitmap(R.id.album_art, bitmap2);
                    }
                }
                return remoteViews4;
            }
        });
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        if (appWidgetManager != null) {
            appWidgetManager.updateAppWidget(i, remoteViewsE);
        }
    }

    public final void g(Context context, int i, Bundle bundle, int i2) {
        if (bundle == null) {
            f(context, i, null, i2, null, agpi.a);
            return;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.widget_music_small_album_art_size);
        ListenableFuture listenableFutureD = d(context, bundle, dimensionPixelSize);
        ListenableFuture listenableFutureM = i2 == 5 ? ahng.m(new IllegalStateException()) : c(context, bundle, dimensionPixelSize);
        taf.j(ahno.av(listenableFutureM, listenableFutureD).k(new iij(this, listenableFutureD, listenableFutureM, context, i, bundle, i2, 0), MoreExecutors.directExecutor()), new ihw(2));
    }

    public final /* synthetic */ void j(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, Context context, int i, Bundle bundle, int i2) {
        Bitmap bitmap;
        agke agkeVar = (agke) Collection.EL.stream((List) ahng.v(listenableFuture)).filter(new hud(16)).collect(aghu.a);
        try {
            bitmap = (Bitmap) ahng.v(listenableFuture2);
        } catch (CancellationException | ExecutionException unused) {
            bitmap = null;
        }
        ihu ihuVar = new ihu(bitmap, agkeVar);
        f(context, i, bundle, i2, ihuVar.a, ihuVar.b);
    }
}
