package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aljo extends aihn implements aiis {
    public static final aljo a;
    private int b;
    private apji c;
    private ajwo d;
    private byte e = 2;

    static {
        aljo aljoVar = new aljo();
        a = aljoVar;
        aihn.registerDefaultInstance(aljo.class, aljoVar);
    }

    private aljo() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0006ᐉ\u0004", new Object[]{"b", "c", "d"});
            case 3:
                return new aljo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aljo.class);
            default:
                return null;
        }
    }
}
