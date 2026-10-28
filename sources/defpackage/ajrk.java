package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajrk extends aihn implements aiis {
    public static final ajrk a;
    private int b;
    private alay c;
    private alay d;
    private byte e = 2;

    static {
        ajrk ajrkVar = new ajrk();
        a = ajrkVar;
        aihn.registerDefaultInstance(ajrk.class, ajrkVar);
    }

    private ajrk() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0010\u0012\u0002\u0000\u0000\u0002\u0010ᐉ\u0005\u0012ᐉ\u0006", new Object[]{"b", "c", "d"});
            case 3:
                return new ajrk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajrk.class);
            default:
                return null;
        }
    }
}
