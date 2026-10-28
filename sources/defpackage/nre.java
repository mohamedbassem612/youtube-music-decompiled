package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nre {
    public static lpa a(ListenableFuture listenableFuture) {
        lqa lqaVar = new lqa();
        kjc kjcVar = new kjc((lqa) lqaVar.a);
        ahng.x(listenableFuture, new oag(kjcVar, listenableFuture, lqaVar), MoreExecutors.directExecutor());
        return (lpa) kjcVar.a;
    }

    public static long b(Optional optional, long j) {
        int i;
        int iBi;
        aisu aisuVar = (aisu) optional.orElse(null);
        if (aisuVar == null || ((iBi = a.bi((i = aisuVar.f))) != 0 && iBi == 8)) {
            return j + 1000;
        }
        int iBi2 = a.bi(i);
        if (iBi2 != 0 && iBi2 == 4) {
            return j;
        }
        int iBi3 = a.bi(i);
        if (iBi3 == 0 || iBi3 != 3) {
            return 0L;
        }
        return aisuVar.c;
    }

    public static agke c(alvt alvtVar) {
        return (agke) Collection.EL.stream(alvtVar.n).filter(new sde(5)).map(new rxg(13)).collect(aghu.a);
    }

    public static agke d(alvt alvtVar, List list) {
        return (agke) Collection.EL.stream(alvtVar.n).filter(new sde(0)).map(new rxg(11)).filter(new sco(list, 4)).collect(aghu.a);
    }

    public static Optional e(alvt alvtVar, String str) {
        agke agkeVarC = c(alvtVar);
        int size = agkeVarC.size();
        for (int i = 0; i < size; i++) {
            aivt aivtVar = (aivt) agkeVarC.get(i);
            aivs aivsVar = aivtVar.c;
            if (aivsVar == null) {
                aivsVar = aivs.a;
            }
            aixo aixoVarA = aixo.a(aivsVar.d);
            if (aixoVarA == null) {
                aixoVarA = aixo.SLOT_TYPE_UNSPECIFIED;
            }
            if (aixoVarA.equals(aixo.SLOT_TYPE_IN_PLAYER) && aivsVar.h.equals(str)) {
                return Optional.of(aivtVar);
            }
        }
        return Optional.empty();
    }

    public static Optional f(wjf wjfVar, long j) {
        boolean z = false;
        for (aisu aisuVar : h(wjfVar.H())) {
            if (aisuVar != null) {
                if (z) {
                    return Optional.of(aisuVar);
                }
                if (aisuVar.c == j) {
                    z = true;
                }
            }
        }
        return Optional.empty();
    }

    public static Optional g(alvt alvtVar, List list) {
        return j(d(alvtVar, list), list);
    }

    public static List h(List list) {
        return (List) Collection.EL.stream(list).filter(new sde(4)).collect(Collectors.toCollection(new ieu(9)));
    }

    public static Optional i(agke agkeVar, int i) {
        int size = agkeVar.size();
        int i2 = 0;
        while (i2 < size) {
            aivt aivtVar = (aivt) agkeVar.get(i2);
            aivs aivsVar = aivtVar.c;
            if (aivsVar == null) {
                aivsVar = aivs.a;
            }
            int iBf = a.bf(aivsVar.g);
            if (iBf == 0) {
                iBf = 1;
            }
            i2++;
            if (iBf == i) {
                return Optional.of(aivtVar);
            }
        }
        return Optional.empty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Optional j(agke agkeVar, List list) {
        int i;
        int size = agkeVar.size();
        int i2 = 0;
        while (i2 < size) {
            aivt aivtVar = (aivt) agkeVar.get(i2);
            agqs agqsVarListIterator = ((agke) list).listIterator(0);
            while (true) {
                i = i2 + 1;
                if (agqsVarListIterator.hasNext()) {
                    aixo aixoVar = (aixo) agqsVarListIterator.next();
                    aivs aivsVar = aivtVar.c;
                    if (aivsVar == null) {
                        aivsVar = aivs.a;
                    }
                    aixo aixoVarA = aixo.a(aivsVar.d);
                    if (aixoVarA == null) {
                        aixoVarA = aixo.SLOT_TYPE_UNSPECIFIED;
                    }
                    if (aixoVarA.equals(aixoVar)) {
                        aivs aivsVar2 = aivtVar.c;
                        if (aivsVar2 == null) {
                            aivsVar2 = aivs.a;
                        }
                        int iBf = a.bf(aivsVar2.g);
                        if (iBf == 0) {
                            iBf = 1;
                        }
                        if (iBf == 2) {
                            return Optional.of(aivtVar);
                        }
                    }
                }
            }
            i2 = i;
        }
        return Optional.empty();
    }

    public static String k(smr smrVar) {
        StringBuilder sb = new StringBuilder(smrVar.c().name());
        sb.append(' ');
        l(sb, smrVar.d);
        l(sb, smrVar.e);
        l(sb, smrVar.f);
        return sb.toString();
    }

    public static void l(StringBuilder sb, List list) {
        int i = 0;
        while (true) {
            int i2 = ((agpi) list).d;
            if (i >= i2) {
                return;
            }
            sb.append(((snk) list.get(i)).a().name());
            i++;
            if (i == i2) {
                sb.append(';');
            } else {
                sb.append(',');
            }
        }
    }

    public static boolean m(sol solVar, aiuv aiuvVar, Uri uri, ajwo ajwoVar) {
        alay alayVar;
        boolean z;
        alay alayVar2;
        if ((aiuvVar.b & 4) != 0) {
            alayVar = aiuvVar.e;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        CharSequence charSequenceK = "<NONE>";
        if (TextUtils.isEmpty(ackj.k(null, alayVar, null, false)) || (uri == null && ajwoVar == null)) {
            z = false;
        } else {
            if ((aiuvVar.b & 4) != 0) {
                alayVar2 = aiuvVar.e;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
            } else {
                alayVar2 = null;
            }
            charSequenceK = ackj.k(null, alayVar2, null, false);
            z = true;
        }
        if (!z) {
            return false;
        }
        abui abuiVarA = sow.a();
        abuiVarA.g(true);
        abuiVarA.h(charSequenceK);
        solVar.d = abuiVarA.f();
        return true;
    }

    public static void n(sol solVar) {
        sor sorVarA = solVar.d().a();
        sorVarA.c(false);
        solVar.g = sorVarA.a();
    }

    public static void o(sol solVar, abnr abnrVar, ajmb ajmbVar, boolean z, boolean z2) {
        sor sorVarB = sos.b();
        boolean z3 = ajmbVar != null;
        if (z3) {
            sorVarB.h(ajmbVar);
        }
        sorVarB.c(z);
        sorVarB.d(z2);
        sorVarB.f(abnrVar == abnr.FULLSCREEN);
        sorVarB.e(z3);
        sorVarB.g(!z3);
        solVar.g = sorVarB.a();
    }

    public static boolean p(sol solVar, abnr abnrVar) {
        boolean z = solVar.d().a;
        boolean z2 = abnrVar == abnr.FULLSCREEN;
        if (z == z2) {
            return false;
        }
        sor sorVarA = solVar.d().a();
        sorVarA.f(z2);
        solVar.g = sorVarA.a();
        return true;
    }
}
