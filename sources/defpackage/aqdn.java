package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqdn extends aihn implements aiis {
    public static final aqdn a;
    public static final aihl b;
    public int c;
    public Object e;
    public int g;
    public int d = 0;
    public aigj f = aigj.d;
    public String h = "";
    public String i = "";
    public float j = 0.5f;
    public float k = 0.5f;
    public String l = "";

    static {
        aqdn aqdnVar = new aqdn();
        a = aqdnVar;
        aihn.registerDefaultInstance(aqdn.class, aqdnVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aqdnVar, aqdnVar, null, 377377894, aika.MESSAGE, aqdn.class);
    }

    private aqdn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0001\u0001\u0001\n\t\u0000\u0000\u0000\u0001ည\u0000\u0002=\u0000\u0003=\u0000\u0004᠌\u0001\u0005ဈ\u0002\u0006ဈ\u0003\u0007ခ\u0004\bခ\u0005\nဈ\u0007", new Object[]{"e", "d", "c", "f", "g", aqcj.l, "h", "i", "j", "k", "l"});
        }
        if (iOrdinal == 3) {
            return new aqdn();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(aqdn.class);
    }
}
