package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akaj extends aihn implements aiis {
    public static final akaj a;
    public static final aihl b;
    public int c;
    public ajwo g;
    public ajwo h;
    public ajwo i;
    public boolean j;
    public akak k;
    private byte l = 2;
    public String d = "";
    public String e = "";
    public aiie f = emptyProtobufList();

    static {
        akaj akajVar = new akaj();
        a = akajVar;
        aihn.registerDefaultInstance(akaj.class, akajVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, akajVar, akajVar, null, 354960961, aika.MESSAGE, akaj.class);
    }

    private akaj() {
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
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\t\b\u0000\u0001\u0003\u0001ဈ\u0001\u0002\u001a\u0003ᐉ\u0004\u0004ဇ\u0005\u0005ᐉ\u0002\u0006ဈ\u0000\bᐉ\u0003\tဉ\u0007", new Object[]{"c", "e", "f", "i", "j", "g", "d", "h", "k"});
            case 3:
                return new akaj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akaj.class);
            default:
                return null;
        }
    }
}
