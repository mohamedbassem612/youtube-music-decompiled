package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atqg extends aihn implements aiis {
    public static final atqg a;
    public int b;
    public atqf c;
    public int d;
    private byte e = 2;

    static {
        atqg atqgVar = new atqg();
        a = atqgVar;
        aihn.registerDefaultInstance(atqg.class, atqgVar);
    }

    private atqg() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဋ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new atqg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(atqg.class);
            default:
                return null;
        }
    }
}
