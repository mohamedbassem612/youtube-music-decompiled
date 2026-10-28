package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akgk extends aihn implements aiis {
    public static final akgk a;
    public static final aihl b;
    public int c;
    public Object e;
    public int d = 0;
    private byte i = 2;
    public aiie f = emptyProtobufList();
    public String g = "";
    public String h = "";

    static {
        akgk akgkVar = new akgk();
        a = akgkVar;
        aihn.registerDefaultInstance(akgk.class, akgkVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, akgkVar, akgkVar, null, 85650004, aika.MESSAGE, akgk.class);
    }

    private akgk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001\t\u0004\u0000\u0001\u0001\u0001\u001a\u0002ဈ\u0000\u0007ဈ\u0002\tм\u0000", new Object[]{"e", "d", "c", "f", "g", "h", apji.class});
            case 3:
                return new akgk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akgk.class);
            default:
                return null;
        }
    }
}
