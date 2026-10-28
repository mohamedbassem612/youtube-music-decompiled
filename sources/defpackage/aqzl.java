package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqzl extends aihn implements aiis {
    public static final aqzl a;
    public static final aihl b;
    public int c;
    public ajwo f;
    public ajwo g;
    private byte h = 2;
    public String d = "";
    public aiie e = emptyProtobufList();

    static {
        aqzl aqzlVar = new aqzl();
        a = aqzlVar;
        aihn.registerDefaultInstance(aqzl.class, aqzlVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aqzlVar, aqzlVar, null, 371825304, aika.MESSAGE, aqzl.class);
    }

    private aqzl() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0002", new Object[]{"c", "d", "e", apji.class, "f", "g"});
            case 3:
                return new aqzl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqzl.class);
            default:
                return null;
        }
    }
}
