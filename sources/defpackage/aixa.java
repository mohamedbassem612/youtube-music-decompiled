package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aixa extends aihn implements aiis {
    public static final aixa a;
    public int b;
    public aoda c;
    public aocd d;
    private aodb e;
    private aqub f;
    private byte g = 2;

    static {
        aixa aixaVar = new aixa();
        a = aixaVar;
        aihn.registerDefaultInstance(aixa.class, aixaVar);
    }

    private aixa() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\ufe1a⌶\ueda3陸\u0006\u0004\u0000\u0000\u0004\ufe1a⌶ᐉ\u0000ﮜ\u2dd7ᐉ\u0001\uf662欣ᐉ\u0003\ueda3陸\u0006ᐉ\u0002", new Object[]{"b", "c", "d", "f", "e"});
            case 3:
                return new aixa();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aixa.class);
            default:
                return null;
        }
    }
}
