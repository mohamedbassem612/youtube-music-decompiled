package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anuz extends aihn implements aiis {
    public static final anuz a;
    public static final aihl b;
    public int c;
    public apji e;
    public apji g;
    public apji h;
    public apji i;
    public int j;
    public aiie k;
    private byte l = 2;
    public String d = "";
    public aiie f = emptyProtobufList();

    static {
        anuz anuzVar = new anuz();
        a = anuzVar;
        aihn.registerDefaultInstance(anuz.class, anuzVar);
        b = aihn.newSingularGeneratedExtension(apjh.a, anuzVar, anuzVar, null, 175617300, aika.MESSAGE, anuz.class);
    }

    private anuz() {
        aigj aigjVar = aigj.d;
        this.k = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0002\u0006\u0001ဈ\u0000\u0002ᐉ\u0001\u0003Л\u0004င\u0007\bᐉ\u0005\nЛ\u000bᐉ\u0002\fᐉ\u0006", new Object[]{"c", "d", "e", "f", apji.class, "j", "h", "k", anva.class, "g", "i"});
            case 3:
                return new anuz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anuz.class);
            default:
                return null;
        }
    }
}
