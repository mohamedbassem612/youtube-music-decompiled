package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum arfq implements aihr {
    FONT_FAMILY_UNSPECIFIED(0),
    FONT_FAMILY_CLASSIC(1),
    FONT_FAMILY_LIGHT(2),
    FONT_FAMILY_HEAVY(3),
    FONT_FAMILY_MARKER(4),
    FONT_FAMILY_BRUSH(5),
    FONT_FAMILY_TYPEWRITER(6),
    FONT_FAMILY_YOUTUBE_SANS(7),
    FONT_FAMILY_HANDWRITING(8),
    FONT_FAMILY_MEME(9),
    FONT_FAMILY_FUN(10),
    FONT_FAMILY_CLASSY(11),
    FONT_FAMILY_SCRIPT(65),
    FONT_FAMILY_PRINTER(66),
    FONT_FAMILY_NARROW(67),
    FONT_FAMILY_COZY(68),
    FONT_FAMILY_JOURNAL(69),
    FONT_FAMILY_CHISEL(70),
    FONT_FAMILY_CLASSIC_INTER_TIGHT(71),
    FONT_FAMILY_LIGHT_INTER_TIGHT(72);

    public final int u;

    arfq(int i) {
        this.u = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.u;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.u);
    }
}
