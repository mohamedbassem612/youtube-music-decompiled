package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apwv extends aihn implements aiis {
    public static final apwv a;
    private int b;
    private apwu c;
    private apwu d;
    private CommandOuterClass$Command e;
    private CommandOuterClass$Command f;
    private CommandOuterClass$Command g;
    private CommandOuterClass$Command h;
    private apji i;
    private alkw j;
    private CommandOuterClass$Command k;
    private arao l;
    private apwt m;
    private byte n = 2;

    static {
        apwv apwvVar = new apwv();
        a = apwvVar;
        aihn.registerDefaultInstance(apwv.class, apwvVar);
    }

    private apwv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0006#\u000b\u0000\u0000\u000b\u0006ᐉ\u0006\u0007ᐉ\u0007\tᐉ\b\fᐉ\r\rᐉ\u000e\u000eᐉ\u000f\u0013ᐉ\t\u0016ᐉ\u0001\u001cᐉ\u0017\u001dᐉ\u0003#ᐉ\u001c", new Object[]{"b", "e", "f", "g", "i", "j", "k", "h", "c", "l", "d", "m"});
            case 3:
                return new apwv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apwv.class);
            default:
                return null;
        }
    }
}
