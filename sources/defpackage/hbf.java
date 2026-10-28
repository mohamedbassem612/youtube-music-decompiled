package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class hbf {
    public final Object a;

    public hbf(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.a = new GestureDetector(context, onGestureListener, handler);
    }

    public final String a(int i) {
        return ((Context) this.a).getResources().getQuantityString(R.plurals.offline_podcast_playlist_size, i, Integer.valueOf(i));
    }

    public final String b() {
        return ((Context) this.a).getString(R.string.offline_episodes_detail_page_title);
    }

    public final String c() {
        return ((Context) this.a).getString(R.string.offline_podcasts_shelf_title);
    }

    public final String d() {
        return ((Context) this.a).getString(R.string.sleep_timer);
    }

    public final void e(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        ((GestureDetector) this.a).setOnDoubleTapListener(onDoubleTapListener);
    }

    public final boolean f(MotionEvent motionEvent) {
        return ((GestureDetector) this.a).onTouchEvent(motionEvent);
    }

    public hbf(Context context) {
        this.a = context;
    }
}
