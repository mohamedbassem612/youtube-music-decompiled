package app.rive.runtime.kotlin.core;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewModelColorProperty extends ViewModelProperty {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelColorProperty(long j, ReentrantLock reentrantLock) {
        super(j, reentrantLock);
        reentrantLock.getClass();
    }

    private final native int cppGetValue(long j);

    private final native void cppSetValue(long j, int i);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public Integer nativeGetValue() {
        return Integer.valueOf(cppGetValue(getCppPointer()));
    }

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public /* bridge */ /* synthetic */ void nativeSetValue(Object obj) {
        nativeSetValue(((Number) obj).intValue());
    }

    protected void nativeSetValue(int i) {
        cppSetValue(getCppPointer(), i);
    }
}
