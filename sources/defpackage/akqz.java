package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akqz extends aihn implements aiis {
    public static final akqz a;
    private int b;
    private askp c;
    private askp d;
    private apji e;
    private apji f;
    private apji g;
    private apji h;
    private apji i;
    private CommandOuterClass$Command j;
    private apji k;
    private apji l;
    private byte m = 2;

    static {
        akqz akqzVar = new akqz();
        a = akqzVar;
        aihn.registerDefaultInstance(akqz.class, akqzVar);
    }

    private akqz() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0004!\n\u0000\u0000\n\u0004ᐉ\u0001\u0005ᐉ\u0002\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\fᐉ\t\rᐉ\u0003\u000eᐉ\u0004\u001cᐉ\u000f!ᐉ\u0018", new Object[]{"b", "c", "d", "g", "h", "i", "j", "e", "f", "k", "l"});
            case 3:
                return new akqz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akqz.class);
            default:
                return null;
        }
    }
}
