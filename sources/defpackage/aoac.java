package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aoac extends aihn implements aiis {
    public static final aoac a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private ajwo f;
    private angb g;
    private aoab h;
    private byte i = 2;

    static {
        aoac aoacVar = new aoac();
        a = aoacVar;
        aihn.registerDefaultInstance(aoac.class, aoacVar);
    }

    private aoac() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\n\u0006\u0000\u0000\u0006\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0005\u0006ᐉ\u0006\tᐉ\t\nᐉ\u0003", new Object[]{"b", "c", "d", "f", "g", "h", "e"});
            case 3:
                return new aoac();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoac.class);
            default:
                return null;
        }
    }
}
