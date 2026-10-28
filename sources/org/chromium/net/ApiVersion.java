package org.chromium.net;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ApiVersion {
    private static final int API_LEVEL = 49;
    private static final String CRONET_VERSION = "156.0.8078.25";
    private static final String LAST_CHANGE = "1228231501697ff7a4a0150ea8ae6df37bb99331-refs/branch-heads/8078@{#583}";
    private static final int MIN_COMPATIBLE_API_LEVEL = 3;

    private ApiVersion() {
    }

    public static int getApiLevel() {
        return 3;
    }

    public static String getCronetVersion() {
        return CRONET_VERSION;
    }

    public static String getCronetVersionWithLastChange() {
        return "156.0.8078.25@12282315";
    }

    public static String getLastChange() {
        return LAST_CHANGE;
    }

    public static int getMaximumAvailableApiLevel() {
        return 49;
    }
}
