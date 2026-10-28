package org.chromium.net;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class GURLUtils {

    /* JADX INFO: compiled from: PG */
    public interface Natives {
        String getOrigin(String str);
    }

    public static String getOrigin(String str) {
        return GURLUtilsJni.get().getOrigin(str);
    }
}
