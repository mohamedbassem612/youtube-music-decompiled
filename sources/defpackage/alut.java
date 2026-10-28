package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alut extends aihn implements aiis {
    public static final alut a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public boolean f;
    public boolean g;
    private byte h = 2;
    public aiie d = emptyProtobufList();
    public String e = "";

    static {
        alut alutVar = new alut();
        a = alutVar;
        aihn.registerDefaultInstance(alut.class, alutVar);
    }

    private alut() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဇ\u0002\u0006ဇ\u0004", new Object[]{"b", "c", "d", alux.class, "e", "f", "g"});
            case 3:
                return new alut();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alut.class);
            default:
                return null;
        }
    }
}
