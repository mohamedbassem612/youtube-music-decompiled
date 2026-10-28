package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akia extends aihn implements aiis {
    public static final akia a;
    private int b;
    private ajwo c;
    private ajwo d;
    private alay e;
    private alay f;
    private ajwo g;
    private byte h = 2;

    static {
        akia akiaVar = new akia();
        a = akiaVar;
        aihn.registerDefaultInstance(akia.class, akiaVar);
    }

    private akia() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0007\u0011\u0005\u0000\u0000\u0005\u0007ᐉ\t\bᐉ\n\u000eᐉ\r\u000fᐉ\u000e\u0011ᐉ\u0010", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new akia();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akia.class);
            default:
                return null;
        }
    }
}
