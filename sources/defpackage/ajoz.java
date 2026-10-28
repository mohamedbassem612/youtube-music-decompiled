package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajoz implements weh {
    static final ajoy a;
    public static final weq b;
    private final ajpa c;

    static {
        ajoy ajoyVar = new ajoy();
        a = ajoyVar;
        b = ajoyVar;
    }

    public ajoz(ajpa ajpaVar) {
        this.c = ajpaVar;
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
        return new ajox(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof ajoz) && this.c.equals(((ajoz) obj).c);
    }

    public ajpb getAwarenessState() {
        ajpb ajpbVarA = ajpb.a(this.c.f);
        return ajpbVarA == null ? ajpb.CAST_ICON_AWARENESS_STATE_UNSPECIFIED : ajpbVarA;
    }

    public Boolean getHasMultipleActiveDevices() {
        return Boolean.valueOf(this.c.e);
    }

    public aijp getTimestamp() {
        aijp aijpVar = this.c.d;
        return aijpVar == null ? aijp.a : aijpVar;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "CastIconAwarenessEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
