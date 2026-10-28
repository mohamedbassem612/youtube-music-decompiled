package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alnu extends aihn implements aiis {
    public static final alnu a;
    public int b;
    public alop c;
    public alnv d;
    public alna f;
    public boolean g;
    public boolean h;
    public apok i;
    private albe j;
    private byte k = 2;
    public aiie e = emptyProtobufList();

    static {
        alnu alnuVar = new alnu();
        a = alnuVar;
        aihn.registerDefaultInstance(alnu.class, alnuVar);
    }

    private alnu() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001̉\b\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004Л\u0005ᐉ\u0002\bဇ\u0005\tဇ\u0006\nᐉ\u0007̉ᐉ\b", new Object[]{"b", "c", "d", "e", ajwo.class, "f", "g", "h", "i", "j"});
            case 3:
                return new alnu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alnu.class);
            default:
                return null;
        }
    }
}
