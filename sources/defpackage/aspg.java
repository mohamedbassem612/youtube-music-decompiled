package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aspg extends aihn implements aiis {
    public static final aspg a;
    private byte c = 2;
    public aiie b = emptyProtobufList();

    static {
        aspg aspgVar = new aspg();
        a = aspgVar;
        aihn.registerDefaultInstance(aspg.class, aspgVar);
    }

    private aspg() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", asmv.class});
            case 3:
                return new aspg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aspg.class);
            default:
                return null;
        }
    }
}
