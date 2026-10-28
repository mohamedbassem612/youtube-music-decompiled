package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ahad extends aihn implements aiis {
    public static final ahad a;
    public int b;
    public long e;
    private byte g = 2;
    public String c = "";
    public String d = "";
    public aiie f = emptyProtobufList();

    static {
        ahad ahadVar = new ahad();
        a = ahadVar;
        aihn.registerDefaultInstance(ahad.class, ahadVar);
    }

    private ahad() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004б", new Object[]{"b", "c", "d", "e", "f", ahac.class});
            case 3:
                return new ahad();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ahad.class);
            default:
                return null;
        }
    }
}
