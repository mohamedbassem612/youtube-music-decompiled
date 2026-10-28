package app.rive.runtime.kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import app.rive.RiveLog;
import app.rive.runtime.kotlin.renderers.Renderer;
import defpackage.a;
import defpackage.atqp;
import defpackage.awmi;
import defpackage.awmp;
import defpackage.awqx;
import defpackage.awrc;
import defpackage.bof;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class RiveTextureView extends TextureView implements TextureView.SurfaceTextureListener {
    private static final String TAG = "RiveL/RiveTextureView";
    private final awmi activity$delegate;
    private final awmi lifecycleObserver$delegate;
    private Renderer renderer;
    private SharedSurface sharedSurface;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.activity$delegate = atqp.k(3, new Function0() { // from class: app.rive.runtime.kotlin.RiveTextureView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveTextureView.activity_delegate$lambda$0(this.f$0);
            }
        });
        this.lifecycleObserver$delegate = new awmp(new Function0() { // from class: app.rive.runtime.kotlin.RiveTextureView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.createObserver();
            }
        });
    }

    static final Activity activity_delegate$lambda$0(RiveTextureView riveTextureView) {
        Context context = riveTextureView.getContext();
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                context.getClass();
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        context = null;
        context.getClass();
        return (Activity) context;
    }

    static final String onAttachedToWindow$lambda$0() {
        return "onAttachedToWindow";
    }

    static final String onDetachedFromWindow$lambda$0() {
        return "onDetachedFromWindow";
    }

    static final String onSurfaceTextureDestroyed$lambda$0() {
        return "onSurfaceTextureDestroyed";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract bof createObserver();

    protected abstract Renderer createRenderer();

    protected final Activity getActivity() {
        return (Activity) this.activity$delegate.a();
    }

    protected final /* synthetic */ Object getContextAsType() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            awrc.e();
            if (context instanceof Object) {
                return context;
            }
        }
        return null;
    }

    protected final bof getLifecycleObserver() {
        return (bof) this.lifecycleObserver$delegate.a();
    }

    protected final Renderer getRenderer() {
        return this.renderer;
    }

    @Override // android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.RiveTextureView$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveTextureView.onAttachedToWindow$lambda$0();
            }
        });
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
        setOpaque(false);
        Renderer rendererCreateRenderer = createRenderer();
        rendererCreateRenderer.make();
        this.renderer = rendererCreateRenderer;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.RiveTextureView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveTextureView.onDetachedFromWindow$lambda$0();
            }
        });
        SharedSurface sharedSurface = this.sharedSurface;
        if (sharedSurface != null) {
            sharedSurface.release();
        }
        this.sharedSurface = null;
        Renderer renderer = this.renderer;
        renderer.getClass();
        renderer.delete();
        this.renderer = null;
        super.onDetachedFromWindow();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, final int i, final int i2) {
        surfaceTexture.getClass();
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.RiveTextureView$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.bQ(i2, i, "onSurfaceTextureAvailable: ", " x ");
            }
        });
        SharedSurface sharedSurface = this.sharedSurface;
        if (sharedSurface != null) {
            sharedSurface.release();
        }
        Renderer renderer = this.renderer;
        if (renderer != null) {
            renderer.stop();
            SharedSurface sharedSurface2 = new SharedSurface(new Surface(surfaceTexture));
            this.sharedSurface = sharedSurface2;
            renderer.setSurface$third_party_java_android_libs_rive_rive_android(sharedSurface2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.RiveTextureView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveTextureView.onSurfaceTextureDestroyed$lambda$0();
            }
        });
        Renderer renderer = this.renderer;
        if (renderer != null) {
            renderer.destroySurfaceAsync$third_party_java_android_libs_rive_rive_android();
        }
        SharedSurface sharedSurface = this.sharedSurface;
        if (sharedSurface != null) {
            sharedSurface.release();
        }
        this.sharedSurface = null;
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        surfaceTexture.getClass();
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.RiveTextureView$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.bQ(i2, i, "onSurfaceTextureSizeChanged: ", " x ");
            }
        });
        onSurfaceTextureAvailable(surfaceTexture, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
    }

    @Override // android.view.TextureView, android.view.View
    protected void onVisibilityChanged(View view, final int i) {
        view.getClass();
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.RiveTextureView$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.bR(i, "onVisibilityChanged: ");
            }
        });
        super.onVisibilityChanged(view, i);
        Renderer renderer = this.renderer;
        if (i == 0) {
            if (renderer != null) {
                renderer.start();
            }
        } else if (renderer != null) {
            renderer.stop();
        }
    }

    protected final void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }

    public /* synthetic */ RiveTextureView(Context context, AttributeSet attributeSet, int i, awqx awqxVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
