package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aojn extends aihn implements aiis {
    public static final aojn a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public akjx n;
    public int o;
    public boolean p;
    public int q;
    public int r;
    private int s;
    private byte t = 2;

    static {
        aojn aojnVar = new aojn();
        a = aojnVar;
        aihn.registerDefaultInstance(aojn.class, aojnVar);
    }

    private aojn() {
        emptyIntList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                this.t = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0010\u0000\u0002\u001bG\u0010\u0000\u0000\u0000\u001bဇ\u0014\u001dဇ\u0016%ဇ\u001e'ဇ -ဇ%1ဇ)2ဇ*4ဇ+7ဇ-:ဂ0;ဂ1>ဉ3?င4@ဇ5Fင:Gင;", new Object[]{"s", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"});
            case 3:
                return new aojn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aojn.class);
            default:
                return null;
        }
    }
}
