package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gyy extends gut {
    public final awmd a;
    public final awmd b;
    public final ttm c;
    public fv d;
    public final vxe e;
    public final xgm f;
    public final jin g;
    public final ssj h;
    private final cf i;
    private final awmd k;
    private final awmd l;
    private final Executor m;
    private final abqx n;
    private final jnm o;

    public gyy(cf cfVar, abqx abqxVar, awmd awmdVar, ttm ttmVar, awmd awmdVar2, jnm jnmVar, awmd awmdVar3, awmd awmdVar4, jin jinVar, vxe vxeVar, ssj ssjVar, Executor executor, xgm xgmVar) {
        cfVar.getClass();
        this.i = cfVar;
        abqxVar.getClass();
        this.n = abqxVar;
        this.a = awmdVar;
        this.b = awmdVar2;
        ttmVar.getClass();
        this.c = ttmVar;
        jnmVar.getClass();
        this.o = jnmVar;
        awmdVar3.getClass();
        this.k = awmdVar3;
        awmdVar4.getClass();
        this.l = awmdVar4;
        this.g = jinVar;
        this.e = vxeVar;
        this.h = ssjVar;
        this.m = executor;
        this.f = xgmVar;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, zwy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, zwb] */
    @Override // defpackage.gut, defpackage.vxc
    public final void c(final ajwo ajwoVar, Map map) {
        ListenableFuture listenableFutureB;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arow.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arow.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        if (((arow) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c.isEmpty()) {
            agrx agrxVar = agso.a;
            return;
        }
        final xgn xgnVar = (xgn) tym.T(map, "com.google.android.libraries.youtube.logging.interaction_logger", xgn.l);
        if (this.o.C()) {
            Object objS = tym.S(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
            if (objS != null) {
                aoia aoiaVarX = fhz.X(this.i);
                String strAg = fhz.ag(objS);
                String strAe = fhz.ae(objS);
                agrx agrxVar2 = agso.a;
                int i = typ.a;
                if (!TextUtils.isEmpty(strAg) && TextUtils.isEmpty(strAe)) {
                    ((hmt) this.l.io()).e(strAg, aoiaVarX, xgnVar, null);
                    return;
                } else {
                    if (TextUtils.isEmpty(strAe)) {
                        return;
                    }
                    ((hmm) this.k.io()).c(strAe, aoiaVarX, null, xgnVar, null);
                    return;
                }
            }
            return;
        }
        cf cfVar = this.i;
        if (jku.c(cfVar)) {
            if (this.d == null) {
                this.d = new fu(cfVar, R.style.Theme_YouTubeMusic_FullscreenDialog).create();
                this.d.setOnShowListener(new sut(this, LayoutInflater.from(cfVar).inflate(R.layout.fullscreen_loading_spinner, (ViewGroup) null), 1, null));
            }
            this.d.show();
            abqx abqxVar = this.n;
            ?? r3 = abqxVar.d;
            wuw wuwVar = new wuw(abqxVar.b, r3.e());
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(arow.b);
            ajwoVar.c(aihlVarCheckIsLite3);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
            wuwVar.a = wuw.j(((arow) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).c);
            wuwVar.n(ajwoVar.c);
            wuwVar.r = tym.I(cfVar);
            Executor executor = this.m;
            if (((vxz) abqxVar.g).m(20, 45462649L)) {
                listenableFutureB = ahcs.f(ahcs.e(((wuv) aguu.aw((Context) abqxVar.i, wuv.class, ((syn) abqxVar.f).m(r3.e()))).b().t(ajgq.ENGAGEMENT_TYPE_YPC_GET_OFFLINE_UPSELL, agpn.b, (int) vwd.a.toMillis(), false), afwl.a(new vxq(15)), executor), afwl.d(new qzc(abqxVar, wuwVar, executor, 15)), executor);
            } else {
                listenableFutureB = ((wnh) abqxVar.h).b(wuwVar, executor, null);
            }
            if (((vxz) abqxVar.c).l(3, 45370961L, false)) {
                yno.ef(abqxVar.e, listenableFutureB, executor, 169);
            }
            taf.k(cfVar, listenableFutureB, new glm(this, 10), new twi() { // from class: gyx
                /* JADX WARN: Code duplicated, block: B:59:0x00ec  */
                /* JADX WARN: Code duplicated, block: B:61:0x00f0  */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // defpackage.twi
                public final void a(Object obj) {
                    aogb aogbVar;
                    ajwo ajwoVar2;
                    aqmi aqmiVar;
                    aqmh aqmhVar;
                    alay alayVar;
                    alay alayVar2;
                    alay alayVar3;
                    ajnf ajnfVar;
                    ajnf ajnfVar2;
                    gyy gyyVar = this.a;
                    aman amanVar = (aman) obj;
                    if (gyyVar.d(gyyVar.d)) {
                        gyyVar.d.dismiss();
                    }
                    if (amanVar != null) {
                        amao amaoVar = amanVar.d;
                        if (amaoVar == null) {
                            amaoVar = amao.a;
                        }
                        if (amaoVar.b == 131899791) {
                            amao amaoVar2 = amanVar.d;
                            if (amaoVar2 == null) {
                                amaoVar2 = amao.a;
                            }
                            aogbVar = amaoVar2.b == 131899791 ? (aogb) amaoVar2.c : aogb.a;
                        } else {
                            aogbVar = null;
                        }
                        if ((amanVar.b & 16) != 0) {
                            ajwoVar2 = amanVar.f;
                            if (ajwoVar2 == null) {
                                ajwoVar2 = ajwo.a;
                            }
                        } else {
                            ajwoVar2 = null;
                        }
                        ajwo ajwoVar3 = ajwoVar;
                        if (aogbVar == null) {
                            if (ajwoVar2 != null) {
                                gyyVar.f.hB().e(new xgj(amanVar.e, (amud) null), new xgj(ajwoVar3.c, (amud) null));
                                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(akrx.a);
                                ajwoVar2.c(aihlVarCheckIsLite4);
                                if (!ajwoVar2.j.n(aihlVarCheckIsLite4.d)) {
                                    gyyVar.e.a(ajwoVar2);
                                    return;
                                }
                                hfu hfuVar = (hfu) gyyVar.a.io();
                                try {
                                    gyyVar.h.c(ajwoVar2, agkj.j("com.google.android.libraries.youtube.logging.interaction_logger", hfuVar));
                                    hfuVar.a = new xgj(amanVar.e, (amud) null);
                                    return;
                                } catch (vxo e) {
                                    throw new AssertionError("Unknown command", e);
                                }
                            }
                            return;
                        }
                        xgn xgnVar2 = xgnVar;
                        xgnVar2.b(xhb.a(33986), ajwoVar3, null);
                        xgnVar2.d(new xgj(amanVar.e, (amud) null));
                        aauf aaufVar = (aauf) gyyVar.b.io();
                        boolean z = true;
                        sqx sqxVar = new sqx(xgnVar2, 1);
                        Activity activity = aaufVar.a;
                        if (activity.isFinishing() || activity.isDestroyed()) {
                            return;
                        }
                        if (aaufVar.d == null) {
                            vxe vxeVar = aaufVar.b;
                            aaqg aaqgVar = aaufVar.e;
                            adhv adhvVar = aaufVar.c;
                            afip afipVar = aaufVar.g;
                            abfv abfvVar = aaufVar.h;
                            adul adulVar = aaufVar.f;
                            aaufVar.d = new aaue(activity, vxeVar, aaqgVar, adhvVar, afipVar, abfvVar);
                        }
                        if (aaufVar.d.h.isShowing()) {
                            aaufVar.d.h.dismiss();
                        }
                        aaue aaueVar = aaufVar.d;
                        aaueVar.r = sqxVar;
                        aauc aaucVar = aaueVar.q;
                        aaucVar.clear();
                        aaueVar.o = xgnVar2;
                        ImageView imageView = aaueVar.c;
                        int i2 = aogbVar.c;
                        if (i2 == 12) {
                            aqmiVar = (i2 == 12 ? (aqmj) aogbVar.d : aqmj.a).b;
                            if (aqmiVar == null) {
                                aqmiVar = aqmi.a;
                            }
                        } else {
                            aqmiVar = null;
                        }
                        if (aqmiVar != null) {
                            int i3 = aqmiVar.b;
                            if ((i3 & 1) == 0 || (i3 & 2) == 0) {
                                aqmhVar = aogbVar.g;
                                if (aqmhVar == null) {
                                    aqmhVar = aqmh.a;
                                }
                            } else if (twm.v(aaueVar.a)) {
                                aqmhVar = aqmiVar.c;
                                if (aqmhVar == null) {
                                    aqmhVar = aqmh.a;
                                }
                            } else {
                                aqmhVar = aqmiVar.d;
                                if (aqmhVar == null) {
                                    aqmhVar = aqmh.a;
                                }
                            }
                        } else {
                            aqmhVar = aogbVar.g;
                            if (aqmhVar == null) {
                                aqmhVar = aqmh.a;
                            }
                        }
                        aaueVar.a(imageView, aqmhVar);
                        ImageView imageView2 = aaueVar.d;
                        aqmh aqmhVar2 = aogbVar.h;
                        if (aqmhVar2 == null) {
                            aqmhVar2 = aqmh.a;
                        }
                        aaueVar.a(imageView2, aqmhVar2);
                        TextView textView = aaueVar.e;
                        if ((aogbVar.b & 4) != 0) {
                            alayVar = aogbVar.i;
                            if (alayVar == null) {
                                alayVar = alay.a;
                            }
                        } else {
                            alayVar = null;
                        }
                        vxe vxeVar2 = aaueVar.b;
                        tuk.u(textView, vxl.a(null, alayVar, vxeVar2, false));
                        TextView textView2 = aaueVar.f;
                        if ((aogbVar.b & 8) != 0) {
                            alayVar2 = aogbVar.j;
                            if (alayVar2 == null) {
                                alayVar2 = alay.a;
                            }
                        } else {
                            alayVar2 = null;
                        }
                        tuk.u(textView2, vxl.a(null, alayVar2, vxeVar2, false));
                        aohw[] aohwVarArr = (aohw[]) aogbVar.m.toArray(new aohw[0]);
                        aaqg aaqgVar2 = aaueVar.s;
                        agke agkeVar = aaqgVar2.e;
                        ArrayList arrayList = new ArrayList();
                        int length = aohwVarArr.length;
                        int i4 = 0;
                        while (true) {
                            boolean z2 = z;
                            if (i4 >= length) {
                                break;
                            }
                            aohw aohwVar = aohwVarArr[i4];
                            aohx aohxVarA = aohx.a(aohwVar.e);
                            if (aohxVarA == null) {
                                aohxVarA = aohx.UNKNOWN_FORMAT_TYPE;
                            }
                            if (agkeVar.contains(aohxVarA)) {
                                arrayList.add(new aame(aohwVar));
                            }
                            i4++;
                            z = z2;
                        }
                        Collections.sort(arrayList, aaus.b);
                        aaucVar.setNotifyOnChange(false);
                        aaucVar.clear();
                        aaucVar.addAll(arrayList);
                        aaucVar.notifyDataSetChanged();
                        aaucVar.a(-1);
                        if (!aaucVar.isEmpty()) {
                            aaueVar.p.setVisibility(0);
                            aohx aohxVarE = aaqgVar2.e();
                            int count = aaucVar.getCount();
                            int i5 = 0;
                            while (true) {
                                if (i5 < count) {
                                    aame aameVar = (aame) aaucVar.getItem(i5);
                                    if (aameVar != null && aameVar.a == aohxVarE) {
                                        aaucVar.a(i5);
                                        break;
                                    }
                                    i5++;
                                } else {
                                    aaucVar.a(0);
                                    break;
                                }
                            }
                        } else {
                            aaueVar.p.setVisibility(8);
                        }
                        TextView textView3 = aaueVar.g;
                        int i6 = aogbVar.e;
                        if (i6 == 3) {
                            alayVar3 = i6 == 3 ? (alay) aogbVar.f : alay.a;
                        } else {
                            alayVar3 = null;
                        }
                        tuk.u(textView3, vxl.a(null, alayVar3, vxeVar2, false));
                        ajng ajngVar = aogbVar.k;
                        if (ajngVar == null) {
                            ajngVar = ajng.a;
                        }
                        if ((ajngVar.b & 1) != 0) {
                            ajng ajngVar2 = aogbVar.k;
                            if (ajngVar2 == null) {
                                ajngVar2 = ajng.a;
                            }
                            ajnfVar = ajngVar2.c;
                            if (ajnfVar == null) {
                                ajnfVar = ajnf.a;
                            }
                        } else {
                            ajnfVar = null;
                        }
                        aaueVar.n = ajnfVar;
                        ajng ajngVar3 = aogbVar.l;
                        if (((ajngVar3 == null ? ajng.a : ajngVar3).b & 1) != 0) {
                            if (ajngVar3 == null) {
                                ajngVar3 = ajng.a;
                            }
                            ajnfVar2 = ajngVar3.c;
                            if (ajnfVar2 == null) {
                                ajnfVar2 = ajnf.a;
                            }
                        } else {
                            ajnfVar2 = null;
                        }
                        aaueVar.m = ajnfVar2;
                        HashMap map2 = new HashMap();
                        HashMap map3 = new HashMap();
                        String str = xhd.c;
                        Boolean bool = Boolean.TRUE;
                        map2.put(str, bool);
                        map3.put(str, bool);
                        if (xgnVar2 != null) {
                            map2.put("com.google.android.libraries.youtube.logging.interaction_logger", xgnVar2);
                            map3.put("com.google.android.libraries.youtube.logging.interaction_logger", xgnVar2);
                        }
                        aaueVar.k.a(aaueVar.n, xgnVar2, map2);
                        aaueVar.j.a(aaueVar.m, xgnVar2, map3);
                        if (aaueVar.n == null && aaueVar.m == null) {
                            tuk.u(aaueVar.i, aaueVar.a.getResources().getText(R.string.cancel));
                        }
                        aaueVar.h.show();
                        if (xgnVar2 != null) {
                            xgnVar2.w(new xgj(aogbVar.n, (amud) null), null);
                        }
                    }
                }
            });
        }
    }

    public final boolean d(Dialog dialog) {
        return jku.c(this.i) && dialog != null && dialog.isShowing();
    }
}
