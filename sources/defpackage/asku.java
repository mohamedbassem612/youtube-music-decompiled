package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asku extends aihn implements aiis {
    public static final asku a;
    public int b;
    public Object d;
    public int e;
    public int f;
    public float h;
    public int i;
    public int j;
    public boolean k;
    public askv l;
    public float m;
    public int n;
    public int o;
    public int c = 0;
    private byte p = 2;
    public String g = "";

    static {
        asku askuVar = new asku();
        a = askuVar;
        aihn.registerDefaultInstance(asku.class, askuVar);
    }

    private asku() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                aiht aihtVar = asel.p;
                return newMessageInfo(a, "\u0001\r\u0001\u0001\u0001\u000e\r\u0000\u0000\u0001\u0001ဋ\u0000\u0002ဋ\u0001\u0004ခ\u0004\u0005ဋ\u0007\u0006᠌\b\u0007>\u0000\b\u083f\u0000\tဇ\t\nᐉ\u000b\u000bခ\f\f᠌\r\r᠌\u000e\u000eဈ\u0003", new Object[]{"d", "c", "b", "e", "f", "h", "i", "j", aihtVar, asel.n, "k", "l", "m", "n", aihtVar, "o", asel.l, "g"});
            case 3:
                return new asku();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asku.class);
            default:
                return null;
        }
    }
}
