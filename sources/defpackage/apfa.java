package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apfa extends aihn implements aiis {
    public static final apfa a;
    public int b;
    public int c;
    private alay d;
    private byte e = 2;

    static {
        apfa apfaVar = new apfa();
        a = apfaVar;
        aihn.registerDefaultInstance(apfa.class, apfaVar);
    }

    private apfa() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0004᠌\u0004", new Object[]{"b", "d", "c", apep.g});
            case 3:
                return new apfa();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apfa.class);
            default:
                return null;
        }
    }
}
