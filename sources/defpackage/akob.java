package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class akob extends aihn implements aiis {
    public static final akob a;
    public int b;
    public boolean e;
    private apji f;
    private byte g = 2;
    public aiie c = emptyProtobufList();
    public String d = "";

    static {
        akob akobVar = new akob();
        a = akobVar;
        aihn.registerDefaultInstance(akob.class, akobVar);
    }

    private akob() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0001\u0002\u0001Л\u0002ဈ\u0000\u0007ဇ\u0006\bᐉ\u0003", new Object[]{"b", "c", akny.class, "d", "e", "f"});
            case 3:
                return new akob();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akob.class);
            default:
                return null;
        }
    }
}
