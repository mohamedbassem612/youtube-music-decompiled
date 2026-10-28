package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aquw extends aihn implements aiis {
    public static final aquw a;
    private int b;
    private aqux c;
    private aquy d;
    private byte e = 2;

    static {
        aquw aquwVar = new aquw();
        a = aquwVar;
        aihn.registerDefaultInstance(aquw.class, aquwVar);
    }

    private aquw() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\uf4b7㡞ﴄ㢙\u0002\u0000\u0000\u0002\uf4b7㡞ᐉ\u0000ﴄ㢙ᐉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new aquw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aquw.class);
            default:
                return null;
        }
    }
}
