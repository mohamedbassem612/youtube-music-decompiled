package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajlu implements weh {
    static final ajls a;
    public static final weq b;
    private final ajlv c;

    static {
        ajls ajlsVar = new ajls();
        a = ajlsVar;
        b = ajlsVar;
    }

    public ajlu(ajlv ajlvVar) {
        this.c = ajlvVar;
    }

    public static ajlt e(String str) {
        str.getClass();
        ahno.P(!str.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = ajlv.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ajlv ajlvVar = (ajlv) aihfVarCreateBuilder.instance;
        ajlvVar.c |= 1;
        ajlvVar.d = str;
        return new ajlt(aihfVarCreateBuilder);
    }

    @Override // defpackage.weh
    public final agkz a() {
        return new agkx().g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.d;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    public final /* bridge */ /* synthetic */ tzk d() {
        return new ajlt(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof ajlu) && this.c.equals(((ajlu) obj).c);
    }

    public Boolean getValue() {
        return Boolean.valueOf(this.c.e);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "BooleanEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
