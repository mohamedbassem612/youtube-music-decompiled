package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atxw extends aihn implements aiis {
    public static final atxw a;
    public static final aihl b;
    public int c;
    private ahaa e;
    private byte f = 2;
    public String d = "";

    static {
        atxw atxwVar = new atxw();
        a = atxwVar;
        aihn.registerDefaultInstance(atxw.class, atxwVar);
        b = aihn.newSingularGeneratedExtension(atxu.a, atxwVar, atxwVar, null, 27423252, aika.MESSAGE, atxw.class);
    }

    private atxw() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0006ᐉ\u0002", new Object[]{"c", "d", "e"});
            case 3:
                return new atxw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(atxw.class);
            default:
                return null;
        }
    }
}
