package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajad extends aihn implements aiis {
    public static final ajad a;
    private int b;
    private ajwo c;
    private byte d = 2;

    static {
        ajad ajadVar = new ajad();
        a = ajadVar;
        aihn.registerDefaultInstance(ajad.class, ajadVar);
    }

    private ajad() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0003", new Object[]{"b", "c"});
            case 3:
                return new ajad();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajad.class);
            default:
                return null;
        }
    }
}
