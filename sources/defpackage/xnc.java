package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xnc extends xjm {
    private String b;
    private String c;
    private String d;
    private String e;

    protected xnc(xkd xkdVar) {
        super("mdx_command", xkdVar);
    }

    @Override // defpackage.xjm
    protected final void a(tas tasVar, Set set, Set set2) {
        if (tasVar instanceof xnf) {
            xnf xnfVar = (xnf) tasVar;
            this.b = xnfVar.a;
            this.c = xnfVar.b;
        }
        super.a(tasVar, set, set2);
    }

    @Override // defpackage.xjm
    public final gdk b() {
        f("method_start", this.b);
        f("start_channel_type", this.c);
        f("method_received", this.d);
        f("end_channel_type", this.e);
        return super.b();
    }

    @Override // defpackage.xjm
    protected final boolean c(tas tasVar) {
        boolean z = tasVar instanceof xne;
        boolean zC = super.c(tasVar);
        if (z) {
            xne xneVar = (xne) tasVar;
            if (this.d == null) {
                this.d = xneVar.a;
                this.e = xneVar.b;
            }
        }
        return zC;
    }
}
