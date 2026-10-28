package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajwk implements weh {
    static final ajwj a;
    public static final weq b;
    private final ajwl c;

    static {
        ajwj ajwjVar = new ajwj();
        a = ajwjVar;
        b = ajwjVar;
    }

    public ajwk(ajwl ajwlVar) {
        this.c = ajwlVar;
    }

    public static ajwi e(String str) {
        str.getClass();
        ahno.P(!str.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = ajwl.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ajwl ajwlVar = (ajwl) aihfVarCreateBuilder.instance;
        ajwlVar.b |= 1;
        ajwlVar.c = str;
        return new ajwi(aihfVarCreateBuilder);
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
    public final boolean equals(Object obj) {
        return (obj instanceof ajwk) && this.c.equals(((ajwk) obj).c);
    }

    @Override // defpackage.weh
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final ajwi d() {
        return new ajwi(this.c.toBuilder());
    }

    public final boolean g() {
        return (this.c.b & 2) != 0;
    }

    public ajwo getCommand() {
        ajwo ajwoVar = this.c.d;
        return ajwoVar == null ? ajwo.a : ajwoVar;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "CommandEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
