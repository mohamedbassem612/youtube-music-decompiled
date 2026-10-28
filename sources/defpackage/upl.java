package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class upl implements View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ aihn b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ upl(Object obj, aihn aihnVar, roq roqVar, xgz xgzVar, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = aihnVar;
        this.c = roqVar;
        this.d = xgzVar;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, xgn] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i = this.$cid;
        if (i == 0) {
            apgy apgyVar = (apgy) this.b;
            apgx apgxVar = apgyVar.c == 3 ? (apgx) apgyVar.d : apgx.a;
            Object obj5 = this.a;
            Object obj6 = this.c;
            String str = apgxVar.b;
            upo upoVar = (upo) obj5;
            EditText editText = upoVar.c;
            editText.setText(str);
            editText.setSelection(editText.length());
            upoVar.i(false);
            if (obj6 == null || (obj = this.d) == null) {
                return;
            }
            new ugo((roq) obj6, obj).d();
            return;
        }
        if (i != 1) {
            if (i == 2) {
                apgy apgyVar2 = (apgy) this.b;
                apgw apgwVar = apgyVar2.c == 4 ? (apgw) apgyVar2.d : apgw.a;
                Object obj7 = this.c;
                ((upo) this.a).m(Optional.of(apgwVar.b));
                if (obj7 == null || (obj2 = this.d) == null) {
                    return;
                }
                new ugo((roq) obj7, obj2).d();
                return;
            }
            aihn aihnVar = this.b;
            if (i == 3) {
                ajwo ajwoVar = ((ajnf) aihnVar).s;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                Object obj8 = this.c;
                this.a.a(ajwoVar);
                if (obj8 == null || (obj3 = this.d) == null) {
                    return;
                }
                new ugo((roq) obj8, obj3).d();
                return;
            }
            ajwo ajwoVar2 = ((ajnf) aihnVar).s;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            ?? r0 = this.d;
            Object obj9 = this.a;
            r0.a(ajwoVar2);
            xgz xgzVar = ((vbr) obj9).a;
            if (xgzVar == null || (obj4 = this.c) == null) {
                return;
            }
            new ugo((roq) obj4, xgzVar).d();
            return;
        }
        rpl rplVar = (rpl) this.c;
        if (!rplVar.g.h()) {
            rplVar.b.a();
            return;
        }
        Object obj10 = this.d;
        if (obj10 == null || !((adly) obj10).j("enable_account_header_gesture_logging")) {
            rplVar.i.d(rplVar.a, null);
            return;
        }
        aihn aihnVar2 = this.b;
        ?? r8 = this.a;
        airk airkVar = (airk) aihnVar2;
        r8.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(airkVar.n, (amud) null), null);
        rql rqlVar = rplVar.i;
        Activity activity = rplVar.a;
        byte[] bArrG = airkVar.n.G();
        String strI = r8.i();
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aigj aigjVarW = aigj.w(bArrG, 0, bArrG.length);
        aihhVar.copyOnWrite();
        ajwo ajwoVar3 = (ajwo) aihhVar.instance;
        aigjVarW.getClass();
        ajwoVar3.b |= 1;
        ajwoVar3.c = aigjVarW;
        if (strI != null) {
            aihl aihlVar = aoaq.b;
            aihf aihfVarCreateBuilder = aoar.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aoar aoarVar = (aoar) aihfVarCreateBuilder.instance;
            aoarVar.b |= 1;
            aoarVar.c = strI;
            aihhVar.e(aihlVar, (aoar) aihfVarCreateBuilder.build());
        }
        rqlVar.c(activity, (ajwo) aihhVar.build(), null);
    }

    public /* synthetic */ upl(rpl rplVar, adly adlyVar, xgn xgnVar, airk airkVar, int i) {
        this.$cid = i;
        this.c = rplVar;
        this.d = adlyVar;
        this.a = xgnVar;
        this.b = airkVar;
    }

    public /* synthetic */ upl(vbr vbrVar, vxe vxeVar, ajnf ajnfVar, roq roqVar, int i) {
        this.$cid = i;
        this.a = vbrVar;
        this.d = vxeVar;
        this.b = ajnfVar;
        this.c = roqVar;
    }
}
