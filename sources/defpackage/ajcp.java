package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ajcp extends aihn implements aiis {
    public static final ajcp a;
    public int b;
    public ajwo c;
    public ajwo d;
    public int e;
    public amud f;
    private byte g = 2;

    static {
        ajcp ajcpVar = new ajcp();
        a = ajcpVar;
        aihn.registerDefaultInstance(ajcp.class, ajcpVar);
    }

    private ajcp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001ϧ\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003᠌\u0002ϧᐉ\u0003", new Object[]{"b", "c", "d", "e", aocm.a, "f"});
            case 3:
                return new ajcp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajcp.class);
            default:
                return null;
        }
    }
}
