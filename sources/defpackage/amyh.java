package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum amyh implements aihr {
    MDX_POLLING_FREQUENCY_UNKNOWN(0),
    MDX_POLLING_FREQUENCY_PING(1),
    MDX_POLLING_FREQUENCY_PASSIVE(2),
    MDX_POLLING_FREQUENCY_ACTIVE(3),
    MDX_POLLING_FREQUENCY_RAPID(4);

    public final int f;

    amyh(int i) {
        this.f = i;
    }

    public static amyh a(int i) {
        if (i == 0) {
            return MDX_POLLING_FREQUENCY_UNKNOWN;
        }
        if (i == 1) {
            return MDX_POLLING_FREQUENCY_PING;
        }
        if (i == 2) {
            return MDX_POLLING_FREQUENCY_PASSIVE;
        }
        if (i == 3) {
            return MDX_POLLING_FREQUENCY_ACTIVE;
        }
        if (i != 4) {
            return null;
        }
        return MDX_POLLING_FREQUENCY_RAPID;
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
