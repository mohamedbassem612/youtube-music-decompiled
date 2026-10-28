package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class assy extends aihn implements aiis {
    public static final assy a;
    public static final aihl b;
    public boolean A;
    public boolean C;
    public boolean D;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    private CommandOuterClass$Command M;
    public int c;
    public int d;
    public askp e;
    public askp f;
    public CommandOuterClass$Command g;
    public CommandOuterClass$Command h;
    public CommandOuterClass$Command i;
    public CommandOuterClass$Command j;
    public boolean k;
    public boolean l;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean v;
    public boolean x;
    public boolean y;
    public boolean z;
    private byte N = 2;
    public boolean m = true;
    public aiie s = emptyProtobufList();
    public aiie t = emptyProtobufList();
    public aiie u = emptyProtobufList();
    public aiie w = emptyProtobufList();
    public aiie B = emptyProtobufList();
    public String E = "";

    static {
        assy assyVar = new assy();
        a = assyVar;
        aihn.registerDefaultInstance(assy.class, assyVar);
        b = aihn.newSingularGeneratedExtension(asow.a, assyVar, assyVar, null, 220721894, aika.MESSAGE, assy.class);
    }

    private assy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.N);
            case 1:
                this.N = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004#\u0000\u0002\u0001(#\u0000\u0005\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ဇ\u0007\u0007ဇ\u0010\bဇ\t\n\u001b\u000bဇ\n\r\u001a\u000fЛ\u0010ဇ\f\u0011ဇ\u0019\u0012ဇ\u0012\u0013\u001b\u0014ဇ\u0013\u0015ဇ\u0015\u0016ဇ\u0017\u0017ဇ\u0014\u0018Л\u0019ဇ\u000f\u001aဇ\u0016\u001cဈ\u0018\u001eဇ\u000e\u001fဇ\b ဇ\u001c!ဋ\u001d\"ဇ\u001e#ဇ\r$᠌\u001f%᠌!&᠌ 'ᐉ\u0005(ᐉ\u0006", new Object[]{"c", "d", "e", "f", "g", "h", "i", "k", "v", "m", "w", asso.class, "n", "s", "u", assw.class, "o", "F", "x", "t", assz.class, "y", "A", "D", "z", "B", aktq.class, "r", "C", "E", "q", "l", "G", "H", "I", "p", "J", asmm.d, "L", asmm.c, "K", asmm.e, "j", "M"});
            case 3:
                return new assy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(assy.class);
            default:
                return null;
        }
    }
}
