package app.rive.runtime.kotlin.core;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class AudioAsset extends FileAsset {
    public static final int $stable = NativeObject.$stable;

    public AudioAsset(long j, int i) {
        super(j, i, null);
    }

    private final native long cppGetAudio(long j);

    private final native void cppSetAudio(long j, long j2);

    public final RiveAudio getAudio() {
        return new RiveAudio(cppGetAudio(getCppPointer()));
    }

    public final void setAudio(RiveAudio riveAudio) {
        riveAudio.getClass();
        cppSetAudio(getCppPointer(), riveAudio.getCppPointer());
    }
}
