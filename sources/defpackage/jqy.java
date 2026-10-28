package defpackage;

import com.google.android.apps.youtube.proto.ClientAbrStateOuterClass$ClientAbrState;
import com.google.android.apps.youtube.proto.streaming.BufferedRangeOuterClass$BufferedRange;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jqy extends aihn implements aiis {
    public static final jqy a;
    public int b;
    public ClientAbrStateOuterClass$ClientAbrState c;
    public alum d;
    public aigj e;
    public int f;
    public int g;
    public aigj h;
    public jrt i;
    public int j;
    public aiie k;
    public aphs l;
    public int m;
    private byte n = 2;

    static {
        jqy jqyVar = new jqy();
        a = jqyVar;
        aihn.registerDefaultInstance(jqy.class, jqyVar);
    }

    private jqy() {
        aigj aigjVar = aigj.d;
        this.e = aigjVar;
        this.h = aigjVar;
        this.k = emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0002\u0010\u000b\u0000\u0001\u0002\u0002ဉ\u0000\u0003ᐉ\u0001\u0004ည\u0002\u0005င\u0003\u0006င\u0004\tည\u0006\nᐉ\u0007\r᠌\b\u000e\u001b\u000fဉ\t\u0010᠌\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", fxd.h, "k", BufferedRangeOuterClass$BufferedRange.class, "l", "m", fxd.e});
            case 3:
                return new jqy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(jqy.class);
            default:
                return null;
        }
    }
}
