package app.rive.runtime.kotlin.renderers;

import app.rive.RiveLog;
import app.rive.runtime.kotlin.controllers.RiveFileController;
import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.Artboard;
import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.Fit;
import app.rive.runtime.kotlin.core.RendererType;
import app.rive.runtime.kotlin.core.Rive;
import app.rive.runtime.kotlin.core.StateMachineInstance;
import app.rive.runtime.kotlin.core.errors.ArtboardException;
import defpackage.awml;
import defpackage.awmy;
import defpackage.awqg;
import defpackage.awqx;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class RiveArtboardRenderer extends Renderer {
    public static final String TAG = "RiveL/RiveArtboardRenderer";
    private RiveFileController controller;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveArtboardRenderer(boolean z, RendererType rendererType, RiveFileController riveFileController) {
        super(rendererType, z);
        rendererType.getClass();
        riveFileController.getClass();
        this.controller = riveFileController;
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.renderers.RiveArtboardRenderer$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveArtboardRenderer._init_$lambda$0();
            }
        });
        RiveFileController riveFileController2 = this.controller;
        riveFileController2.setOnStart(new RiveArtboardRenderer$2$1(this));
        riveFileController2.acquire();
        getDependencies().add(riveFileController2);
    }

    static final String _init_$lambda$0() {
        return "Initializing.";
    }

    private final Alignment getAlignment() {
        return this.controller.getAlignment();
    }

    private final Fit getFit() {
        return this.controller.getFit();
    }

    private final float getScaleFactor() {
        return this.controller.getLayoutScaleFactorActive$third_party_java_android_libs_rive_rive_android();
    }

    static final String reset$lambda$0() {
        return "Reset.";
    }

    static final awmy resizeArtboard$lambda$0(RiveArtboardRenderer riveArtboardRenderer) {
        Iterator it = riveArtboardRenderer.controller.getStateMachines().iterator();
        while (it.hasNext()) {
            riveArtboardRenderer.controller.resolveStateMachineAdvance$third_party_java_android_libs_rive_rive_android((StateMachineInstance) it.next(), 0.0f);
        }
        return awmy.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final awmy resizeArtboard$lambda$1$1(float f, float f2, Function0 function0, Artboard artboard) {
        artboard.getClass();
        boolean z = true;
        if (artboard.getWidth() == f && artboard.getHeight() == f2) {
            z = false;
        }
        artboard.setWidth(f);
        artboard.setHeight(f2);
        if (z) {
            function0.invoke();
        }
        return awmy.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final awmy resizeArtboard$lambda$2$0(Function0 function0, Artboard artboard) {
        artboard.getClass();
        float width = artboard.getWidth();
        float height = artboard.getHeight();
        artboard.resetArtboardSize();
        if (artboard.getWidth() != width || artboard.getHeight() != height) {
            function0.invoke();
        }
        return awmy.a;
    }

    private final void resizeArtboardIfNeeded() {
        if (!this.controller.getRequireArtboardResize$third_party_java_android_libs_rive_rive_android().getAndSet(false) || resizeArtboard()) {
            return;
        }
        this.controller.getRequireArtboardResize$third_party_java_android_libs_rive_rive_android().set(true);
    }

    private final boolean withLockedActiveArtboard(awqg awqgVar) {
        while (true) {
            File file = this.controller.getFile();
            if (file == null) {
                return false;
            }
            synchronized (file.getFileLock$third_party_java_android_libs_rive_rive_android()) {
                if (this.controller.getFile() == file) {
                    Artboard activeArtboard = this.controller.getActiveArtboard();
                    if (activeArtboard == null) {
                        return false;
                    }
                    awqgVar.invoke(activeArtboard);
                    return true;
                }
            }
        }
    }

    @Override // app.rive.runtime.kotlin.renderers.Renderer
    public void advance(float f) {
        if (getHasCppObject()) {
            if (this.controller.isActive()) {
                this.controller.advance(f);
            }
            synchronized (this.controller.getStartStopLock$third_party_java_android_libs_rive_rive_android()) {
                if (!this.controller.isAdvancing()) {
                    stopThread$third_party_java_android_libs_rive_rive_android();
                }
            }
        }
    }

    @Override // app.rive.runtime.kotlin.renderers.Renderer
    protected void disposeDependencies() {
        Object fileLock$third_party_java_android_libs_rive_rive_android;
        File file = this.controller.getFile();
        if (file == null || (fileLock$third_party_java_android_libs_rive_rive_android = file.getFileLock$third_party_java_android_libs_rive_rive_android()) == null) {
            fileLock$third_party_java_android_libs_rive_rive_android = this;
        }
        synchronized (fileLock$third_party_java_android_libs_rive_rive_android) {
            super.disposeDependencies();
        }
    }

    @Override // app.rive.runtime.kotlin.renderers.Renderer
    public void draw() {
        Artboard activeArtboard;
        resizeArtboardIfNeeded();
        synchronized (getFrameLock()) {
            if (getHasCppObject() && this.controller.isActive() && (activeArtboard = this.controller.getActiveArtboard()) != null) {
                activeArtboard.draw(getCppPointer(), getFit(), getAlignment(), getScaleFactor());
            }
        }
    }

    public final void reset() throws ArtboardException {
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.renderers.RiveArtboardRenderer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveArtboardRenderer.reset$lambda$0();
            }
        });
        this.controller.stopAnimations();
        this.controller.reset$third_party_java_android_libs_rive_rive_android();
        stop();
        RiveFileController.selectArtboard$default(this.controller, null, 1, null);
        start();
    }

    public boolean resizeArtboard() {
        awml awmlVar;
        final Function0 function0 = new Function0() { // from class: app.rive.runtime.kotlin.renderers.RiveArtboardRenderer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveArtboardRenderer.resizeArtboard$lambda$0(this.f$0);
            }
        };
        if (getFit() != Fit.LAYOUT) {
            return withLockedActiveArtboard(new awqg() { // from class: app.rive.runtime.kotlin.renderers.RiveArtboardRenderer$$ExternalSyntheticLambda3
                @Override // defpackage.awqg
                public final Object invoke(Object obj) {
                    return RiveArtboardRenderer.resizeArtboard$lambda$2$0(function0, (Artboard) obj);
                }
            });
        }
        synchronized (getFrameLock()) {
            awmlVar = null;
            if (getHasCppObject() && this.controller.isActive()) {
                awmlVar = new awml(Float.valueOf(getWidth() / getScaleFactor()), Float.valueOf(getHeight() / getScaleFactor()));
            }
        }
        if (awmlVar == null) {
            return false;
        }
        final float fFloatValue = ((Number) awmlVar.a).floatValue();
        final float fFloatValue2 = ((Number) awmlVar.b).floatValue();
        return withLockedActiveArtboard(new awqg() { // from class: app.rive.runtime.kotlin.renderers.RiveArtboardRenderer$$ExternalSyntheticLambda2
            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                return RiveArtboardRenderer.resizeArtboard$lambda$1$1(fFloatValue, fFloatValue2, function0, (Artboard) obj);
            }
        });
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }

    public /* synthetic */ RiveArtboardRenderer(boolean z, RendererType rendererType, RiveFileController riveFileController, int i, awqx awqxVar) {
        this(1 == (((i & 1) ^ 1) & (z ? 1 : 0)), (i & 2) != 0 ? Rive.INSTANCE.getDefaultRendererType() : rendererType, riveFileController);
    }
}
