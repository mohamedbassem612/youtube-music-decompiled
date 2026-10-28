package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqhl extends aihn implements aiis {
    public static final aqhl a;
    public int b;
    public Object d;
    public aqhm f;
    public apji i;
    public apji j;
    public apji k;
    public aqhp l;
    public int c = 0;
    private byte m = 2;
    public String e = "";
    public aiie g = emptyProtobufList();
    public String h = "";

    static {
        aqhl aqhlVar = new aqhl();
        a = aqhlVar;
        aihn.registerDefaultInstance(aqhl.class, aqhlVar);
    }

    private aqhl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0001\u0006\u0001ဈ\u0003\u0002ᐉ\u0004\u0003ᐉ\u0005\u0004ᐉ\u0006\u0005м\u0000\u0006м\u0000\u0007ဉ\u0007\bဈ\u0000\tᐉ\u0001\n\u001b", new Object[]{"d", "c", "b", "h", "i", "j", "k", aqhn.class, ajwo.class, "l", "e", "f", "g", aqhs.class});
            case 3:
                return new aqhl();
            case 4:
                return new aihf((float[][]) null, (byte[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqhl.class);
            default:
                return null;
        }
    }
}
