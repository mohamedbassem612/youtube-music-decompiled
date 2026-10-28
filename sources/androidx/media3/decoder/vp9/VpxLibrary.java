package androidx.media3.decoder.vp9;

import defpackage.bst;
import defpackage.bvr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class VpxLibrary {
    private static final bvr a;

    /* JADX INFO: renamed from: androidx.media3.decoder.vp9.VpxLibrary$1, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    class AnonymousClass1 extends bvr {
        @Override // defpackage.bvr
        protected final void a(String str) {
            System.loadLibrary(str);
        }
    }

    static {
        bst.b("media3.decoder.vpx");
        a = new AnonymousClass1("vpx", "vpxV2JNI");
    }

    private VpxLibrary() {
    }

    public static boolean a() {
        return a.b();
    }

    private static native String vpxGetBuildConfig();

    public static native String vpxGetVersion();

    public static native boolean vpxIsSecureDecodeSupported();
}
