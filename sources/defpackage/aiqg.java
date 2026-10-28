package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiqg extends aihn implements aiis {
    public static final aiqg a;
    private int b;
    private askp c;
    private apji d;
    private askp e;
    private CommandOuterClass$Command f;
    private byte g = 2;

    static {
        aiqg aiqgVar = new aiqg();
        a = aiqgVar;
        aihn.registerDefaultInstance(aiqg.class, aiqgVar);
    }

    private aiqg() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\b\u0004\u0000\u0000\u0004\u0002ᐉ\u0002\u0004ᐉ\u0000\u0006ᐉ\u0005\bᐉ\u0006", new Object[]{"b", "d", "c", "e", "f"});
            case 3:
                return new aiqg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aiqg.class);
            default:
                return null;
        }
    }
}
