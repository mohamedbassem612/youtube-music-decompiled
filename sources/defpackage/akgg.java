package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akgg extends aihn implements aiis {
    public static final akgg a;
    public static final aihl b;
    public int c;
    public alay e;
    public boolean f;
    public long i;
    public int j;
    private byte o = 2;
    public String d = "";
    public String g = "";
    public String h = "";
    public String k = "";
    public aiie l = emptyProtobufList();
    public String m = "";
    public String n = "";

    static {
        akgg akggVar = new akgg();
        a = akggVar;
        aihn.registerDefaultInstance(akgg.class, akggVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, akggVar, akggVar, null, 68212148, aika.MESSAGE, akgg.class);
    }

    private akgg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007င\u0006\bဈ\u0007\t\u001a\nဈ\b\u000bဈ\t", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
            case 3:
                return new akgg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akgg.class);
            default:
                return null;
        }
    }
}
