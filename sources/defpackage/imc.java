package defpackage;

import android.R;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import j$.util.function.Consumer$CC;
import java.util.AbstractList;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class imc implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ imc(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v34, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v35, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        int i = 4;
        switch (this.$cid) {
            case 0:
                ((acvc) obj).a.add(this.a);
                break;
            case 1:
                ((acvc) obj).a.remove(this.a);
                break;
            case 2:
                apji apjiVar = (apji) obj;
                aihf aihfVar = (aihf) this.a;
                aihfVar.copyOnWrite();
                anne anneVar = (anne) aihfVar.instance;
                anne anneVar2 = anne.a;
                apjiVar.getClass();
                anneVar.g = apjiVar;
                anneVar.b |= 64;
                break;
            case 3:
                this.a.add((aejg) obj);
                break;
            case 4:
                anwt anwtVar = (anwt) obj;
                agrf agrfVar = itj.a;
                aihf aihfVarCreateBuilder = apox.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                apox apoxVar = (apox) aihfVarCreateBuilder.instance;
                anwtVar.getClass();
                apoxVar.aq = anwtVar;
                apoxVar.c |= 536870912;
                ((aihf) this.a).ck(aihfVarCreateBuilder);
                break;
            case 5:
                anwt anwtVar2 = (anwt) obj;
                agrf agrfVar2 = itj.a;
                aihf aihfVarCreateBuilder2 = apox.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                apox apoxVar2 = (apox) aihfVarCreateBuilder2.instance;
                anwtVar2.getClass();
                apoxVar2.aq = anwtVar2;
                apoxVar2.c |= 536870912;
                ((aihf) this.a).ck(aihfVarCreateBuilder2);
                break;
            case 6:
                anwt anwtVar3 = (anwt) obj;
                agrf agrfVar3 = itj.a;
                aihf aihfVarCreateBuilder3 = apox.a.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                apox apoxVar3 = (apox) aihfVarCreateBuilder3.instance;
                anwtVar3.getClass();
                apoxVar3.aq = anwtVar3;
                apoxVar3.c |= 536870912;
                ((aihf) this.a).ck(aihfVarCreateBuilder3);
                break;
            case 7:
                ((aihf) this.a).bQ((apji) obj);
                break;
            case 8:
                apji apjiVar2 = (apji) obj;
                aihf aihfVar2 = (aihf) this.a;
                aihfVar2.copyOnWrite();
                alfr alfrVar = (alfr) aihfVar2.instance;
                alfr alfrVar2 = alfr.a;
                apjiVar2.getClass();
                alfrVar.c = apjiVar2;
                alfrVar.b |= 1;
                break;
            case 9:
                String str = (String) obj;
                aihf aihfVar3 = (aihf) this.a;
                aihfVar3.copyOnWrite();
                apyy apyyVar = (apyy) aihfVar3.instance;
                apyy apyyVar2 = apyy.a;
                str.getClass();
                apyyVar.b |= 4;
                apyyVar.e = str;
                break;
            case 10:
                apyy apyyVar3 = (apyy) obj;
                aihf aihfVarCreateBuilder4 = apyx.a.createBuilder();
                aihfVarCreateBuilder4.copyOnWrite();
                apyx apyxVar = (apyx) aihfVarCreateBuilder4.instance;
                apyyVar3.getClass();
                apyxVar.c = apyyVar3;
                apyxVar.b = 3;
                ((aihf) this.a).cm(aihfVarCreateBuilder4);
                break;
            case 11:
                ((iwj) this.a).j((ajnf) obj);
                break;
            case 12:
                ((iwj) this.a).j((ajnf) obj);
                break;
            case 13:
                ((iwj) this.a).j((ajnf) obj);
                break;
            case 14:
                ((AbstractList) this.a).add(obj);
                break;
            case 15:
                agrf agrfVar4 = jah.a;
                this.a.invoke(obj);
                break;
            case 16:
                agrf agrfVar5 = jah.a;
                this.a.invoke(obj);
                break;
            case 17:
                ajta ajtaVar = (ajta) obj;
                if (!ajtaVar.c.isEmpty()) {
                    jbf jbfVar = (jbf) this.a;
                    if (jbfVar.f == null) {
                        jbfVar.f = (jbw) adul.e(jbfVar.c.a, ajtaVar, null);
                    }
                    ixi ixiVar = jbfVar.d.z;
                    ixiVar.f();
                    adly adlyVar = new adly();
                    adlyVar.a(jbfVar.b);
                    adlyVar.f("backgroundColor", Integer.valueOf(jbfVar.a.getContext().getColor(R.color.transparent)));
                    adlyVar.f("chipCloudController", ixiVar);
                    jbfVar.f.hU(adlyVar, ajtaVar);
                    ViewGroup viewGroup = jbfVar.e;
                    if (viewGroup.indexOfChild(jbfVar.f.a()) < 0) {
                        viewGroup.addView(jbfVar.f.a());
                    }
                    viewGroup.setVisibility(0);
                }
                break;
            case 18:
                ((TextView) obj).setTextColor(((jbm) this.a).b);
                break;
            case 19:
                Object obj2 = this.a;
                View view = ((xta) obj2).a;
                ((YouTubeTextView) view).d();
                tuk.u((TextView) view, ackj.k(null, (alay) obj, new jdc(obj2, i), false));
                break;
            default:
                anrv anrvVar = (anrv) obj;
                alay alayVar = anrvVar.c;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                Object obj3 = this.a;
                Spanned spannedK = ackj.k(null, alayVar, null, false);
                jfb jfbVar = (jfb) obj3;
                TextView textView = jfbVar.d;
                tuk.u(textView, spannedK);
                aiqe aiqeVar = anrvVar.i;
                if (aiqeVar == null) {
                    aiqeVar = aiqe.a;
                }
                jfb.g(jfbVar.b, aiqeVar, textView.getText().toString());
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
