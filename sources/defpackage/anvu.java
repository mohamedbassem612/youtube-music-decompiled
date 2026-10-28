package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anvu implements weh {
    static final anvt a;
    public static final weq b;
    private final anvv c;

    static {
        anvt anvtVar = new anvt();
        a = anvtVar;
        b = anvtVar;
    }

    public anvu(anvv anvvVar) {
        this.c = anvvVar;
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
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final anvs d() {
        return new anvs(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anvu) && this.c.equals(((anvu) obj).c);
    }

    public anvx getState() {
        anvx anvxVarA = anvx.a(this.c.d);
        return anvxVarA == null ? anvx.MUSIC_RADIO_BUILDER_BUTTON_STATE_UKNNOWN : anvxVarA;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicRadioBuilderButtonEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
