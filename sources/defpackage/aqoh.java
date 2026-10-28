package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqoh extends aihn implements aiis {
    public static final aqoh a;
    public int b;
    public apji c;
    public String d;
    private byte e = 2;

    static {
        aqoh aqohVar = new aqoh();
        a = aqohVar;
        aihn.registerDefaultInstance(aqoh.class, aqohVar);
    }

    private aqoh() {
        emptyProtobufList();
        this.d = "";
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဈ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new aqoh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqoh.class);
            default:
                return null;
        }
    }
}
