package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ardo extends aihn implements aiis {
    public static final ardo a;
    public alay d;
    private int f;
    private byte g = 2;
    public String b = "";
    public String c = "";
    public aiie e = emptyProtobufList();

    static {
        ardo ardoVar = new ardo();
        a = ardoVar;
        aihn.registerDefaultInstance(ardo.class, ardoVar);
    }

    private ardo() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0002ᐉ\u0002\u0003\u001a\u0004ဈ\u0001", new Object[]{"f", "b", "d", "e", "c"});
            case 3:
                return new ardo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ardo.class);
            default:
                return null;
        }
    }
}
