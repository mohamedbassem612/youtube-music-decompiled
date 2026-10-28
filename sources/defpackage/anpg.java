package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anpg extends aihn implements aiis {
    public static final anpg a;
    public int b;
    public alja c;
    public apji d;
    private alay e;
    private alay f;
    private apji g;
    private byte h = 2;

    static {
        anpg anpgVar = new anpg();
        a = anpgVar;
        aihn.registerDefaultInstance(anpg.class, anpgVar);
    }

    private anpg() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", "e", "f", "g", "d"});
            case 3:
                return new anpg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anpg.class);
            default:
                return null;
        }
    }
}
