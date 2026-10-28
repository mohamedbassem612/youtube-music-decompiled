package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class appe extends aihn implements aiis {
    public static final appe a;
    public static final aihl b;
    private int d;
    private ajwo e;
    private ajwo f;
    private byte g = 2;
    public aiie c = emptyProtobufList();

    static {
        appe appeVar = new appe();
        a = appeVar;
        aihn.registerDefaultInstance(appe.class, appeVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, appeVar, appeVar, null, 77196420, aika.MESSAGE, appe.class);
    }

    private appe() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001Л\u0003ᐉ\u0001\u0004ᐉ\u0002", new Object[]{"d", "c", aisd.class, "e", "f"});
            case 3:
                return new appe();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(appe.class);
            default:
                return null;
        }
    }
}
