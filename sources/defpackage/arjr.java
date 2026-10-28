package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arjr implements weh {
    static final arjq a;
    public static final weq b;
    private final arjs c;

    static {
        arjq arjqVar = new arjq();
        a = arjqVar;
        b = arjqVar;
    }

    public arjr(arjs arjsVar) {
        this.c = arjsVar;
    }

    public static arjp e(String str) {
        str.getClass();
        ahno.P(!str.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = arjs.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        arjs arjsVar = (arjs) aihfVarCreateBuilder.instance;
        arjsVar.b |= 1;
        arjsVar.c = str;
        return new arjp(aihfVarCreateBuilder);
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
        return new arjp(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof arjr) && this.c.equals(((arjr) obj).c);
    }

    public String getMessageId() {
        return this.c.e;
    }

    public String getSerializedAdditionalMetadata() {
        return this.c.d;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "WebToNativeMessageEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
