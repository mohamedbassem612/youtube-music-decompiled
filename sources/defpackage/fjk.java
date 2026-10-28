package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum fjk {
    HINT_VISIBLE("HINT_VISIBLE"),
    HINT_INVISIBLE("HINT_INVISIBLE"),
    DESTROYED("DESTROYED");

    public final String d;

    fjk(String str) {
        this.d = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.d;
    }
}
