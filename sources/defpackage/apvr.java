package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum apvr implements aihr {
    SHORTS_CREATION_DRAFT_SAVE_ACTION_UNSPECIFIED(0),
    SHORTS_CREATION_DRAFT_SAVE_ACTION_AUTOMATIC(1),
    SHORTS_CREATION_DRAFT_SAVE_ACTION_USER(2),
    SHORTS_CREATION_DRAFT_SAVE_ACTION_EPHEMERAL(3);

    private final int f;

    apvr(int i) {
        this.f = i;
    }

    public static apvr a(int i) {
        if (i == 0) {
            return SHORTS_CREATION_DRAFT_SAVE_ACTION_UNSPECIFIED;
        }
        if (i == 1) {
            return SHORTS_CREATION_DRAFT_SAVE_ACTION_AUTOMATIC;
        }
        if (i == 2) {
            return SHORTS_CREATION_DRAFT_SAVE_ACTION_USER;
        }
        if (i != 3) {
            return null;
        }
        return SHORTS_CREATION_DRAFT_SAVE_ACTION_EPHEMERAL;
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
