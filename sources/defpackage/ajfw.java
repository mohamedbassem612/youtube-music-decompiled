package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajfw extends aihn implements aiis {
    public static final ajfw a;
    public static final aihl b;
    public int c;
    public int f;
    public int g;
    private byte i = 2;
    public String d = "";
    public String e = "";
    public aiie h = emptyProtobufList();

    static {
        ajfw ajfwVar = new ajfw();
        a = ajfwVar;
        aihn.registerDefaultInstance(ajfw.class, ajfwVar);
        b = aihn.newSingularGeneratedExtension(akvi.a, ajfwVar, ajfwVar, null, 364, aika.MESSAGE, ajfw.class);
    }

    private ajfw() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004င\u0003\u0005Л", new Object[]{"c", "d", "e", "f", aixp.q, "g", "h", ajfv.class});
            case 3:
                return new ajfw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajfw.class);
            default:
                return null;
        }
    }
}
