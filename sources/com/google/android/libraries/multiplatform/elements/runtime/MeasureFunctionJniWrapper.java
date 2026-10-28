package com.google.android.libraries.multiplatform.elements.runtime;

import com.google.android.libraries.multiplatform.elements.ElementsServices;
import defpackage.ovo;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class MeasureFunctionJniWrapper implements AutoCloseable {
    public final long a;
    public final ovo b;
    private final AtomicBoolean c = new AtomicBoolean();

    public MeasureFunctionJniWrapper(ElementsServices elementsServices) {
        ovo ovoVar = new ovo(elementsServices);
        this.b = ovoVar;
        this.a = jniCreateMeasureFunction(ovoVar);
    }

    private static native long jniCreateMeasureFunction(Object obj);

    private static native void jniDeleteMeasureFunction(long j);

    private static native int jniGetInstanceCount();

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.c.getAndSet(true)) {
            return;
        }
        jniDeleteMeasureFunction(this.a);
    }
}
