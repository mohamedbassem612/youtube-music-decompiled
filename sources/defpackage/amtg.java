package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amtg extends aihn implements aiis {
    public static final amtg a;
    private int b;
    private alay c;
    private alay d;
    private amtf e;
    private alay f;
    private alay g;
    private alay h;
    private amtf i;
    private alay j;
    private alay k;
    private amtf l;
    private alay m;
    private alay n;
    private amtf o;
    private byte p = 2;

    static {
        amtg amtgVar = new amtg();
        a = amtgVar;
        aihn.registerDefaultInstance(amtg.class, amtgVar);
    }

    private amtg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0003\u000f\r\u0000\u0000\r\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\n\fᐉ\u000b\rᐉ\f\u000eᐉ\r\u000fᐉ\u000e", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
            case 3:
                return new amtg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amtg.class);
            default:
                return null;
        }
    }
}
