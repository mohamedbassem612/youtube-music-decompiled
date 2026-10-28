package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajnh extends aihn implements aiis {
    public static final ajnh a;
    private int b;
    private ajwo c;
    private byte d = 2;

    static {
        ajnh ajnhVar = new ajnh();
        a = ajnhVar;
        aihn.registerDefaultInstance(ajnh.class, ajnhVar);
    }

    private ajnh() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0001\bᐉ\u0002", new Object[]{"b", "c"});
            case 3:
                return new ajnh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajnh.class);
            default:
                return null;
        }
    }
}
