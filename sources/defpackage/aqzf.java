package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqzf extends aihn implements aiis {
    public static final aqzf a;
    public static final aihl b;
    public int c;
    public alay e;
    public boolean f;
    private byte j = 2;
    public String d = "";
    public String g = "";
    public String h = "";
    public String i = "";

    static {
        aqzf aqzfVar = new aqzf();
        a = aqzfVar;
        aihn.registerDefaultInstance(aqzf.class, aqzfVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aqzfVar, aqzfVar, null, 99326409, aika.MESSAGE, aqzf.class);
    }

    private aqzf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new aqzf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqzf.class);
            default:
                return null;
        }
    }
}
