package app.rive.runtime.kotlin.core;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.os.Process;
import app.rive.RiveLog;
import app.rive.runtime.kotlin.fonts.FontHelper;
import app.rive.runtime.kotlin.fonts.Fonts;
import app.rive.runtime.kotlin.fonts.NativeFontHelper;
import defpackage.awrc;
import defpackage.kro;
import java.io.IOException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class Rive {
    public static final int $stable = 0;
    private static final String CXX_SHARED = "c++_shared";
    private static final String RIVE_ANDROID = "rive-android";
    private static final String TAG = "Rive";
    public static final Rive INSTANCE = new Rive();
    private static RendererType defaultRendererType = RendererType.Rive;

    /* JADX INFO: compiled from: PG */
    final class NativeLoader {
        public static final NativeLoader INSTANCE = new NativeLoader();

        private NativeLoader() {
        }

        private final void loadWithReLinker(Context context, String str) throws Throwable {
            try {
                kro.bc(context, Rive.CXX_SHARED);
                try {
                    kro.bc(context, str);
                } catch (UnsatisfiedLinkError e) {
                    logLoadFailure(str, "ReLinker", e);
                    throw e;
                }
            } catch (UnsatisfiedLinkError e2) {
                logLoadFailure(Rive.CXX_SHARED, "ReLinker", e2);
                throw e2;
            }
        }

        private final void loadWithSystemLoader(String str) throws IOException {
            try {
                System.loadLibrary(str);
            } catch (UnsatisfiedLinkError e) {
                logLoadFailure(str, "System.loadLibrary", e);
                throw e;
            }
        }

        private final void logLoadFailure(final String str, final String str2, UnsatisfiedLinkError unsatisfiedLinkError) throws IOException {
            String[] strArr = Build.SUPPORTED_ABIS;
            strArr.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int i = 0;
            for (String str3 : strArr) {
                i++;
                if (i > 1) {
                    sb.append((CharSequence) ", ");
                }
                awrc.k(sb, str3, null);
            }
            sb.append((CharSequence) "]");
            final String string = sb.toString();
            final boolean zIs64Bit = Process.is64Bit();
            RiveLog.INSTANCE.getLogger().e(Rive.TAG, unsatisfiedLinkError, new Function0() { // from class: app.rive.runtime.kotlin.core.Rive$NativeLoader$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Rive.NativeLoader.logLoadFailure$lambda$0(str, str2, string, zIs64Bit);
                }
            });
        }

        static final String logLoadFailure$lambda$0(String str, String str2, String str3, boolean z) {
            StringBuilder sb = new StringBuilder("Failed to load lib");
            sb.append(str);
            sb.append(".so using ");
            sb.append(str2);
            sb.append(". Supported ABIs: ");
            sb.append(str3);
            sb.append(". Device bitness: ");
            sb.append(true != z ? "32-bit" : "64-bit");
            sb.append(". Check your APK/AAB contains lib/<abi>/lib");
            sb.append(str);
            sb.append(".so and verify ABI filters, split APK/dynamic feature delivery, and 32-bit support (for example armeabi-v7a) are not stripped.");
            return sb.toString();
        }

        public final void loadLibrary(Context context, String str, boolean z) throws IOException {
            context.getClass();
            str.getClass();
            loadWithSystemLoader(str);
        }
    }

    private Rive() {
    }

    public static /* synthetic */ RectF calculateRequiredBounds$default(Rive rive, Fit fit, Alignment alignment, RectF rectF, RectF rectF2, float f, int i, Object obj) {
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return rive.calculateRequiredBounds(fit, alignment, rectF, rectF2, f);
    }

    private final native void cppCalculateRequiredBounds(Fit fit, Alignment alignment, RectF rectF, RectF rectF2, RectF rectF3, float f);

    private final native void cppInitialize();

    public static /* synthetic */ void init$default(Rive rive, Context context, RendererType rendererType, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            rendererType = RendererType.Rive;
        }
        rive.init(context, rendererType);
    }

    static final String init$lambda$0() {
        return "Initializing Rive runtime";
    }

    static final String init$lambda$1() {
        return "Native loading failed for librive-android.so. If your app loads native libraries manually, load libc++_shared.so before librive-android.so, then call Rive.initializeCppEnvironment(context). For split APK/dynamic feature delivery, load both libraries from the split context with SplitInstallHelper.loadLibrary(...) before calling initializeCppEnvironment(context). See https://developer.android.com/guide/playcore/feature-delivery/on-demand#native-code";
    }

    public static final void initializeCppEnvironment(Context context) {
        context.getClass();
        initializeCppEnvironment();
        FontHelper.Companion.watchLocaleChanges$third_party_java_android_libs_rive_rive_android(context);
    }

    public static /* synthetic */ boolean setFallbackFont$default(Rive rive, Fonts.FontOpts fontOpts, int i, Object obj) {
        if (1 == (i & 1)) {
            fontOpts = null;
        }
        return rive.setFallbackFont(fontOpts);
    }

    public final RectF calculateRequiredBounds(Fit fit, Alignment alignment, RectF rectF, RectF rectF2, float f) {
        fit.getClass();
        alignment.getClass();
        rectF.getClass();
        rectF2.getClass();
        RectF rectF3 = new RectF();
        cppCalculateRequiredBounds(fit, alignment, rectF, rectF2, rectF3, f);
        return rectF3;
    }

    public final RendererType getDefaultRendererType() {
        return defaultRendererType;
    }

    public final void init(Context context, RendererType rendererType) throws IOException {
        context.getClass();
        rendererType.getClass();
        RiveLog.INSTANCE.getLogger().i(TAG, new Function0() { // from class: app.rive.runtime.kotlin.core.Rive$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Rive.init$lambda$0();
            }
        });
        defaultRendererType = rendererType;
        try {
            NativeLoader.INSTANCE.loadLibrary(context, RIVE_ANDROID, true);
            initializeCppEnvironment(context);
        } catch (UnsatisfiedLinkError e) {
            RiveLog.INSTANCE.getLogger().e(TAG, null, new Function0() { // from class: app.rive.runtime.kotlin.core.Rive$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Rive.init$lambda$1();
                }
            });
            throw e;
        }
    }

    public final boolean setFallbackFont(Fonts.FontOpts fontOpts) {
        byte[] fallbackFontBytes = FontHelper.Companion.getFallbackFontBytes(fontOpts);
        return fallbackFontBytes != null && NativeFontHelper.INSTANCE.cppRegisterFallbackFont(fallbackFontBytes);
    }

    public static final void initializeCppEnvironment() {
        INSTANCE.cppInitialize();
    }

    public final boolean setFallbackFont(byte[] bArr) {
        bArr.getClass();
        return NativeFontHelper.INSTANCE.cppRegisterFallbackFont(bArr);
    }
}
