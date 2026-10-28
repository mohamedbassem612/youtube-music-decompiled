package defpackage;

import android.view.View;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class aenw extends oh {
    public final tqj A;
    public final aenu B;
    public volatile boolean C;
    public volatile boolean D;
    public ajwo E;
    public String F;
    public aenr G;
    public aeno H;

    protected aenw(tqj tqjVar, aenu aenuVar, View view) {
        super(view);
        this.C = false;
        this.D = false;
        this.A = tqjVar;
        this.B = aenuVar;
    }

    protected boolean E() {
        return true;
    }

    protected abstract int G();

    public final aeno R() {
        if (this.F == null || this.E == null) {
            return null;
        }
        if (U()) {
            aenr aenrVar = this.G;
            if (aenrVar != null) {
                return aenrVar.c;
            }
            aeno aenoVarW = this.H;
            if (aenoVarW == null) {
                ajwo ajwoVar = this.E;
                String str = this.F;
                str.getClass();
                int iG = G();
                ajwoVar.getClass();
                aihf builder = aewo.t(ajwoVar).toBuilder();
                builder.getClass();
                agvp.J(str, builder);
                agvp.K(iG, builder);
                aenoVarW = aewo.w(ajwoVar, agvp.I(builder));
                this.H = aenoVarW;
            }
            return aenoVarW;
        }
        aihh aihhVar = (aihh) this.E.toBuilder();
        aihl aihlVar = aoaq.b;
        ajwo ajwoVar2 = this.E;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar2.c(aihlVarCheckIsLite);
        Object objK = ajwoVar2.j.k(aihlVarCheckIsLite.d);
        aihf builder2 = ((aoar) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).toBuilder();
        String str2 = this.F;
        str2.getClass();
        builder2.copyOnWrite();
        aoar aoarVar = (aoar) builder2.instance;
        aoarVar.b |= SemanticState.ReadOnly;
        aoarVar.k = str2;
        int iG2 = G();
        builder2.copyOnWrite();
        aoar aoarVar2 = (aoar) builder2.instance;
        aoarVar2.b |= SemanticState.Focused;
        aoarVar2.h = iG2;
        aihhVar.e(aihlVar, (aoar) builder2.build());
        return aeno.n.s((ajwo) aihhVar.build());
    }

    public final aenr S() {
        aenr aenrVar = this.G;
        if (aenrVar != null) {
            return aenrVar;
        }
        String str = this.F;
        if (str == null) {
            return null;
        }
        return this.B.c(str);
    }

    public final boolean T() {
        int i = tqr.a;
        return this.A.k(1073830263);
    }

    public final boolean U() {
        int i = tqr.a;
        return this.A.k(1073830415);
    }

    public final boolean V() {
        return this.B.o();
    }

    public final boolean W() {
        return this.B.l();
    }
}
