package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vbg implements vbf {
    private final vbd a;
    private final zf b;

    public vbg(zf zfVar, vbd vbdVar) {
        ahno.G(vbdVar != vbd.d, "Surface cannot be UNKNOWN");
        this.b = zfVar;
        this.a = vbdVar;
    }

    @Override // defpackage.vbf
    public final vbd a() {
        return this.a;
    }

    @Override // defpackage.vbf
    public final agke b() {
        return this.b.M(this.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.vbf
    public final void c(agke agkeVar) {
        this.b.a.put(this.a, agkeVar);
    }
}
