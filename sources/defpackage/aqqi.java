package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqqi extends aihn implements aiis {
    public static final aqqi a;
    private int b;
    private alay c;
    private alay d;
    private apji e;
    private byte f = 2;

    static {
        aqqi aqqiVar = new aqqi();
        a = aqqiVar;
        aihn.registerDefaultInstance(aqqi.class, aqqiVar);
    }

    private aqqi() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\t\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\tᐉ\u0004", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aqqi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqqi.class);
            default:
                return null;
        }
    }
}
