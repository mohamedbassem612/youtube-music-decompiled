package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.MoreExecutors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ihd implements iis {
    private final ihk a;
    private final ihh b = new ihh(gzo.LEGACY.e);

    public ihd(ihk ihkVar) {
        this.a = ihkVar;
    }

    public static final void c(Context context, int i, RemoteViews remoteViews) {
        AppWidgetManager.getInstance(context).updateAppWidget(i, remoteViews);
    }

    @Override // defpackage.iis
    public final void a(Context context, int i, int i2, Bundle bundle) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.app_widget);
        if (bundle == null || i2 == 5) {
            this.a.d(context, remoteViews, this.b, R.string.app_name, -1, R.drawable.empty_state_cover_square, false);
            remoteViews.setInt(R.id.widget_right_panel, "setBackgroundResource", R.color.ytm_color_grey_10);
            remoteViews.setTextColor(R.id.trackname, context.getColor(R.color.widget_music_disabled_title_color));
            c(context, i, remoteViews);
            return;
        }
        ihk ihkVar = this.a;
        ihkVar.c(context, remoteViews, bundle, i2, this.b, false, true);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.widget_music_legacy_album_art_size);
        wgg wggVarB = ihk.b(bundle, dimensionPixelSize);
        if (wggVarB == null) {
            c(context, i, remoteViews);
        } else {
            ahno.at(ahno.ar(ihk.g(context, wggVarB, dimensionPixelSize, null), new iii(ihkVar, 1), ihkVar.b), new ihc(remoteViews, context, i), MoreExecutors.directExecutor());
        }
    }

    @Override // defpackage.iis
    public final /* synthetic */ void b(Context context, int[] iArr, int i, Bundle bundle) {
        hna.q(this, context, iArr, i, bundle);
    }
}
