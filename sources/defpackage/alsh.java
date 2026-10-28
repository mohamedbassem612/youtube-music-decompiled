package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alsh extends aihn implements aiis {
    public static final alsh a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public alsg d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;
    private alsj i;
    private byte j = 2;

    static {
        alsh alshVar = new alsh();
        a = alshVar;
        aihn.registerDefaultInstance(alsh.class, alshVar);
    }

    private alsh() {
        aigj aigjVar = aigj.d;
        this.e = "";
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
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u001c\u0007\u0000\u0000\u0001\u0001ᐉ\u0000\u0004ဈ\u0003\tဉ\u0013\u000eဇ\u0005\u0012ဇ\u0007\u0019ဉ\u0002\u001cဇ\u0011", new Object[]{"b", "c", "e", "i", "f", "g", "d", "h"});
            case 3:
                return new alsh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alsh.class);
            default:
                return null;
        }
    }
}
