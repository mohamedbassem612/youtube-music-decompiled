package app.rive.runtime.kotlin.fonts;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class NativeFontHelper {
    public static final int $stable = 0;
    public static final NativeFontHelper INSTANCE = new NativeFontHelper();

    private NativeFontHelper() {
    }

    public final native void cppInvalidateSystemFallbacks();

    public final native boolean cppRegisterFallbackFont(byte[] bArr);
}
