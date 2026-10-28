package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajki extends aihn implements aiis {
    public static final ajki a;
    private int b;
    private ajkh c;
    private alay d;
    private ajwo e;
    private ajwo f;
    private byte g = 2;

    static {
        ajki ajkiVar = new ajki();
        a = ajkiVar;
        aihn.registerDefaultInstance(ajki.class, ajkiVar);
    }

    private ajki() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0003\b\u0004\u0000\u0000\u0004\u0003ᐉ\u0002\u0004ᐉ\u0003\u0007ᐉ\u0004\bᐉ\u0005", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new ajki();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajki.class);
            default:
                return null;
        }
    }
}
