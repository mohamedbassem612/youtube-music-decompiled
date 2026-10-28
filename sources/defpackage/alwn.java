package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class alwn extends aihn implements aiis {
    public static final alwn a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alwn alwnVar = new alwn();
        a = alwnVar;
        aihn.registerDefaultInstance(alwn.class, alwnVar);
    }

    private alwn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ue592᯦\uf492䤳\u0003\u0000\u0000\u0003\ue592᯦м\u0000\uf254⩭м\u0000\uf492䤳м\u0000", new Object[]{"c", "b", angn.class, aiwx.class, akrn.class});
            case 3:
                return new alwn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alwn.class);
            default:
                return null;
        }
    }
}
