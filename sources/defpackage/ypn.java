package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ypn extends ziq {
    private final zjd a;
    private boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypn(bye byeVar, zjd zjdVar) {
        super(byeVar);
        zkf.d(byeVar);
        zkf.d(zjdVar);
        this.a = zjdVar;
    }

    @Override // defpackage.ziq, defpackage.bye
    public final long b(byi byiVar) {
        String queryParameter;
        if (!this.b && (queryParameter = byiVar.a.getQueryParameter("itag")) != null) {
            try {
                int i = Integer.parseInt(queryParameter);
                Set setB = wir.b();
                Integer numValueOf = Integer.valueOf(i);
                if (setB.contains(numValueOf)) {
                    if (!this.b) {
                        this.a.B();
                    }
                    this.b = true;
                    this.a.E();
                } else if (wir.c().contains(numValueOf) || wir.y().contains(numValueOf)) {
                    if (!this.b) {
                        this.a.B();
                    }
                    this.b = true;
                    this.a.F();
                }
            } catch (NumberFormatException unused) {
            }
        }
        return super.b(byiVar);
    }
}
