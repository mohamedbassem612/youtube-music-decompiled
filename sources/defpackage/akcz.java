package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akcz extends aihn implements aiis {
    public static final akcz a;
    private int b;
    private CommandOuterClass$Command c;
    private byte d = 2;

    static {
        akcz akczVar = new akcz();
        a = akczVar;
        aihn.registerDefaultInstance(akcz.class, akczVar);
    }

    private akcz() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0001", new Object[]{"b", "c"});
            case 3:
                return new akcz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akcz.class);
            default:
                return null;
        }
    }
}
