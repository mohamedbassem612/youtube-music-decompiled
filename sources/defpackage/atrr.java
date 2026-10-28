package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum atrr implements aihr {
    TEXT_CONTENT_MODE_UNSPECIFIED(0),
    TEXT_CONTENT_MODE_NORMAL(1),
    TEXT_CONTENT_MODE_HIGHLIGHT_REVEAL(2),
    TEXT_CONTENT_MODE_LETTER_REVEAL(3);

    public final int e;

    atrr(int i) {
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
