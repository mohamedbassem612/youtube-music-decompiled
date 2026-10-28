package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqke extends aihn implements aiis {
    public static final aqke a;
    private int b;
    private apgr c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private alay i;
    private alay j;
    private alay k;
    private byte l = 2;

    static {
        aqke aqkeVar = new aqke();
        a = aqkeVar;
        aihn.registerDefaultInstance(aqke.class, aqkeVar);
    }

    private aqke() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0002\f\t\u0000\u0000\t\u0002ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\n\fᐉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new aqke();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqke.class);
            default:
                return null;
        }
    }
}
