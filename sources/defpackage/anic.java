package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anic extends aihn implements aiis {
    public static final anic a;
    private int b;
    private CommandOuterClass$Command c;
    private CommandOuterClass$Command d;
    private apji e;
    private apji f;
    private apji g;
    private apji h;
    private alkw i;
    private byte j = 2;

    static {
        anic anicVar = new anic();
        a = anicVar;
        aihn.registerDefaultInstance(anic.class, anicVar);
    }

    private anic() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u00042\u0007\u0000\u0000\u0007\u0004ᐉ\u0007\u0007ᐉ\t\tᐉ\u000b\rᐉ\u000f\u0012ᐉ\u0011\u001bᐉ\u00182ᐉ\u000e", new Object[]{"b", "c", "d", "e", "g", "h", "i", "f"});
            case 3:
                return new anic();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anic.class);
            default:
                return null;
        }
    }
}
