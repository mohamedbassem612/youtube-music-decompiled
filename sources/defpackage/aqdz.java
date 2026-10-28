package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqdz extends aihn implements aiis {
    public static final aqdz a;
    private int b;
    private aqdy c;
    private apji d;
    private apji e;
    private apji f;
    private CommandOuterClass$Command g;
    private CommandOuterClass$Command h;
    private byte i = 2;

    static {
        aqdz aqdzVar = new aqdz();
        a = aqdzVar;
        aihn.registerDefaultInstance(aqdz.class, aqdzVar);
    }

    private aqdz() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0003\u0011\u0006\u0000\u0000\u0006\u0003ᐉ\u0002\u0004ᐉ\u0001\bᐉ\u0003\fᐉ\u0005\rᐉ\u0006\u0011ᐉ\u0004", new Object[]{"b", "d", "c", "e", "g", "h", "f"});
            case 3:
                return new aqdz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqdz.class);
            default:
                return null;
        }
    }
}
