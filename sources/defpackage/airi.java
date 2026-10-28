package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class airi extends aihn implements aiis {
    public static final airi a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        airi airiVar = new airi();
        a = airiVar;
        aihn.registerDefaultInstance(airi.class, airiVar);
    }

    private airi() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\ueeecḿ\ued6a▻\u0002\u0000\u0000\u0002\ueeecḿм\u0000\ued6a▻м\u0000", new Object[]{"c", "b", airg.class, akbg.class});
            case 3:
                return new airi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(airi.class);
            default:
                return null;
        }
    }
}
