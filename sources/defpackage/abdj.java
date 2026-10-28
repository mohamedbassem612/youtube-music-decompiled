package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class abdj {
    private final List a;
    private final List b;

    /* JADX WARN: Multi-variable type inference failed */
    public abdj(List list, List list2) {
        agqs agqsVarListIterator = ((agke) list).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            ((xhc) agqsVarListIterator.next()).getClass();
        }
        agqs agqsVarListIterator2 = ((agke) list2).listIterator(0);
        while (agqsVarListIterator2.hasNext()) {
            ((xhc) agqsVarListIterator2.next()).getClass();
        }
        this.a = list;
        this.b = list2;
    }

    protected static ajwo d(aihh aihhVar, abec abecVar) {
        if (aihhVar == null) {
            return null;
        }
        if (abecVar == null) {
            return (ajwo) aihhVar.build();
        }
        String str = abecVar.a;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        xhc xhcVar = abecVar.b;
        boolean z = xhcVar != null;
        if (zIsEmpty && !z) {
            return (ajwo) aihhVar.build();
        }
        aihf aihfVarCreateBuilder = e((ajwo) aihhVar.build()) == null ? aoar.a.createBuilder() : e((ajwo) aihhVar.build()).toBuilder();
        if (!zIsEmpty) {
            if (str != null) {
                aihfVarCreateBuilder.copyOnWrite();
                aoar aoarVar = (aoar) aihfVarCreateBuilder.instance;
                aoarVar.b |= 1;
                aoarVar.c = str;
            } else {
                aihfVarCreateBuilder.copyOnWrite();
                aoar aoarVar2 = (aoar) aihfVarCreateBuilder.instance;
                aoarVar2.b &= -2;
                aoarVar2.c = aoar.a.c;
            }
        }
        if (z) {
            aihfVarCreateBuilder.copyOnWrite();
            aoar aoarVar3 = (aoar) aihfVarCreateBuilder.instance;
            aoarVar3.b |= 2;
            aoarVar3.d = xhcVar.a;
        }
        aihhVar.e(aoaq.b, (aoar) aihfVarCreateBuilder.build());
        return (ajwo) aihhVar.build();
    }

    private static aoar e(ajwo ajwoVar) {
        if (ajwoVar == null) {
            return null;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aoaq.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        return (aoar) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
    }

    public xgt a(xgn xgnVar, ajwo ajwoVar, abec abecVar) {
        ajwo ajwoVarD = d(ajwoVar == null ? null : (aihh) ajwoVar.toBuilder(), abecVar);
        xgt xgtVarC = xgnVar.c(xhb.a(3832), xgu.a, ajwoVarD, yno.dl(ajwoVarD, amdx.b), yno.dl(ajwoVarD, amdx.a));
        c(xgnVar);
        b(xgnVar);
        return xgtVarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void b(xgn xgnVar) {
        agqs agqsVarListIterator = ((agke) this.b).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            xgnVar.d(new xgj((xhc) agqsVarListIterator.next()));
        }
    }

    protected final void c(xgn xgnVar) {
        for (xhc xhcVar : this.a) {
            if (xhcVar != null) {
                xgnVar.l(new xgj(xhcVar));
            }
        }
    }

    public abdj(xhc... xhcVarArr) {
        this.a = Arrays.asList(xhcVarArr);
        this.b = agpi.a;
    }
}
