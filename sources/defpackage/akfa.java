package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akfa extends aihn implements aiis {
    public static final akfa a;
    private int b;
    private alay c;
    private alay d;
    private ajng e;
    private ajwo f;
    private ajwo g;
    private akez h;
    private byte i = 2;

    static {
        akfa akfaVar = new akfa();
        a = akfaVar;
        aihn.registerDefaultInstance(akfa.class, akfaVar);
    }

    private akfa() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\r\u0006\u0000\u0000\u0006\u0001ᐉ\u0003\u0006ᐉ\u0004\bᐉ\u0005\tᐉ\u0007\fᐉ\u0001\rᐉ\u0002", new Object[]{"b", "e", "f", "g", "h", "c", "d"});
            case 3:
                return new akfa();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akfa.class);
            default:
                return null;
        }
    }
}
