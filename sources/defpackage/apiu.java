package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apiu extends aihn implements aiis {
    public static final apiu a;
    public int b;
    public long c;
    public int d;
    public apic e;
    private byte g = 2;
    public String f = "";

    static {
        apiu apiuVar = new apiu();
        a = apiuVar;
        aihn.registerDefaultInstance(apiu.class, apiuVar);
    }

    private apiu() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0001\u0002ဂ\u0001\u0003ᐉ\u0003\u0004ለ\u0004\u0005᠌\u0002", new Object[]{"b", "c", "e", "f", "d", apep.t});
            case 3:
                return new apiu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apiu.class);
            default:
                return null;
        }
    }
}
