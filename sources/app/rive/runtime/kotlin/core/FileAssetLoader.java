package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.errors.RiveException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class FileAssetLoader extends NativeObject {
    public static final int $stable = NativeObject.$stable;

    public FileAssetLoader() throws RiveException {
        super(0L);
        setCppPointer(constructor());
        getRefs().incrementAndGet();
        getCppPointer();
    }

    private final native void cppSetRendererType(long j, int i);

    @Override // app.rive.runtime.kotlin.core.NativeObject, app.rive.runtime.kotlin.core.RefCount
    public int acquire() {
        cppRef(getCppPointer());
        return super.acquire();
    }

    protected final native long constructor();

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long j);

    public final native void cppRef(long j);

    public abstract boolean loadContents(FileAsset fileAsset, byte[] bArr);

    public final void setRendererType(RendererType rendererType) {
        rendererType.getClass();
        cppSetRendererType(getCppPointer(), rendererType.getValue());
    }
}
