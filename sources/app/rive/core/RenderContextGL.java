package app.rive.core;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import app.rive.RiveInitializationException;
import app.rive.RiveLog;
import app.rive.RiveRenderException;
import app.rive.RiveShutdownException;
import com.google.cardboard.sdk.EglFactory;
import defpackage.a;
import defpackage.awmy;
import defpackage.awqg;
import defpackage.awqx;
import defpackage.awrc;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RenderContextGL extends RenderContext implements CheckableAutoCloseable {
    public static final String TAG = "Rive/RenderContextGL";
    private final EGLConfig config;
    private final EGLContext context;
    private final UniquePointer cppPointer;
    private final EGLDisplay display;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public RenderContextGL(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext) {
        eGLDisplay.getClass();
        eGLConfig.getClass();
        eGLContext.getClass();
        this.display = eGLDisplay;
        this.config = eGLConfig;
        this.context = eGLContext;
        this.cppPointer = new UniquePointer(cppConstructor(eGLDisplay.getNativeHandle(), eGLContext.getNativeHandle()), TAG, new awqg() { // from class: app.rive.core.RenderContextGL$$ExternalSyntheticLambda10
            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                return RenderContextGL.cppPointer$lambda$0(this.f$0, ((Long) obj).longValue());
            }
        });
    }

    public static /* synthetic */ RenderContextGL copy$default(RenderContextGL renderContextGL, EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i, Object obj) {
        if ((i & 1) != 0) {
            eGLDisplay = renderContextGL.display;
        }
        if ((i & 2) != 0) {
            eGLConfig = renderContextGL.config;
        }
        if ((i & 4) != 0) {
            eGLContext = renderContextGL.context;
        }
        return renderContextGL.copy(eGLDisplay, eGLConfig, eGLContext);
    }

    private final native long cppConstructor(long j, long j2);

    private final native long cppCreateSurface(long j, int i, int i2);

    private final native void cppDelete(long j);

    private final native int cppDestroySurface(long j, long j2);

    static final awmy cppPointer$lambda$0(RenderContextGL renderContextGL, long j) {
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.core.RenderContextGL$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RenderContextGL.cppPointer$lambda$0$0();
            }
        });
        renderContextGL.cppDelete(j);
        return awmy.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cppPointer$lambda$0$0() {
        return "Deleting RenderContextGL native object";
    }

    static final String createSurface_mDlYe8U$lambda$0() {
        return "Creating EGL window surface";
    }

    static final String dispose$lambda$0() {
        return "Destroying EGL context";
    }

    static final String dispose$lambda$2() {
        return "Terminating EGL display";
    }

    public final EGLDisplay component1() {
        return this.display;
    }

    public final EGLConfig component2() {
        return this.config;
    }

    public final EGLContext component3() {
        return this.context;
    }

    public final RenderContextGL copy(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext) {
        eGLDisplay.getClass();
        eGLConfig.getClass();
        eGLContext.getClass();
        return new RenderContextGL(eGLDisplay, eGLConfig, eGLContext);
    }

    @Override // app.rive.core.RenderContext
    /* JADX INFO: renamed from: createImageSurface-i4dAsZ4$third_party_java_android_libs_rive_rive_android */
    public RiveSurface mo558x25d34fc(final int i, final int i2, long j, CommandQueue commandQueue) throws Throwable {
        long jCppCreateSurface;
        commandQueue.getClass();
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Image surfaces require a positive width and height.");
        }
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.core.RenderContextGL$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.ck(i2, i, "Creating EGL PBuffer surface (", " x ", (byte) 41);
            }
        });
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.display, this.config, new int[]{12375, i, 12374, i2, 12344}, 0);
        if (awrc.c(eGLSurfaceEglCreatePbufferSurface, EGL14.EGL_NO_SURFACE)) {
            final String strErrorString = EGLError.INSTANCE.errorString(EGL14.eglGetError());
            RiveLog.INSTANCE.getLogger().e(TAG, null, new Function0() { // from class: app.rive.core.RenderContextGL$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return "eglCreatePbufferSurface failed with error: ".concat(String.valueOf(strErrorString));
                }
            });
            throw new RiveRenderException("Unable to create EGL PBuffer surface", new Throwable(strErrorString));
        }
        try {
            jCppCreateSurface = cppCreateSurface(eGLSurfaceEglCreatePbufferSurface.getNativeHandle(), i, i2);
            try {
                eGLSurfaceEglCreatePbufferSurface.getClass();
                return new RiveSurfaceGLPBuffer(eGLSurfaceEglCreatePbufferSurface, this, commandQueue, jCppCreateSurface, j, i, i2, null);
            } catch (Throwable th) {
                th = th;
                EGL14.eglDestroySurface(this.display, eGLSurfaceEglCreatePbufferSurface);
                if (jCppCreateSurface != 0) {
                    RiveSurface.Companion.cppDeleteSurface$third_party_java_android_libs_rive_rive_android(jCppCreateSurface);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            jCppCreateSurface = 0;
        }
    }

    @Override // app.rive.core.RenderContext
    /* JADX INFO: renamed from: createSurface-mDlYe8U$third_party_java_android_libs_rive_rive_android */
    public RiveSurface mo559x4819e378(CloseableSurface closeableSurface, long j, CommandQueue commandQueue) throws Throwable {
        EGLSurface eGLSurface;
        long jCppCreateSurface;
        closeableSurface.getClass();
        commandQueue.getClass();
        if (!closeableSurface.getSurface().isValid()) {
            throw new RiveRenderException("Unable to create Android Surface", null, 2, null);
        }
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.core.RenderContextGL$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RenderContextGL.createSurface_mDlYe8U$lambda$0();
            }
        });
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.display, this.config, closeableSurface.getSurface(), new int[]{12344}, 0);
        if (awrc.c(eGLSurfaceEglCreateWindowSurface, EGL14.EGL_NO_SURFACE)) {
            final String strErrorString = EGLError.INSTANCE.errorString(EGL14.eglGetError());
            RiveLog.INSTANCE.getLogger().e(TAG, null, new Function0() { // from class: app.rive.core.RenderContextGL$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return "eglCreateWindowSurface failed with error: ".concat(String.valueOf(strErrorString));
                }
            });
            throw new RiveRenderException("Unable to create EGL surface", new Throwable(strErrorString));
        }
        try {
            final int width = closeableSurface.getWidth();
            final int height = closeableSurface.getHeight();
            RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.core.RenderContextGL$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.ck(height, width, "Created EGL surface (", " x ", (byte) 41);
                }
            });
            jCppCreateSurface = cppCreateSurface(eGLSurfaceEglCreateWindowSurface.getNativeHandle(), width, height);
            try {
                eGLSurfaceEglCreateWindowSurface.getClass();
                eGLSurface = eGLSurfaceEglCreateWindowSurface;
                try {
                    return new RiveSurfaceGL(eGLSurface, this, closeableSurface, commandQueue, jCppCreateSurface, j, width, height, closeableSurface.getResizable(), null);
                } catch (Throwable th) {
                    th = th;
                    EGL14.eglDestroySurface(this.display, eGLSurface);
                    if (jCppCreateSurface != 0) {
                        RiveSurface.Companion.cppDeleteSurface$third_party_java_android_libs_rive_rive_android(jCppCreateSurface);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                eGLSurface = eGLSurfaceEglCreateWindowSurface;
            }
        } catch (Throwable th3) {
            th = th3;
            eGLSurface = eGLSurfaceEglCreateWindowSurface;
            jCppCreateSurface = 0;
        }
    }

    public final void destroySurface(EGLSurface eGLSurface) throws RiveShutdownException {
        eGLSurface.getClass();
        int iCppDestroySurface = cppDestroySurface(getNativeObjectPointer(), eGLSurface.getNativeHandle());
        if (iCppDestroySurface != 12288) {
            throw new RiveShutdownException("Unable to destroy EGL surface: ".concat(EGLError.INSTANCE.errorString(iCppDestroySurface)), null, 2, null);
        }
    }

    @Override // app.rive.core.RenderContext
    protected void dispose() throws RiveShutdownException {
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.core.RenderContextGL$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RenderContextGL.dispose$lambda$0();
            }
        });
        if (!EGL14.eglDestroyContext(this.display, this.context)) {
            final String strErrorString = EGLError.INSTANCE.errorString(EGL14.eglGetError());
            RiveLog.INSTANCE.getLogger().e(TAG, null, new Function0() { // from class: app.rive.core.RenderContextGL$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return "eglDestroyContext failed with error: ".concat(String.valueOf(strErrorString));
                }
            });
            throw new RiveShutdownException("Unable to destroy EGL context", new Throwable(strErrorString));
        }
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.core.RenderContextGL$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RenderContextGL.dispose$lambda$2();
            }
        });
        if (EGL14.eglTerminate(this.display)) {
            this.cppPointer.close();
            return;
        }
        final String strErrorString2 = EGLError.INSTANCE.errorString(EGL14.eglGetError());
        RiveLog.INSTANCE.getLogger().e(TAG, null, new Function0() { // from class: app.rive.core.RenderContextGL$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return "eglTerminate failed with error: ".concat(String.valueOf(strErrorString2));
            }
        });
        throw new RiveShutdownException("Unable to terminate EGL display", new Throwable(strErrorString2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RenderContextGL) {
            RenderContextGL renderContextGL = (RenderContextGL) obj;
            if (awrc.c(this.display, renderContextGL.display) && awrc.c(this.config, renderContextGL.config) && awrc.c(this.context, renderContextGL.context)) {
                return true;
            }
        }
        return false;
    }

    public final EGLConfig getConfig() {
        return this.config;
    }

    public final EGLContext getContext() {
        return this.context;
    }

    public final EGLDisplay getDisplay() {
        return this.display;
    }

    @Override // app.rive.core.RenderContext
    public long getNativeObjectPointer() {
        return this.cppPointer.getPointer();
    }

    public int hashCode() {
        return (((this.display.hashCode() * 31) + this.config.hashCode()) * 31) + this.context.hashCode();
    }

    public String toString() {
        return "RenderContextGL(display=" + this.display + ", config=" + this.config + ", context=" + this.context + ')';
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final EGLConfig createConfig(final EGLDisplay eGLDisplay) throws RiveInitializationException {
            final EGLConfig eGLConfig;
            RiveLog.INSTANCE.getLogger().d(RenderContextGL.TAG, new Function0() { // from class: app.rive.core.RenderContextGL$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RenderContextGL.Companion.createConfig$lambda$0();
                }
            });
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!EGL14.eglChooseConfig(eGLDisplay, new int[]{12352, 4, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr, 0)) {
                final String strErrorString = EGLError.INSTANCE.errorString(EGL14.eglGetError());
                RiveLog.INSTANCE.getLogger().e(RenderContextGL.TAG, null, new Function0() { // from class: app.rive.core.RenderContextGL$Companion$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return "eglChooseConfig failed with error: ".concat(String.valueOf(strErrorString));
                    }
                });
                throw new RiveInitializationException("EGL config creation failed: ".concat(strErrorString), new Throwable(strErrorString));
            }
            if (iArr[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                RiveLog.INSTANCE.getLogger().e(RenderContextGL.TAG, null, new Function0() { // from class: app.rive.core.RenderContextGL$Companion$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RenderContextGL.Companion.createConfig$lambda$2();
                    }
                });
                throw new RiveInitializationException("Unable to find a suitable EGL config", null, 2, null);
            }
            RiveLog.INSTANCE.getLogger().d(RenderContextGL.TAG, new Function0() { // from class: app.rive.core.RenderContextGL$Companion$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RenderContextGL.Companion.createConfig$lambda$3(eGLDisplay, eGLConfig);
                }
            });
            return eGLConfig;
        }

        private static final int createConfig$attr(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
            int[] iArr = new int[1];
            EGL14.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr, 0);
            return iArr[0];
        }

        static final String createConfig$lambda$0() {
            return "Choosing EGL config";
        }

        static final String createConfig$lambda$2() {
            return "eglChooseConfig could not find a suitable config";
        }

        static final String createConfig$lambda$3(EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            return "EGL config chosen successfully:\n  R=" + createConfig$attr(eGLDisplay, eGLConfig, 12324) + "\n  G=" + createConfig$attr(eGLDisplay, eGLConfig, 12323) + "\n  B=" + createConfig$attr(eGLDisplay, eGLConfig, 12322) + "\n  A=" + createConfig$attr(eGLDisplay, eGLConfig, 12321) + "\n  Depth=" + createConfig$attr(eGLDisplay, eGLConfig, 12325) + "\n  Stencil=" + createConfig$attr(eGLDisplay, eGLConfig, 12326);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final EGLContext createContext(EGLDisplay eGLDisplay, EGLConfig eGLConfig) throws RiveInitializationException {
            int[] iArr = {EglFactory.EGL_CONTEXT_CLIENT_VERSION, 2, 12344};
            RiveLog.INSTANCE.getLogger().d(RenderContextGL.TAG, new Function0() { // from class: app.rive.core.RenderContextGL$Companion$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RenderContextGL.Companion.createContext$lambda$0();
                }
            });
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
            if (!awrc.c(eGLContextEglCreateContext, EGL14.EGL_NO_CONTEXT)) {
                eGLContextEglCreateContext.getClass();
                return eGLContextEglCreateContext;
            }
            final String strErrorString = EGLError.INSTANCE.errorString(EGL14.eglGetError());
            RiveLog.INSTANCE.getLogger().e(RenderContextGL.TAG, null, new Function0() { // from class: app.rive.core.RenderContextGL$Companion$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return "eglCreateContext failed with error: ".concat(String.valueOf(strErrorString));
                }
            });
            throw new RiveInitializationException("Unable to create EGL context", new Throwable(strErrorString));
        }

        static final String createContext$lambda$0() {
            return "Creating EGL context";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final EGLDisplay createDisplay() throws RiveInitializationException {
            RiveLog.INSTANCE.getLogger().d(RenderContextGL.TAG, new Function0() { // from class: app.rive.core.RenderContextGL$Companion$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RenderContextGL.Companion.createDisplay$lambda$0();
                }
            });
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            if (awrc.c(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
                final String strErrorString = EGLError.INSTANCE.errorString(EGL14.eglGetError());
                RiveLog.INSTANCE.getLogger().e(RenderContextGL.TAG, null, new Function0() { // from class: app.rive.core.RenderContextGL$Companion$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return "eglGetDisplay failed with error: ".concat(String.valueOf(strErrorString));
                    }
                });
                throw new RiveInitializationException("Unable to get EGL display", new Throwable(strErrorString));
            }
            RiveLog.INSTANCE.getLogger().d(RenderContextGL.TAG, new Function0() { // from class: app.rive.core.RenderContextGL$Companion$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RenderContextGL.Companion.createDisplay$lambda$2();
                }
            });
            final int[] iArr = new int[1];
            final int[] iArr2 = new int[1];
            if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr2, 0)) {
                RiveLog.INSTANCE.getLogger().d(RenderContextGL.TAG, new Function0() { // from class: app.rive.core.RenderContextGL$Companion$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RenderContextGL.Companion.createDisplay$lambda$4(iArr, iArr2);
                    }
                });
                eGLDisplayEglGetDisplay.getClass();
                return eGLDisplayEglGetDisplay;
            }
            final String strErrorString2 = EGLError.INSTANCE.errorString(EGL14.eglGetError());
            RiveLog.INSTANCE.getLogger().e(RenderContextGL.TAG, null, new Function0() { // from class: app.rive.core.RenderContextGL$Companion$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return "eglInitialize failed with error: ".concat(String.valueOf(strErrorString2));
                }
            });
            throw new RiveInitializationException("Unable to initialize EGL", new Throwable(strErrorString2));
        }

        static final String createDisplay$lambda$0() {
            return "Getting EGL display";
        }

        static final String createDisplay$lambda$2() {
            return "Initializing EGL";
        }

        static final String createDisplay$lambda$4(int[] iArr, int[] iArr2) {
            return "EGL initialized with version " + iArr[0] + '.' + iArr2[0];
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }

    public RenderContextGL() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RenderContextGL(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i, awqx awqxVar) {
        eGLDisplay = (i & 1) != 0 ? Companion.createDisplay() : eGLDisplay;
        eGLConfig = (i & 2) != 0 ? Companion.createConfig(eGLDisplay) : eGLConfig;
        this(eGLDisplay, eGLConfig, (i & 4) != 0 ? Companion.createContext(eGLDisplay, eGLConfig) : eGLContext);
    }
}
