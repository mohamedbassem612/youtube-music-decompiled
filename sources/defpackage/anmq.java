package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anmq implements weh {
    static final anmp a;
    public static final weq b;
    private final anmr c;

    static {
        anmp anmpVar = new anmp();
        a = anmpVar;
        b = anmpVar;
    }

    public anmq(anmr anmrVar) {
        this.c = anmrVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        return new agkx().g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.c;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    public final /* bridge */ /* synthetic */ tzk d() {
        return new anmo(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anmq) && this.c.equals(((anmq) obj).c);
    }

    public aolh getPanelExpandedStyle() {
        aolh aolhVarA = aolh.a(this.c.e);
        return aolhVarA == null ? aolh.PANEL_EXPANDED_STYLE_UNKNOWN : aolhVarA;
    }

    public String getSelectedQuery() {
        return this.c.f;
    }

    public anmt getState() {
        anmt anmtVarA = anmt.a(this.c.d);
        return anmtVarA == null ? anmt.MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_UNKNOWN : anmtVarA;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicConversationalRadioBuilderEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
