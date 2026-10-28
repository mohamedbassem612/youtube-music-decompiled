package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqju extends aihn implements aiis {
    public static final aqju a;
    private byte c = 2;
    public aiie b = emptyProtobufList();

    static {
        aqju aqjuVar = new aqju();
        a = aqjuVar;
        aihn.registerDefaultInstance(aqju.class, aqjuVar);
    }

    private aqju() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", aqjt.class});
            case 3:
                return new aqju();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqju.class);
            default:
                return null;
        }
    }
}
