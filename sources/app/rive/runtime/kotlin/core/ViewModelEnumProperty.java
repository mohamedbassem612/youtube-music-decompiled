package app.rive.runtime.kotlin.core;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewModelEnumProperty extends ViewModelProperty {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelEnumProperty(long j, ReentrantLock reentrantLock) {
        super(j, reentrantLock);
        reentrantLock.getClass();
    }

    private final native String cppGetValue(long j);

    private final native void cppSetValue(long j, String str);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public String nativeGetValue() {
        return cppGetValue(getCppPointer());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public void nativeSetValue(String str) {
        str.getClass();
        cppSetValue(getCppPointer(), str);
    }
}
