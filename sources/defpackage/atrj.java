package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum atrj implements aihr {
    PARA_STYLE_TEXT_ALIGN_UNSPECIFIED(0),
    PARA_STYLE_TEXT_ALIGN_LEFT(1),
    PARA_STYLE_TEXT_ALIGN_RIGHT(2),
    PARA_STYLE_TEXT_ALIGN_CENTER(3);

    public final int e;

    atrj(int i) {
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
