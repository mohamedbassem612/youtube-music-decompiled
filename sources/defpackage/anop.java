package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anop implements weh {
    static final anoo a;
    public static final weq b;
    private final anow c;

    static {
        anoo anooVar = new anoo();
        a = anooVar;
        b = anooVar;
    }

    public anop(anow anowVar) {
        this.c = anowVar;
    }

    public static anon e(String str) {
        str.getClass();
        ahno.P(!str.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = anow.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anow anowVar = (anow) aihfVarCreateBuilder.instance;
        anowVar.b |= 1;
        anowVar.e = str;
        return new anon(aihfVarCreateBuilder);
    }

    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        anow anowVar = this.c;
        int i = anowVar.c;
        if (i == 2) {
            agkxVar.c(i == 2 ? (String) anowVar.d : "");
        }
        int i2 = anowVar.c;
        if (i2 == 5) {
            agkxVar.c(i2 == 5 ? (String) anowVar.d : "");
        }
        return agkxVar.g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.e;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anop) && this.c.equals(((anop) obj).c);
    }

    @Override // defpackage.weh
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final anon d() {
        return new anon(this.c.toBuilder());
    }

    public Boolean getDefaultValue() {
        return Boolean.valueOf(this.c.h);
    }

    public String getOpaqueToken() {
        return this.c.g;
    }

    public Boolean getSelected() {
        return Boolean.valueOf(this.c.f);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicFormBooleanChoiceEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
