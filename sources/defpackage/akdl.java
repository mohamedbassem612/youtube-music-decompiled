package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akdl extends aihn implements aiis {
    public static final akdl a;
    private int b;
    private alay c;
    private alay d;
    private ajwo e;
    private apji f;
    private byte g = 2;

    static {
        akdl akdlVar = new akdl();
        a = akdlVar;
        aihn.registerDefaultInstance(akdl.class, akdlVar);
    }

    private akdl() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\f\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003\fᐉ\t", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new akdl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akdl.class);
            default:
                return null;
        }
    }
}
