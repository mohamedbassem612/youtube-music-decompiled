package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ammw extends aihn implements aiis {
    public static final ammw a;
    public static final aihl b;
    public long d;
    private int e;
    private byte f = 2;
    public aiie c = emptyProtobufList();

    static {
        ammw ammwVar = new ammw();
        a = ammwVar;
        aihn.registerDefaultInstance(ammw.class, ammwVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ammwVar, ammwVar, null, 145132565, aika.MESSAGE, ammw.class);
    }

    private ammw() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဂ\u0000", new Object[]{"e", "c", ajwo.class, "d"});
            case 3:
                return new ammw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ammw.class);
            default:
                return null;
        }
    }
}
