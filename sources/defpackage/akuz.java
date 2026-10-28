package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akuz extends aihn implements aiis {
    public static final akuz a;
    public static final aihl b;
    public aqnk c;
    private int e;
    private byte f = 2;
    public aiie d = emptyProtobufList();

    static {
        akuz akuzVar = new akuz();
        a = akuzVar;
        aihn.registerDefaultInstance(akuz.class, akuzVar);
        b = aihn.newSingularGeneratedExtension(albe.a, akuzVar, akuzVar, null, 1, aika.MESSAGE, akuz.class);
    }

    private akuz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000", new Object[]{"e", "d", akvh.class, "c"});
            case 3:
                return new akuz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akuz.class);
            default:
                return null;
        }
    }
}
