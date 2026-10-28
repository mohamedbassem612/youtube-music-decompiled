package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class appo extends aihn implements aiis {
    public static final appo a;
    public static final aihl b;
    public int c;
    public almy d;
    public almw e;
    public almv f;
    private byte g = 2;

    static {
        appo appoVar = new appo();
        a = appoVar;
        aihn.registerDefaultInstance(appo.class, appoVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, appoVar, appoVar, null, 92310068, aika.MESSAGE, appo.class);
    }

    private appo() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0004ᐉ\u0002", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new appo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(appo.class);
            default:
                return null;
        }
    }
}
