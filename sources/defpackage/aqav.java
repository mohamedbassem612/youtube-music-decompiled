package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aqav extends aihn implements aiis {
    public static final aqav a;
    public int b;
    public Object d;
    public boolean f;
    private apji g;
    private ajkc h;
    public int c = 0;
    private byte i = 2;
    public String e = "";

    static {
        aqav aqavVar = new aqav();
        a = aqavVar;
        aihn.registerDefaultInstance(aqav.class, aqavVar);
    }

    private aqav() {
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
                return newMessageInfo(a, "\u0001\u0007\u0001\u0001\u0001\u0011\u0007\u0000\u0000\u0005\u0001ဈ\u0000\u0002ဇ\u0002\u0003м\u0000\u0005м\u0000\u0006м\u0000\tᐉ\u0007\u0011ᐉ\f", new Object[]{"d", "c", "b", "e", "f", aqax.class, ajwo.class, ajwo.class, "g", "h"});
            case 3:
                return new aqav();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqav.class);
            default:
                return null;
        }
    }
}
