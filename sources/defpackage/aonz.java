package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aonz extends aihn implements aiis {
    public static final aonz a;
    private int b;
    private ajwo c;
    private ajwo d;
    private ajwo e;
    private ajwo f;
    private ajwo g;
    private byte h = 2;

    static {
        aonz aonzVar = new aonz();
        a = aonzVar;
        aihn.registerDefaultInstance(aonz.class, aonzVar);
    }

    private aonz() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0006\n\u0005\u0000\u0000\u0005\u0006ᐉ\u0003\u0007ᐉ\u0004\bᐉ\u0005\tᐉ\u0006\nᐉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new aonz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aonz.class);
            default:
                return null;
        }
    }
}
