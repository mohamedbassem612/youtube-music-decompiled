package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqsn extends aihn implements aiis {
    public static final aqsn a;
    public int b;
    public aqsa c;
    public aqsf d;
    public aqst e;
    public aqss f;
    public aqrw g;
    private aqsc h;
    private aqry i;
    private byte j = 2;

    static {
        aqsn aqsnVar = new aqsn();
        a = aqsnVar;
        aihn.registerDefaultInstance(aqsn.class, aqsnVar);
    }

    private aqsn() {
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
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\ue084⦔\uf5e5族\u0007\u0000\u0000\u0007\ue084⦔ᐉ\u0004\uee27⦜ᐉ\u0001\uee6f⦽ᐉ\u0000\uee75㿤ᐉ\u0002זּ䘞ᐉ\u0006\uf281冯ᐉ\u0007\uf5e5族ᐉ\u0005", new Object[]{"b", "e", "c", "h", "d", "i", "g", "f"});
            case 3:
                return new aqsn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqsn.class);
            default:
                return null;
        }
    }
}
