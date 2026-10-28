package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajso extends aihn implements aiis {
    public static final ajso a;
    private int b;
    private askp c;
    private apji d;
    private apji e;
    private askp f;
    private apji g;
    private apji h;
    private CommandOuterClass$Command i;
    private CommandOuterClass$Command j;
    private apji k;
    private arne l;
    private apji m;
    private apji n;
    private byte o = 2;

    static {
        ajso ajsoVar = new ajso();
        a = ajsoVar;
        aihn.registerDefaultInstance(ajso.class, ajsoVar);
    }

    private ajso() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\f\u0000\u0001\u0001\u0014\f\u0000\u0000\f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0005\u0006ᐉ\u0007\u0007ᐉ\b\tᐉ\n\rᐉ\u000b\u000eᐉ\u0003\u000fᐉ\u0004\u0011ᐉ\f\u0014ᐉ\u000e", new Object[]{"b", "c", "d", "e", "h", "i", "j", "k", "l", "f", "g", "m", "n"});
            case 3:
                return new ajso();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajso.class);
            default:
                return null;
        }
    }
}
