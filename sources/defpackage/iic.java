package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.SizeF;
import android.widget.RemoteViews;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iic implements iis {
    public final ihk a;
    public final ihh b = new ihh(gzo.FREE_FORM.e);

    public iic(ihk ihkVar) {
        this.a = ihkVar;
    }

    @Override // defpackage.iis
    public final void a(Context context, int i, int i2, Bundle bundle) {
        c(context, i, bundle, i2);
    }

    @Override // defpackage.iis
    public final /* synthetic */ void b(Context context, int[] iArr, int i, Bundle bundle) {
        hna.q(this, context, iArr, i, bundle);
    }

    public final void c(Context context, int i, Bundle bundle, int i2) {
        Collection collectionAL;
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        context.getClass();
        appWidgetManager.getClass();
        Resources resources = context.getResources();
        Bundle appWidgetOptions = appWidgetManager.getAppWidgetOptions(i);
        appWidgetOptions.getClass();
        ArrayList<SizeF> parcelableArrayList = Build.VERSION.SDK_INT >= 31 ? appWidgetOptions.getParcelableArrayList("appWidgetSizes") : null;
        int i3 = 2;
        if (Build.VERSION.SDK_INT < 31 || parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            resources.getClass();
            collectionAL = atqq.aL(new mar[]{mdu.f(appWidgetOptions, true), mdu.f(appWidgetOptions, false)});
        } else {
            collectionAL = new ArrayList(atqq.N(parcelableArrayList, 10));
            for (SizeF sizeF : parcelableArrayList) {
                sizeF.getWidth();
                sizeF.getHeight();
                sizeF.getClass();
                collectionAL.add(mdu.g(sizeF));
            }
        }
        int asInt = j$.util.Collection.EL.stream(collectionAL).mapToInt(new ddc(i3)).max().getAsInt();
        wgg wggVarB = ihk.b(bundle, asInt);
        if (wggVarB == null) {
            d(context, i, i2, bundle, null);
        } else {
            ahno.at(ihk.g(context, wggVarB, asInt, new ezz()), new iib(this, context, i, i2, bundle), MoreExecutors.directExecutor());
        }
    }

    public final void d(final Context context, int i, final int i2, final Bundle bundle, final Bitmap bitmap) {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        appWidgetManager.updateAppWidget(i, mdu.e(context, appWidgetManager, i, new awqg() { // from class: iia
            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                int i3;
                Bundle bundle2;
                Context context2 = context;
                mar marVar = (mar) obj;
                RemoteViews remoteViews = new RemoteViews(context2.getPackageName(), R.layout.app_widget_freeform);
                int iMin = Math.min(marVar.a, marVar.b);
                double dimensionPixelSize = ((double) iMin) / ((double) context2.getResources().getDimensionPixelSize(R.dimen.freeform_widget_album_art_size));
                double d = (((-1.0d) + dimensionPixelSize) * 0.25d) + 1.0d;
                float dimensionPixelSize2 = (int) (((double) context2.getResources().getDimensionPixelSize(R.dimen.freeform_widget_play_button_size)) * d);
                remoteViews.setViewLayoutHeight(R.id.play_pause_button, dimensionPixelSize2, 0);
                remoteViews.setViewLayoutWidth(R.id.play_pause_button, dimensionPixelSize2, 0);
                float fMax = (int) Math.max(((double) context2.getResources().getDimensionPixelSize(R.dimen.freeform_widget_like_button_size)) * d, context2.getResources().getDimension(R.dimen.a11y_min_size));
                remoteViews.setViewLayoutHeight(R.id.like_button, fMax, 0);
                remoteViews.setViewLayoutWidth(R.id.like_button, fMax, 0);
                float f = iMin;
                remoteViews.setViewLayoutHeight(R.id.album_art, f, 0);
                remoteViews.setViewLayoutWidth(R.id.album_art, f, 0);
                remoteViews.setViewLayoutHeight(android.R.id.background, f, 0);
                remoteViews.setViewLayoutWidth(android.R.id.background, f, 0);
                remoteViews.setInt(android.R.id.background, "setBackgroundResource", R.drawable.freeform_circle_background);
                if (dimensionPixelSize > 1.0d) {
                    int i4 = iMin / 8;
                    i3 = i4 - ((int) (((double) i4) / dimensionPixelSize));
                } else {
                    i3 = 0;
                }
                int i5 = i2;
                iic iicVar = this.a;
                float f2 = i3;
                remoteViews.setViewLayoutMargin(R.id.like_button, 1, f2, 0);
                remoteViews.setViewLayoutMargin(R.id.like_button, 5, f2, 0);
                remoteViews.setViewLayoutMargin(R.id.play_pause_button, 3, f2, 0);
                remoteViews.setViewLayoutMargin(R.id.play_pause_button, 4, f2, 0);
                if (i5 == 5 || (bundle2 = bundle) == null) {
                    iicVar.a.d(context2, remoteViews, iicVar.b, R.string.app_name, -1, R.drawable.widget_default_circular_icon, true);
                } else {
                    Bitmap bitmap2 = bitmap;
                    iicVar.a.c(context2, remoteViews, bundle2, i5, iicVar.b, true, false);
                    if (bitmap2 != null) {
                        remoteViews.setImageViewBitmap(R.id.album_art, bitmap2);
                    } else {
                        remoteViews.setImageViewResource(R.id.album_art, R.drawable.widget_default_circular_icon);
                    }
                }
                return remoteViews;
            }
        }));
    }
}
