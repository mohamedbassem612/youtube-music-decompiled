package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ankz extends aihn implements aiis {
    public static final ankz a;
    public int b;
    public alay c;
    public alay d;
    public aiie e;
    private alay f;
    private apji g;
    private apji h;
    private apji i;
    private byte j = 2;

    static {
        ankz ankzVar = new ankz();
        a = ankzVar;
        aihn.registerDefaultInstance(ankz.class, ankzVar);
    }

    private ankz() {
        emptyProtobufList();
        this.e = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\nᐉ\u0005\u000bЛ", new Object[]{"b", "c", "f", "d", "g", "h", "i", "e", apji.class});
            case 3:
                return new ankz();
            case 4:
                return new aihf((short[]) null, (short[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ankz.class);
            default:
                return null;
        }
    }
}
