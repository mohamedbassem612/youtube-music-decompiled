package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cbb {
    public int a;
    public boolean b;
    private final HashMap c;
    private crf d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private Boolean n;

    public cbb() {
        HashMap map = new HashMap();
        this.c = map;
        map.put(cfd.a.b, 144179200);
        this.e = 50000;
        this.f = 1000;
        this.g = 50000;
        this.h = 50000;
        this.i = 1000;
        this.j = 1000;
        this.k = 2000;
        this.l = 1000;
        this.m = true;
        this.a = 0;
    }

    public final cbd a() {
        ahno.O(!this.b);
        this.b = true;
        if (this.d == null) {
            this.d = new crf(true, 65536);
        }
        Boolean bool = this.n;
        if (bool != null) {
            bool.booleanValue();
            this.f = this.e;
            this.h = this.g;
            this.j = this.i;
            this.l = this.k;
            this.m = false;
        }
        return new cbd(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.a, this.c);
    }

    public final void b(int i, int i2, int i3, int i4) {
        ahno.O(!this.b);
        agke agkeVar = cbd.a;
        ahno.M(true, "%s cannot be less than %s", "bufferForPlaybackMs", "0");
        ahno.M(true, "%s cannot be less than %s", "bufferForPlaybackAfterRebufferMs", "0");
        ahno.M(i >= i3, "%s cannot be less than %s", "minBufferMs", "bufferForPlaybackMs");
        ahno.M(i >= i4, "%s cannot be less than %s", "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        ahno.M(i2 >= i, "%s cannot be less than %s", "maxBufferMs", "minBufferMs");
        this.e = i;
        this.g = i2;
        this.i = i3;
        this.k = i4;
        this.f = i;
        this.h = i2;
        this.j = i3;
        this.l = i4;
        if (this.n == null) {
            this.n = Boolean.TRUE;
        }
    }
}
