package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anxa extends aihn implements aiis {
    public static final anxa a;
    public static final aihl b;
    private byte d = 2;
    public aiie c = emptyProtobufList();

    static {
        anxa anxaVar = new anxa();
        a = anxaVar;
        aihn.registerDefaultInstance(anxa.class, anxaVar);
        b = aihn.newSingularGeneratedExtension(apji.a, anxaVar, anxaVar, null, 218259194, aika.MESSAGE, anxa.class);
    }

    private anxa() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"c", alay.class});
            case 3:
                return new anxa();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anxa.class);
            default:
                return null;
        }
    }
}
