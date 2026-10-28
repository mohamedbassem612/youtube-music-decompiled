package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akij extends aihn implements aiis {
    public static final akij a;
    private int b;
    private askp c;
    private askp d;
    private askp e;
    private byte f = 2;

    static {
        akij akijVar = new akij();
        a = akijVar;
        aihn.registerDefaultInstance(akij.class, akijVar);
    }

    private akij() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0003\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new akij();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akij.class);
            default:
                return null;
        }
    }
}
