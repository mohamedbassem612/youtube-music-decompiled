package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajpz extends aihn implements aiis {
    public static final ajpz a;
    private int b;
    private ajqe c;
    private ajqc d;
    private ajqd e;
    private algg f;
    private byte g = 2;

    static {
        ajpz ajpzVar = new ajpz();
        a = ajpzVar;
        aihn.registerDefaultInstance(ajpz.class, ajpzVar);
    }

    private ajpz() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\uec7d⏫\uf3e4줨\u0004\u0000\u0000\u0004\uec7d⏫ᐉ\u0000\uf2a2⤛ᐉ\u0001\uf4fb⮘ᐉ\u0002\uf3e4줨ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new ajpz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajpz.class);
            default:
                return null;
        }
    }
}
