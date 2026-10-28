package app.rive.runtime.kotlin.core;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ImageAsset extends FileAsset {
    public static final int $stable = NativeObject.$stable;

    public ImageAsset(long j, int i) {
        super(j, i, null);
    }

    private final native long cppGetRenderImage(long j);

    private final native float cppImageAssetHeight(long j);

    private final native float cppImageAssetWidth(long j);

    private final native void cppSetRenderImage(long j, long j2);

    public final float getHeight() {
        return cppImageAssetHeight(getCppPointer());
    }

    public final RiveRenderImage getImage() {
        return new RiveRenderImage(cppGetRenderImage(getCppPointer()));
    }

    public final float getWidth() {
        return cppImageAssetWidth(getCppPointer());
    }

    public final void setImage(RiveRenderImage riveRenderImage) {
        riveRenderImage.getClass();
        cppSetRenderImage(getCppPointer(), riveRenderImage.getCppPointer());
    }
}
