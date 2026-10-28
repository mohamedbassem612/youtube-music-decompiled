package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaoo extends ygn {
    public boolean a;
    private final aadc b;
    private final zho c;
    private final vxz d;
    private final vxz e;
    private final adgf f;

    public aaoo(aadc aadcVar, adgf adgfVar, zho zhoVar, vxz vxzVar, vxz vxzVar2) {
        aadcVar.getClass();
        this.b = aadcVar;
        this.f = adgfVar;
        this.c = zhoVar;
        this.d = vxzVar;
        this.e = vxzVar2;
        this.a = false;
    }

    @Override // defpackage.ygn
    public final bye a(bye byeVar, List list) {
        if (this.d.l(10, 45354110L, false)) {
            return new aaoj(this.b, this.f, this.c, byeVar, this.a, this.e);
        }
        aaon aaonVar = new aaon(byeVar);
        aadc aadcVar = this.b;
        bye jsnVar = aaonVar;
        for (aamc aamcVar : aadcVar.i()) {
            aadb aadbVar = (aadb) aadcVar;
            if (aadbVar.a != null) {
                aadbVar.a.f();
            }
            jsnVar = new jsn(aamcVar, jsnVar, this.f.a(new jsx("Offline")), null, 4, this.c);
        }
        return jsnVar;
    }
}
