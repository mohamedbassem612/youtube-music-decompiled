package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class akvl extends aihn implements aiis {
    public static final akvl a;
    private int b;
    private ajwo c;
    private alay d;
    private alay e;
    private apji f;
    private angb g;
    private ajwo h;
    private byte i = 2;

    static {
        akvl akvlVar = new akvl();
        a = akvlVar;
        aihn.registerDefaultInstance(akvl.class, akvlVar);
    }

    private akvl() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0004\u0019\u0006\u0000\u0000\u0006\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\tᐉ\t\nᐉ\n\u0019ᐉ\u0007", new Object[]{"b", "c", "d", "e", "g", "h", "f"});
            case 3:
                return new akvl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akvl.class);
            default:
                return null;
        }
    }
}
