package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aaje {
    public static wej a(Set set, wej wejVar) {
        vwt vwtVarC = wejVar.c();
        vwtVarC.c("local_image_entity_reference_set_key", set, new aaly(1));
        return vwtVarC.b();
    }

    public static agke b(aqmh aqmhVar, aqmh aqmhVar2) {
        Set hashSet = aqmhVar != null ? (Set) Collection.EL.stream(aqmhVar.c).map(new aakc(2)).collect(Collectors.toCollection(new yoj(7))) : new HashSet();
        agjz agjzVar = new agjz(4);
        Iterator it = aqmhVar2.c.iterator();
        while (it.hasNext()) {
            String str = ((aqmg) it.next()).c;
            String strG = wfs.g(197, str);
            aihf aihfVarCreateBuilder = amsz.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            amsz amszVar = (amsz) aihfVarCreateBuilder.instance;
            str.getClass();
            amszVar.c |= 1;
            amszVar.d = str;
            amsz amszVar2 = (amsz) aihfVarCreateBuilder.build();
            aihf aihfVarCreateBuilder2 = aofh.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            aofh aofhVar = (aofh) aihfVarCreateBuilder2.instance;
            aofhVar.c = 3;
            aofhVar.b |= 1;
            aihfVarCreateBuilder2.copyOnWrite();
            aofh aofhVar2 = (aofh) aihfVarCreateBuilder2.instance;
            strG.getClass();
            aofhVar2.b |= 2;
            aofhVar2.d = strG;
            aihh aihhVar = (aihh) aofg.b.createBuilder();
            aihhVar.o(aoff.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK);
            aihhVar.n(aael.a);
            aihhVar.e(amsz.b, amszVar2);
            aofg aofgVar = (aofg) aihhVar.build();
            aihfVarCreateBuilder2.copyOnWrite();
            aofh aofhVar3 = (aofh) aihfVarCreateBuilder2.instance;
            aofgVar.getClass();
            aofhVar3.e = aofgVar;
            aofhVar3.b |= 4;
            agjzVar.h((aofh) aihfVarCreateBuilder2.build());
            hashSet.remove(str);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            agjzVar.h(y((String) it2.next()));
        }
        return agjzVar.g();
    }

    public static agke c(aqmh aqmhVar) {
        if (aqmhVar == null) {
            return agpi.a;
        }
        agjz agjzVar = new agjz(4);
        Iterator it = aqmhVar.c.iterator();
        while (it.hasNext()) {
            String str = ((aqmg) it.next()).c;
            String strG = wfs.g(197, str);
            aihf aihfVarCreateBuilder = amsz.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            amsz amszVar = (amsz) aihfVarCreateBuilder.instance;
            str.getClass();
            amszVar.c |= 1;
            amszVar.d = str;
            amsz amszVar2 = (amsz) aihfVarCreateBuilder.build();
            aihf aihfVarCreateBuilder2 = aofh.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            aofh aofhVar = (aofh) aihfVarCreateBuilder2.instance;
            aofhVar.c = 1;
            aofhVar.b |= 1;
            aihfVarCreateBuilder2.copyOnWrite();
            aofh aofhVar2 = (aofh) aihfVarCreateBuilder2.instance;
            strG.getClass();
            aofhVar2.b |= 2;
            aofhVar2.d = strG;
            aihh aihhVar = (aihh) aofg.b.createBuilder();
            aihhVar.o(aoff.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK);
            aihhVar.n(aael.a);
            aihhVar.e(amsz.b, amszVar2);
            aofg aofgVar = (aofg) aihhVar.build();
            aihfVarCreateBuilder2.copyOnWrite();
            aofh aofhVar3 = (aofh) aihfVarCreateBuilder2.instance;
            aofgVar.getClass();
            aofhVar3.e = aofgVar;
            aofhVar3.b |= 4;
            agjzVar.h((aofh) aihfVarCreateBuilder2.build());
        }
        return agjzVar.g();
    }

    public static agke d(aqmh aqmhVar) {
        if (aqmhVar == null) {
            return agpi.a;
        }
        agjz agjzVar = new agjz(4);
        Iterator it = aqmhVar.c.iterator();
        while (it.hasNext()) {
            agjzVar.h(y(((aqmg) it.next()).c));
        }
        return agjzVar.g();
    }

    public static Set e(wej wejVar) {
        Set set = (Set) wejVar.a("local_image_entity_reference_set_key", new aalz(1));
        return set == null ? new HashSet() : set;
    }

    public static final aofo f(alvl alvlVar) {
        alvlVar.getClass();
        aihf aihfVarCreateBuilder = aofo.a.createBuilder();
        if ((alvlVar.b & 1) != 0) {
            aony aonyVarA = aony.a(alvlVar.c);
            if (aonyVarA == null) {
                aonyVarA = aony.OK;
            }
            aihfVarCreateBuilder.copyOnWrite();
            aofo aofoVar = (aofo) aihfVarCreateBuilder.instance;
            aofoVar.c = aonyVarA.k;
            aofoVar.b |= 1;
        }
        if ((alvlVar.b & 4) != 0) {
            String str = alvlVar.e;
            aihfVarCreateBuilder.copyOnWrite();
            aofo aofoVar2 = (aofo) aihfVarCreateBuilder.instance;
            str.getClass();
            aofoVar2.b |= 2;
            aofoVar2.d = str;
        }
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        return (aofo) aihnVarBuild;
    }

    public static final aofo g(aoop aoopVar, Function0 function0) {
        if (aoopVar != null && (aoopVar.d.b & 4) != 0) {
            return aoopVar.getOfflinePlayabilityStatus();
        }
        alvt alvtVar = (alvt) function0.invoke();
        if (alvtVar == null || (alvtVar.b & 4) == 0) {
            return null;
        }
        alvl alvlVar = alvtVar.f;
        if (alvlVar == null) {
            alvlVar = alvl.a;
        }
        alvlVar.getClass();
        return f(alvlVar);
    }

    public static final aony h(aoop aoopVar, Function0 function0) {
        aony aonyVarA;
        if (aoopVar != null && aoopVar.j()) {
            return aoopVar.getPlayerResponsePlayabilityCanPlayStatus();
        }
        aofo aofoVarG = g(aoopVar, function0);
        return (aofoVarG == null || (aofoVarG.b & 1) == 0 || (aonyVarA = aony.a(aofoVarG.c)) == null) ? aony.OK : aonyVarA;
    }

    public static boolean i(wjf wjfVar, mbc mbcVar) {
        return (wjfVar == null || wjfVar.g() == null || !wjfVar.g().A(mbcVar.b())) ? false : true;
    }

    public static ajhi j(alvl alvlVar) {
        if (alvlVar != null) {
            alvc alvcVar = alvlVar.n;
            if (alvcVar == null) {
                alvcVar = alvc.a;
            }
            if ((alvcVar.b & 1) != 0) {
                alvc alvcVar2 = alvlVar.n;
                if (alvcVar2 == null) {
                    alvcVar2 = alvc.a;
                }
                ajhi ajhiVar = alvcVar2.c;
                return ajhiVar == null ? ajhi.a : ajhiVar;
            }
        }
        return null;
    }

    public static ajjm k(alvl alvlVar) {
        if (!o(alvlVar) && alvlVar != null && (alvlVar.b & SemanticState.Modal) != 0) {
            alvd alvdVar = alvlVar.m;
            if (alvdVar == null) {
                alvdVar = alvd.a;
            }
            if (((alvdVar.b == 64657230 ? (ajjn) alvdVar.c : ajjn.a).b & 2) != 0) {
                alvd alvdVar2 = alvlVar.m;
                if (alvdVar2 == null) {
                    alvdVar2 = alvd.a;
                }
                ajjm ajjmVar = (alvdVar2.b == 64657230 ? (ajjn) alvdVar2.c : ajjn.a).d;
                return ajjmVar == null ? ajjm.a : ajjmVar;
            }
        }
        return null;
    }

    public static amsm l(alvl alvlVar) {
        if (alvlVar != null) {
            alvg alvgVar = alvlVar.r;
            if (alvgVar == null) {
                alvgVar = alvg.a;
            }
            amsp amspVar = alvgVar.c;
            if (amspVar == null) {
                amspVar = amsp.a;
            }
            amso amsoVar = amspVar.h;
            if (amsoVar == null) {
                amsoVar = amso.a;
            }
            if ((amsoVar.b & 1) != 0) {
                alvg alvgVar2 = alvlVar.r;
                if (alvgVar2 == null) {
                    alvgVar2 = alvg.a;
                }
                amsp amspVar2 = alvgVar2.c;
                if (amspVar2 == null) {
                    amspVar2 = amsp.a;
                }
                amso amsoVar2 = amspVar2.h;
                if (amsoVar2 == null) {
                    amsoVar2 = amso.a;
                }
                amsm amsmVar = amsoVar2.c;
                return amsmVar == null ? amsm.a : amsmVar;
            }
        }
        return null;
    }

    public static aoqp m(alvl alvlVar) {
        if (alvlVar != null) {
            alvk alvkVar = alvlVar.h;
            if (alvkVar == null) {
                alvkVar = alvk.a;
            }
            if (alvkVar.b == 58356580) {
                alvk alvkVar2 = alvlVar.h;
                if (alvkVar2 == null) {
                    alvkVar2 = alvk.a;
                }
                return alvkVar2.b == 58356580 ? (aoqp) alvkVar2.c : aoqp.a;
            }
        }
        return null;
    }

    public static aoqv n(alvl alvlVar) {
        aoqv aoqvVar;
        if (alvlVar == null || (alvlVar.b & 64) == 0) {
            return null;
        }
        alvk alvkVar = alvlVar.h;
        if (alvkVar == null) {
            alvkVar = alvk.a;
        }
        if (alvkVar.b == 73238862) {
            alvk alvkVar2 = alvlVar.h;
            if (alvkVar2 == null) {
                alvkVar2 = alvk.a;
            }
            aoqvVar = alvkVar2.b == 73238862 ? (aoqv) alvkVar2.c : aoqv.a;
        } else {
            aoqvVar = null;
        }
        if (aoqvVar == null || aoqvVar.c.isEmpty()) {
            return null;
        }
        int i = aoqvVar.b;
        if ((i & 4) == 0 || (i & 2) == 0) {
            return null;
        }
        return aoqvVar;
    }

    public static boolean o(alvl alvlVar) {
        ajjn ajjnVar;
        if (alvlVar == null || (alvlVar.b & SemanticState.Modal) == 0) {
            return false;
        }
        alvd alvdVar = alvlVar.m;
        if (alvdVar == null) {
            alvdVar = alvd.a;
        }
        if (alvdVar.b == 64657230) {
            alvd alvdVar2 = alvlVar.m;
            if (alvdVar2 == null) {
                alvdVar2 = alvd.a;
            }
            ajjnVar = alvdVar2.b == 64657230 ? (ajjn) alvdVar2.c : ajjn.a;
        } else {
            ajjnVar = null;
        }
        return ajjnVar != null && ajjnVar.c;
    }

    public static boolean p(alvl alvlVar) {
        if (alvlVar != null && (alvlVar.b & 524288) != 0) {
            aony aonyVarA = aony.a(alvlVar.c);
            if (aonyVarA == null) {
                aonyVarA = aony.OK;
            }
            if (aonyVarA == aony.LIVE_STREAM_OFFLINE) {
                return true;
            }
        }
        return false;
    }

    public static boolean q(alvl alvlVar) {
        if (alvlVar != null) {
            aony aonyVarA = aony.a(alvlVar.c);
            if (aonyVarA == null) {
                aonyVarA = aony.OK;
            }
            if (r(aonyVarA)) {
                return true;
            }
        }
        return false;
    }

    public static boolean r(aony aonyVar) {
        return aonyVar == aony.OK;
    }

    public static boolean s(alvl alvlVar) {
        if (alvlVar == null) {
            return false;
        }
        aony aonyVarA = aony.a(alvlVar.c);
        if (aonyVarA == null) {
            aonyVarA = aony.OK;
        }
        return t(aonyVarA);
    }

    public static boolean t(aony aonyVar) {
        return aonyVar == aony.OK || aonyVar == aony.LOGIN_REQUIRED || aonyVar == aony.CONTENT_CHECK_REQUIRED || aonyVar == aony.AGE_CHECK_REQUIRED || aonyVar == aony.AGE_VERIFICATION_REQUIRED;
    }

    public static boolean u(alvl alvlVar) {
        if (alvlVar == null || (alvlVar.b & 524288) == 0) {
            return false;
        }
        alvg alvgVar = alvlVar.r;
        if (alvgVar == null) {
            alvgVar = alvg.a;
        }
        amsp amspVar = alvgVar.c;
        if (amspVar == null) {
            amspVar = amsp.a;
        }
        return amspVar.i;
    }

    public static tvh v(tpq tpqVar, abix abixVar) {
        return new tvn(tpqVar, new ablq(2), new aaoz(abixVar, 6));
    }

    public static tvh w(tpq tpqVar) {
        return new tvn(tpqVar, new ablq(0), new abfb(9));
    }

    public static tvh x(tpq tpqVar) {
        return new tvn(tpqVar, new ablq(1), new abfb(8));
    }

    private static aofh y(String str) {
        String strG = wfs.g(197, str);
        aihf aihfVarCreateBuilder = aofh.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aofh aofhVar = (aofh) aihfVarCreateBuilder.instance;
        aofhVar.c = 2;
        aofhVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        aofh aofhVar2 = (aofh) aihfVarCreateBuilder.instance;
        strG.getClass();
        aofhVar2.b |= 2;
        aofhVar2.d = strG;
        aihh aihhVar = (aihh) aofg.b.createBuilder();
        aihhVar.n(aael.a);
        aofg aofgVar = (aofg) aihhVar.build();
        aihfVarCreateBuilder.copyOnWrite();
        aofh aofhVar3 = (aofh) aihfVarCreateBuilder.instance;
        aofgVar.getClass();
        aofhVar3.e = aofgVar;
        aofhVar3.b |= 4;
        return (aofh) aihfVarCreateBuilder.build();
    }
}
