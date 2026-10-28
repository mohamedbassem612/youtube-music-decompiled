package androidx.media3.decoder.opus;

import defpackage.bst;
import defpackage.bvr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class OpusLibrary {
    public static final /* synthetic */ int a = 0;
    private static final bvr b;

    /* JADX INFO: renamed from: androidx.media3.decoder.opus.OpusLibrary$1, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    class AnonymousClass1 extends bvr {
        @Override // defpackage.bvr
        protected final void a(String str) {
            System.loadLibrary(str);
        }
    }

    static {
        bst.b("media3.decoder.opus");
        b = new AnonymousClass1("opusV2JNI");
    }

    private OpusLibrary() {
    }

    public static boolean a() {
        return b.b();
    }

    public static native String opusGetVersion();

    public static native boolean opusIsSecureDecodeSupported();
}
