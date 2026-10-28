package org.chromium.net.impl;

import android.content.Context;
import android.net.http.HttpEngine;
import defpackage.axlp;
import defpackage.axlq;
import defpackage.axnh;
import defpackage.axnm;
import defpackage.axok;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class NativeCronetProvider extends CronetProvider {
    private final HttpEngineNativeProvider a;

    public NativeCronetProvider(Context context) {
        super(context);
        this.a = new HttpEngineNativeProvider(this.mContext);
    }

    private final boolean a() {
        if (!HttpEngineNativeProvider.a()) {
            return false;
        }
        Context context = this.mContext;
        axlq axlqVar = (axlq) axlp.a(context, false, axnm.b(context, axnh.CRONET_SOURCE_STATICALLY_LINKED)).d().get("Cronet_OverrideNativeCronetWithHttpEngine");
        return axlqVar != null && axlqVar.f();
    }

    @Override // org.chromium.net.CronetProvider
    public final CronetEngine.Builder createBuilder() {
        return a() ? this.a.createBuilder() : new ExperimentalCronetEngine.Builder(new axok(this.mContext));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof NativeCronetProvider) && this.mContext.equals(((NativeCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.CronetProvider
    public final String getName() {
        return "App-Packaged-Cronet-Provider";
    }

    @Override // org.chromium.net.CronetProvider
    public final String getVersion() {
        return a() ? HttpEngine.getVersionString() : ImplVersion.getCronetVersion();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{NativeCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    public final boolean isEnabled() {
        try {
            Class.forName(getClass().getName() + "Sentinel", false, getClass().getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
