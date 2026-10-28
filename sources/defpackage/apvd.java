package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apvd extends aihn implements aiis {
    public static final apvd a;
    private int b;
    private askp c;
    private askp d;
    private askp e;
    private apji f;
    private apji g;
    private apji h;
    private apji i;
    private apji j;
    private apji k;
    private CommandOuterClass$Command l;
    private byte m = 2;

    static {
        apvd apvdVar = new apvd();
        a = apvdVar;
        aihn.registerDefaultInstance(apvd.class, apvdVar);
    }

    private apvd() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\n\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u000b\u0006ᐉ\u0002\u0007ᐉ\u0005\bᐉ\u0006\tᐉ\u0007\nᐉ\b\u000bᐉ\t\fᐉ\n", new Object[]{"b", "c", "d", "l", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new apvd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apvd.class);
            default:
                return null;
        }
    }
}
