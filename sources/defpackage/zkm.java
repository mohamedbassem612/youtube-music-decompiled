package defpackage;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.creation.editor.ShortsPlayerView;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zkm implements TextureView.SurfaceTextureListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ ViewGroup a;

    public zkm(ViewGroup viewGroup, int i) {
        this.$cid = i;
        this.a = viewGroup;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        int i3;
        int i4 = this.$cid;
        ViewGroup viewGroup = this.a;
        if (i4 != 0) {
            ShortsPlayerView shortsPlayerView = (ShortsPlayerView) viewGroup;
            ulj uljVar = shortsPlayerView.f;
            if (uljVar != null) {
                uljVar.i().z(surfaceTexture, new Size(i, i2));
                shortsPlayerView.e();
                return;
            }
            return;
        }
        zkn zknVar = (zkn) viewGroup;
        int i5 = zknVar.q;
        if (i5 > 0 && (i3 = zknVar.r) > 0) {
            surfaceTexture.setDefaultBufferSize(i5, i3);
        }
        zknVar.o = true;
        AtomicLong atomicLong = zknVar.h;
        atomicLong.incrementAndGet();
        Surface surface = zknVar.n;
        if (surface != null) {
            surface.release();
        }
        zknVar.n = new Surface(surfaceTexture);
        zll zllVar = zknVar.c;
        if (zllVar instanceof yzo) {
            ((yzo) zllVar).j(zknVar.n, atomicLong.get());
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        int i = this.$cid;
        ViewGroup viewGroup = this.a;
        if (i != 0) {
            ulj uljVar = ((ShortsPlayerView) viewGroup).f;
            if (uljVar == null) {
                return false;
            }
            ((uld) uljVar.i()).w();
            return false;
        }
        zkn zknVar = (zkn) viewGroup;
        Surface surface = zknVar.n;
        if (surface != null) {
            surface.release();
            zknVar.n = null;
        }
        zknVar.o = false;
        zknVar.h.incrementAndGet();
        zll zllVar = zknVar.c;
        if (zllVar instanceof yzo) {
            ((yzo) zllVar).i(null);
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.$cid == 0 || i <= 0 || i2 <= 0) {
            return;
        }
        ShortsPlayerView shortsPlayerView = (ShortsPlayerView) this.a;
        if (shortsPlayerView.j) {
            ((agrc) ((agrc) ShortsPlayerView.a.c()).k("com/google/android/libraries/youtube/creation/editor/ShortsPlayerView$2", "onSurfaceTextureSizeChanged", 299, "ShortsPlayerView.java")).t("Ignoring texture size changes since frames processing has started");
            zvp.a(zvn.a, zvm.f, "[ShortsCreation][Android][Edit]Ignoring texture size changes since frames processing has started");
        } else {
            ulj uljVar = shortsPlayerView.f;
            if (uljVar != null) {
                uljVar.i().z(surfaceTexture, new Size(i, i2));
            }
        }
        shortsPlayerView.e();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
