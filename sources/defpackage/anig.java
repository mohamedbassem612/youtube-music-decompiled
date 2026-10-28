package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anig extends aihn implements aiis {
    public static final anig a;
    public static final aihl b;
    public int c;
    public apji d;
    private byte e = 2;

    static {
        anig anigVar = new anig();
        a = anigVar;
        aihn.registerDefaultInstance(anig.class, anigVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, anigVar, anigVar, null, 1810, aika.MESSAGE, anig.class);
    }

    private anig() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new anig();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anig.class);
            default:
                return null;
        }
    }
}
