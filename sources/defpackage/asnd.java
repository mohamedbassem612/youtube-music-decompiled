package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum asnd implements aihr {
    SUBSCRIPTION_UNKNOWN(0),
    SUBSCRIPTION_LAYOUT_ROOT_MAX_WIDTH_DIMENSIONS(1),
    SUBSCRIPTION_LAYOUT_ROOT_MAX_HEIGHT_DIMENSIONS(2),
    SUBSCRIPTION_DEVICE_ORIENTATION(3),
    SUBSCRIPTION_WINDOW_SIZE(4),
    SUBSCRIPTION_PLATFORM_NAME(5),
    SUBSCRIPTION_FORM_FACTOR(6),
    SUBSCRIPTION_IS_SCREEN_READER_ACTIVE(7),
    SUBSCRIPTION_WINDOW_SAFE_AREA_INSETS(8),
    SUBSCRIPTION_IS_REDUCE_ANIMATIONS_SETTING_ENABLED(9),
    SUBSCRIPTION_FOLDING_DISPLAY_INFO(10),
    SUBSCRIPTION_COLOR_CONTRAST_MODE(11);

    private final int n;

    asnd(int i) {
        this.n = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.n);
    }
}
