package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apzd extends aihn implements aiis {
    public static final apzd a;
    public static final aihl b;
    public int c;
    public apze d;
    public int e;
    private byte g = 2;
    public aiie f = emptyProtobufList();

    static {
        apzd apzdVar = new apzd();
        a = apzdVar;
        aihn.registerDefaultInstance(apzd.class, apzdVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apzdVar, apzdVar, null, 219530031, aika.MESSAGE, apzd.class);
    }

    private apzd() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဉ\u0000\u0002᠌\u0001\u0003Л", new Object[]{"c", "d", "e", aobi.s, "f", ajwo.class});
            case 3:
                return new apzd();
            case 4:
                return new aihf((int[]) null, (byte[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apzd.class);
            default:
                return null;
        }
    }
}
