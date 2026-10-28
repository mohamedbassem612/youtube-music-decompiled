package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum axnh {
    CRONET_SOURCE_UNSPECIFIED("Unspecified"),
    CRONET_SOURCE_STATICALLY_LINKED("Statically Linked"),
    CRONET_SOURCE_PLAY_SERVICES("Play Services"),
    CRONET_SOURCE_FALLBACK("Fallback"),
    CRONET_SOURCE_PLATFORM("HttpEngine"),
    CRONET_SOURCE_FAKE("Fake");

    private final String h;

    axnh(String str) {
        this.h = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.h;
    }
}
