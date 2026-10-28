package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum akmz implements aihr {
    SORT_RELOAD_CONTINUATION_TOKEN_UNSPECIFIED(0),
    SORT_RELOAD_CONTINUATION_TOKEN_A_TO_Z(1),
    SORT_RELOAD_CONTINUATION_TOKEN_Z_TO_A(2),
    SORT_RELOAD_CONTINUATION_TOKEN_RECENTS(3),
    SORT_RELOAD_CONTINUATION_TOKEN_RECENTLY_PLAYED(4),
    SORT_RELOAD_CONTINUATION_TOKEN_RECENTLY_ADDED(5);

    public final int g;

    akmz(int i) {
        this.g = i;
    }

    public static akmz a(int i) {
        if (i == 0) {
            return SORT_RELOAD_CONTINUATION_TOKEN_UNSPECIFIED;
        }
        if (i == 1) {
            return SORT_RELOAD_CONTINUATION_TOKEN_A_TO_Z;
        }
        if (i == 2) {
            return SORT_RELOAD_CONTINUATION_TOKEN_Z_TO_A;
        }
        if (i == 3) {
            return SORT_RELOAD_CONTINUATION_TOKEN_RECENTS;
        }
        if (i == 4) {
            return SORT_RELOAD_CONTINUATION_TOKEN_RECENTLY_PLAYED;
        }
        if (i != 5) {
            return null;
        }
        return SORT_RELOAD_CONTINUATION_TOKEN_RECENTLY_ADDED;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
