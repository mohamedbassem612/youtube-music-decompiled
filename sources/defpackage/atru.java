package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum atru implements aihr {
    TEXT_DECORATION_TYPE_UNSPECIFIED(0),
    TEXT_DECORATION_TYPE_NO_DECORATION(1),
    TEXT_DECORATION_TYPE_UNDERLINE(2),
    TEXT_DECORATION_TYPE_OVERLINE(3),
    TEXT_DECORATION_TYPE_LINE_THROUGH(4);

    public final int f;

    atru(int i) {
        this.f = i;
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
