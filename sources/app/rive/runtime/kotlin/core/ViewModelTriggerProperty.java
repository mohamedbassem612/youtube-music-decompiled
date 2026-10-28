package app.rive.runtime.kotlin.core;

import defpackage.awmy;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewModelTriggerProperty extends ViewModelProperty {
    public static final int $stable = 8;

    /* JADX INFO: compiled from: PG */
    public final class TriggerUnit {
        public static final int $stable = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelTriggerProperty(long j, ReentrantLock reentrantLock) {
        super(j, reentrantLock);
        reentrantLock.getClass();
    }

    private final native void cppTrigger(long j);

    static final awmy trigger$lambda$0(ViewModelTriggerProperty viewModelTriggerProperty) {
        viewModelTriggerProperty.cppTrigger(viewModelTriggerProperty.getCppPointer());
        return awmy.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public TriggerUnit nativeGetValue() {
        return new TriggerUnit();
    }

    public final void trigger() {
        withLock(new Function0() { // from class: app.rive.runtime.kotlin.core.ViewModelTriggerProperty$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ViewModelTriggerProperty.trigger$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public void nativeSetValue(TriggerUnit triggerUnit) {
        triggerUnit.getClass();
    }
}
