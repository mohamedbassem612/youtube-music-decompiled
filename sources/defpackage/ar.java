package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ar extends ap {
    public float af = -1.0f;
    public int ag = -1;
    public int ah = -1;
    private ao aj = this.j;
    public int ai = 0;

    public ar() {
        this.q.clear();
        this.q.add(this.aj);
    }

    public final void A(int i) {
        ao aoVar;
        if (this.ai != i) {
            this.ai = i;
            ArrayList arrayList = this.q;
            arrayList.clear();
            if (this.ai == 1) {
                aoVar = this.i;
                this.aj = aoVar;
            } else {
                aoVar = this.j;
                this.aj = aoVar;
            }
            arrayList.add(aoVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0010, code lost:
    
        if (r2.ai != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
    
        if (r2.ai == 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return r2.aj;
     */
    @Override // defpackage.ap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ao t(int r3) {
        /*
            r2 = this;
            int r3 = r3 + (-1)
            r0 = 1
            if (r3 == r0) goto L13
            r1 = 2
            if (r3 == r1) goto Le
            r1 = 3
            if (r3 == r1) goto L13
            r0 = 4
            if (r3 != r0) goto L1a
        Le:
            int r3 = r2.ai
            if (r3 == 0) goto L17
            goto L1a
        L13:
            int r3 = r2.ai
            if (r3 != r0) goto L1a
        L17:
            ao r2 = r2.aj
            goto L1b
        L1a:
            r2 = 0
        L1b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ar.t(int):ao");
    }

    @Override // defpackage.ap
    public final void x(am amVar) {
        ap apVar = this.r;
        if (apVar != null) {
            ao aoVarT = apVar.t(2);
            ao aoVarT2 = apVar.t(4);
            if (this.ai == 0) {
                aoVarT = apVar.t(3);
                aoVarT2 = apVar.t(5);
            }
            if (this.ag != -1) {
                amVar.g(am.c(amVar, amVar.e(this.aj), amVar.e(aoVarT), this.ag, false));
                return;
            }
            if (this.ah != -1) {
                amVar.g(am.c(amVar, amVar.e(this.aj), amVar.e(aoVarT2), -this.ah, false));
                return;
            }
            if (this.af != -1.0f) {
                an anVarE = amVar.e(this.aj);
                an anVarE2 = amVar.e(aoVarT);
                an anVarE3 = amVar.e(aoVarT2);
                float f = this.af;
                ak akVarA = amVar.a();
                aj ajVar = akVarA.d;
                ajVar.f(anVarE, -1.0f);
                ajVar.f(anVarE2, 1.0f - f);
                ajVar.f(anVarE3, f);
                amVar.g(akVarA);
            }
        }
    }

    @Override // defpackage.ap
    public final void y() {
        if (this.r != null) {
            int iP = am.p(this.aj);
            if (this.ai == 1) {
                this.w = iP;
                this.x = 0;
                j(this.r.d());
                p(0);
                return;
            }
            this.w = 0;
            this.x = iP;
            p(this.r.h());
            j(0);
        }
    }
}
