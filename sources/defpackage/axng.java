package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axng {
    public long a;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public axng() {
        this.b = -1;
        this.c = -1;
        this.e = axnh.CRONET_SOURCE_UNSPECIFIED;
    }

    public final zup a() {
        this.e.getClass();
        Object obj = this.e;
        return new zup((akwf) obj, (zup) this.d, this.b, this.c, this.a);
    }

    public final void b(akwf akwfVar, int i, int i2) {
        aihf builder = akwfVar.toBuilder();
        builder.copyOnWrite();
        akwf akwfVar2 = (akwf) builder.instance;
        akwfVar2.b |= 1;
        akwfVar2.c = -1;
        this.e = (akwf) builder.build();
        this.b = i;
        this.c = i2;
    }

    public final void c(zvb zvbVar) {
        akku akkuVarA = akku.a(((akwf) this.e).f);
        if (akkuVarA == null) {
            akkuVarA = akku.DELAYED_EVENT_TIER_UNSPECIFIED;
        }
        int iA = zvb.a(akkuVarA);
        this.b = iA;
        this.c = zvbVar.b(iA);
    }

    public axng(byte[] bArr) {
    }
}
