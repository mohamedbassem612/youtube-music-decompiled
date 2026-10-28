package defpackage;

import java.util.ArrayDeque;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class wwy extends adtv {
    public boolean a;
    public boolean b;
    public boolean c;
    public alsg d;
    public final wwn e;

    public wwy(wnf wnfVar, tbt tbtVar, ttm ttmVar, wwn wwnVar, xgn xgnVar) {
        super(null, wnfVar, tbtVar, null, ttmVar, xgnVar, null, new ArrayDeque(), null);
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = alsg.a;
        this.e = wwnVar;
    }

    public static final amqm r(apjh apjhVar) {
        if (apjhVar != null) {
            aihl aihlVar = amqm.b;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            apjhVar.c(aihlVarCheckIsLite);
            if (apjhVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                apjhVar.c(aihlVarCheckIsLite2);
                Object objK = apjhVar.j.k(aihlVarCheckIsLite2.d);
                return (amqm) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        return null;
    }

    public abstract void a();

    @Override // defpackage.adtv
    protected final /* bridge */ /* synthetic */ Object c(apjh apjhVar) {
        return r(apjhVar);
    }

    public abstract void h();

    @Override // defpackage.adtv
    protected final void hr(wkf wkfVar, adtl adtlVar) {
        if (wkfVar instanceof wqu) {
            wqu wquVar = (wqu) wkfVar;
            if (this.b) {
                wquVar.b = true;
            }
            alsg alsgVar = this.d;
            if (alsgVar != null) {
                wquVar.d = alsgVar;
            }
            if (this.a && !this.c) {
                wquVar.a = true;
            }
            this.a = false;
            if (adtlVar == null || !adtlVar.a) {
                return;
            }
            wquVar.c = true;
        }
    }

    @Override // defpackage.adtv
    protected final boolean hv() {
        return false;
    }

    public abstract void j(List list);

    public abstract void k();

    public abstract boolean l();

    public abstract boolean q();
}
