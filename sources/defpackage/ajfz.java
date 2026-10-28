package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajfz extends aihn implements aiis {
    public static final ajfz a;
    public static final aihl b;
    public int c;
    public aiie d;
    public aiie e;
    public String f;
    private byte g = 2;

    static {
        ajfz ajfzVar = new ajfz();
        a = ajfzVar;
        aihn.registerDefaultInstance(ajfz.class, ajfzVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ajfzVar, ajfzVar, null, 437088376, aika.MESSAGE, ajfz.class);
    }

    private ajfz() {
        emptyProtobufList();
        this.d = emptyProtobufList();
        this.e = emptyProtobufList();
        this.f = "";
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0002\u0001\u0002Л\u0003ဈ\u0000\u0005\u001b", new Object[]{"c", "d", ajfy.class, "f", "e", aqyu.class});
            case 3:
                return new ajfz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajfz.class);
            default:
                return null;
        }
    }
}
