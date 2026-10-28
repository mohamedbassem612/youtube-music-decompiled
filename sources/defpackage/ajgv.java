package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajgv extends aihn implements aiis {
    public static final ajgv a;
    private int b;
    private apji c;
    private byte d = 2;

    static {
        ajgv ajgvVar = new ajgv();
        a = ajgvVar;
        aihn.registerDefaultInstance(ajgv.class, ajgvVar);
    }

    private ajgv() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new ajgv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajgv.class);
            default:
                return null;
        }
    }
}
