package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amnt implements weh {
    static final amns a;
    public static final weq b;
    private final amnu c;

    static {
        amns amnsVar = new amns();
        a = amnsVar;
        b = amnsVar;
    }

    public amnt(amnu amnuVar) {
        this.c = amnuVar;
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
        return new amnr(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof amnt) && this.c.equals(((amnt) obj).c);
    }

    public Boolean getIsLiveChatParticipationRestricted() {
        return Boolean.valueOf(this.c.d);
    }

    public Boolean getMessagesFailedToSendInCurrentPlayback() {
        return Boolean.valueOf(this.c.f);
    }

    public Boolean getMessagesSentInCurrentPlayback() {
        return Boolean.valueOf(this.c.e);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "LiveChatClientStateEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
