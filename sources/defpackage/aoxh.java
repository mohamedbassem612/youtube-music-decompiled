package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoxh extends aihn implements aiis {
    public static final aoxh a;
    private int b;
    private askp c;
    private CommandOuterClass$Command d;
    private CommandOuterClass$Command e;
    private apji f;
    private byte g = 2;

    static {
        aoxh aoxhVar = new aoxh();
        a = aoxhVar;
        aihn.registerDefaultInstance(aoxh.class, aoxhVar);
    }

    private aoxh() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0003\u000e\u0004\u0000\u0000\u0004\u0003ᐉ\u0002\u0004ᐉ\u0003\u0007ᐉ\u0004\u000eᐉ\u000b", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aoxh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoxh.class);
            default:
                return null;
        }
    }
}
