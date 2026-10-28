package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arem extends aihn implements aiis {
    public static final arem a;
    private int b;
    private askp c;
    private askp d;
    private askp e;
    private apji f;
    private CommandOuterClass$Command g;
    private CommandOuterClass$Command h;
    private apji i;
    private apji j;
    private apji k;
    private apji l;
    private byte m = 2;

    static {
        arem aremVar = new arem();
        a = aremVar;
        aihn.registerDefaultInstance(arem.class, aremVar);
    }

    private arem() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0002\u0012\n\u0000\u0000\n\u0002ᐉ\u0002\u0003ᐉ\u0003\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\b\rᐉ\u0004\u000fᐉ\u000e\u0010ᐉ\u000f\u0011ᐉ\u0010\u0012ᐉ\u0011", new Object[]{"b", "c", "d", "f", "g", "h", "e", "i", "j", "k", "l"});
            case 3:
                return new arem();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arem.class);
            default:
                return null;
        }
    }
}
