package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auig extends aihn implements aiis {
    public static final auig a;
    public int b;
    public aqlb c;
    public auie e;
    private arfi f;
    private byte g = 2;
    public String d = "";

    static {
        auig auigVar = new auig();
        a = auigVar;
        aihn.registerDefaultInstance(auig.class, auigVar);
    }

    private auig() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဉ\u0004", new Object[]{"b", "f", "c", "d", "e"});
            case 3:
                return new auig();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(auig.class);
            default:
                return null;
        }
    }
}
