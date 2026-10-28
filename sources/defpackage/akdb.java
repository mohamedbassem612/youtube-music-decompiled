package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akdb extends aihn implements aiis {
    public static final akdb a;
    public static final aihl b;
    public int c;
    public akdc d;
    private byte e = 2;

    static {
        akdb akdbVar = new akdb();
        a = akdbVar;
        aihn.registerDefaultInstance(akdb.class, akdbVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, akdbVar, akdbVar, null, 79289575, aika.MESSAGE, akdb.class);
    }

    private akdb() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new akdb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akdb.class);
            default:
                return null;
        }
    }
}
