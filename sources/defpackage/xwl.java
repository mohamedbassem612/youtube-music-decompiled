package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xwl implements tae {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xwl(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0488  */
    /* JADX WARN: Code duplicated, block: B:134:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:56:0x017a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0195 A[LOOP:3: B:57:0x0193->B:58:0x0195, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v65, types: [awut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, xla] */
    /* JADX WARN: Type inference failed for: r1v78, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v80, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v82, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v85, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v87, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v89, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v91, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v93, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v95, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v97, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v99, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r3v22, types: [eug, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.tae, defpackage.twi
    public final void a(Object obj) {
        aihf aihfVarCreateBuilder;
        amum[] amumVarArr;
        amup amupVar;
        int i;
        Object obj2;
        apri apriVar;
        int i2 = -1;
        int i3 = 6;
        int i4 = 2;
        switch (this.$cid) {
            case 0:
                taf.h(((xwm) this.a).b.a(new xwd(this.b, i4), MoreExecutors.directExecutor()), MoreExecutors.directExecutor(), new xwk(1));
                break;
            case 1:
                Object obj3 = this.a;
                tai taiVar = tai.b;
                Object obj4 = this.b;
                ((xfc) obj4).f.b(taiVar, new vwh(obj4, (alox) obj, obj3, 14, (short[]) null));
                break;
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    ((yar) this.a).m((xvn) this.b);
                }
                break;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    Object obj5 = this.b;
                    yar yarVar = (yar) this.a;
                    yarVar.e.remove(obj5);
                    yarVar.b.remove(obj5);
                    yarVar.k();
                }
                break;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    Object obj6 = this.b;
                    yar yarVar2 = (yar) this.a;
                    yarVar2.d.remove(obj6);
                    yarVar2.b.remove(obj6);
                    yarVar2.k();
                }
                break;
            case 5:
                ((yar) this.a).o((xvk) this.b);
                break;
            case 6:
                if (((Boolean) obj).booleanValue()) {
                    Object obj7 = this.b;
                    yar yarVar3 = (yar) this.a;
                    yarVar3.c.remove(obj7);
                    yarVar3.b.remove(obj7);
                    yarVar3.j.remove(((xvn) obj7).n);
                    yarVar3.k();
                }
                break;
            case 7:
                ((yar) this.a).m((xvn) this.b);
                break;
            case 8:
                if (((Boolean) obj).booleanValue()) {
                    ((yaq) this.a).a = this.b.H();
                }
                break;
            case 9:
                int i5 = ((xva) obj).a;
                Object obj8 = this.a;
                if (i5 == -2) {
                    agrx agrxVar = agso.a;
                    ((yab) obj8).h();
                } else if (i5 == -1) {
                    ((agrc) ((agrc) yaz.n.c().i(agso.a, "MDX.DialRecoverer")).k("com/google/android/libraries/youtube/mdx/remote/internal/DialSessionRecoverer", "appStatusReceived", 172, "DialSessionRecoverer.java")).t("DIAL screen found but app is not found");
                    ((yab) obj8).i(7);
                } else if (i5 == 0) {
                    ((agrc) ((agrc) yaz.n.c().i(agso.a, "MDX.DialRecoverer")).k("com/google/android/libraries/youtube/mdx/remote/internal/DialSessionRecoverer", "appStatusReceived", 166, "DialSessionRecoverer.java")).t("DIAL screen found but app is installable");
                    ((yab) obj8).i(6);
                } else if (i5 == 1) {
                    Object obj9 = this.b;
                    agrx agrxVar2 = agso.a;
                    ((yab) obj8).c((dii) obj9);
                } else if (i5 != 2) {
                    ((agrc) ((agrc) yaz.n.c().i(agso.a, "MDX.DialRecoverer")).k("com/google/android/libraries/youtube/mdx/remote/internal/DialSessionRecoverer", "appStatusReceived", 178, "DialSessionRecoverer.java")).t("DIAL screen found but app is hidden");
                    ((yab) obj8).i(8);
                } else {
                    agrx agrxVar3 = agso.a;
                    ((yab) obj8).i(4);
                }
                ((yaz) obj8).p = null;
                break;
            case 10:
                ((ycp) this.a).k((xvj) this.b, (xze) ((Optional) obj).orElse(null));
                break;
            case 11:
                ((abzn) this.a).c((Optional) obj, this.b);
                break;
            case 12:
                allm allmVar = (allm) obj;
                if (allmVar == null || (allmVar.b & 2) == 0) {
                    zvp.a(zvn.b, zvm.m, "AttestationDelayedEventDispatcher.dispatchEvents() response from AttestationChallengeService is null");
                } else {
                    abzq abzqVar = (abzq) this.a;
                    abzo abzoVar = (abzo) abzqVar.c.io();
                    String str = allmVar.d;
                    aihf aihfVarCreateBuilder2 = aopm.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    aopm aopmVar = (aopm) aihfVarCreateBuilder2.instance;
                    str.getClass();
                    aopmVar.b |= 1;
                    aopmVar.c = str;
                    aopm aopmVar2 = (aopm) aihfVarCreateBuilder2.build();
                    akki akkiVarD = abzn.d(abzqVar.d);
                    if (akkiVarD == null) {
                        aihfVarCreateBuilder = amup.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        amup amupVar2 = (amup) aihfVarCreateBuilder.instance;
                        amupVar2.b |= 1;
                        amupVar2.c = "https://www.youtube.com/api/stats/atr?ns=yt&ver=2";
                        amumVarArr = abzq.b;
                        int length = amumVarArr.length;
                        for (int i6 = 0; i6 < 3; i6++) {
                            amum amumVar = amumVarArr[i6];
                            aihf aihfVarCreateBuilder3 = amun.a.createBuilder();
                            aihfVarCreateBuilder3.copyOnWrite();
                            amun amunVar = (amun) aihfVarCreateBuilder3.instance;
                            amunVar.c = amumVar.m;
                            amunVar.b |= 1;
                            aihfVarCreateBuilder.copyOnWrite();
                            amup amupVar3 = (amup) aihfVarCreateBuilder.instance;
                            amun amunVar2 = (amun) aihfVarCreateBuilder3.build();
                            amunVar2.getClass();
                            amupVar3.a();
                            amupVar3.e.add(amunVar2);
                        }
                        amupVar = (amup) aihfVarCreateBuilder.build();
                    } else {
                        amup amupVar4 = akkiVarD.d;
                        if (amupVar4 == null) {
                            amupVar4 = amup.a;
                        }
                        if (amupVar4.c.isEmpty()) {
                            aihfVarCreateBuilder = amup.a.createBuilder();
                            aihfVarCreateBuilder.copyOnWrite();
                            amup amupVar5 = (amup) aihfVarCreateBuilder.instance;
                            amupVar5.b |= 1;
                            amupVar5.c = "https://www.youtube.com/api/stats/atr?ns=yt&ver=2";
                            amumVarArr = abzq.b;
                            int length2 = amumVarArr.length;
                            while (i6 < 3) {
                                amum amumVar2 = amumVarArr[i6];
                                aihf aihfVarCreateBuilder4 = amun.a.createBuilder();
                                aihfVarCreateBuilder4.copyOnWrite();
                                amun amunVar3 = (amun) aihfVarCreateBuilder4.instance;
                                amunVar3.c = amumVar2.m;
                                amunVar3.b |= 1;
                                aihfVarCreateBuilder.copyOnWrite();
                                amup amupVar6 = (amup) aihfVarCreateBuilder.instance;
                                amun amunVar4 = (amun) aihfVarCreateBuilder4.build();
                                amunVar4.getClass();
                                amupVar6.a();
                                amupVar6.e.add(amunVar4);
                            }
                            amupVar = (amup) aihfVarCreateBuilder.build();
                        } else {
                            amupVar = akkiVarD.d;
                            if (amupVar == null) {
                                amupVar = amup.a;
                            }
                        }
                    }
                    Object obj10 = this.b;
                    wjm wjmVar = new wjm(amupVar);
                    zxj zxjVar = (zxj) abzoVar.a.io();
                    zxjVar.getClass();
                    Executor executor = (Executor) abzoVar.b.io();
                    executor.getClass();
                    ((Context) abzoVar.c.io()).getClass();
                    ek ekVar = (ek) abzoVar.d.io();
                    ekVar.getClass();
                    zwb zwbVar = (zwb) abzoVar.e.io();
                    zwbVar.getClass();
                    ci ciVar = (ci) abzoVar.f.io();
                    ciVar.getClass();
                    tfq tfqVar = (tfq) abzoVar.g.io();
                    tfqVar.getClass();
                    ztf ztfVar = (ztf) abzoVar.h.io();
                    ztfVar.getClass();
                    vxu vxuVar = (vxu) abzoVar.i.io();
                    vxuVar.getClass();
                    acqf acqfVar = (acqf) abzoVar.j.io();
                    acqfVar.getClass();
                    abzq abzqVar2 = (abzq) abzoVar.k.io();
                    abzqVar2.getClass();
                    aopmVar2.getClass();
                    abzn abznVar = new abzn(zxjVar, executor, ekVar, zwbVar, ciVar, tfqVar, ztfVar, vxuVar, acqfVar, abzqVar2, aopmVar2, wjmVar);
                    abznVar.b.execute(new abwl(abznVar, obj10, i3));
                }
                break;
            case 13:
                acrq acrqVar = (acrq) this.b;
                actm actmVar = acrqVar.d;
                alql alqlVar = (alql) obj;
                actmVar.f("r_sqr");
                actmVar.b(false, null);
                Object obj11 = this.a;
                apfu apfuVar = ((acux) obj11).e;
                if (alqlVar != null) {
                    acsj acsjVar = acrqVar.g;
                    if (acsjVar.b() > 0) {
                        if (apfuVar != null) {
                            Object obj12 = acsjVar.b;
                            if (!hno.bi(apfuVar)) {
                                new awwf(null).c();
                            }
                        }
                        zwa zwaVar = ((wkf) obj11).u;
                        if (((hno) acsjVar.b).ao()) {
                            awro.t(acsjVar.e, null, 0, new ysb(acsjVar, zwaVar, alqlVar, (awoq) null, 2), 3);
                        } else {
                            acsjVar.e(zwaVar, alqlVar);
                            new awwf(null).c();
                        }
                    }
                }
                new awwf(null).c();
                break;
            case 14:
                actr actrVar = (actr) this.b;
                actp actpVar = actrVar.h;
                actpVar.getClass();
                actrVar.b.j((ajwo) obj, (String) this.a, actpVar, zzd.a);
                break;
            case 15:
                ajwo ajwoVar = (ajwo) obj;
                actp actpVar2 = (actp) this.b;
                if (!actpVar2.e) {
                    actpVar2.b.k(ajwoVar, this.a, zzd.a);
                }
                break;
            case 16:
                wjf wjfVar = (wjf) obj;
                abnl abnlVar = ((abuu) this.b).a;
                Object obj13 = this.a;
                ajwo ajwoVar2 = abnlVar.b;
                actv actvVar = ((acuu) obj13).f;
                if (ajwoVar2 == null) {
                    actvVar.b.f(19, "ReelPlaybackController cannot trigger GetReelItemWatch prefetch due to null command");
                    twu.c(6, "ReelPlaybackController cannot trigger GetReelItemWatch prefetch due to null command", null);
                } else {
                    actvVar.E(new acss(ajwoVar2, wjfVar, false));
                }
                break;
            case 17:
                this.a.b(this.b, (byte[]) obj);
                break;
            case 18:
                tnx tnxVar = (tnx) obj;
                boolean zH = tnxVar.h();
                ?? r3 = this.b;
                if (zH) {
                    r3.b(((adjh) this.a).a.d((byte[]) tnxVar.c().a));
                } else {
                    r3.e(tnxVar.a().a);
                }
                break;
            default:
                aeke aekeVar = (aeke) this.a;
                aekeVar.p = (String) obj;
                ArrayList arrayList = new ArrayList(Arrays.asList(aekeVar.q, aekeVar.r));
                for (int i7 = 0; i7 < aekeVar.o.c.size(); i7++) {
                    Iterator it = ((apri) aekeVar.o.c.get(i7)).c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            apra apraVar = (apra) it.next();
                            if (ahno.ag((apraVar.b == 64166933 ? (apqz) apraVar.c : apqz.a).d, aekeVar.p)) {
                                i2 = i7;
                                for (i = 0; i < aekeVar.o.c.size(); i++) {
                                    obj2 = this.b;
                                    apriVar = (apri) aekeVar.o.c.get(i);
                                    if (apriVar.d || i2 == i) {
                                        aekeVar.l((LayoutInflater) obj2, (RadioGroup) arrayList.get(i), apriVar);
                                    } else {
                                        LayoutInflater layoutInflater = (LayoutInflater) obj2;
                                        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.voice_language_selector_section_title_collapsed, (ViewGroup) arrayList.get(i), false);
                                        TextView textView = (TextView) linearLayout.findViewById(R.id.collapsed_title_text);
                                        alay alayVar = apriVar.b;
                                        if (alayVar == null) {
                                            alayVar = alay.a;
                                        }
                                        textView.setText(ackj.k(null, alayVar, null, false));
                                        ((RadioGroup) arrayList.get(i)).addView(linearLayout);
                                        linearLayout.setOnClickListener(new aekd(aekeVar, layoutInflater, (RadioGroup) arrayList.get(i), apriVar));
                                    }
                                }
                                aekeVar.n.l(new xgj(xhb.b(95981)));
                                break;
                            }
                        }
                    }
                }
                while (i < aekeVar.o.c.size()) {
                    obj2 = this.b;
                    apriVar = (apri) aekeVar.o.c.get(i);
                    if (apriVar.d) {
                        aekeVar.l((LayoutInflater) obj2, (RadioGroup) arrayList.get(i), apriVar);
                    } else {
                        aekeVar.l((LayoutInflater) obj2, (RadioGroup) arrayList.get(i), apriVar);
                    }
                }
                aekeVar.n.l(new xgj(xhb.b(95981)));
                break;
        }
    }

    public /* synthetic */ xwl(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
