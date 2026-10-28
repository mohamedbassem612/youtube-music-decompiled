package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class algu extends aihn implements aiis {
    public static final algu a;
    public int b;
    public int c;
    public int d;
    public int e;
    private byte f = 2;

    static {
        algu alguVar = new algu();
        a = alguVar;
        aihn.registerDefaultInstance(algu.class, alguVar);
    }

    private algu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002᠌\u0001\u0003᠌\u0002\u0005᠌\u0004", new Object[]{"b", "c", akvb.r, "d", akvb.s, "e", akvb.q});
            case 3:
                return new algu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(algu.class);
            default:
                return null;
        }
    }
}
