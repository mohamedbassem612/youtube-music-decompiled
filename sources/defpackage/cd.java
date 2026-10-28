package defpackage;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cd implements axo {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ cd(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.axo
    public final void accept(Object obj) {
        athg athgVarM;
        switch (this.$cid) {
            case 0:
                ((cf) this.a).m678lambda$init$2$androidsupportv4appFragmentActivity((Intent) obj);
                break;
            case 1:
                ((cf) this.a).m677lambda$init$1$androidsupportv4appFragmentActivity((Configuration) obj);
                break;
            case 2:
                Configuration configuration = (Configuration) obj;
                dd ddVar = (dd) this.a;
                if (ddVar.ab()) {
                    ddVar.t(configuration, false);
                }
                break;
            case 3:
                Integer num = (Integer) obj;
                dd ddVar2 = (dd) this.a;
                if (ddVar2.ab() && num.intValue() == 80) {
                    ddVar2.w(false);
                    break;
                }
                break;
            case 4:
                acih acihVar = (acih) obj;
                dd ddVar3 = (dd) this.a;
                if (ddVar3.ab()) {
                    ddVar3.x(acihVar.a, false);
                }
                break;
            case 5:
                acih acihVar2 = (acih) obj;
                dd ddVar4 = (dd) this.a;
                if (ddVar4.ab()) {
                    ddVar4.C(acihVar2.a, false);
                }
                break;
            case 6:
                super/*android.widget.Button*/.setTypeface((Typeface) obj);
                break;
            case 7:
                super/*android.widget.TextView*/.setTypeface((Typeface) obj);
                break;
            default:
                List list = ((dwy) obj).a;
                osj osjVar = (osj) this.a;
                kjc kjcVar = osjVar.f;
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        dwr dwrVar = (dwr) it.next();
                        if (dwrVar instanceof dwr) {
                            athgVarM = kjcVar.M(dwrVar);
                        }
                    } else {
                        athgVarM = kjcVar.M(null);
                    }
                }
                if (athgVarM == null) {
                    osjVar.h(new hgi(5));
                } else {
                    osjVar.h(new kjk(athgVarM, 8));
                }
                break;
        }
    }
}
