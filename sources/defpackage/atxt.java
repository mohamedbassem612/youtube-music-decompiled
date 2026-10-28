package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atxt extends aihn implements aiis {
    public static final atxt a;
    public static final aihl b;
    public int c;
    public String d = "";
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;

    static {
        atxt atxtVar = new atxt();
        a = atxtVar;
        aihn.registerDefaultInstance(atxt.class, atxtVar);
        b = aihn.newSingularGeneratedExtension(atxu.a, atxtVar, atxtVar, null, 294000, aika.MESSAGE, atxt.class);
    }

    private atxt() {
        emptyProtobufList();
        emptyProtobufList();
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        emptyProtobufList();
        this.i = "";
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0010\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0004\bဈ\u0002\tဈ\u0003\u000bဈ\u0006\u0010ဈ\u000b", new Object[]{"c", "d", "g", "e", "f", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new atxt();
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
        return aihn.getParserForClass(atxt.class);
    }
}
