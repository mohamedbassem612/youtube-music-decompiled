package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aolw implements weh {
    static final aolv a;
    public static final weq b;
    private final aolx c;

    static {
        aolv aolvVar = new aolv();
        a = aolvVar;
        b = aolvVar;
    }

    public aolw(aolx aolxVar) {
        this.c = aolxVar;
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
        return new aolu(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof aolw) && this.c.equals(((aolw) obj).c);
    }

    public aoly getState() {
        aoly aolyVarA = aoly.a(this.c.d);
        return aolyVarA == null ? aoly.PARTICIPANT_JOIN_STATE_UNKNOWN : aolyVarA;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "ParticipantJoinStateEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
