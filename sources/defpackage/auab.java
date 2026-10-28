package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum auab implements aihr {
    CHANNEL_MENTION_STYLE_UNSPECIFIED(0),
    CHANNEL_MENTION_NORMAL(1),
    CHANNEL_MENTION_LIGHT(2);

    private final int e;

    auab(int i) {
        this.e = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
