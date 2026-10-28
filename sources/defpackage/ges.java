package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.youtube.music.activities.MusicActivity;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ges implements ViewTreeObserver.OnPreDrawListener {
    public final WeakReference a;
    private final WeakReference b;

    public ges(MusicActivity musicActivity, View view) {
        this.a = new WeakReference(musicActivity);
        this.b = new WeakReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.b.get();
        if (view == null) {
            return true;
        }
        view.post(new br(this, view, 17));
        return true;
    }
}
