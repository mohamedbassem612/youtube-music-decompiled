package com.google.android.gms.net;

import android.content.Context;
import defpackage.kmj;
import defpackage.kmk;
import defpackage.kro;
import defpackage.kvc;
import defpackage.lkw;
import defpackage.lky;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class PlayServicesCronetProvider extends CronetProvider {
    private static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final String TAG = "PlayServicesCronet";

    public PlayServicesCronetProvider(Context context) {
        super(context);
    }

    private static Class subclassNativeCronetEngine(ClassLoader classLoader) {
        try {
            return classLoader.loadClass(NATIVE_CRONET_ENGINE_BUILDER_IMPL).asSubclass(ICronetEngineBuilder.class);
        } catch (ClassCastException e) {
            throw new IllegalStateException(String.format("Failed to subclass native cronet engine!, NativeCronetEngineBuilderImpl Classloader: %s, ICronetEngineBuilder Classloader: %s", classLoader, ICronetEngineBuilder.class.getClassLoader()), e);
        }
    }

    private void tryToInstallCronetProvider() {
        try {
            lkw.b(this.mContext);
        } catch (kmj | kmk unused) {
        }
    }

    @Override // org.chromium.net.CronetProvider
    public CronetEngine.Builder createBuilder() {
        try {
            lkw.b(this.mContext);
            try {
                lky lkyVar = new lky(this.mContext, 37402, 0.01f);
                try {
                    HttpEngineProviderSingleton httpEngineProviderSingleton = HttpEngineProviderSingleton.getInstance(this.mContext);
                    if (httpEngineProviderSingleton.shouldUseHttpEngine()) {
                        CronetEngine.Builder builderCreateBuilder = httpEngineProviderSingleton.getHttpEngineProvider().createBuilder();
                        lkyVar.a();
                        lkyVar.close();
                        return builderCreateBuilder;
                    }
                    kvc kvcVarA = lkw.a();
                    kro.l(kvcVarA);
                    ClassLoader classLoader = kvcVarA.f.getClassLoader();
                    kro.l(classLoader);
                    ExperimentalCronetEngine.Builder builder = new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) subclassNativeCronetEngine(classLoader).getConstructor(Context.class).newInstance(this.mContext));
                    lkyVar.a();
                    lkyVar.close();
                    return builder;
                } catch (Throwable th) {
                    try {
                        lkyVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (ReflectiveOperationException e) {
                throw new RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", e);
            }
        } catch (kmj e2) {
            throw new IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", e2);
        } catch (kmk e3) {
            throw new IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e3);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof PlayServicesCronetProvider) && this.mContext.equals(((PlayServicesCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.CronetProvider
    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    @Override // org.chromium.net.CronetProvider
    public String getVersion() {
        String str;
        HttpEngineProviderSingleton httpEngineProviderSingleton = HttpEngineProviderSingleton.getInstance(this.mContext);
        if (httpEngineProviderSingleton.shouldUseHttpEngine()) {
            return httpEngineProviderSingleton.getHttpEngineProvider().getVersion();
        }
        tryToInstallCronetProvider();
        synchronized (lkw.a) {
            str = lkw.b;
        }
        return str;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    public boolean isEnabled() {
        if (HttpEngineProviderSingleton.getInstance(this.mContext).shouldUseHttpEngine()) {
            return true;
        }
        tryToInstallCronetProvider();
        return lkw.c();
    }
}
