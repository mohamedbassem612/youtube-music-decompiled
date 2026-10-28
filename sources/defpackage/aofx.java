package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aofx extends aihn implements aiis {
    public static final aofx a;
    public static final aihl b;
    public int c;
    public int e;
    public apji f;
    public aodn h;
    private ajwo i;
    private byte j = 2;
    public String d = "";
    public aiie g = emptyProtobufList();

    static {
        aofx aofxVar = new aofx();
        a = aofxVar;
        aihn.registerDefaultInstance(aofx.class, aofxVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aofxVar, aofxVar, null, 73082583, aika.MESSAGE, aofx.class);
    }

    private aofx() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0003\u0001ဈ\u0000\u0002᠌\u0001\u0004ᐉ\u0003\u0005Л\u0006ဉ\u0004\u0007ᐉ\u0005", new Object[]{"c", "d", "e", aofw.a, "f", "g", ajwo.class, "h", "i"});
            case 3:
                return new aofx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aofx.class);
            default:
                return null;
        }
    }
}
