package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aofg extends aihi implements aihj {
    public static final aihw a = new aiat(16);
    public static final aofg b;
    public int c;
    public int d;
    public aofa g;
    private ajwo h;
    private byte i = 2;
    public aihv e = emptyIntList();
    public aihv f = emptyIntList();

    static {
        aofg aofgVar = new aofg();
        b = aofgVar;
        aihn.registerDefaultInstance(aofg.class, aofgVar);
    }

    private aofg() {
    }

    public final void d() {
        aihv aihvVar = this.e;
        if (aihvVar.c()) {
            return;
        }
        this.e = aihn.mutableCopy(aihvVar);
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
                return newMessageInfo(b, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0001\u0001င\u0000\u0002ࠞ\u0003\u0016\u0004ဉ\u0001\u0005ᐉ\u0002", new Object[]{"c", "d", "e", aocm.n, "f", "g", "h"});
            case 3:
                return new aofg();
            case 4:
                return new aihh(b);
            case 5:
                return b;
            case 6:
                return aihn.getParserForClass(aofg.class);
            default:
                return null;
        }
    }

    public final void e() {
        aihv aihvVar = this.f;
        if (aihvVar.c()) {
            return;
        }
        this.f = aihn.mutableCopy(aihvVar);
    }
}
