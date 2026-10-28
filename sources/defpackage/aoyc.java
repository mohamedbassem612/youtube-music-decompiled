package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoyc extends aihn implements aiis {
    public static final aoyc a;
    public static final aihl b;
    public int c;
    public int f;
    public aojv h;
    public arig i;
    public float k;
    public String d = "";
    public String e = "";
    public String g = "";
    public aigj j = aigj.d;
    public String l = "";

    static {
        aoyc aoycVar = new aoyc();
        a = aoycVar;
        aihn.registerDefaultInstance(aoyc.class, aoycVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aoycVar, aoycVar, null, 387205844, aika.MESSAGE, aoyc.class);
    }

    private aoyc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0000\u0001\u0002\u0015\t\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005ဈ\u0004\u0006ဉ\u0006\u0007ဉ\u0007\tခ\n\u000bည\b\u0015ဈ\u0014", new Object[]{"c", "d", "e", "f", "g", "h", "i", "k", "j", "l"});
        }
        if (iOrdinal == 3) {
            return new aoyc();
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
        return aihn.getParserForClass(aoyc.class);
    }
}
