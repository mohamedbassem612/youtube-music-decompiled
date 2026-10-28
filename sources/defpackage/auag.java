package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum auag implements aihr {
    DAY_OF_WEEK_STYLE_UNSPECIFIED(0),
    DAY_OF_WEEK_NORMAL(1),
    DAY_OF_WEEK_LIGHT(2);

    public final int d;

    auag(int i) {
        this.d = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
