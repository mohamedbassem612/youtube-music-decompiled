package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akgl extends aihn implements aiis {
    public static final akgl a;
    public static final aihl b;
    public int c;
    public int h;
    public aiie d = emptyProtobufList();
    public String e = "";
    public String f = "";
    public String g = "";
    public String i = "";

    static {
        akgl akglVar = new akgl();
        a = akglVar;
        aihn.registerDefaultInstance(akgl.class, akglVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, akglVar, akglVar, null, 124747980, aika.MESSAGE, akgl.class);
    }

    private akgl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u0006᠌\u0003\u0007ဈ\u0004", new Object[]{"c", "d", "e", "f", "g", "h", aobi.o, "i"});
        }
        if (iOrdinal == 3) {
            return new akgl();
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
        return aihn.getParserForClass(akgl.class);
    }
}
