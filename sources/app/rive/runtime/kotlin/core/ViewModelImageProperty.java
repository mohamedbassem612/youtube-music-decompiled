package app.rive.runtime.kotlin.core;

import defpackage.awmy;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewModelImageProperty extends ViewModelProperty {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelImageProperty(long j, ReentrantLock reentrantLock) {
        super(j, reentrantLock);
        reentrantLock.getClass();
    }

    private final native void cppSetValue(long j, long j2);

    static final awmy set$lambda$0(ViewModelImageProperty viewModelImageProperty, RiveRenderImage riveRenderImage) {
        viewModelImageProperty.cppSetValue(viewModelImageProperty.getCppPointer(), riveRenderImage != null ? riveRenderImage.getCppPointer() : 0L);
        return awmy.a;
    }

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public /* bridge */ /* synthetic */ Object nativeGetValue() {
        return awmy.a;
    }

    public final void set(final RiveRenderImage riveRenderImage) {
        withLock(new Function0() { // from class: app.rive.runtime.kotlin.core.ViewModelImageProperty$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ViewModelImageProperty.set$lambda$0(this.f$0, riveRenderImage);
            }
        });
    }

    /* JADX INFO: renamed from: nativeGetValue, reason: collision with other method in class */
    protected void m591nativeGetValue() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public void nativeSetValue(awmy awmyVar) {
        awmyVar.getClass();
    }
}
