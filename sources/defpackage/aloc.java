package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aloc extends aihn implements aiis {
    public static final aloc a;
    public int b;
    public alop c;
    public alod d;
    public alna f;
    public boolean g;
    private albe h;
    private byte i = 2;
    public aiie e = emptyProtobufList();

    static {
        aloc alocVar = new aloc();
        a = alocVar;
        aihn.registerDefaultInstance(aloc.class, alocVar);
    }

    private aloc() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001̉\u0006\u0000\u0001\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004Л\u0005ᐉ\u0002\bဇ\u0005̉ᐉ\u0006", new Object[]{"b", "c", "d", "e", ajwo.class, "f", "g", "h"});
            case 3:
                return new aloc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aloc.class);
            default:
                return null;
        }
    }
}
