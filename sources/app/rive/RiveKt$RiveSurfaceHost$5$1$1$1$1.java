package app.rive;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import app.rive.core.CommandQueue;
import app.rive.core.RiveSurface;
import app.rive.core.SurfaceTextureSurface;
import defpackage.a;
import defpackage.aia;
import defpackage.ais;
import defpackage.awqg;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveKt$RiveSurfaceHost$5$1$1$1$1 implements TextureView.SurfaceTextureListener {
    final /* synthetic */ aia $bitmapCallbackSent$delegate;
    final /* synthetic */ ais $currentOnBitmapAvailable$delegate;
    final /* synthetic */ CommandQueue $riveWorker;
    final /* synthetic */ RiveSurfaceState $surfaceState;
    final /* synthetic */ RiveTextureView $this_apply;

    public RiveKt$RiveSurfaceHost$5$1$1$1$1(RiveSurfaceState riveSurfaceState, CommandQueue commandQueue, aia aiaVar, RiveTextureView riveTextureView, ais aisVar) {
        this.$surfaceState = riveSurfaceState;
        this.$riveWorker = commandQueue;
        this.$bitmapCallbackSent$delegate = aiaVar;
        this.$this_apply = riveTextureView;
        this.$currentOnBitmapAvailable$delegate = aisVar;
    }

    static final String onSurfaceTextureDestroyed$lambda$1() {
        return "Surface texture destroyed (final release deferred to RenderContext disposal)";
    }

    static final void onSurfaceTextureUpdated$lambda$3(ais aisVar, final RiveTextureView riveTextureView) {
        awqg awqgVarRiveSurfaceHost$lambda$1 = RiveKt.RiveSurfaceHost$lambda$1(aisVar);
        if (awqgVarRiveSurfaceHost$lambda$1 != null) {
            awqgVarRiveSurfaceHost$lambda$1.invoke(new Function0() { // from class: app.rive.RiveKt$RiveSurfaceHost$5$1$1$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveKt$RiveSurfaceHost$5$1$1$1$1.onSurfaceTextureUpdated$lambda$3$0(riveTextureView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap onSurfaceTextureUpdated$lambda$3$0(RiveTextureView riveTextureView) {
        Bitmap bitmap = riveTextureView.getBitmap();
        if (bitmap != null) {
            return bitmap;
        }
        throw new IllegalStateException("Bitmap no longer available; surface may have been destroyed");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, final int i, final int i2) {
        surfaceTexture.getClass();
        RiveLog.INSTANCE.getLogger().d("Rive/UI", new Function0() { // from class: app.rive.RiveKt$RiveSurfaceHost$5$1$1$1$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.ck(i2, i, "Surface texture available (", " x ", (byte) 41);
            }
        });
        this.$surfaceState.setWidth(i);
        this.$surfaceState.setHeight(i2);
        this.$surfaceState.setSurface(this.$riveWorker.createRiveSurface(new SurfaceTextureSurface(surfaceTexture, i, i2)));
        RiveKt.RiveSurfaceHost$lambda$4(this.$bitmapCallbackSent$delegate, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        RiveLog.INSTANCE.getLogger().d("Rive/UI", new Function0() { // from class: app.rive.RiveKt$RiveSurfaceHost$5$1$1$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveKt$RiveSurfaceHost$5$1$1$1$1.onSurfaceTextureDestroyed$lambda$1();
            }
        });
        this.$surfaceState.setSurface(null);
        RiveKt.RiveSurfaceHost$lambda$4(this.$bitmapCallbackSent$delegate, false);
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        surfaceTexture.getClass();
        RiveLog.INSTANCE.getLogger().d("Rive/UI", new Function0() { // from class: app.rive.RiveKt$RiveSurfaceHost$5$1$1$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.ck(i2, i, "Surface texture size changed (", " x ", (byte) 41);
            }
        });
        this.$surfaceState.setWidth(i);
        this.$surfaceState.setHeight(i2);
        RiveSurface surface = this.$surfaceState.getSurface();
        if (surface != null) {
            surface.resize$third_party_java_android_libs_rive_rive_android(i, i2);
        }
        RiveKt.RiveSurfaceHost$lambda$4(this.$bitmapCallbackSent$delegate, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        if (RiveKt.RiveSurfaceHost$lambda$3(this.$bitmapCallbackSent$delegate) || RiveKt.RiveSurfaceHost$lambda$1(this.$currentOnBitmapAvailable$delegate) == null || this.$this_apply.getBitmap() == null) {
            return;
        }
        RiveKt.RiveSurfaceHost$lambda$4(this.$bitmapCallbackSent$delegate, true);
        final RiveTextureView riveTextureView = this.$this_apply;
        final ais aisVar = this.$currentOnBitmapAvailable$delegate;
        riveTextureView.post(new Runnable() { // from class: app.rive.RiveKt$RiveSurfaceHost$5$1$1$1$1$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                RiveKt$RiveSurfaceHost$5$1$1$1$1.onSurfaceTextureUpdated$lambda$3(aisVar, riveTextureView);
            }
        });
    }
}
