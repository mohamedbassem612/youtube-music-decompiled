package org.chromium.net.impl;

import android.content.Context;
import defpackage.axlp;
import defpackage.axlq;
import defpackage.axnh;
import defpackage.axnm;
import defpackage.axnw;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class JavaCronetProvider extends CronetProvider {
    public JavaCronetProvider(Context context) {
        super(context);
    }

    @Override // org.chromium.net.CronetProvider
    public final CronetEngine.Builder createBuilder() {
        if (HttpEngineNativeProvider.a()) {
            Context context = this.mContext;
            axlq axlqVar = (axlq) axlp.a(context, false, axnm.b(context, axnh.CRONET_SOURCE_FALLBACK)).d().get("Cronet_ForceHttpEngineInFallback");
            if (axlqVar != null && axlqVar.f()) {
                return new HttpEngineNativeProvider(this.mContext).createBuilder();
            }
        }
        return new ExperimentalCronetEngine.Builder(new axnw(this.mContext));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof JavaCronetProvider) && this.mContext.equals(((JavaCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.CronetProvider
    public final String getName() {
        return "Fallback-Cronet-Provider";
    }

    @Override // org.chromium.net.CronetProvider
    public final String getVersion() {
        return ImplVersion.getCronetVersion();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{JavaCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    public final boolean isEnabled() {
        return true;
    }
}
