package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akyy extends aihn implements aiis {
    public static final akyy a;
    public static final aihl b;
    public int c;
    public alay d;
    public int f;
    public boolean g;
    public alay i;
    private byte j = 2;
    public aiie e = emptyProtobufList();
    public aigj h = aigj.d;

    static {
        akyy akyyVar = new akyy();
        a = akyyVar;
        aihn.registerDefaultInstance(akyy.class, akyyVar);
        b = aihn.newSingularGeneratedExtension(apji.a, akyyVar, akyyVar, null, 196186429, aika.MESSAGE, akyy.class);
    }

    private akyy() {
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0003\u0001ᐉ\u0000\u0002Л\u0003င\u0001\u0004ဇ\u0002\u0006ည\u0004\u0007ᐉ\u0005", new Object[]{"c", "d", "e", alay.class, "f", "g", "h", "i"});
            case 3:
                return new akyy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akyy.class);
            default:
                return null;
        }
    }
}
