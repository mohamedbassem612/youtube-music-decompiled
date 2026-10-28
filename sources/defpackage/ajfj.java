package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajfj extends aihn implements aiis {
    public static final ajfj a;
    public static final aihl b;
    private int d;
    private ajwo e;
    private ajwo f;
    private ajwo g;
    private byte h = 2;
    public aiie c = emptyProtobufList();

    static {
        ajfj ajfjVar = new ajfj();
        a = ajfjVar;
        aihn.registerDefaultInstance(ajfj.class, ajfjVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ajfjVar, ajfjVar, null, 485207817, aika.MESSAGE, ajfj.class);
    }

    private ajfj() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0001\u0004\u0003Л\u0004ᐉ\u0000\u0005ᐉ\u0001\u0006ᐉ\u0002", new Object[]{"d", "c", aphw.class, "e", "f", "g"});
            case 3:
                return new ajfj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajfj.class);
            default:
                return null;
        }
    }
}
