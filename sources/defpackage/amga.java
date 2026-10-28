package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amga extends aihn implements aiis {
    public static final amga a;
    public int b;
    public akci c;
    public akbq d;
    public akbs e;
    public akbt f;
    public akbv g;
    public akbw h;
    public akay i;
    private byte j = 2;

    static {
        amga amgaVar = new amga();
        a = amgaVar;
        aihn.registerDefaultInstance(amga.class, amgaVar);
    }

    private amga() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\uf143ᠤﭮⰜ\u0007\u0000\u0000\u0007\uf143ᠤᐉ\u0000\ue567ᠲᐉ\u0001\uef41ᠸᐉ\u0006\uf2b9ᥚᐉ\u0005\uef78⌿ᐉ\u0004\uf20bⰌᐉ\u0002ﭮⰜᐉ\u0003", new Object[]{"b", "c", "d", "i", "h", "g", "e", "f"});
            case 3:
                return new amga();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amga.class);
            default:
                return null;
        }
    }
}
