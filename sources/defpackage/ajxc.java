package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajxc extends aihn implements aiis {
    public static final ajxc a;
    private int b;
    private apji c;
    private apji d;
    private CommandOuterClass$Command e;
    private apji f;
    private askp g;
    private askp h;
    private askp i;
    private apji j;
    private askp k;
    private byte l = 2;

    static {
        ajxc ajxcVar = new ajxc();
        a = ajxcVar;
        aihn.registerDefaultInstance(ajxc.class, ajxcVar);
    }

    private ajxc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\t\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0004\u0006ᐉ\u0003\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\n", new Object[]{"b", "c", "d", "f", "e", "g", "h", "i", "j", "k"});
            case 3:
                return new ajxc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajxc.class);
            default:
                return null;
        }
    }
}
