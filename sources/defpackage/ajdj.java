package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajdj extends aihn implements aiis {
    public static final ajdj a;
    public static final aihl b;
    public int c;
    public aqej h;
    private byte i = 2;
    public aiie d = emptyProtobufList();
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        ajdj ajdjVar = new ajdj();
        a = ajdjVar;
        aihn.registerDefaultInstance(ajdj.class, ajdjVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ajdjVar, ajdjVar, null, 106983893, aika.MESSAGE, ajdj.class);
    }

    private ajdj() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0002\u0001Л\u0002ဈ\u0000\u0004ဈ\u0001\u0006ဈ\u0002\u0007ᐉ\u0003", new Object[]{"c", "d", amgu.class, "e", "f", "g", "h"});
            case 3:
                return new ajdj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajdj.class);
            default:
                return null;
        }
    }
}
