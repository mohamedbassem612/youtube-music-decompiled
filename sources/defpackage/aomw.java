package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aomw extends aihn implements aiis {
    public static final aomw a;
    private int b;
    private aona c;
    private byte d = 2;

    static {
        aomw aomwVar = new aomw();
        a = aomwVar;
        aihn.registerDefaultInstance(aomw.class, aomwVar);
    }

    private aomw() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue4bf㱾\ue4bf㱾\u0001\u0000\u0000\u0001\ue4bf㱾ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aomw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aomw.class);
            default:
                return null;
        }
    }
}
