package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auih extends aihn implements aiis {
    public static final auih a;
    public int b;
    public Object d;
    public ameh e;
    public int f;
    public int c = 0;
    private byte g = 2;

    static {
        auih auihVar = new auih();
        a = auihVar;
        aihn.registerDefaultInstance(auih.class, auihVar);
    }

    private auih() {
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
                return newMessageInfo(a, "\u0004\n\u0001\u0001\u0001\u000b\n\u0000\u0000\u0003\u0001м\u0000\u0002ᐉ\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0007᠌\u0001\bм\u0000\t<\u0000\n<\u0000\u000b<\u0000", new Object[]{"d", "c", "b", auig.class, "e", auib.class, auhz.class, auid.class, "f", aqcj.g, auia.class, auif.class, auhx.class, auhw.class});
            case 3:
                return new auih();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(auih.class);
            default:
                return null;
        }
    }
}
