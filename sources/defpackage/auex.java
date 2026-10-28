package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class auex extends aihn implements aiis {
    public static final auex a;
    private byte d = 2;
    public aiie b = emptyProtobufList();
    public aiie c = emptyProtobufList();

    static {
        auex auexVar = new auex();
        a = auexVar;
        aihn.registerDefaultInstance(auex.class, auexVar);
    }

    private auex() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"b", auew.class, "c", auew.class});
            case 3:
                return new auex();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(auex.class);
            default:
                return null;
        }
    }
}
