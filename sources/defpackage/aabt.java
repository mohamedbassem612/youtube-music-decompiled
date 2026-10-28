package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.util.SparseIntArray;
import android.widget.RemoteViews;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aabt {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/notification/push/util/NotificationProcessingCustomRenderingUtil");
    public static final SparseIntArray b = new aabs((byte[]) null);
    static final SparseIntArray c = new aabs();

    public static Bitmap a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public static void b(Context context, RemoteViews remoteViews) {
        int iC = twm.c(context.getResources().getDisplayMetrics(), 16);
        remoteViews.setImageViewBitmap(R.id.custom_notification_work_profile_badge, a(context.getPackageManager().getUserBadgedDrawableForDensity(new BitmapDrawable(context.getResources(), Bitmap.createBitmap(iC, iC, Bitmap.Config.ARGB_8888)), Process.myUserHandle(), new Rect(0, 0, iC, iC), -1)));
    }
}
