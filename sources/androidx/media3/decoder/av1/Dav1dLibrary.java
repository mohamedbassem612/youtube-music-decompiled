package androidx.media3.decoder.av1;

import defpackage.bst;
import defpackage.bvr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class Dav1dLibrary {
    private static final bvr a;

    /* JADX INFO: renamed from: androidx.media3.decoder.av1.Dav1dLibrary$1, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    class AnonymousClass1 extends bvr {
        @Override // defpackage.bvr
        protected final void a(String str) {
            System.loadLibrary(str);
        }
    }

    static {
        bst.b("media3.decoder.dav1d");
        a = new AnonymousClass1("dav1dJNI");
    }

    private Dav1dLibrary() {
    }

    public static boolean isAvailable() {
        try {
            return a.b();
        } catch (Exception unused) {
            return false;
        }
    }
}
