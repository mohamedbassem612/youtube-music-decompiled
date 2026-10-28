package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akdk extends aihn implements aiis {
    public static final akdk a;
    private int b;
    private alay c;
    private ajng d;
    private alay e;
    private ajwo f;
    private alay g;
    private ajwo h;
    private angb i;
    private byte j = 2;

    static {
        akdk akdkVar = new akdk();
        a = akdkVar;
        aihn.registerDefaultInstance(akdk.class, akdkVar);
    }

    private akdk() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\f\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0003ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\n\nᐉ\u0006\u000bᐉ\u0007\fᐉ\u000b", new Object[]{"b", "c", "d", "e", "h", "f", "g", "i"});
            case 3:
                return new akdk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akdk.class);
            default:
                return null;
        }
    }
}
