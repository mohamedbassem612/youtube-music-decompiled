package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aprs extends aihn implements aiis {
    public static final aprs a;
    private int b;
    private alay c;
    private alay d;
    private ajwo e;
    private aprq f;
    private alay g;
    private alay h;
    private alay i;
    private byte j = 2;

    static {
        aprs aprsVar = new aprs();
        a = aprsVar;
        aihn.registerDefaultInstance(aprs.class, aprsVar);
    }

    private aprs() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0006ᐉ\t\u0007ᐉ\n\bᐉ\u000b\u000bᐉ\u0005", new Object[]{"b", "c", "d", "e", "g", "h", "i", "f"});
            case 3:
                return new aprs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aprs.class);
            default:
                return null;
        }
    }
}
