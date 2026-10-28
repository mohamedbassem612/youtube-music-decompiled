package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amld implements weh {
    static final amlc a;
    public static final weq b;
    private final amle c;

    static {
        amlc amlcVar = new amlc();
        a = amlcVar;
        b = amlcVar;
    }

    public amld(amle amleVar) {
        this.c = amleVar;
    }

    public static amlb e(String str) {
        str.getClass();
        ahno.P(!str.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = amle.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amle amleVar = (amle) aihfVarCreateBuilder.instance;
        amleVar.b |= 1;
        amleVar.c = str;
        return new amlb(aihfVarCreateBuilder);
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
        return new amlb(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof amld) && this.c.equals(((amld) obj).c);
    }

    public Boolean getHadUserInteraction() {
        return Boolean.valueOf(this.c.e);
    }

    public amlg getLikeStatus() {
        amlg amlgVarA = amlg.a(this.c.d);
        return amlgVarA == null ? amlg.LIKE : amlgVarA;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "LikeStatusEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
