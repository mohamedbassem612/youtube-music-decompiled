package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aovy extends aihn implements aiis {
    public static final aovy a;
    public int b;
    public aobx c;
    public aoyh d;
    private byte e = 2;

    static {
        aovy aovyVar = new aovy();
        a = aovyVar;
        aihn.registerDefaultInstance(aovy.class, aovyVar);
    }

    private aovy() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\ueee9ᣑ\ueeedᣑ\u0002\u0000\u0000\u0001\ueee9ᣑᐉ\u0000\ueeedᣑဉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new aovy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aovy.class);
            default:
                return null;
        }
    }
}
