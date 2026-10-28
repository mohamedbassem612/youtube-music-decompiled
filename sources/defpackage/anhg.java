package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anhg extends aihn implements aiis {
    public static final anhg a;
    private CommandOuterClass$Command A;
    private CommandOuterClass$Command B;
    private CommandOuterClass$Command C;
    private CommandOuterClass$Command D;
    private byte E = 2;
    private int b;
    private int c;
    private apji d;
    private apji e;
    private CommandOuterClass$Command f;
    private CommandOuterClass$Command g;
    private CommandOuterClass$Command h;
    private CommandOuterClass$Command i;
    private CommandOuterClass$Command j;
    private CommandOuterClass$Command k;
    private CommandOuterClass$Command l;
    private CommandOuterClass$Command m;
    private CommandOuterClass$Command n;
    private CommandOuterClass$Command o;
    private CommandOuterClass$Command p;
    private CommandOuterClass$Command q;
    private CommandOuterClass$Command r;
    private CommandOuterClass$Command s;
    private CommandOuterClass$Command t;
    private apji u;
    private CommandOuterClass$Command v;
    private apji w;
    private CommandOuterClass$Command x;
    private CommandOuterClass$Command y;
    private CommandOuterClass$Command z;

    static {
        anhg anhgVar = new anhg();
        a = anhgVar;
        aihn.registerDefaultInstance(anhg.class, anhgVar);
    }

    private anhg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.E);
            case 1:
                this.E = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001b\u0000\u0002\u00020\u001b\u0000\u0000\u001b\u0002ᐉ\u0001\u0005ᐉ\b\bᐉ\t\u000bᐉ\u000f\u000eᐉ\u0010\u000fᐉ\u0011\u0012ᐉ\u0012\u0013ᐉ\u0002\u0014ᐉ\u0014\u0016ᐉ\u0017\u0017ᐉ\u0018\u0019ᐉ\u001a\u001aᐉ\u001b\u001bᐉ\u001d\u001dᐉ\u001c ᐉ\u0013\"ᐉ#$ᐉ\u0015&ᐉ\u0016'ᐉ$(ᐉ%)ᐉ&*ᐉ'+ᐉ(-ᐉ).ᐉ*0ᐉ,", new Object[]{"b", "c", "d", "f", "g", "h", "i", "j", "k", "e", "m", "p", "q", "r", "s", "u", "t", "l", "v", "n", "o", "w", "x", "y", "z", "A", "B", "C", "D"});
            case 3:
                return new anhg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anhg.class);
            default:
                return null;
        }
    }
}
