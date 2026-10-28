package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akyf extends aihn implements aiis {
    public static final akyf a;
    private int b;
    private akyd c;
    private byte d = 2;

    static {
        akyf akyfVar = new akyf();
        a = akyfVar;
        aihn.registerDefaultInstance(akyf.class, akyfVar);
    }

    private akyf() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf828ᢍ\uf828ᢍ\u0001\u0000\u0000\u0001\uf828ᢍᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new akyf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akyf.class);
            default:
                return null;
        }
    }
}
