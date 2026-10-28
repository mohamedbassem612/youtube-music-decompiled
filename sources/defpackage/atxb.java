package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atxb extends aihn implements aiis {
    public static final atxb a;
    public int b;
    public ahnl c;
    public atsf d;
    public atwx g;
    public atup h;
    public int i;
    private byte k = 2;
    public String e = "";
    public aiie f = emptyProtobufList();
    public aiie j = emptyProtobufList();

    static {
        atxb atxbVar = new atxb();
        a = atxbVar;
        aihn.registerDefaultInstance(atxb.class, atxbVar);
    }

    private atxb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0002\u0002\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ለ\u0002\u0004\u001b\u0005ဉ\u0003\u0006ᐉ\u0004\u0007င\u0005\bȚ", new Object[]{"b", "c", "d", "e", "f", atxa.class, "g", "h", "i", "j"});
            case 3:
                return new atxb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(atxb.class);
            default:
                return null;
        }
    }
}
