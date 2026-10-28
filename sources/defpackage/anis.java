package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anis extends aihn implements aiis {
    public static final anis a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        anis anisVar = new anis();
        a = anisVar;
        aihn.registerDefaultInstance(anis.class, anisVar);
    }

    private anis() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0001\u0000쏬ﱖ\uab1f\u0006\u0000\u0000\u0005쏬м\u0000\ueb11ἑм\u0000ﴌ㦜м\u0000\uebde馑м\u0000\ue123鶿<\u0000ﱖ\uab1fм\u0000", new Object[]{"c", "b", aput.class, ajnf.class, anjh.class, aqoh.class, aqoi.class, aliu.class});
            case 3:
                return new anis();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anis.class);
            default:
                return null;
        }
    }
}
