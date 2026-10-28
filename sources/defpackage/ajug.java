package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajug extends aihn implements aiis {
    public static final ajug a;
    private int b;
    private ajwo c;
    private ajwo d;
    private byte e = 2;

    static {
        ajug ajugVar = new ajug();
        a = ajugVar;
        aihn.registerDefaultInstance(ajug.class, ajugVar);
    }

    private ajug() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003ᐉ\u0001\u0004ᐉ\u0002", new Object[]{"b", "c", "d"});
            case 3:
                return new ajug();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajug.class);
            default:
                return null;
        }
    }
}
