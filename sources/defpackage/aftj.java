package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aftj {
    public Object a;
    public Object b;

    public aftj(boolean z) {
        this.b = afti.d;
        this.a = z ? afty.c(true) : null;
    }

    public static void a(afvl afvlVar) {
        afty.s(afvlVar.d());
    }

    final void b(afvl afvlVar) {
        if (d(afvlVar) || afvlVar.b() == null) {
            afvlVar.e();
            a(afvlVar);
        } else {
            b(afvlVar.b());
            a(afvlVar);
        }
    }

    final void c(afvl afvlVar) {
        if (d(afvlVar) || afvlVar.b() == null) {
            return;
        }
        c(afvlVar.b());
    }

    public final boolean d(afvl afvlVar) {
        return afvlVar.a() != this;
    }

    public final xiz e() {
        Object obj;
        Object obj2 = this.a;
        if (obj2 != null && (obj = this.b) != null) {
            return new xiz((String) obj2, (String) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" tickName");
        }
        if (this.b == null) {
            sb.append(" actionNonce");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null actionNonce");
        }
        this.b = str;
    }

    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null tickName");
        }
        this.a = str;
    }

    public final wgd h() {
        if (this.a == null) {
            aqjg aqjgVar = ((aqjj) this.b).i;
            if (aqjgVar == null) {
                aqjgVar = aqjg.a;
            }
            if ((aqjgVar.b & 1) != 0) {
                aqjg aqjgVar2 = ((aqjj) this.b).i;
                if (aqjgVar2 == null) {
                    aqjgVar2 = aqjg.a;
                }
                apoq apoqVar = aqjgVar2.c;
                if (apoqVar == null) {
                    apoqVar = apoq.a;
                }
                this.a = new wgd(apoqVar);
            }
        }
        return (wgd) this.a;
    }

    public final tmr i() {
        Object obj;
        Object obj2 = this.a;
        if (obj2 != null && (obj = this.b) != null) {
            return new tmr((tmp) obj2, (tmt) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" item");
        }
        if (this.b == null) {
            sb.append(" metadata");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void j(tmt tmtVar) {
        if (tmtVar == null) {
            throw new NullPointerException("Null metadata");
        }
        this.b = tmtVar;
    }

    public aftj(tmr tmrVar) {
        this.a = tmrVar.a;
        this.b = tmrVar.b;
    }

    public aftj(byte[] bArr, byte[] bArr2) {
        this.a = null;
        this.b = null;
    }

    public aftj(aqjj aqjjVar) {
        aqjjVar.getClass();
        this.b = aqjjVar;
    }

    public aftj() {
    }
}
