package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akxv extends aihn implements aiis {
    public static final akxv a;
    private int c;
    private apji d;
    private aqpt e;
    private aqpq f;
    private byte g = 2;
    public String b = "";

    static {
        akxv akxvVar = new akxv();
        a = akxvVar;
        aihn.registerDefaultInstance(akxv.class, akxvVar);
    }

    private akxv() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\n\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ဈ\u0001\tᐉ\u0007\nᐉ\b", new Object[]{"c", "d", "b", "e", "f"});
            case 3:
                return new akxv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akxv.class);
            default:
                return null;
        }
    }
}
