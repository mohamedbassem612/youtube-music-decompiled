package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aovx extends aihn implements aiis {
    public static final aovx a;
    public static final aihl b;
    private int f;
    private ajwo g;
    private apji h;
    private byte i = 2;
    public aiie c = emptyProtobufList();
    public aiie d = emptyProtobufList();
    public String e = "";

    static {
        aovx aovxVar = new aovx();
        a = aovxVar;
        aihn.registerDefaultInstance(aovx.class, aovxVar);
        b = aihn.newSingularGeneratedExtension(apjh.a, aovxVar, aovxVar, null, 54681060, aika.MESSAGE, aovx.class);
    }

    private aovx() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\f\u0005\u0000\u0002\u0004\u0001Л\u0002ဈ\u0000\u0004Л\u000bᐉ\u0003\fᐉ\u0004", new Object[]{"f", "c", aovz.class, "e", "d", aovy.class, "g", "h"});
            case 3:
                return new aovx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aovx.class);
            default:
                return null;
        }
    }
}
