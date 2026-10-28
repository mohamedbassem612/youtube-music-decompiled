package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ammk extends aihn implements aiis {
    public static final ammk a;
    public static final aihl b;
    public amrb c;
    public long d;
    private int e;
    private byte f = 2;

    static {
        ammk ammkVar = new ammk();
        a = ammkVar;
        aihn.registerDefaultInstance(ammk.class, ammkVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ammkVar, ammkVar, null, 132845915, aika.MESSAGE, ammk.class);
    }

    private ammk() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဂ\u0001", new Object[]{"e", "c", "d"});
            case 3:
                return new ammk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ammk.class);
            default:
                return null;
        }
    }
}
