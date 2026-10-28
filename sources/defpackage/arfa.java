package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arfa extends aihn implements aiis {
    public static final arfa a;
    public static final aihl b;
    private int c;
    private alay d;
    private byte e = 2;

    static {
        arfa arfaVar = new arfa();
        a = arfaVar;
        aihn.registerDefaultInstance(arfa.class, arfaVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, arfaVar, arfaVar, null, 77611383, aika.MESSAGE, arfa.class);
    }

    private arfa() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0003", new Object[]{"c", "d"});
            case 3:
                return new arfa();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arfa.class);
            default:
                return null;
        }
    }
}
