package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajjp extends aihn implements aiis {
    public static final ajjp a;
    private int b;
    private askp c;
    private apji d;
    private CommandOuterClass$Command e;
    private askp f;
    private apji g;
    private askp h;
    private askp i;
    private askp j;
    private apji k;
    private apji l;
    private apji m;
    private askp n;
    private byte o = 2;

    static {
        ajjp ajjpVar = new ajjp();
        a = ajjpVar;
        aihn.registerDefaultInstance(ajjp.class, ajjpVar);
    }

    private ajjp() {
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0000\f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\tᐉ\b\nᐉ\n\u000bᐉ\u000b\fᐉ\f\rᐉ\r", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
            case 3:
                return new ajjp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajjp.class);
            default:
                return null;
        }
    }
}
