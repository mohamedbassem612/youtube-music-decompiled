package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asqd extends aihn implements aiis {
    public static final asqd a;
    private int b;
    private int c;
    private askp d;
    private CommandOuterClass$Command e;
    private CommandOuterClass$Command f;
    private asqg g;
    private CommandOuterClass$Command h;
    private CommandOuterClass$Command i;
    private asqj j;
    private asqe k;
    private askp l;
    private askp m;
    private apji n;
    private askp o;
    private apji p;
    private apji q;
    private apji r;
    private byte s = 2;

    static {
        asqd asqdVar = new asqd();
        a = asqdVar;
        aihn.registerDefaultInstance(asqd.class, asqdVar);
    }

    private asqd() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                this.s = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u000f\u0000\u0002\tD\u000f\u0000\u0000\u000f\tᐉ\u000b\u000bᐉ\u0013\u001fᐉ\t!ᐉ\n#ᐉ\u001c$ᐉ\u0011%ᐉ\u00156ᐉ\";ᐉ%<ᐉ'=ᐉ&?ᐉ(@ᐉ)Cᐉ*Dᐉ+", new Object[]{"b", "c", "f", "h", "d", "e", "j", "g", "i", "k", "l", "n", "m", "o", "p", "q", "r"});
            case 3:
                return new asqd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asqd.class);
            default:
                return null;
        }
    }
}
