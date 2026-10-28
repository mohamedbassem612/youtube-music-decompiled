package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akoe extends aihn implements aiis {
    public static final akoe a;
    private int b;
    private alay c;
    private alay d;
    private ajwo e;
    private alay f;
    private byte g = 2;

    static {
        akoe akoeVar = new akoe();
        a = akoeVar;
        aihn.registerDefaultInstance(akoe.class, akoeVar);
    }

    private akoe() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0003ᐉ\u0003\tᐉ\u0007\nᐉ\b", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new akoe();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akoe.class);
            default:
                return null;
        }
    }
}
