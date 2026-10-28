package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqpp extends aihn implements aiis {
    public static final aqpp a;
    private byte c = 2;
    public aiie b = emptyProtobufList();

    static {
        aqpp aqppVar = new aqpp();
        a = aqppVar;
        aihn.registerDefaultInstance(aqpp.class, aqppVar);
    }

    private aqpp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", aqpr.class});
            case 3:
                return new aqpp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqpp.class);
            default:
                return null;
        }
    }
}
