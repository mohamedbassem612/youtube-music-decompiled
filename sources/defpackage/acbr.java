package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acbr {
    public long a;
    public Object b;
    public Object c;

    public acbr() {
        this.b = acbs.a;
        this.a = 0L;
        this.c = "";
    }

    public final buh a() {
        Object obj;
        if (!((btn) this.b).n() && (obj = this.c) != null) {
            ahno.F(((btn) this.b).a(obj) != -1);
        }
        return new buh(this);
    }

    public acbr(buh buhVar) {
        this.a = buhVar.b;
        this.b = buhVar.c;
        this.c = buhVar.d;
    }

    public acbr(byte[] bArr) {
        this.a = 0L;
        this.b = btn.a;
        this.c = null;
    }
}
