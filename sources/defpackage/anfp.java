package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anfp extends aihn implements aiis {
    public static final anfp a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private ajwo g;
    private byte h = 2;

    static {
        anfp anfpVar = new anfp();
        a = anfpVar;
        aihn.registerDefaultInstance(anfp.class, anfpVar);
    }

    private anfp() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0006ᐉ\u0005\nᐉ\t", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new anfp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anfp.class);
            default:
                return null;
        }
    }
}
