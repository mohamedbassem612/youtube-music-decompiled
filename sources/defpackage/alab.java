package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alab extends aihi implements aihj {
    public static final alab a;
    public int b;
    public boolean g;
    public boolean h;
    public boolean i;
    public alaa k;
    public aiip f = aiip.a;
    private byte l = 2;
    public String c = "";
    public String d = "";
    public aiie e = emptyProtobufList();

    static {
        alab alabVar = new alab();
        a = alabVar;
        aihn.registerDefaultInstance(alab.class, alabVar);
    }

    private alab() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                aika aikaVar = aika.STRING;
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0001\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u00042\u0005ᐉ\u0005\u0006ဇ\u0002\u0007ဇ\u0003\bဇ\u0004", new Object[]{"b", "c", "d", "e", "f", new ahud(aikaVar, "", aikaVar, ""), "k", "g", "h", "i"});
            case 3:
                return new alab();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alab.class);
            default:
                return null;
        }
    }
}
