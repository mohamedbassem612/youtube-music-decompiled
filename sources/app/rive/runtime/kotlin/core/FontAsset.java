package app.rive.runtime.kotlin.core;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class FontAsset extends FileAsset {
    public static final int $stable = NativeObject.$stable;

    public FontAsset(long j, int i) {
        super(j, i, null);
    }

    private final native long cppGetFont(long j);

    private final native void cppSetFont(long j, long j2);

    public final RiveFont getFont() {
        return new RiveFont(cppGetFont(getCppPointer()));
    }

    public final void setFont(RiveFont riveFont) {
        riveFont.getClass();
        cppSetFont(getCppPointer(), riveFont.getCppPointer());
    }
}
