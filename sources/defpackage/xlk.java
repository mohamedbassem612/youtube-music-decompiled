package defpackage;

import android.content.Context;
import android.os.Bundle;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.gms.cast.CastDevice;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xlk extends awrb implements awqg {
    public xlk(Object obj) {
        super(1, obj, xll.class, "createMediaHubItems", "createMediaHubItems(Ljava/util/List;)Lcom/google/protos/youtube/client/blocks/api/mdx/MediaHubUiDeviceItemsResult;", 0);
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0405  */
    /* JADX WARN: Code duplicated, block: B:127:0x0410  */
    /* JADX WARN: Code duplicated, block: B:129:0x041c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0422  */
    /* JADX WARN: Code duplicated, block: B:134:0x042c  */
    /* JADX WARN: Code duplicated, block: B:137:0x0431  */
    /* JADX WARN: Code duplicated, block: B:142:0x0443  */
    /* JADX WARN: Code duplicated, block: B:145:0x044b  */
    /* JADX WARN: Code duplicated, block: B:146:0x0456  */
    /* JADX WARN: Code duplicated, block: B:148:0x045e  */
    /* JADX WARN: Code duplicated, block: B:149:0x0469  */
    /* JADX WARN: Code duplicated, block: B:151:0x0473  */
    /* JADX WARN: Code duplicated, block: B:154:0x049c  */
    /* JADX WARN: Code duplicated, block: B:156:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:157:0x04af  */
    /* JADX WARN: Code duplicated, block: B:177:0x0557  */
    /* JADX WARN: Code duplicated, block: B:179:0x0561  */
    /* JADX WARN: Code duplicated, block: B:181:0x0566  */
    /* JADX WARN: Code duplicated, block: B:182:0x0568  */
    /* JADX WARN: Code duplicated, block: B:183:0x056a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object, wjf] */
    /* JADX WARN: Type inference failed for: r5v53, types: [java.lang.Object, wjf] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, java.util.List] */
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
    @Override // defpackage.awqg
    public final /* synthetic */ Object invoke(Object obj) {
        String string;
        Bundle bundle;
        int i;
        int i2;
        int iA;
        int i3;
        airx airxVar;
        Object obj2;
        asnm asnmVar;
        askp askpVar;
        int i4;
        Object obj3;
        xvq xvqVar;
        String string2;
        xvp xvpVarA;
        aisk aiskVar;
        int iBt;
        String str;
        int i5;
        long j;
        yar yarVar;
        int i6;
        int i7;
        xvp xvpVarA2;
        xvp xvpVarA3;
        airx airxVar2;
        xvp xvpVarA4;
        List list = (List) obj;
        list.getClass();
        xll xllVar = (xll) this.receiver;
        int i8 = xll.p;
        aihf aihfVarCreateBuilder = asem.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        atqn.J(aihfVarCreateBuilder);
        ArrayList arrayList = new ArrayList(atqq.N(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xvq xvqVar2 = (xvq) it.next();
            aihf aihfVarCreateBuilder2 = asek.a.createBuilder();
            aihfVarCreateBuilder2.getClass();
            xql xqlVar = xllVar.b;
            xsa xsaVar = xqlVar.k;
            dii diiVar = xvqVar2.a;
            String str2 = "";
            if (xsaVar.d(diiVar)) {
                dov dovVar = xsaVar.e;
                CastDevice castDeviceK = xrx.k(diiVar);
                if (castDeviceK == null || (string = castDeviceK.n) == null) {
                    string = "";
                }
            } else if (!xrx.h(diiVar) || (bundle = diiVar.s) == null) {
                if (xrx.g(diiVar)) {
                    string = diiVar.d;
                } else if (xvqVar2.l()) {
                    string = "THIS_DEVICE";
                } else {
                    string = "";
                }
            } else if (!bundle.containsKey("lounge_device_id") || (string = bundle.getString("lounge_device_id")) == null) {
                string = "";
            }
            string.getClass();
            atqn.L(string, aihfVarCreateBuilder2);
            aihf aihfVarCreateBuilder3 = asei.a.createBuilder();
            aihfVarCreateBuilder3.getClass();
            String strC = xvqVar2.c();
            strC.getClass();
            aihfVarCreateBuilder3.copyOnWrite();
            asei aseiVar = (asei) aihfVarCreateBuilder3.instance;
            aseiVar.b = 1;
            aseiVar.c = strC;
            aihn aihnVarBuild = aihfVarCreateBuilder3.build();
            aihnVarBuild.getClass();
            aihfVarCreateBuilder2.copyOnWrite();
            asek asekVar = (asek) aihfVarCreateBuilder2.instance;
            asekVar.d = (asei) aihnVarBuild;
            int i9 = 2;
            asekVar.b |= 2;
            aihf aihfVarCreateBuilder4 = asej.a.createBuilder();
            aihfVarCreateBuilder4.getClass();
            atqn.R(xqlVar.s(xvqVar2), aihfVarCreateBuilder4);
            askp askpVar2 = askp.a;
            aihf aihfVarCreateBuilder5 = askpVar2.createBuilder();
            aihfVarCreateBuilder5.getClass();
            String string3 = xvqVar2.k() ? xqlVar.c.getString(R.string.this_device_title) : xvqVar2.c;
            string3.getClass();
            atqn.j(string3, aihfVarCreateBuilder5);
            atqn.P(atqn.i(aihfVarCreateBuilder5), aihfVarCreateBuilder4);
            if (xvqVar2.l()) {
                i = 5;
            } else {
                int iA2 = xvqVar2.a();
                if (iA2 != 1) {
                    i = (iA2 == 2 || iA2 == 12 || xvqVar2.n()) ? 3 : 7;
                } else {
                    i = 2;
                }
            }
            atqn.Q(i, aihfVarCreateBuilder4);
            xvq xvqVar3 = xqlVar.f;
            if (xvqVar2.l() || !xvqVar2.c().equals(xqlVar.e.c())) {
                i2 = (xvqVar3 == null || !xvqVar2.c().equals(xvqVar3.c())) ? 2 : 3;
            } else {
                i2 = 4;
            }
            aihfVarCreateBuilder4.copyOnWrite();
            asej asejVar = (asej) aihfVarCreateBuilder4.instance;
            asejVar.g = i2 - 1;
            asejVar.b |= 16;
            if (xqlVar.o() && xvqVar2.equals(xqlVar.e)) {
                iA = xqlVar.q;
                if (iA < 0) {
                    iA = xqlVar.l.a();
                }
            } else {
                iA = 0;
            }
            aihfVarCreateBuilder4.copyOnWrite();
            asej asejVar2 = (asej) aihfVarCreateBuilder4.instance;
            asejVar2.b |= 64;
            asejVar2.i = iA;
            if (!xrx.j(diiVar) || (xvpVarA4 = xqlVar.t.a(xvqVar2.c())) == null) {
                if (!xqlVar.e.l() && xqlVar.e.equals(xvqVar2)) {
                    Iterator it2 = xqlVar.t.f.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            xvp xvpVar = (xvp) it2.next();
                            int i10 = i9;
                            if (Collections.disjoint(xqlVar.p.b(diiVar), xvpVar.v())) {
                                i9 = i10;
                            } else {
                                airxVar2 = xvpVar.b;
                            }
                        }
                    }
                }
                int i11 = i9;
                airx airxVar3 = airx.a;
                Optional optionalI = xqlVar.i(xvqVar2);
                if (optionalI.isPresent()) {
                    ?? r13 = optionalI.get();
                    abvk abvkVarB = xqlVar.b();
                    aihf aihfVarCreateBuilder6 = airxVar3.createBuilder();
                    String strG = r13.G();
                    aihfVarCreateBuilder6.copyOnWrite();
                    airx airxVar4 = (airx) aihfVarCreateBuilder6.instance;
                    strG.getClass();
                    airxVar4.b |= 2;
                    airxVar4.d = strG;
                    abuz abuzVarAf = r13.af();
                    if (abuzVarAf.b.isEmpty()) {
                        asnmVar = asnm.a;
                    } else {
                        aihf aihfVarCreateBuilder7 = asnm.a.createBuilder();
                        aihf aihfVarCreateBuilder8 = asno.a.createBuilder();
                        String str3 = ((aqmg) abuzVarAf.l().c.get(0)).c;
                        aihfVarCreateBuilder8.copyOnWrite();
                        asno asnoVar = (asno) aihfVarCreateBuilder8.instance;
                        str3.getClass();
                        asnoVar.c = 1;
                        asnoVar.d = str3;
                        asno asnoVar2 = (asno) aihfVarCreateBuilder8.build();
                        aihfVarCreateBuilder7.copyOnWrite();
                        asnm asnmVar2 = (asnm) aihfVarCreateBuilder7.instance;
                        asnoVar2.getClass();
                        asnmVar2.a();
                        asnmVar2.c.add(asnoVar2);
                        asnmVar = (asnm) aihfVarCreateBuilder7.build();
                    }
                    aihfVarCreateBuilder6.copyOnWrite();
                    airx airxVar5 = (airx) aihfVarCreateBuilder6.instance;
                    asnmVar.getClass();
                    airxVar5.f = asnmVar;
                    airxVar5.b |= 8;
                    aihf aihfVarCreateBuilder9 = aisk.a.createBuilder();
                    if (abvkVarB.X()) {
                        aihfVarCreateBuilder9.copyOnWrite();
                        aisk aiskVar2 = (aisk) aihfVarCreateBuilder9.instance;
                        aiskVar2.c = i11;
                        aiskVar2.b |= 1;
                        i3 = 3;
                    } else if (abvkVarB.U()) {
                        aihfVarCreateBuilder9.copyOnWrite();
                        aisk aiskVar3 = (aisk) aihfVarCreateBuilder9.instance;
                        i3 = 3;
                        aiskVar3.c = 3;
                        aiskVar3.b |= 1;
                    } else {
                        i3 = 3;
                        aihfVarCreateBuilder9.copyOnWrite();
                        aisk aiskVar4 = (aisk) aihfVarCreateBuilder9.instance;
                        aiskVar4.c = 1;
                        aiskVar4.b |= 1;
                    }
                    aisk aiskVar5 = (aisk) aihfVarCreateBuilder9.build();
                    aihfVarCreateBuilder6.copyOnWrite();
                    airx airxVar6 = (airx) aihfVarCreateBuilder6.instance;
                    aiskVar5.getClass();
                    airxVar6.h = aiskVar5;
                    airxVar6.b |= 131072;
                    askp askpVarD = xqlVar.d(r13, abvkVarB);
                    aihfVarCreateBuilder6.copyOnWrite();
                    airx airxVar7 = (airx) aihfVarCreateBuilder6.instance;
                    askpVarD.getClass();
                    airxVar7.e = askpVarD;
                    airxVar7.b |= 4;
                    if (abvkVarB.Y()) {
                        askpVar = askpVar2;
                    } else {
                        aihf aihfVarCreateBuilder10 = askpVar2.createBuilder();
                        String strB = r13.B();
                        aihfVarCreateBuilder10.copyOnWrite();
                        askp askpVar3 = (askp) aihfVarCreateBuilder10.instance;
                        strB.getClass();
                        askpVar3.b |= 1;
                        askpVar3.c = strB;
                        askpVar = (askp) aihfVarCreateBuilder10.build();
                    }
                    aihfVarCreateBuilder6.copyOnWrite();
                    airx airxVar8 = (airx) aihfVarCreateBuilder6.instance;
                    askpVar.getClass();
                    airxVar8.g = askpVar;
                    airxVar8.b |= 16;
                    if (xqlVar.b().U()) {
                        i4 = xqlVar.b().Y() ? i3 : 2;
                    } else {
                        i4 = 1;
                    }
                    aihfVarCreateBuilder6.copyOnWrite();
                    airx airxVar9 = (airx) aihfVarCreateBuilder6.instance;
                    airxVar9.c = i4 - 1;
                    airxVar9.b |= 1;
                    airx airxVar10 = (airx) aihfVarCreateBuilder6.build();
                    ahfi ahfiVar = xqlVar.w;
                    abvk abvkVarB2 = xqlVar.b();
                    ahfiVar.a = airxVar10;
                    ahfiVar.b = abvkVarB2.d();
                    if (ahfiVar.b != null && abvkVarB2.i() != null) {
                        acfw acfwVarI = abvkVarB2.i();
                        Object obj4 = ahfiVar.b;
                        long jA = acfwVarI.a();
                        abnl abnlVar = (abnl) obj4;
                        aihf builder = abnlVar.a.toBuilder();
                        builder.copyOnWrite();
                        jrk jrkVar = (jrk) builder.instance;
                        jrkVar.b |= SemanticState.LiveRegion;
                        jrkVar.n = jA;
                        abnlVar.a = (jrk) builder.build();
                    }
                    airxVar = airxVar10;
                } else {
                    askpVar2 = askpVar2;
                    str2 = "";
                    i3 = 3;
                    airxVar = airxVar3;
                }
                ahfi ahfiVar2 = xqlVar.w;
                obj3 = airxVar;
                if (xvqVar2.k() && (obj2 = ahfiVar2.c) != null && (((airx) obj2).b & 2) != 0 && xqlVar.v.l(175, 45694635L, false)) {
                    obj3 = airxVar;
                    obj3 = airxVar;
                    obj3 = airxVar;
                    obj3 = ahfiVar2.c;
                }
                obj3 = airxVar;
                obj3 = airxVar;
                obj3 = airxVar;
                obj3 = airxVar;
                obj3 = airxVar;
                obj3 = airxVar;
                obj3.getClass();
                aihfVarCreateBuilder4.copyOnWrite();
                asej asejVar3 = (asej) aihfVarCreateBuilder4.instance;
                asejVar3.f = (airx) obj3;
                asejVar3.b |= 8;
                aihf aihfVarCreateBuilder11 = askpVar2.createBuilder();
                aihfVarCreateBuilder11.getClass();
                xvqVar = xqlVar.f;
                if (xvqVar == null && diiVar.equals(xvqVar.a)) {
                    string2 = xqlVar.c.getString(R.string.connecting_subtitle);
                } else if (xrx.j(diiVar)) {
                    xvpVarA = xqlVar.t.a(xvqVar2.c());
                    if (xvpVarA != null) {
                        aiskVar = xvpVarA.b.h;
                        if (aiskVar == null) {
                            aiskVar = aisk.a;
                        }
                        iBt = a.bt(aiskVar.c);
                        if (iBt == 0) {
                            iBt = 1;
                        }
                        str = xvpVarA.h;
                        if (str != null || iBt == 2) {
                            i5 = 1;
                        } else {
                            i5 = 1;
                            if (iBt != 1) {
                                string2 = xqlVar.c.getString(R.string.playing_device, str);
                            }
                        }
                        if (xvqVar2.m()) {
                            Context context = xqlVar.c;
                            Object[] objArr = new Object[i5];
                            objArr[0] = "YouTube";
                            string2 = context.getString(R.string.playing_device, objArr);
                        } else {
                            string2 = str2;
                        }
                    } else if (xvqVar2.m()) {
                        string2 = xqlVar.c.getString(R.string.playing_device, "YouTube");
                    } else {
                        string2 = str2;
                    }
                } else if (!xqlVar.i(xvqVar2).isPresent() && !xqlVar.b().Y()) {
                    string2 = xqlVar.c.getString(R.string.playing_device, xqlVar.d(xqlVar.i(xvqVar2).get(), xqlVar.b()).c);
                } else if (xvqVar2.m()) {
                    string2 = xqlVar.c.getString(R.string.playing_device, "YouTube");
                } else {
                    string2 = str2;
                }
                string2.getClass();
                atqn.j(string2, aihfVarCreateBuilder11);
                atqn.O(atqn.i(aihfVarCreateBuilder11), aihfVarCreateBuilder4);
                aihf aihfVarCreateBuilder12 = aseh.a.createBuilder();
                aihfVarCreateBuilder12.getClass();
                long jB = xvqVar2.b(xqlVar.n);
                aihfVarCreateBuilder12.copyOnWrite();
                aseh asehVar = (aseh) aihfVarCreateBuilder12.instance;
                asehVar.b |= 1;
                asehVar.c = jB;
                j = 0;
                if (xrx.j(diiVar) && (xvpVarA3 = xqlVar.t.a(xvqVar2.c())) != null) {
                    j = xvpVarA3.j;
                }
                aihfVarCreateBuilder12.copyOnWrite();
                aseh asehVar2 = (aseh) aihfVarCreateBuilder12.instance;
                asehVar2.b |= 2;
                asehVar2.d = j;
                yarVar = xqlVar.t;
                xvr xvrVarC = yarVar.c(diiVar.s);
                boolean z = (xvrVarC instanceof xvj) ? !(xvrVarC == null || !xvrVarC.j()) : xvrVarC.j() && xvqVar2.m();
                aihfVarCreateBuilder12.copyOnWrite();
                aseh asehVar3 = (aseh) aihfVarCreateBuilder12.instance;
                asehVar3.b |= 16;
                asehVar3.e = z;
                aihn aihnVarBuild2 = aihfVarCreateBuilder12.build();
                aihnVarBuild2.getClass();
                aihfVarCreateBuilder4.copyOnWrite();
                asej asejVar4 = (asej) aihfVarCreateBuilder4.instance;
                asejVar4.j = (aseh) aihnVarBuild2;
                asejVar4.b |= SemanticState.Focused;
                if (xrx.j(diiVar)) {
                    xvpVarA2 = yarVar.a(xvqVar2.c());
                    if (xvpVarA2 != null) {
                        i6 = 2;
                        if (xvpVarA2.k != 2) {
                            i7 = i3;
                        }
                    } else {
                        i7 = 1;
                    }
                    aihfVarCreateBuilder4.copyOnWrite();
                    asej asejVar5 = (asej) aihfVarCreateBuilder4.instance;
                    asejVar5.k = i7 - 1;
                    asejVar5.b |= SemanticState.Hidden;
                    atqn.M(atqn.N(aihfVarCreateBuilder4), aihfVarCreateBuilder2);
                    arrayList.add(atqn.K(aihfVarCreateBuilder2));
                    it = it;
                } else {
                    i6 = 2;
                }
                i7 = i6;
                aihfVarCreateBuilder4.copyOnWrite();
                asej asejVar6 = (asej) aihfVarCreateBuilder4.instance;
                asejVar6.k = i7 - 1;
                asejVar6.b |= SemanticState.Hidden;
                atqn.M(atqn.N(aihfVarCreateBuilder4), aihfVarCreateBuilder2);
                arrayList.add(atqn.K(aihfVarCreateBuilder2));
                it = it;
            } else {
                airxVar2 = xvpVarA4.b;
            }
            it = it;
            askpVar2 = askpVar2;
            str2 = "";
            i3 = 3;
            obj3 = airxVar2;
            obj3 = airxVar;
            obj3 = airxVar;
            obj3 = airxVar;
            obj3 = airxVar;
            obj3 = airxVar;
            obj3 = airxVar;
            obj3.getClass();
            aihfVarCreateBuilder4.copyOnWrite();
            asej asejVar7 = (asej) aihfVarCreateBuilder4.instance;
            asejVar7.f = (airx) obj3;
            asejVar7.b |= 8;
            aihf aihfVarCreateBuilder13 = askpVar2.createBuilder();
            aihfVarCreateBuilder13.getClass();
            xvqVar = xqlVar.f;
            if (xvqVar == null) {
                if (xrx.j(diiVar)) {
                    xvpVarA = xqlVar.t.a(xvqVar2.c());
                    if (xvpVarA != null) {
                        aiskVar = xvpVarA.b.h;
                        if (aiskVar == null) {
                            aiskVar = aisk.a;
                        }
                        iBt = a.bt(aiskVar.c);
                        if (iBt == 0) {
                            iBt = 1;
                        }
                        str = xvpVarA.h;
                        if (str != null) {
                            i5 = 1;
                            if (xvqVar2.m()) {
                                Context context2 = xqlVar.c;
                                Object[] objArr2 = new Object[i5];
                                objArr2[0] = "YouTube";
                                string2 = context2.getString(R.string.playing_device, objArr2);
                            } else {
                                string2 = str2;
                            }
                        } else {
                            i5 = 1;
                            if (xvqVar2.m()) {
                                Context context3 = xqlVar.c;
                                Object[] objArr3 = new Object[i5];
                                objArr3[0] = "YouTube";
                                string2 = context3.getString(R.string.playing_device, objArr3);
                            } else {
                                string2 = str2;
                            }
                        }
                    } else if (xvqVar2.m()) {
                        string2 = xqlVar.c.getString(R.string.playing_device, "YouTube");
                    } else {
                        string2 = str2;
                    }
                } else if (!xqlVar.i(xvqVar2).isPresent()) {
                    if (xvqVar2.m()) {
                        string2 = xqlVar.c.getString(R.string.playing_device, "YouTube");
                    } else {
                        string2 = str2;
                    }
                } else if (xvqVar2.m()) {
                    string2 = xqlVar.c.getString(R.string.playing_device, "YouTube");
                } else {
                    string2 = str2;
                }
            } else if (xrx.j(diiVar)) {
                xvpVarA = xqlVar.t.a(xvqVar2.c());
                if (xvpVarA != null) {
                    aiskVar = xvpVarA.b.h;
                    if (aiskVar == null) {
                        aiskVar = aisk.a;
                    }
                    iBt = a.bt(aiskVar.c);
                    if (iBt == 0) {
                        iBt = 1;
                    }
                    str = xvpVarA.h;
                    if (str != null) {
                        i5 = 1;
                        if (xvqVar2.m()) {
                            Context context4 = xqlVar.c;
                            Object[] objArr4 = new Object[i5];
                            objArr4[0] = "YouTube";
                            string2 = context4.getString(R.string.playing_device, objArr4);
                        } else {
                            string2 = str2;
                        }
                    } else {
                        i5 = 1;
                        if (xvqVar2.m()) {
                            Context context5 = xqlVar.c;
                            Object[] objArr5 = new Object[i5];
                            objArr5[0] = "YouTube";
                            string2 = context5.getString(R.string.playing_device, objArr5);
                        } else {
                            string2 = str2;
                        }
                    }
                } else if (xvqVar2.m()) {
                    string2 = xqlVar.c.getString(R.string.playing_device, "YouTube");
                } else {
                    string2 = str2;
                }
            } else if (!xqlVar.i(xvqVar2).isPresent()) {
                if (xvqVar2.m()) {
                    string2 = xqlVar.c.getString(R.string.playing_device, "YouTube");
                } else {
                    string2 = str2;
                }
            } else if (xvqVar2.m()) {
                string2 = xqlVar.c.getString(R.string.playing_device, "YouTube");
            } else {
                string2 = str2;
            }
            string2.getClass();
            atqn.j(string2, aihfVarCreateBuilder13);
            atqn.O(atqn.i(aihfVarCreateBuilder13), aihfVarCreateBuilder4);
            aihf aihfVarCreateBuilder14 = aseh.a.createBuilder();
            aihfVarCreateBuilder14.getClass();
            long jB2 = xvqVar2.b(xqlVar.n);
            aihfVarCreateBuilder14.copyOnWrite();
            aseh asehVar4 = (aseh) aihfVarCreateBuilder14.instance;
            asehVar4.b |= 1;
            asehVar4.c = jB2;
            j = 0;
            if (xrx.j(diiVar)) {
                j = xvpVarA3.j;
            }
            aihfVarCreateBuilder14.copyOnWrite();
            aseh asehVar5 = (aseh) aihfVarCreateBuilder14.instance;
            asehVar5.b |= 2;
            asehVar5.d = j;
            yarVar = xqlVar.t;
            xvr xvrVarC2 = yarVar.c(diiVar.s);
            if (xvrVarC2 instanceof xvj) {
            }
            aihfVarCreateBuilder14.copyOnWrite();
            aseh asehVar6 = (aseh) aihfVarCreateBuilder14.instance;
            asehVar6.b |= 16;
            asehVar6.e = z;
            aihn aihnVarBuild3 = aihfVarCreateBuilder14.build();
            aihnVarBuild3.getClass();
            aihfVarCreateBuilder4.copyOnWrite();
            asej asejVar8 = (asej) aihfVarCreateBuilder4.instance;
            asejVar8.j = (aseh) aihnVarBuild3;
            asejVar8.b |= SemanticState.Focused;
            if (xrx.j(diiVar)) {
                xvpVarA2 = yarVar.a(xvqVar2.c());
                if (xvpVarA2 != null) {
                    i6 = 2;
                    if (xvpVarA2.k != 2) {
                        i7 = i3;
                    }
                } else {
                    i7 = 1;
                }
                aihfVarCreateBuilder4.copyOnWrite();
                asej asejVar9 = (asej) aihfVarCreateBuilder4.instance;
                asejVar9.k = i7 - 1;
                asejVar9.b |= SemanticState.Hidden;
                atqn.M(atqn.N(aihfVarCreateBuilder4), aihfVarCreateBuilder2);
                arrayList.add(atqn.K(aihfVarCreateBuilder2));
                it = it;
            } else {
                i6 = 2;
            }
            i7 = i6;
            aihfVarCreateBuilder4.copyOnWrite();
            asej asejVar10 = (asej) aihfVarCreateBuilder4.instance;
            asejVar10.k = i7 - 1;
            asejVar10.b |= SemanticState.Hidden;
            atqn.M(atqn.N(aihfVarCreateBuilder4), aihfVarCreateBuilder2);
            arrayList.add(atqn.K(aihfVarCreateBuilder2));
            it = it;
        }
        aihfVarCreateBuilder.copyOnWrite();
        asem asemVar = (asem) aihfVarCreateBuilder.instance;
        asemVar.a();
        aifs.addAll(arrayList, asemVar.c);
        boolean z2 = !xllVar.g.a();
        aihfVarCreateBuilder.copyOnWrite();
        asem asemVar2 = (asem) aihfVarCreateBuilder.instance;
        asemVar2.b |= 1;
        asemVar2.d = z2;
        xql xqlVar2 = xllVar.b;
        if (!xqlVar2.o() && (xqlVar2.h.equals("cl") || xqlVar2.v.l(73, 45416615L, false))) {
            atqn.J(aihfVarCreateBuilder);
            atqn.I((asek) xllVar.j.a(), aihfVarCreateBuilder);
        }
        if (xqlVar2.j(xqlVar2.d).isEmpty()) {
            atqn.J(aihfVarCreateBuilder);
            atqn.I((asek) xllVar.k.a(), aihfVarCreateBuilder);
        }
        aihn aihnVarBuild4 = aihfVarCreateBuilder.build();
        aihnVarBuild4.getClass();
        return (asem) aihnVarBuild4;
    }
}
