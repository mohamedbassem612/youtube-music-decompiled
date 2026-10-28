package app.rive.runtime.kotlin.renderers;

import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Surface;
import app.rive.RiveLog;
import app.rive.core.EGLError;
import app.rive.runtime.kotlin.SharedSurface;
import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.Fit;
import app.rive.runtime.kotlin.core.NativeObject;
import app.rive.runtime.kotlin.core.RefCount;
import app.rive.runtime.kotlin.core.RendererType;
import app.rive.runtime.kotlin.core.Rive;
import defpackage.a;
import defpackage.awqg;
import defpackage.awqx;
import defpackage.awrc;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Renderer extends NativeObject implements Choreographer.FrameCallback {
    private static final int CONTEXT_EVENT_LOST = 0;
    private static final int CONTEXT_EVENT_RECOVERED = 1;
    private static final String TAG = "RiveL/Renderer";
    private final Object frameLock;
    private boolean isAttached;
    private boolean isPlaying;
    private volatile awqg onRenderContextEvent;
    private final ArrayDeque pendingSurfaceReleases;
    private SharedSurface sharedSurface;
    private final boolean trace;
    private RendererType type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Renderer(RendererType rendererType, boolean z) {
        super(0L);
        rendererType.getClass();
        this.type = rendererType;
        this.trace = z;
        this.pendingSurfaceReleases = new ArrayDeque();
        this.frameLock = new Object();
    }

    public static /* synthetic */ void align$default(Renderer renderer, Fit fit, Alignment alignment, RectF rectF, RectF rectF2, float f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: align");
        }
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        renderer.align(fit, alignment, rectF, rectF2, f);
    }

    private final native long constructor(boolean z, int i);

    private final native void cppAlign(long j, Fit fit, Alignment alignment, RectF rectF, RectF rectF2, float f);

    private final native float cppAvgFps(long j);

    private final native void cppDestroySurface(long j);

    private final native void cppDoFrame(long j);

    private final native int cppHeight(long j);

    private final native void cppRestore(long j);

    private final native void cppSave(long j);

    private final native void cppSetSurface(Surface surface, long j);

    private final native void cppStart(long j);

    private final native void cppStop(long j);

    private final native void cppTransform(long j, float f, float f2, float f3, float f4, float f5, float f6);

    private final native int cppWidth(long j);

    static final String delete$lambda$0() {
        return "Deleting Renderer.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String destroySurfaceAsync$lambda$0$0() {
        return "Surface destroy requested.";
    }

    private final void destroySurfaceLocked() {
        this.isAttached = false;
        stopThread$third_party_java_android_libs_rive_rive_android();
        SharedSurface sharedSurface = this.sharedSurface;
        if (sharedSurface != null) {
            this.pendingSurfaceReleases.addLast(sharedSurface);
        }
        this.sharedSurface = null;
        if (getHasCppObject()) {
            RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.renderers.Renderer$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Renderer.destroySurfaceLocked$lambda$0();
                }
            });
            cppDestroySurface(getCppPointer());
        }
    }

    static final String destroySurfaceLocked$lambda$0() {
        return "Destroying surface.";
    }

    static final String doFrame$lambda$1(Renderer renderer) {
        return "doFrame - isPlaying: " + renderer.isPlaying + ", isAttached: " + renderer.isAttached + " - one or both are false; not scheduling any new frames";
    }

    static final String make$lambda$0() {
        return "Making Renderer.";
    }

    private final void onNativeRenderContextEvent(final int i, int i2, String str) {
        RenderContextEventType renderContextEventType;
        if (i == 0) {
            renderContextEventType = RenderContextEventType.Lost;
        } else {
            if (i != 1) {
                RiveLog.INSTANCE.getLogger().e(TAG, null, new Function0() { // from class: app.rive.runtime.kotlin.renderers.Renderer$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return a.bR(i, "Unknown render context event type: ");
                    }
                });
                return;
            }
            renderContextEventType = RenderContextEventType.Recovered;
        }
        final awqg awqgVar = this.onRenderContextEvent;
        if (awqgVar != null) {
            final RenderContextEvent renderContextEvent = new RenderContextEvent(renderContextEventType, i2, EGLError.INSTANCE.errorString(i2), str);
            if (awrc.c(Looper.myLooper(), Looper.getMainLooper())) {
                awqgVar.invoke(renderContextEvent);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: app.rive.runtime.kotlin.renderers.Renderer$$ExternalSyntheticLambda14
                    @Override // java.lang.Runnable
                    public final void run() {
                        awqgVar.invoke(renderContextEvent);
                    }
                });
            }
        }
    }

    private final void onNativeSurfaceReleased() {
        synchronized (this.frameLock) {
            SharedSurface sharedSurface = (SharedSurface) this.pendingSurfaceReleases.pollFirst();
            if (sharedSurface == null) {
                RiveLog.INSTANCE.getLogger().e(TAG, null, new Function0() { // from class: app.rive.runtime.kotlin.renderers.Renderer$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Renderer.onNativeSurfaceReleased$lambda$0$0();
                    }
                });
            } else {
                sharedSurface.release();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onNativeSurfaceReleased$lambda$0$0() {
        return "Native released a surface with no pending Kotlin reference.";
    }

    private final void removeFrameCallback() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: app.rive.runtime.kotlin.renderers.Renderer$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                Choreographer.getInstance().removeFrameCallback(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSurface$lambda$0$0() {
        return "Setting surface.";
    }

    static final String start$lambda$0() {
        return "Starting Renderer.";
    }

    static final String start$lambda$1() {
        return "Already playing - returning.";
    }

    static final String start$lambda$2() {
        return "Not attached - returning.";
    }

    static final String start$lambda$3() {
        return "Native object disposed - returning.";
    }

    static final String stop$lambda$0() {
        return "Stopping Renderer.";
    }

    static final String stopThread$lambda$0() {
        return "Stopping Renderer thread.";
    }

    static final String stopThread$lambda$1() {
        return "Already stopped - returning.";
    }

    static final String stopThread$lambda$2() {
        return "Native object disposed - returning.";
    }

    public abstract void advance(float f);

    public final void align(Fit fit, Alignment alignment, RectF rectF, RectF rectF2, float f) {
        fit.getClass();
        alignment.getClass();
        rectF.getClass();
        rectF2.getClass();
        cppAlign(getCppPointer(), fit, alignment, rectF, rectF2, f);
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long j);

    public void delete() {
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.renderers.Renderer$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Renderer.delete$lambda$0();
            }
        });
        stop();
        synchronized (this.frameLock) {
            destroySurfaceLocked();
            cppDelete(getCppPointer());
            setCppPointer(0L);
        }
    }

    public final void destroySurfaceAsync$third_party_java_android_libs_rive_rive_android() {
        synchronized (this.frameLock) {
            RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.renderers.Renderer$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Renderer.destroySurfaceAsync$lambda$0$0();
                }
            });
            destroySurfaceLocked();
        }
        removeFrameCallback();
    }

    protected void disposeDependencies() {
        synchronized (this.frameLock) {
            SharedSurface sharedSurface = this.sharedSurface;
            if (sharedSurface != null) {
                sharedSurface.release();
            }
            this.sharedSurface = null;
            Iterator it = this.pendingSurfaceReleases.iterator();
            while (it.hasNext()) {
                ((SharedSurface) it.next()).release();
            }
            this.pendingSurfaceReleases.clear();
            Iterator it2 = getDependencies().iterator();
            while (it2.hasNext()) {
                ((RefCount) it2.next()).release();
            }
            getDependencies().clear();
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        if (this.isPlaying && this.isAttached) {
            synchronized (this.frameLock) {
                if (getHasCppObject() && this.isPlaying && this.isAttached) {
                    cppDoFrame(getCppPointer());
                }
            }
            if (this.isPlaying && this.isAttached) {
                scheduleFrame();
            } else {
                RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.renderers.Renderer$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Renderer.doFrame$lambda$1(this.f$0);
                    }
                });
            }
        }
    }

    public abstract void draw();

    public final float getAverageFps() {
        return cppAvgFps(getCppPointer());
    }

    public final Object getFrameLock() {
        return this.frameLock;
    }

    public final float getHeight() {
        return cppHeight(getCppPointer());
    }

    public final awqg getOnRenderContextEvent() {
        return this.onRenderContextEvent;
    }

    public final boolean getTrace() {
        return this.trace;
    }

    public final RendererType getType() {
        return this.type;
    }

    public final float getWidth() {
        return cppWidth(getCppPointer());
    }

    public final boolean isAttached() {
        return this.isAttached;
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public void make() {
        if (getHasCppObject()) {
            return;
        }
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.renderers.Renderer$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Renderer.make$lambda$0();
            }
        });
        setCppPointer(constructor(this.trace, this.type.getValue()));
        getRefs().incrementAndGet();
    }

    public final void restore() {
        cppRestore(getCppPointer());
    }

    public final void save() {
        cppSave(getCppPointer());
    }

    public final void scale(float f, float f2) {
        transform(f, 0.0f, 0.0f, f2, 0.0f, 0.0f);
    }

    public void scheduleFrame() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: app.rive.runtime.kotlin.renderers.Renderer$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                Choreographer.getInstance().postFrameCallback(this.f$0);
            }
        });
    }

    public final void setAttached(boolean z) {
        this.isAttached = z;
    }

    public final void setOnRenderContextEvent(awqg awqgVar) {
        this.onRenderContextEvent = awqgVar;
    }

    public final void setRendererType(int i) {
        if (i != this.type.getValue()) {
            this.type = RendererType.Companion.fromIndex(i);
        }
    }

    public final void setSurface(Surface surface) {
        surface.getClass();
        setSurface$third_party_java_android_libs_rive_rive_android(new SharedSurface(surface));
    }

    public final void setSurface$third_party_java_android_libs_rive_rive_android(SharedSurface sharedSurface) {
        sharedSurface.getClass();
        synchronized (this.frameLock) {
            RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.renderers.Renderer$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Renderer.setSurface$lambda$0$0();
                }
            });
            SharedSurface sharedSurface2 = this.sharedSurface;
            if (sharedSurface2 != null) {
                this.pendingSurfaceReleases.addLast(sharedSurface2);
            }
            sharedSurface.acquire();
            this.sharedSurface = sharedSurface;
            cppSetSurface(sharedSurface.getSurface(), getCppPointer());
            this.isAttached = true;
        }
        start();
    }

    public final void setType(RendererType rendererType) {
        rendererType.getClass();
        this.type = rendererType;
    }

    public final void start() {
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.renderers.Renderer$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Renderer.start$lambda$0();
            }
        });
        if (this.isPlaying) {
            RiveLog.INSTANCE.getLogger().v(TAG, new Function0() { // from class: app.rive.runtime.kotlin.renderers.Renderer$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Renderer.start$lambda$1();
                }
            });
            return;
        }
        if (!this.isAttached) {
            RiveLog.INSTANCE.getLogger().v(TAG, new Function0() { // from class: app.rive.runtime.kotlin.renderers.Renderer$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Renderer.start$lambda$2();
                }
            });
        } else if (!getHasCppObject()) {
            RiveLog.INSTANCE.getLogger().e(TAG, null, new Function0() { // from class: app.rive.runtime.kotlin.renderers.Renderer$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Renderer.start$lambda$3();
                }
            });
        } else {
            this.isPlaying = true;
            cppStart(getCppPointer());
            scheduleFrame();
        }
    }

    public final void stop() {
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.renderers.Renderer$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Renderer.stop$lambda$0();
            }
        });
        stopThread$third_party_java_android_libs_rive_rive_android();
        removeFrameCallback();
    }

    public final void stopThread$third_party_java_android_libs_rive_rive_android() {
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.renderers.Renderer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Renderer.stopThread$lambda$0();
            }
        });
        if (!this.isPlaying) {
            RiveLog.INSTANCE.getLogger().w(TAG, new Function0() { // from class: app.rive.runtime.kotlin.renderers.Renderer$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Renderer.stopThread$lambda$1();
                }
            });
        } else if (getHasCppObject()) {
            this.isPlaying = false;
            cppStop(getCppPointer());
        } else {
            RiveLog.INSTANCE.getLogger().e(TAG, null, new Function0() { // from class: app.rive.runtime.kotlin.renderers.Renderer$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Renderer.stopThread$lambda$2();
                }
            });
        }
    }

    public final void transform(float f, float f2, float f3, float f4, float f5, float f6) {
        cppTransform(getCppPointer(), f, f2, f3, f4, f5, f6);
    }

    public final void translate(float f, float f2) {
        transform(1.0f, 0.0f, 0.0f, 1.0f, f, f2);
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Renderer() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ Renderer(RendererType rendererType, boolean z, int i, awqx awqxVar) {
        this((i & 1) != 0 ? Rive.INSTANCE.getDefaultRendererType() : rendererType, ((i & 2) == 0) & z);
    }
}
