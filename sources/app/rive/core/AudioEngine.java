package app.rive.core;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class AudioEngine {
    public static final int $stable = 0;
    public static final AudioEngine INSTANCE = new AudioEngine();

    private AudioEngine() {
    }

    public final native void acquire();

    public final native void release();
}
