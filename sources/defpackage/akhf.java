package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akhf extends aihn implements aiis {
    public static final akhf a;
    public static final aihl b;
    public int c;
    public akhg d;
    public akhh e;
    private byte f = 2;

    static {
        akhf akhfVar = new akhf();
        a = akhfVar;
        aihn.registerDefaultInstance(akhf.class, akhfVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, akhfVar, akhfVar, null, 1478, aika.MESSAGE, akhf.class);
    }

    private akhf() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new akhf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akhf.class);
            default:
                return null;
        }
    }
}
