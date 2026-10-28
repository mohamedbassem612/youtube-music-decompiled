package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zkc {
    public String a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public agkz f;

    /* JADX WARN: Multi-variable type inference failed */
    public zkc(atpl atplVar, int i, vxz vxzVar) {
        atpj atpjVar = atplVar.p;
        atpjVar = atpjVar == null ? atpj.a : atpjVar;
        atpj atpjVar2 = atplVar.o;
        atpjVar2 = atpjVar2 == null ? atpj.a : atpjVar2;
        this.f = agpr.a;
        if (vxzVar.m(6, 45399743L) && !atpjVar.f.isEmpty()) {
            this.f = agkz.n(atpjVar.f);
        }
        if (i != 1 || atpjVar.e >= atpjVar2.e) {
            long j = atpjVar.e;
            this.d = j == 0 ? -1L : j;
        } else {
            this.d = -1L;
            atpjVar = atpjVar2;
        }
        this.a = (atplVar.b & 8) != 0 ? atplVar.g : null;
        Long l = (Long) atplVar.d.get("last_playback_start_timestamp");
        this.e = l != null ? l.longValue() : -1L;
        int i2 = atpjVar.b;
        this.b = (i2 & 1) != 0 ? atpjVar.c : -1;
        this.c = (i2 & 2) != 0 ? atpjVar.d : -2;
    }
}
