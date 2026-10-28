package app.rive.runtime.kotlin.core;

import defpackage.awqx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class BindableArtboard extends NativeObject {
    public static final int $stable = NativeObject.$stable | ViewModelInstance.$stable;
    private final ViewModelInstance viewModelInstance;

    public BindableArtboard(long j, ViewModelInstance viewModelInstance) {
        super(j);
        this.viewModelInstance = viewModelInstance;
        acquire();
        if (viewModelInstance != null) {
            if (!viewModelInstance.getHasCppObject()) {
                throw new IllegalArgumentException("Cannot bind a disposed ViewModelInstance to a BindableArtboard.");
            }
            viewModelInstance.acquire();
            getDependencies().add(viewModelInstance);
        }
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long j);

    public final native String cppName(long j);

    public final String getName() {
        return cppName(getCppPointer());
    }

    public final ViewModelInstance getViewModelInstance() {
        return this.viewModelInstance;
    }

    public /* synthetic */ BindableArtboard(long j, ViewModelInstance viewModelInstance, int i, awqx awqxVar) {
        this(j, (i & 2) != 0 ? null : viewModelInstance);
    }
}
