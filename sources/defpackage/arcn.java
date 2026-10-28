package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arcn extends aihn implements aiis {
    public static final arcn a;
    private int b;
    private CommandOuterClass$Command c;
    private apji d;
    private apji e;
    private apji f;
    private apji g;
    private byte h = 2;

    static {
        arcn arcnVar = new arcn();
        a = arcnVar;
        aihn.registerDefaultInstance(arcn.class, arcnVar);
    }

    private arcn() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0004\t\u0005\u0000\u0000\u0005\u0004ᐉ\u0002\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\u0004", new Object[]{"b", "c", "e", "f", "g", "d"});
            case 3:
                return new arcn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arcn.class);
            default:
                return null;
        }
    }
}
