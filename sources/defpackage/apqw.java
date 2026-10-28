package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class apqw extends aihn implements aiis {
    public static final apqw a;
    public int b;
    public alay c;
    public int e;
    public aigj f;
    private apji h;
    private alay i;
    private ajwo j;
    private byte k = 2;
    private String g = "";
    public aiie d = emptyProtobufList();

    static {
        apqw apqwVar = new apqw();
        a = apqwVar;
        aihn.registerDefaultInstance(apqw.class, apqwVar);
    }

    private apqw() {
        emptyProtobufList();
        this.f = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0001\u0005\u0001ᐉ\u0001\u0002ᐉ\u0003\u0003ᐉ\u0004\u0004Л\u0006᠌\u0006\u0007ဈ\u0000\tည\b\fᐉ\u0002", new Object[]{"b", "c", "i", "j", "d", apqu.class, "e", apjs.u, "g", "f", "h"});
            case 3:
                return new apqw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apqw.class);
            default:
                return null;
        }
    }
}
