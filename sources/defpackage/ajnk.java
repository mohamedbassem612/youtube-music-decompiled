package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajnk extends aihn implements aiis {
    public static final ajnk a;
    private int b;
    private alay c;
    private ajwo d;
    private byte e = 2;

    static {
        ajnk ajnkVar = new ajnk();
        a = ajnkVar;
        aihn.registerDefaultInstance(ajnk.class, ajnkVar);
    }

    private ajnk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d"});
            case 3:
                return new ajnk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajnk.class);
            default:
                return null;
        }
    }
}
