package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asch extends aihn implements aiis {
    public static final asch a;
    public int b;
    public anuu c;
    public ascf e;
    public boolean f;
    public boolean g;
    public int i;
    public anqt j;
    public float k;
    public aiip h = aiip.a;
    private byte l = 2;
    public aiie d = emptyProtobufList();

    static {
        asch aschVar = new asch();
        a = aschVar;
        aihn.registerDefaultInstance(asch.class, aschVar);
    }

    private asch() {
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
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\t\t\u0001\u0001\u0002\u0001ᐉ\u0000\u0002Л\u0003ဉ\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u00062\u0007ဌ\u0004\bဉ\u0005\tခ\u0006", new Object[]{"b", "c", "d", anzd.class, "e", "f", "g", "h", new ahud(aika.STRING, "", aika.MESSAGE, areu.a), "i", "j", "k"});
            case 3:
                return new asch();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asch.class);
            default:
                return null;
        }
    }
}
