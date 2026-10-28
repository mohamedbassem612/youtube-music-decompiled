package defpackage;

import android.content.Context;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class poa implements pny {
    private final Context a;
    private final kjc b;

    static {
        agsn.h("GnpSdk");
    }

    public poa(Context context, kjc kjcVar, pxh pxhVar) {
        context.getClass();
        kjcVar.getClass();
        pxhVar.getClass();
        this.a = context;
        this.b = kjcVar;
        pxhVar.a(context);
    }

    @Override // defpackage.pny
    public final void a(pnz pnzVar) {
        plx plxVarA;
        String strSubstring;
        aihf aihfVarCreateBuilder = ahyk.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        aihf aihfVarCreateBuilder2 = ahyj.a.createBuilder();
        aihfVarCreateBuilder2.getClass();
        axst axstVarAv = aewo.av(ahyh.a.createBuilder());
        axstVarAv.Y();
        poc pocVar = (poc) pnzVar;
        axstVarAv.X(pocVar.m);
        String str = pocVar.e.a;
        str.getClass();
        axstVarAv.M(str);
        if (pocVar.h != null || TextUtils.isEmpty(pocVar.o)) {
            plxVarA = pocVar.h;
        } else {
            plw plwVarA = plx.a();
            plwVarA.b(pyd.a);
            plwVarA.f = pocVar.o;
            plxVarA = plwVarA.a();
        }
        axstVarAv.W(pocVar.f.e(plxVarA));
        axstVarAv.U(pocVar.g.b());
        axstVarAv.R(pocVar.n);
        ahyr ahyrVar = pocVar.l;
        if (ahyrVar != null) {
            aihf aihfVarCreateBuilder3 = ahyp.a.createBuilder();
            aihfVarCreateBuilder3.getClass();
            aewo.O(ahyrVar, aihfVarCreateBuilder3);
            axstVarAv.O(aewo.N(aihfVarCreateBuilder3));
        }
        String str2 = pocVar.i;
        if (!TextUtils.isEmpty(str2)) {
            if (str2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            axstVarAv.S(str2);
        }
        String str3 = pocVar.j;
        if (!TextUtils.isEmpty(str3)) {
            if (str3 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            axstVarAv.T(str3);
        }
        String str4 = pocVar.k;
        if (!TextUtils.isEmpty(str4)) {
            if (str4 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            axstVarAv.S(str4);
        }
        Long l = pocVar.q;
        if (l != null) {
            axstVarAv.P(l.longValue());
        }
        String str5 = pocVar.r;
        if (str5 != null && str5.length() != 0) {
            aihf aihfVarCreateBuilder4 = ahyf.a.createBuilder();
            aihfVarCreateBuilder4.getClass();
            aihfVarCreateBuilder4.copyOnWrite();
            ahyf ahyfVar = (ahyf) aihfVarCreateBuilder4.instance;
            ahyfVar.b |= 1;
            ahyfVar.c = str5;
            aihn aihnVarBuild = aihfVarCreateBuilder4.build();
            aihnVarBuild.getClass();
            aihf aihfVar = (aihf) axstVarAv.a;
            aihfVar.copyOnWrite();
            ahyh ahyhVar = (ahyh) aihfVar.instance;
            ahyhVar.o = (ahyf) aihnVarBuild;
            ahyhVar.b |= 16384;
        }
        String str6 = pocVar.s;
        if (str6 != null && str6.length() != 0) {
            aihf aihfVarCreateBuilder5 = ahye.a.createBuilder();
            aihfVarCreateBuilder5.getClass();
            aihfVarCreateBuilder5.copyOnWrite();
            ahye ahyeVar = (ahye) aihfVarCreateBuilder5.instance;
            ahyeVar.b |= 1;
            ahyeVar.c = str6;
            aihn aihnVarBuild2 = aihfVarCreateBuilder5.build();
            aihnVarBuild2.getClass();
            aihf aihfVar2 = (aihf) axstVarAv.a;
            aihfVar2.copyOnWrite();
            ahyh ahyhVar2 = (ahyh) aihfVar2.instance;
            ahyhVar2.p = (ahye) aihnVarBuild2;
            ahyhVar2.b |= 32768;
        }
        pax paxVar = pocVar.u;
        if (paxVar != null) {
            axstVarAv.N(paxVar.a.longValue());
            ahzv ahzvVar = pocVar.b;
            if (ahzvVar == ahzv.SHOWN || ahzvVar == ahzv.SHOWN_REPLACED || ahzvVar == ahzv.REMOVED || pocVar.c == ahyy.DROPPED_BY_CLIENT) {
                aihf aihfVarCreateBuilder6 = ahyv.a.createBuilder();
                aihfVarCreateBuilder6.getClass();
                aewo.G(pocVar.t - paxVar.b.longValue(), aihfVarCreateBuilder6);
                Long l2 = paxVar.c;
                l2.getClass();
                aewo.B(l2.longValue(), aihfVarCreateBuilder6);
                Long l3 = paxVar.d;
                l3.getClass();
                aewo.F(l3.longValue(), aihfVarCreateBuilder6);
                Long l4 = paxVar.e;
                l4.getClass();
                aewo.A(l4.longValue(), aihfVarCreateBuilder6);
                Long l5 = paxVar.f;
                l5.getClass();
                aewo.C(l5.longValue(), aihfVarCreateBuilder6);
                Long l6 = paxVar.g;
                l6.getClass();
                aewo.D(l6.longValue(), aihfVarCreateBuilder6);
                Long l7 = paxVar.h;
                l7.getClass();
                aewo.E(l7.longValue(), aihfVarCreateBuilder6);
                aewo.H(paxVar.i, aihfVarCreateBuilder6);
                axstVarAv.Q(aewo.z(aihfVarCreateBuilder6));
            }
        }
        axstVarAv.V(String.valueOf(poc.a.nextInt(1000000000)));
        aewo.W(axstVarAv.L(), aihfVarCreateBuilder2);
        ahzv ahzvVar2 = pocVar.b;
        if (ahzvVar2 != null) {
            aihf aihfVarCreateBuilder7 = ahzz.a.createBuilder();
            aihfVarCreateBuilder7.getClass();
            aihfVarCreateBuilder7.copyOnWrite();
            ahzz ahzzVar = (ahzz) aihfVarCreateBuilder7.instance;
            ahzzVar.c = ahzvVar2.ah;
            ahzzVar.b |= 1;
            aihn aihnVarBuild3 = aihfVarCreateBuilder7.build();
            aihnVarBuild3.getClass();
            aihfVarCreateBuilder2.copyOnWrite();
            ahyj ahyjVar = (ahyj) aihfVarCreateBuilder2.instance;
            ahyjVar.d = (ahzz) aihnVarBuild3;
            ahyjVar.c = 2;
        } else {
            ahyy ahyyVar = pocVar.c;
            if (ahyyVar != null) {
                aihf aihfVarCreateBuilder8 = ahyz.a.createBuilder();
                aihfVarCreateBuilder8.getClass();
                aihfVarCreateBuilder8.copyOnWrite();
                ahyz ahyzVar = (ahyz) aihfVarCreateBuilder8.instance;
                ahyzVar.c = ahyyVar.ap;
                ahyzVar.b |= 1;
                int i = pocVar.y;
                if (i != 0) {
                    aihfVarCreateBuilder8.copyOnWrite();
                    ahyz ahyzVar2 = (ahyz) aihfVarCreateBuilder8.instance;
                    ahyzVar2.h = i - 1;
                    ahyzVar2.b |= SemanticState.Hidden;
                }
                String str7 = pocVar.p;
                if (str7 != null) {
                    aihfVarCreateBuilder8.copyOnWrite();
                    ahyz ahyzVar3 = (ahyz) aihfVarCreateBuilder8.instance;
                    ahyzVar3.b |= 32;
                    ahyzVar3.g = str7;
                }
                aihn aihnVarBuild4 = aihfVarCreateBuilder8.build();
                aihnVarBuild4.getClass();
                aihfVarCreateBuilder2.copyOnWrite();
                ahyj ahyjVar2 = (ahyj) aihfVarCreateBuilder2.instance;
                ahyjVar2.d = (ahyz) aihnVarBuild4;
                ahyjVar2.c = 3;
            } else {
                Throwable cause = pocVar.d;
                if (cause == null) {
                    throw new IllegalStateException("GnpLogEvent must have interactionType, failureType, systemEventType, or exception.");
                }
                aihf aihfVarCreateBuilder9 = ahyn.a.createBuilder();
                aihfVarCreateBuilder9.getClass();
                while (cause != null) {
                    List listUnmodifiableList = DesugarCollections.unmodifiableList(((ahyn) aihfVarCreateBuilder9.instance).d);
                    listUnmodifiableList.getClass();
                    new aikl(listUnmodifiableList);
                    aihf aihfVarCreateBuilder10 = ahym.a.createBuilder();
                    aihfVarCreateBuilder10.getClass();
                    String simpleName = cause.getClass().getSimpleName();
                    simpleName.getClass();
                    aihfVarCreateBuilder10.copyOnWrite();
                    ahym ahymVar = (ahym) aihfVarCreateBuilder10.instance;
                    ahymVar.b |= 1;
                    ahymVar.c = simpleName;
                    String message = cause.getMessage();
                    if (message != null) {
                        strSubstring = message.substring(0, Math.min(message.length(), 200));
                        strSubstring.getClass();
                    } else {
                        strSubstring = "";
                    }
                    strSubstring.getClass();
                    aihfVarCreateBuilder10.copyOnWrite();
                    ahym ahymVar2 = (ahym) aihfVarCreateBuilder10.instance;
                    ahymVar2.b |= 2;
                    ahymVar2.d = strSubstring;
                    aihn aihnVarBuild5 = aihfVarCreateBuilder10.build();
                    aihnVarBuild5.getClass();
                    ahym ahymVar3 = (ahym) aihnVarBuild5;
                    aihfVarCreateBuilder9.copyOnWrite();
                    ahyn ahynVar = (ahyn) aihfVarCreateBuilder9.instance;
                    aiie aiieVar = ahynVar.d;
                    if (!aiieVar.c()) {
                        ahynVar.d = aihn.mutableCopy(aiieVar);
                    }
                    ahynVar.d.add(ahymVar3);
                    cause = cause.getCause();
                }
                if (pocVar.r != null) {
                    aewo.R(3, aihfVarCreateBuilder9);
                } else if (pocVar.s != null) {
                    aewo.R(4, aihfVarCreateBuilder9);
                }
                aihn aihnVarBuild6 = aihfVarCreateBuilder9.build();
                aihnVarBuild6.getClass();
                aihfVarCreateBuilder2.copyOnWrite();
                ahyj ahyjVar3 = (ahyj) aihfVarCreateBuilder2.instance;
                ahyjVar3.d = (ahyn) aihnVarBuild6;
                ahyjVar3.c = 6;
            }
        }
        aewo.T(aewo.V(aihfVarCreateBuilder2), aihfVarCreateBuilder);
        aewo.U(rpi.U(pocVar.x), aihfVarCreateBuilder);
        ahyk ahykVarS = aewo.S(aihfVarCreateBuilder);
        String str8 = pocVar.v;
        kjc kjcVar = this.b;
        kih kihVarJ = (str8 == null ? kjcVar.K() : kjcVar.J(str8)).j(ahykVarS, mea.a(this.a, new mdp(-548316723)));
        if (!pocVar.w.isEmpty()) {
            kihVarJ.j(atqq.az(pocVar.w));
        }
        kihVarJ.e();
    }
}
