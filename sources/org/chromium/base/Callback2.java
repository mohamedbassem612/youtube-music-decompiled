package org.chromium.base;

import defpackage.a;
import defpackage.axpk;
import defpackage.axpn;
import defpackage.axpo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
@FunctionalInterface
public interface Callback2 {

    /* JADX INFO: compiled from: PG */
    public final class JniHelper {
        public static final axpo a(byte[] bArr, axpk axpkVar) {
            axpkVar.d();
            return new axpn(bArr);
        }

        public static String b(int i) {
            switch (i) {
                case 0:
                    return "NOT_STARTED";
                case 1:
                    return "STARTED";
                case 2:
                    return "REDIRECT_RECEIVED";
                case 3:
                    return "AWAITING_FOLLOW_REDIRECT";
                case 4:
                    return "AWAITING_READ";
                case 5:
                    return "READING";
                case 6:
                    return "ERROR";
                case 7:
                    return "COMPLETE";
                case 8:
                    return "CANCELLED";
                default:
                    throw new IllegalArgumentException(a.bR(i, "Unknown state "));
            }
        }

        static void onResultFromNative(Callback2 callback2, Object obj, Object obj2) {
            callback2.a();
        }
    }

    void a();
}
