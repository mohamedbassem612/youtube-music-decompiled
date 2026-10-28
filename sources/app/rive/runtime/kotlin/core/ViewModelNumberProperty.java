package app.rive.runtime.kotlin.core;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewModelNumberProperty extends ViewModelProperty {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelNumberProperty(long j, ReentrantLock reentrantLock) {
        super(j, reentrantLock);
        reentrantLock.getClass();
    }

    private final native float cppGetValue(long j);

    private final native void cppSetValue(long j, float f);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public Float nativeGetValue() {
        return Float.valueOf(cppGetValue(getCppPointer()));
    }

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public /* bridge */ /* synthetic */ void nativeSetValue(Object obj) {
        nativeSetValue(((Number) obj).floatValue());
    }

    protected void nativeSetValue(float f) {
        cppSetValue(getCppPointer(), f);
    }
}
