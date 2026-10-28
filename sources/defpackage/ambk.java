package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ambk extends aihn implements aiis {
    public static final ambk a;
    public int b;
    public Object d;
    public apji e;
    public int f;
    public int c = 0;
    private byte h = 2;
    public String g = "";

    static {
        ambk ambkVar = new ambk();
        a = ambkVar;
        aihn.registerDefaultInstance(ambk.class, ambkVar);
    }

    private ambk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002᠌\u0001\u0003;\u0000\u0004ဈ\u0002", new Object[]{"d", "c", "b", "e", "f", alre.q, "g"});
            case 3:
                return new ambk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ambk.class);
            default:
                return null;
        }
    }
}
