package defpackage;

import android.content.DialogInterface;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ijf implements DialogInterface.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ijf(Object obj, aihn aihnVar, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = aihnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.lang.Object, svj] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        View viewFindViewById;
        akdd akddVar = null;
        switch (this.$cid) {
            case 0:
                ajwo ajwoVar = ((aosu) this.b).h;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                ((ijg) this.a).a.c(ajwoVar, null);
                break;
            case 1:
                ((gtt) this.a).d((ajwo) this.b);
                break;
            case 2:
                ira iraVar = (ira) this.b;
                iraVar.b(302066);
                iraVar.d((iqk) this.a, false);
                break;
            case 3:
                ((sus) this.a).c.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(((ajnf) this.b).y, (amud) null), null);
                break;
            case 4:
                if (i == -1) {
                    Object obj = this.b;
                    Object obj2 = this.a;
                    dialogInterface.dismiss();
                    ajng ajngVar = ((aqgo) obj).f;
                    if (ajngVar == null) {
                        ajngVar = ajng.a;
                    }
                    if ((ajngVar.b & 1) != 0) {
                        ajnf ajnfVar = ajngVar.c;
                        if (ajnfVar == null) {
                            ajnfVar = ajnf.a;
                        }
                        ajwo ajwoVar2 = ajnfVar.r;
                        if (ajwoVar2 == null) {
                            ajwoVar2 = ajwo.a;
                        }
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(akdb.b);
                        ajwoVar2.c(aihlVarCheckIsLite);
                        if (ajwoVar2.j.n(aihlVarCheckIsLite.d)) {
                            ajwo ajwoVar3 = ajnfVar.r;
                            if (ajwoVar3 == null) {
                                ajwoVar3 = ajwo.a;
                            }
                            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akdb.b);
                            ajwoVar3.c(aihlVarCheckIsLite2);
                            Object objK = ajwoVar3.j.k(aihlVarCheckIsLite2.d);
                            akdb akdbVar = (akdb) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                            if ((akdbVar.c & 1) != 0) {
                                akdc akdcVar = akdbVar.d;
                                if (akdcVar == null) {
                                    akdcVar = akdc.a;
                                }
                                akddVar = akdcVar.c;
                                if (akddVar == null) {
                                    akddVar = akdd.a;
                                }
                            }
                        }
                    }
                    akdd akddVar2 = akddVar;
                    suu suuVar = (suu) obj2;
                    vxe vxeVar = suuVar.b;
                    xgn xgnVar = suuVar.c;
                    ArrayList arrayList = new ArrayList();
                    int checkedRadioButtonId = suuVar.d.getCheckedRadioButtonId();
                    if (checkedRadioButtonId != -1 && (viewFindViewById = suuVar.d.findViewById(checkedRadioButtonId)) != null) {
                        ajwo ajwoVar4 = ((aqgn) viewFindViewById.getTag()).d;
                        if (ajwoVar4 == null) {
                            ajwoVar4 = ajwo.a;
                        }
                        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(akyq.a);
                        ajwoVar4.c(aihlVarCheckIsLite3);
                        Object objK2 = ajwoVar4.j.k(aihlVarCheckIsLite3.d);
                        arrayList.add(((akyo) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).b);
                    }
                    acwl.i(suuVar.a, akddVar2, vxeVar, xgnVar, null, true, true, null, arrayList, null, null, suuVar.e, false);
                }
                break;
            case 5:
                ((svl) this.b).c(this.a, null);
                break;
            case 6:
                wwh.j(((wwh) this.a).b, (alph) this.b);
                break;
            default:
                if (i == -1) {
                    ((Runnable) ((Pair) this.a).second).run();
                }
                ((aazo) this.b).d();
                break;
        }
    }

    public /* synthetic */ ijf(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
