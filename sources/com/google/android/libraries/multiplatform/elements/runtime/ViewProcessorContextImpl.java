package com.google.android.libraries.multiplatform.elements.runtime;

import com.google.android.libraries.multiplatform.elements.ElementsServices;
import defpackage.agfr;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ViewProcessorContextImpl implements AutoCloseable {
    public final long a;
    private final AtomicBoolean c = new AtomicBoolean(false);
    public volatile int b = -1;

    public ViewProcessorContextImpl(ElementsServices elementsServices) {
        agfr agfrVarU = elementsServices.u();
        this.a = jniCreateViewProcessorContext(elementsServices.p().io(), elementsServices.i(), elementsServices.q().io(), a(elementsServices.v()), a(elementsServices.r()), elementsServices.M().a, elementsServices.a(), agfrVarU == null ? 0L : ((ReaperThreadJniWrapper) agfrVarU.io()).a, ((ElementsRuntimeImpl) elementsServices.L().io()).getHandle(), 0L);
    }

    private static Object a(agfr agfrVar) {
        if (agfrVar == null) {
            return null;
        }
        return agfrVar.io();
    }

    private static native long jniCreateViewProcessorContext(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, long j, float f, long j2, long j3, long j4);

    private static native void jniDeleteViewProcessorContext(long j);

    private static native long jniGetViewProcessorContextInstanceCount();

    private static native void jniSetPipelineStrategy(long j, int[] iArr);

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.c.getAndSet(true)) {
            return;
        }
        jniDeleteViewProcessorContext(this.a);
    }
}
