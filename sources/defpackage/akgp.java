package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum akgp implements aihr {
    ACTIVE_CREATION_PAGE_UNKNOWN(0),
    ACTIVE_CREATION_PAGE_AUDIO_PICKER_BROWSE(1),
    ACTIVE_CREATION_PAGE_AUDIO_PICKER_SEARCH(2),
    ACTIVE_CREATION_PAGE_CAMERA(3),
    ACTIVE_CREATION_PAGE_EDITOR(4);

    public final int f;

    akgp(int i) {
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
