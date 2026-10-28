package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asqc extends aihn implements aiis {
    public static final asqc a;
    private int b;
    private ajnc c;
    private CommandOuterClass$Command d;
    private CommandOuterClass$Command e;
    private apji f;
    private byte g = 2;

    static {
        asqc asqcVar = new asqc();
        a = asqcVar;
        aihn.registerDefaultInstance(asqc.class, asqcVar);
    }

    private asqc() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0003\u0016\u0004\u0000\u0000\u0004\u0003ᐉ\u0003\u0005ᐉ\u0007\u0010ᐉ\t\u0016ᐉ\r", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new asqc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asqc.class);
            default:
                return null;
        }
    }
}
