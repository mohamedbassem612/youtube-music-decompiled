package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum apsc implements aihr {
    SFV_EFFECT_CLIENT_UNKNOWN(0),
    SFV_EFFECT_CLIENT_MDE_SHORTS_EFFECTS(1),
    SFV_EFFECT_CLIENT_MDE_XENO_IN_EDITOR(3),
    SFV_EFFECT_CLIENT_MDE_AUDIO(4),
    SFV_EFFECT_CLIENT_MDE_PRODUCER(2),
    SFV_EFFECT_CLIENT_MDE_SHORTS_CREATION(5),
    SFV_EFFECT_CLIENT_MDE_LIVE(6),
    SFV_EFFECT_CLIENT_MDE_IMAGE_EDITOR(7),
    SFV_EFFECT_CLIENT_MDE_IMAGE_EDITOR_ON_MUSIC(8);

    public final int j;

    apsc(int i) {
        this.j = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
