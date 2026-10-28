package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqfu extends aihn implements aiis {
    public static final aqfu a;
    public int b;
    public alay c;
    public int e;
    public aqfw f;
    private alay g;
    private byte h = 2;
    public aiie d = emptyProtobufList();

    static {
        aqfu aqfuVar = new aqfu();
        a = aqfuVar;
        aihn.registerDefaultInstance(aqfu.class, aqfuVar);
    }

    private aqfu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0004ဋ\u0003\u0005ဉ\u0005", new Object[]{"b", "c", "g", "d", alay.class, "e", "f"});
            case 3:
                return new aqfu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqfu.class);
            default:
                return null;
        }
    }
}
