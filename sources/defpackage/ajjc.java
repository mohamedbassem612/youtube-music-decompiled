package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajjc extends aihn implements aiis {
    public static final ajjc a;
    private int b;
    private askp c;
    private askp d;
    private askp e;
    private byte f = 2;

    static {
        ajjc ajjcVar = new ajjc();
        a = ajjcVar;
        aihn.registerDefaultInstance(ajjc.class, ajjcVar);
    }

    private ajjc() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0003\u0002ᐉ\u0000\u0004ᐉ\u0003\u0005ᐉ\u0001", new Object[]{"b", "c", "e", "d"});
            case 3:
                return new ajjc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajjc.class);
            default:
                return null;
        }
    }
}
