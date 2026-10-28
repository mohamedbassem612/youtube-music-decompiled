package j$.util;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class e extends RuntimeException {
    public static void a(String str, Serializable serializable) {
        throw new e("Unsupported " + str + " :" + serializable);
    }
}
