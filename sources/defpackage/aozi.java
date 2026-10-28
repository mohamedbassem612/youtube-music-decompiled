package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aozi extends aihn implements aiis {
    public static final aozi a;
    private int b;
    private apji c;
    private askp d;
    private aond e;
    private CommandOuterClass$Command f;
    private byte g = 2;

    static {
        aozi aoziVar = new aozi();
        a = aoziVar;
        aihn.registerDefaultInstance(aozi.class, aoziVar);
    }

    private aozi() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0006ᐉ\u0002\tᐉ\u0007", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aozi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aozi.class);
            default:
                return null;
        }
    }
}
