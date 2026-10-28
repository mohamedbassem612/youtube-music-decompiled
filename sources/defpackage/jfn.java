package defpackage;

import android.graphics.Color;
import android.text.Spanned;
import android.widget.TextView;
import com.google.research.xeno.effect.Control;
import com.makeramen.RoundedImageView;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jfn implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ jfn(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v55, types: [java.lang.Object, java.util.Map$Entry] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        qxq qxqVar;
        switch (this.$cid) {
            case 0:
                ((RoundedImageView) this.a).a(((Integer) obj).intValue());
                break;
            case 1:
                anrv anrvVar = (anrv) obj;
                alay alayVar = anrvVar.c;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                Object obj2 = this.a;
                Spanned spannedK = ackj.k(null, alayVar, null, false);
                jfa jfaVar = (jfa) obj2;
                TextView textView = jfaVar.b;
                tuk.u(textView, spannedK);
                aiqe aiqeVar = anrvVar.i;
                if (aiqeVar == null) {
                    aiqeVar = aiqe.a;
                }
                jfb.g(jfaVar.a, aiqeVar, textView.getText().toString());
                break;
            case 2:
                ((vxe) obj).a((ajwo) this.a);
                break;
            case 3:
                ajnf ajnfVar = (ajnf) obj;
                aihf aihfVarCreateBuilder = ajng.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                ajng ajngVar = (ajng) aihfVarCreateBuilder.instance;
                ajnfVar.getClass();
                ajngVar.c = ajnfVar;
                ajngVar.b |= 1;
                aihf aihfVar = (aihf) this.a;
                aihfVar.copyOnWrite();
                angn angnVar = (angn) aihfVar.instance;
                ajng ajngVar2 = (ajng) aihfVarCreateBuilder.build();
                angn angnVar2 = angn.a;
                ajngVar2.getClass();
                angnVar.h = ajngVar2;
                angnVar.b |= 16;
                break;
            case 4:
                ajwo ajwoVar = jlb.a;
                ((AtomicReference) this.a).set(((jla) obj).a);
                break;
            case 5:
                ((jny) this.a).e((aqmh) obj);
                break;
            case 6:
                ((jol) this.a).c.d(new xgj(((anvo) obj).f, (amud) null));
                break;
            case 7:
                ((jol) this.a).c.d(new xgj(((ajta) obj).d, (amud) null));
                break;
            case 8:
                joz jozVar = (joz) this.a;
                jozVar.at = (aqof) obj;
                jozVar.o(((hfn) jozVar.M.io()).x());
                break;
            case 9:
                ((vxe) ((joz) this.a).H.io()).a((ajwo) obj);
                break;
            case 10:
                aigj aigjVarV = aigj.v((byte[]) obj);
                aihf aihfVar2 = (aihf) this.a;
                aihfVar2.copyOnWrite();
                agcz agczVar = (agcz) aihfVar2.instance;
                agcz agczVar2 = agcz.a;
                aigjVarV.getClass();
                agczVar.b |= 16;
                agczVar.f = aigjVarV;
                break;
            case 11:
                Control.nativeSetColorValue(((Control) obj).e.a, ((qva) this.a).b.toByteArray());
                break;
            case 12:
                Control.RuntimeOptionsSetting runtimeOptionsSetting = ((Control) obj).d;
                aihh aihhVar = (aihh) atwa.a.createBuilder();
                aihl aihlVar = aube.b;
                aihf aihfVarCreateBuilder2 = aube.a.createBuilder();
                qvg qvgVar = (qvg) this.a;
                int i = qvgVar.a.ordinal() != 1 ? 2 : 3;
                aihfVarCreateBuilder2.copyOnWrite();
                aube aubeVar = (aube) aihfVarCreateBuilder2.instance;
                aubeVar.d = i - 2;
                aubeVar.c |= 1;
                int i2 = qvgVar.b;
                aihf aihfVarCreateBuilder3 = atyv.a.createBuilder();
                float fRed = Color.red(i2);
                aihfVarCreateBuilder3.copyOnWrite();
                ((atyv) aihfVarCreateBuilder3.instance).c = fRed / 255.0f;
                float fGreen = Color.green(i2);
                aihfVarCreateBuilder3.copyOnWrite();
                ((atyv) aihfVarCreateBuilder3.instance).d = fGreen / 255.0f;
                float fBlue = Color.blue(i2);
                aihfVarCreateBuilder3.copyOnWrite();
                ((atyv) aihfVarCreateBuilder3.instance).e = fBlue / 255.0f;
                int iAlpha = Color.alpha(i2);
                if (iAlpha != 255) {
                    aihf aihfVarCreateBuilder4 = aihd.a.createBuilder();
                    aihfVarCreateBuilder4.copyOnWrite();
                    ((aihd) aihfVarCreateBuilder4.instance).b = iAlpha / 255.0f;
                    aihfVarCreateBuilder3.copyOnWrite();
                    atyv atyvVar = (atyv) aihfVarCreateBuilder3.instance;
                    aihd aihdVar = (aihd) aihfVarCreateBuilder4.build();
                    aihdVar.getClass();
                    atyvVar.f = aihdVar;
                    atyvVar.b |= 1;
                }
                atyv atyvVar2 = (atyv) aihfVarCreateBuilder3.build();
                aihfVarCreateBuilder2.copyOnWrite();
                aube aubeVar2 = (aube) aihfVarCreateBuilder2.instance;
                atyvVar2.getClass();
                aubeVar2.f = atyvVar2;
                aubeVar2.c |= 4;
                aihfVarCreateBuilder2.copyOnWrite();
                aube aubeVar3 = (aube) aihfVarCreateBuilder2.instance;
                aubeVar3.c |= 2;
                aubeVar3.e = 0.0f;
                aihhVar.e(aihlVar, (aube) aihfVarCreateBuilder2.build());
                runtimeOptionsSetting.a((atwa) aihhVar.build());
                break;
            case 13:
                int i3 = qvj.a;
                ((Control) obj).a.a(((Float) this.a.getValue()).floatValue());
                break;
            case 14:
                rbm rbmVar = qxm.z;
                Map map = ((qxr) obj).c;
                Object obj3 = this.a;
                if (map.containsKey(obj3) && (qxqVar = (qxq) map.remove(obj3)) != null) {
                    qxqVar.a();
                    break;
                }
                break;
            case 15:
                int i4 = qzl.j;
                ((Control) obj).d.a((atwa) this.a);
                break;
            case 16:
                int i5 = qzm.i;
                ((Control) obj).d.a((atwa) this.a);
                break;
            case 17:
                int i6 = qzn.b;
                Control.DoubleSetting doubleSetting = ((Control) obj).f;
                double dE = ((rfs) this.a).e();
                long j = doubleSetting.b;
                Control.nativeGetDoubleValue(j);
                Control.nativeSetDoubleValue(j, dE / 1000000.0d);
                Iterator it = doubleSetting.a.iterator();
                while (it.hasNext()) {
                    ((atst) it.next()).a();
                }
                break;
            case 18:
                Control.IntSetting intSetting = ((Control) obj).c;
                int i7 = ((rad) this.a).b;
                intSetting.a();
                Control.nativeSetIntValue(intSetting.b, i7);
                Iterator it2 = intSetting.a.iterator();
                while (it2.hasNext()) {
                    ((atst) it2.next()).c();
                }
                break;
            case 19:
                int iIntValue = ((Integer) obj).intValue();
                aihf aihfVar3 = (aihf) this.a;
                aihfVar3.copyOnWrite();
                auej auejVar = (auej) aihfVar3.instance;
                auej auejVar2 = auej.a;
                auejVar.b |= 8;
                auejVar.f = iIntValue;
                break;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                aihf aihfVar4 = (aihf) this.a;
                aihfVar4.copyOnWrite();
                auej auejVar3 = (auej) aihfVar4.instance;
                auej auejVar4 = auej.a;
                auejVar3.b |= 4;
                auejVar3.e = iIntValue2;
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
