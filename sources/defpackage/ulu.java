package defpackage;

import android.util.Size;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.google.android.libraries.youtube.creation.editor.ShortsPlayerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ulu implements SurfaceHolder.Callback {
    final /* synthetic */ SurfaceView a;
    final /* synthetic */ ulj b;
    final /* synthetic */ ShortsPlayerView c;
    private boolean d = false;

    public ulu(ShortsPlayerView shortsPlayerView, SurfaceView surfaceView, ulj uljVar) {
        this.a = surfaceView;
        this.b = uljVar;
        this.c = shortsPlayerView;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return;
        }
        ShortsPlayerView shortsPlayerView = this.c;
        if (!shortsPlayerView.j || this.d) {
            ulj uljVar = this.b;
            uljVar.i().y(surfaceHolder.getSurface(), new Size(i2, i3));
            this.d = false;
        } else {
            ((agrc) ((agrc) ShortsPlayerView.a.c()).k("com/google/android/libraries/youtube/creation/editor/ShortsPlayerView$1", "surfaceChanged", 245, "ShortsPlayerView.java")).t("Ignoring texture size changes since frames processing has started");
            zvp.a(zvn.a, zvm.f, "[ShortsCreation][Android][Edit] Ignoring texture size changes since frames processing has started");
        }
        if (shortsPlayerView.i != 0.0f) {
            surfaceHolder.setFixedSize(i2, i3);
        }
        shortsPlayerView.e();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.d = true;
        SurfaceView surfaceView = this.a;
        surfaceView.getWidth();
        surfaceView.getHeight();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ((uld) this.b.i()).w();
        this.c.b.a();
    }
}
