package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anwz extends aihn implements aiis {
    public static final anwz a;
    public static final aihl b;
    private int f;
    private byte g = 2;
    public aiie c = emptyProtobufList();
    public aiie d = emptyProtobufList();
    public aigj e = aigj.d;

    static {
        anwz anwzVar = new anwz();
        a = anwzVar;
        aihn.registerDefaultInstance(anwz.class, anwzVar);
        b = aihn.newSingularGeneratedExtension(apji.a, anwzVar, anwzVar, null, 217934217, aika.MESSAGE, anwz.class);
    }

    private anwz() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0002\u0001Л\u0002Л\u0004ည\u0001", new Object[]{"f", "c", apji.class, "d", apji.class, "e"});
            case 3:
                return new anwz();
            case 4:
                return new aihf((float[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anwz.class);
            default:
                return null;
        }
    }
}
