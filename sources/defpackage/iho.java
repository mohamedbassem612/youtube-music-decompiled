package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iho implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ iho(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00e9  */
    /* JADX WARN: Type inference failed for: r4v20, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v21, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v23, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v25, types: [awqg, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        wgi wgiVar;
        Optional optionalEmpty;
        switch (this.$cid) {
            case 0:
                Object obj2 = this.a;
                ((ihr) obj2).g.execute(afwl.i(new ihq(obj2, obj, 0, (byte[]) null)));
                break;
            case 1:
                ((ihr) this.a).d();
                break;
            case 2:
                ((ilw) this.a).h = (aazn) obj;
                break;
            case 3:
                ((ilw) this.a).i = (aazn) obj;
                break;
            case 4:
                ivn ivnVar = (ivn) this.a;
                ivnVar.m.setPadding(0, 0, 0, ivnVar.s.J());
                break;
            case 5:
                aayw aaywVar = (aayw) obj;
                if (aaywVar.b == abnw.e && (wgiVar = aaywVar.d) != null) {
                    amae amaeVar = wgiVar.a;
                    amag amagVar = amaeVar.o;
                    if (amagVar == null) {
                        amagVar = amag.a;
                    }
                    if (((amagVar.b == 84469052 ? (aqgy) amagVar.c : aqgy.a).b & 16) != 0) {
                        amag amagVar2 = amaeVar.o;
                        if (amagVar2 == null) {
                            amagVar2 = amag.a;
                        }
                        aqgx aqgxVar = (amagVar2.b == 84469052 ? (aqgy) amagVar2.c : aqgy.a).c;
                        if (aqgxVar == null) {
                            aqgxVar = aqgx.a;
                        }
                        ((ivu) this.a).e(aqgxVar, 1);
                    }
                    break;
                }
                break;
            case 6:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                iwd iwdVar = (iwd) this.a;
                iwdVar.a = zBooleanValue;
                iwdVar.c();
                break;
            case 7:
                ((iwd) this.a).c();
                break;
            case 8:
                this.a.invoke(obj);
                break;
            case 9:
                this.a.invoke(obj);
                break;
            case 10:
                this.a.invoke(obj);
                break;
            case 11:
                this.a.invoke(obj);
                break;
            case 12:
                this.a.invoke(obj);
                break;
            case 13:
                this.a.invoke(obj);
                break;
            case 14:
                ((jlc) this.a).a();
                break;
            case 15:
                jms jmsVar = (jms) this.a;
                jmsVar.c(jmsVar.d, (hww) obj, jmsVar.c);
                break;
            case 16:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                jms jmsVar2 = (jms) this.a;
                jmsVar2.c(jmsVar2.d, jmsVar2.b, zBooleanValue2);
                break;
            case 17:
                aazj aazjVar = (aazj) obj;
                abob abobVar = aazjVar.a;
                Object obj3 = this.a;
                if (abobVar == abob.a) {
                    ((jms) ((hzo) obj3).a).a = Optional.empty();
                } else if (abobVar.c(abob.h)) {
                    wjf wjfVar = aazjVar.b;
                    if (wjfVar != null) {
                        Object obj4 = ((hzo) obj3).a;
                        alvt alvtVarU = wjfVar.u();
                        if (alvtVarU == null) {
                            optionalEmpty = Optional.empty();
                        } else {
                            alvl alvlVar = alvtVarU.f;
                            if (alvlVar == null) {
                                alvlVar = alvl.a;
                            }
                            if ((alvlVar.b & SemanticState.ReadOnly) == 0) {
                                optionalEmpty = Optional.empty();
                            } else {
                                alvl alvlVar2 = alvtVarU.f;
                                if (alvlVar2 == null) {
                                    alvlVar2 = alvl.a;
                                }
                                apji apjiVar = alvlVar2.l;
                                if (apjiVar == null) {
                                    apjiVar = apji.a;
                                }
                                aihl aihlVarCheckIsLite = aihn.checkIsLite(anii.a);
                                apjiVar.c(aihlVarCheckIsLite);
                                if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                                    alvl alvlVar3 = alvtVarU.f;
                                    if (alvlVar3 == null) {
                                        alvlVar3 = alvl.a;
                                    }
                                    apji apjiVar2 = alvlVar3.l;
                                    if (apjiVar2 == null) {
                                        apjiVar2 = apji.a;
                                    }
                                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anii.a);
                                    apjiVar2.c(aihlVarCheckIsLite2);
                                    Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                                    optionalEmpty = Optional.of((anih) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
                                } else {
                                    optionalEmpty = Optional.empty();
                                }
                            }
                        }
                        ((jms) obj4).a = optionalEmpty;
                    } else {
                        ((jms) ((hzo) obj3).a).a = Optional.empty();
                    }
                    if (abobVar == abob.i) {
                        jms jmsVar3 = (jms) ((hzo) obj3).a;
                        jmsVar3.c(2, jmsVar3.b, jmsVar3.c);
                    }
                }
                break;
            case 18:
                int i = ((aazn) obj).a;
                jms jmsVar4 = (jms) ((hzo) this.a).a;
                jmsVar4.c(i, jmsVar4.b, jmsVar4.c);
                break;
            case 19:
                wjf wjfVar2 = ((aazj) obj).b;
                boolean z = (wjfVar2 == null || wjfVar2.g() == null || !wjfVar2.g().I()) ? false : true;
                jmt jmtVar = (jmt) ((hzo) this.a).a;
                jmtVar.c = z;
                jmtVar.e = wjfVar2 != null && wjfVar2.f().aF();
                jmtVar.a();
                break;
            default:
                boolean z2 = ((aaxo) obj).e;
                jmt jmtVar2 = (jmt) ((hzo) this.a).a;
                jmtVar2.b = z2;
                jmtVar2.a();
                break;
        }
    }
}
