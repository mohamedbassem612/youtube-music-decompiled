package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akfr extends aihn implements aiis {
    public static final akfr a;
    public static final aihl b;
    private int f;
    private byte g = 2;
    public String c = "";
    public aiie d = emptyProtobufList();
    public aiie e = emptyProtobufList();

    static {
        akfr akfrVar = new akfr();
        a = akfrVar;
        aihn.registerDefaultInstance(akfr.class, akfrVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, akfrVar, akfrVar, null, 90198251, aika.MESSAGE, akfr.class);
    }

    private akfr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0002\u0001ဈ\u0000\u0002Л\u0003Л", new Object[]{"f", "c", "d", ajwo.class, "e", ajwo.class});
            case 3:
                return new akfr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akfr.class);
            default:
                return null;
        }
    }
}
