package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class alyj extends aihn implements aiis {
    public static final alyj a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public aocg g;
    private byte h = 2;
    public aiie d = emptyProtobufList();
    public String e = "";
    public String f = "";

    static {
        alyj alyjVar = new alyj();
        a = alyjVar;
        aihn.registerDefaultInstance(alyj.class, alyjVar);
    }

    private alyj() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001a\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဉ\u0003", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new alyj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alyj.class);
            default:
                return null;
        }
    }
}
