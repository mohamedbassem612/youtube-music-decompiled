package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akuf extends aihn implements aiis {
    public static final akuf a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        akuf akufVar = new akuf();
        a = akufVar;
        aihn.registerDefaultInstance(akuf.class, akufVar);
    }

    private akuf() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\ufaea䈠\ufaea䈠\u0001\u0000\u0000\u0001\ufaea䈠м\u0000", new Object[]{"c", "b", akuj.class});
            case 3:
                return new akuf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akuf.class);
            default:
                return null;
        }
    }
}
