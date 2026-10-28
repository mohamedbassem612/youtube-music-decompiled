package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum amyg implements aihr {
    MDX_DEVICE_DISCOVERY_STRATEGY_UNKNOWN(0),
    MDX_DEVICE_DISCOVERY_STRATEGY_DIAL(1),
    MDX_DEVICE_DISCOVERY_STRATEGY_CAST(2),
    MDX_DEVICE_DISCOVERY_STRATEGY_PAIRED(3),
    MDX_DEVICE_DISCOVERY_STRATEGY_REMOTE(4);

    public final int f;

    amyg(int i) {
        this.f = i;
    }

    public static amyg a(int i) {
        if (i == 0) {
            return MDX_DEVICE_DISCOVERY_STRATEGY_UNKNOWN;
        }
        if (i == 1) {
            return MDX_DEVICE_DISCOVERY_STRATEGY_DIAL;
        }
        if (i == 2) {
            return MDX_DEVICE_DISCOVERY_STRATEGY_CAST;
        }
        if (i == 3) {
            return MDX_DEVICE_DISCOVERY_STRATEGY_PAIRED;
        }
        if (i != 4) {
            return null;
        }
        return MDX_DEVICE_DISCOVERY_STRATEGY_REMOTE;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
