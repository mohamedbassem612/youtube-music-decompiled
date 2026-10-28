package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajuz extends aihi implements aihj {
    public static final ajuz a;
    public int b;
    public int c;
    public int d;
    public ajva f;
    private byte g = 2;
    public int e = -1;

    static {
        ajuz ajuzVar = new ajuz();
        a = ajuzVar;
        aihn.registerDefaultInstance(ajuz.class, ajuzVar);
    }

    private ajuz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new ajuz();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajuz.class);
            default:
                return null;
        }
    }
}
