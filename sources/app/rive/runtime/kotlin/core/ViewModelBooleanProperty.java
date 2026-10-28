package app.rive.runtime.kotlin.core;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewModelBooleanProperty extends ViewModelProperty {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelBooleanProperty(long j, ReentrantLock reentrantLock) {
        super(j, reentrantLock);
        reentrantLock.getClass();
    }

    private final native boolean cppGetValue(long j);

    private final native void cppSetValue(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public Boolean nativeGetValue() {
        return Boolean.valueOf(cppGetValue(getCppPointer()));
    }

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public /* bridge */ /* synthetic */ void nativeSetValue(Object obj) {
        nativeSetValue(((Boolean) obj).booleanValue());
    }

    protected void nativeSetValue(boolean z) {
        cppSetValue(getCppPointer(), z);
    }
}
