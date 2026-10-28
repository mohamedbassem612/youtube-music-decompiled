package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class anmw extends aihn implements aiis {
    public static final anmw a;
    private int b;
    private apji c;
    private apji d;
    private apji e;
    private apji f;
    private apji g;
    private apji h;
    private apji i;
    private apji j;
    private byte k = 2;

    static {
        anmw anmwVar = new anmw();
        a = anmwVar;
        aihn.registerDefaultInstance(anmw.class, anmwVar);
    }

    private anmw() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\u000b\b\u0000\u0000\b\u0002ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\tᐉ\t\nᐉ\u0005\u000bᐉ\u0001", new Object[]{"b", "d", "e", "g", "h", "i", "j", "f", "c"});
            case 3:
                return new anmw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anmw.class);
            default:
                return null;
        }
    }
}
