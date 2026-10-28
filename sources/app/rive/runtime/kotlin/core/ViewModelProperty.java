package app.rive.runtime.kotlin.core;

import defpackage.awmy;
import defpackage.axaf;
import defpackage.axag;
import defpackage.axat;
import defpackage.axaw;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ViewModelProperty extends NativeObject {
    public static final int $stable = 8;
    private final axaf _valueFlow;
    private volatile ReentrantLock fileLock;
    private final axat valueFlow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelProperty(long j, ReentrantLock reentrantLock) {
        super(j);
        reentrantLock.getClass();
        this.fileLock = reentrantLock;
        axaf axafVarA = axaw.a(withLock(new Function0() { // from class: app.rive.runtime.kotlin.core.ViewModelProperty$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.nativeGetValue();
            }
        }));
        this._valueFlow = axafVarA;
        this.valueFlow = new axag(axafVarA, null);
    }

    static final awmy _set_value_$lambda$0(ViewModelProperty viewModelProperty, Object obj) {
        viewModelProperty.nativeSetValue(obj);
        return awmy.a;
    }

    private final native boolean cppFlushChanges(long j);

    static final awmy pollChanges$lambda$0(ViewModelProperty viewModelProperty) {
        if (viewModelProperty.cppHasChanged(viewModelProperty.getCppPointer())) {
            viewModelProperty._valueFlow.d(viewModelProperty.nativeGetValue());
            viewModelProperty.cppFlushChanges(viewModelProperty.getCppPointer());
        }
        return awmy.a;
    }

    public final native boolean cppHasChanged(long j);

    public final native String cppName(long j);

    protected final ReentrantLock getFileLock() {
        return this.fileLock;
    }

    public final String getName() {
        return cppName(getCppPointer());
    }

    public final Object getValue() {
        return this._valueFlow.c();
    }

    public final axat getValueFlow() {
        return this.valueFlow;
    }

    public final boolean isSubscribed$third_party_java_android_libs_rive_rive_android() {
        return ((Number) this._valueFlow.a().c()).intValue() > 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object nativeGetValue();

    protected abstract void nativeSetValue(Object obj);

    public void pollChanges$third_party_java_android_libs_rive_rive_android() {
        withLock(new Function0() { // from class: app.rive.runtime.kotlin.core.ViewModelProperty$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ViewModelProperty.pollChanges$lambda$0(this.f$0);
            }
        });
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject, app.rive.runtime.kotlin.core.RefCount
    public int release() {
        return ((Number) withLock(new Function0() { // from class: app.rive.runtime.kotlin.core.ViewModelProperty$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(super/*app.rive.runtime.kotlin.core.NativeObject*/.release());
            }
        })).intValue();
    }

    protected final void setFileLock(ReentrantLock reentrantLock) {
        reentrantLock.getClass();
        this.fileLock = reentrantLock;
    }

    public final void setValue(final Object obj) {
        withLock(new Function0() { // from class: app.rive.runtime.kotlin.core.ViewModelProperty$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ViewModelProperty._set_value_$lambda$0(this.f$0, obj);
            }
        });
        this._valueFlow.d(obj);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0035 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateFileLock$third_party_java_android_libs_rive_rive_android(java.util.concurrent.locks.ReentrantLock r6) {
        /*
            r5 = this;
            r6.getClass()
        L3:
            java.util.concurrent.locks.ReentrantLock r0 = r5.fileLock
            if (r0 == r6) goto L63
            r1 = 1
            r2 = 0
            if (r0 != r6) goto L1a
            monitor-enter(r0)
            java.util.concurrent.locks.ReentrantLock r3 = r5.fileLock     // Catch: java.lang.Throwable -> L17
            if (r3 != r0) goto L14
            r5.setFileLock(r6)     // Catch: java.lang.Throwable -> L17
            goto L15
        L14:
            r1 = r2
        L15:
            monitor-exit(r0)
            goto L61
        L17:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        L1a:
            int r3 = java.lang.System.identityHashCode(r0)
            int r4 = java.lang.System.identityHashCode(r6)
            if (r3 >= r4) goto L38
            monitor-enter(r0)
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.locks.ReentrantLock r3 = r5.fileLock     // Catch: java.lang.Throwable -> L32
            if (r3 != r0) goto L2e
            r5.setFileLock(r6)     // Catch: java.lang.Throwable -> L32
            goto L2f
        L2e:
            r1 = r2
        L2f:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r0)
            goto L61
        L32:
            r5 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L35
            throw r5     // Catch: java.lang.Throwable -> L35
        L35:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        L38:
            if (r3 <= r4) goto L4e
            monitor-enter(r6)
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L4b
            java.util.concurrent.locks.ReentrantLock r3 = r5.fileLock     // Catch: java.lang.Throwable -> L48
            if (r3 != r0) goto L44
            r5.setFileLock(r6)     // Catch: java.lang.Throwable -> L48
            goto L45
        L44:
            r1 = r2
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r6)
            goto L61
        L48:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4b
            throw r5     // Catch: java.lang.Throwable -> L4b
        L4b:
            r5 = move-exception
            monitor-exit(r6)
            throw r5
        L4e:
            java.lang.Object r3 = app.rive.runtime.kotlin.core.ViewModelInstanceKt.access$getFileLockUpdateTieLock$p()
            monitor-enter(r3)
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L6a
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L67
            java.util.concurrent.locks.ReentrantLock r4 = r5.fileLock     // Catch: java.lang.Throwable -> L64
            if (r4 != r0) goto L5d
            r5.setFileLock(r6)     // Catch: java.lang.Throwable -> L64
            goto L5e
        L5d:
            r1 = r2
        L5e:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L67
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r3)
        L61:
            if (r1 == 0) goto L3
        L63:
            return
        L64:
            r5 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L67
            throw r5     // Catch: java.lang.Throwable -> L67
        L67:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6a
            throw r5     // Catch: java.lang.Throwable -> L6a
        L6a:
            r5 = move-exception
            monitor-exit(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.rive.runtime.kotlin.core.ViewModelProperty.updateFileLock$third_party_java_android_libs_rive_rive_android(java.util.concurrent.locks.ReentrantLock):void");
    }

    protected final Object withLock(Function0 function0) {
        function0.getClass();
        while (true) {
            ReentrantLock fileLock = getFileLock();
            synchronized (fileLock) {
                if (getFileLock() == fileLock) {
                    return function0.invoke();
                }
            }
        }
    }
}
