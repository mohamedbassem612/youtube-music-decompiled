package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anps extends aihn implements aiis {
    public static final anps a;
    private int b;
    private ajwo c;
    private ajwo d;
    private ajwo e;
    private ajwo f;
    private apji g;
    private apji h;
    private apji i;
    private byte j = 2;

    static {
        anps anpsVar = new anps();
        a = anpsVar;
        aihn.registerDefaultInstance(anps.class, anpsVar);
    }

    private anps() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\nᐉ\u0003\u000bᐉ\u0006", new Object[]{"b", "c", "d", "e", "g", "h", "f", "i"});
            case 3:
                return new anps();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anps.class);
            default:
                return null;
        }
    }
}
