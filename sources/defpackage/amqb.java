package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amqb extends aihn implements aiis {
    public static final amqb a;
    public int b;
    public alay d;
    public alay e;
    public int i;
    public aiip f = aiip.a;
    private byte j = 2;
    public String c = "";
    public String g = "";
    public String h = "";

    static {
        amqb amqbVar = new amqb();
        a = amqbVar;
        aihn.registerDefaultInstance(amqb.class, amqbVar);
    }

    private amqb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0000\u0003\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004в\u0005ဈ\u0003\u0006ဈ\u0004\u0007င\u0005", new Object[]{"b", "c", "d", "e", "f", new ahud(aika.INT32, (Object) 0, aika.MESSAGE, (Object) amqa.a), "g", "h", "i"});
            case 3:
                return new amqb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amqb.class);
            default:
                return null;
        }
    }
}
