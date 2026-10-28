package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akvs extends aihn implements aiis {
    public static final akvs a;
    private int b;
    private alay c;
    private apji d;
    private byte e = 2;

    static {
        akvs akvsVar = new akvs();
        a = akvsVar;
        aihn.registerDefaultInstance(akvs.class, akvsVar);
    }

    private akvs() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0004ᐉ\u0003", new Object[]{"b", "c", "d"});
            case 3:
                return new akvs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akvs.class);
            default:
                return null;
        }
    }
}
