package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ammq extends aihn implements aiis {
    public static final ammq a;
    public static final aihl b;
    private byte c = 2;

    static {
        ammq ammqVar = new ammq();
        a = ammqVar;
        aihn.registerDefaultInstance(ammq.class, ammqVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ammqVar, ammqVar, null, 220358198, aika.MESSAGE, ammq.class);
    }

    private ammq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0000", null);
            case 3:
                return new ammq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ammq.class);
            default:
                return null;
        }
    }
}
