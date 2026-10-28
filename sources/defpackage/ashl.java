package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum ashl implements aihr {
    PLAYER_VISIBILITY_DEFAULT(0),
    PLAYER_VISIBILITY_MINIMIZED(1),
    PLAYER_VISIBILITY_FULLSCREEN(2),
    PLAYER_VISIBILITY_BACKGROUND(3),
    PLAYER_VISIBILITY_REMOTE(4),
    PLAYER_VISIBILITY_INLINE(5),
    PLAYER_VISIBILITY_VR(6),
    PLAYER_VISIBILITY_PICTURE_IN_PICTURE(7),
    PLAYER_VISIBILITY_IMMERSIVE_PREVIEW(8),
    PLAYER_VISIBILITY_SQUEEZEBACK(9),
    PLAYER_VISIBILITY_THEATER(10);

    public final int l;

    ashl(int i) {
        this.l = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
