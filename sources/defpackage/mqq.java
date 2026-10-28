package defpackage;

import android.os.Looper;
import com.google.android.libraries.elements.interfaces.CommandHandler;
import com.google.android.libraries.elements.interfaces.CommandRunCompletionCallback;
import com.google.android.libraries.elements.interfaces.CommandRunContext;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import j$.lang.Iterable$EL;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mqq extends CommandHandler {
    public static final /* synthetic */ int e = 0;
    public final agkj a;
    public final agkj b;
    public final long c;
    public final isi d;
    private final agke f;
    private final agke g;
    private final avmb h;
    private final agev i;
    private final awmd j;
    private final awmd k;
    private final agev l;
    private final agev m;

    public mqq(Map map, Map map2, Set set, Set set2, agev agevVar, avmb avmbVar, agev agevVar2, isi isiVar, awmd awmdVar, awmd awmdVar2, agev agevVar3, agev agevVar4) {
        agke agkeVarJ = agke.j(agix.a(((agpn) map).values(), set));
        this.f = agkeVarJ;
        agke agkeVarJ2 = agke.j(agix.a(((agpn) map2).values(), set2));
        this.g = agkeVarJ2;
        int size = agkeVarJ.size();
        aguu.ag(size, "expectedSize");
        agkh agkhVar = new agkh(size);
        Iterable$EL.forEach(agkeVarJ, new jap(agkhVar, 4));
        this.a = agkhVar.d(false);
        int size2 = agkeVarJ2.size();
        aguu.ag(size2, "expectedSize");
        agkh agkhVar2 = new agkh(size2);
        Iterable$EL.forEach(agkeVarJ2, new jap(agkhVar2, 5));
        this.b = agkhVar2.d(false);
        this.i = agevVar;
        this.h = avmbVar;
        this.c = ((Long) agevVar2.e(0L)).longValue();
        this.d = isiVar;
        this.j = awmdVar;
        this.k = true != ((nsu) awmdVar.io()).a() ? null : awmdVar2;
        this.l = agevVar3;
        this.m = agevVar4;
    }

    public static int a(CommandOuterClass$Command commandOuterClass$Command) {
        try {
            aigm aigmVarM = aigm.M(commandOuterClass$Command.toByteArray());
            if (aigmVarM.D()) {
                return 0;
            }
            return aigmVarM.n() >>> 3;
        } catch (IOException unused) {
            return -1;
        }
    }

    public static avlb c(nrw nrwVar, CommandOuterClass$Command commandOuterClass$Command, nrv nrvVar, long j) {
        nrwVar.getClass();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(nrwVar.a());
        commandOuterClass$Command.c(aihlVarCheckIsLite);
        Object objK = commandOuterClass$Command.j.k(aihlVarCheckIsLite.d);
        Object objC = objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK);
        nrc.a(j);
        return nrwVar.c(objC, nrvVar);
    }

    public static avlb d(nwg nwgVar, CommandOuterClass$Command commandOuterClass$Command, nwf nwfVar, long j) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(nwgVar.a());
        commandOuterClass$Command.c(aihlVarCheckIsLite);
        Object objK = commandOuterClass$Command.j.k(aihlVarCheckIsLite.d);
        Object objC = objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK);
        nrc.a(j);
        return nwgVar.c(objC, nwfVar);
    }

    public final assc b(nsl nslVar) {
        awmd awmdVar;
        if (!((nsu) this.j.io()).b() || (awmdVar = this.k) == null) {
            return null;
        }
        return npi.d((DebuggerClient) awmdVar.io(), nslVar);
    }

    public final avlb e(int i) {
        return i == 0 ? avlb.e() : avlb.m(new IllegalStateException(a.bR(i, "Unrecognized command with extension id: ")));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0080 A[PHI: r5
      0x0080: PHI (r5v2 nwg) = (r5v1 nwg), (r5v1 nwg), (r5v12 nwg) binds: [B:13:0x0025, B:14:0x0027, B:21:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0105  */
    /* JADX WARN: Code duplicated, block: B:66:0x0124  */
    /* JADX WARN: Type inference failed for: r6v4, types: [agek, java.lang.Object] */
    public final avlb f(CommandOuterClass$Command commandOuterClass$Command, Object obj) {
        int iA;
        nrw nrwVar;
        nwg nwgVar;
        nwg nwgVar2;
        nrw nrwVar2;
        aigw aigwVarA;
        avmb avmbVar;
        avmb avmbVarA;
        try {
            iA = aext.A(commandOuterClass$Command);
        } catch (RuntimeException unused) {
            iA = -1;
        }
        avlb avlbVarC = null;
        if (iA != -1) {
            agkj agkjVar = this.b;
            Integer numValueOf = Integer.valueOf(iA);
            nwgVar = (nwg) agkjVar.get(numValueOf);
            nrwVar = nwgVar == null ? (nrw) this.a.get(numValueOf) : null;
        } else {
            nrwVar = null;
            nwgVar = null;
        }
        if (nwgVar == null && nrwVar == null) {
            agke agkeVar = this.g;
            int size = agkeVar.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    nwgVar = null;
                    break;
                }
                nwg nwgVar3 = (nwg) agkeVar.get(i2);
                aihl aihlVarCheckIsLite = aihn.checkIsLite(nwgVar3.a());
                commandOuterClass$Command.c(aihlVarCheckIsLite);
                i2++;
                if (commandOuterClass$Command.j.n(aihlVarCheckIsLite.d)) {
                    nwgVar = nwgVar3;
                    break;
                }
            }
            if (nwgVar == null) {
                agke agkeVar2 = this.f;
                int size2 = agkeVar2.size();
                while (true) {
                    if (i >= size2) {
                        nwgVar2 = nwgVar;
                        nrwVar2 = null;
                        break;
                    }
                    nrw nrwVar3 = (nrw) agkeVar2.get(i);
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(nrwVar3.a());
                    commandOuterClass$Command.c(aihlVarCheckIsLite2);
                    i++;
                    if (commandOuterClass$Command.j.n(aihlVarCheckIsLite2.d)) {
                        nwgVar2 = nwgVar;
                        nrwVar2 = nrwVar3;
                        break;
                    }
                }
            } else {
                nwgVar2 = nwgVar;
                nrwVar2 = nrwVar;
            }
        } else {
            nwgVar2 = nwgVar;
            nrwVar2 = nrwVar;
        }
        if (nwgVar2 != null) {
            aigwVarA = nwgVar2.a();
        } else {
            if (nrwVar2 == null) {
                return e(a(commandOuterClass$Command));
            }
            aigwVarA = nrwVar2.a();
        }
        aigw aigwVar = aigwVarA;
        agev agevVar = this.l;
        Boolean bool = Boolean.FALSE;
        if ((((Boolean) agevVar.e(bool)).booleanValue() && aigwVar != null) || (((Boolean) this.m.e(bool)).booleanValue() && aigwVar != null && aigwVar.a() == 217165905)) {
            nrx nrxVar = nwgVar2 != null ? nwgVar2 : nrwVar2;
            agev agevVar2 = this.i;
            int iA2 = aigwVar.a();
            aslz aslzVarB = nrxVar.b();
            aslz aslzVar = (aslz) ((agfa) agevVar2).a.apply(Integer.valueOf(iA2));
            if (aslzVar != null) {
                aslzVarB = aslzVar;
            }
            if (aslzVarB == null) {
                avmbVar = null;
            } else {
                int iAS = a.aS(aslzVarB.c);
                if (iAS == 0) {
                    iAS = 1;
                }
                int i3 = iAS - 1;
                if (i3 != 1) {
                    if (i3 == 2 && Looper.myLooper() == Looper.getMainLooper()) {
                        avmbVarA = this.h;
                        avmbVar = avmbVarA;
                    } else {
                        avmbVar = null;
                    }
                } else if (Looper.myLooper() == Looper.getMainLooper()) {
                    avmbVar = null;
                } else {
                    avmbVarA = avmh.a();
                    avmbVar = avmbVarA;
                }
            }
            if (avmbVar != null) {
                avlbVarC = avlb.h(new hni(this, nwgVar2, commandOuterClass$Command, obj, nrwVar2, 9, null)).v(avmbVar);
            }
        }
        if (avlbVarC == null) {
            if (nwgVar2 != 0) {
                avlbVarC = d(nwgVar2, commandOuterClass$Command, ((nrv) obj).f(), this.c);
            } else {
                avlbVarC = c(nrwVar2, commandOuterClass$Command, (nrv) obj, this.c);
            }
        }
        nrv nrvVar = (nrv) obj;
        return this.d.v(avlbVarC, commandOuterClass$Command, nrvVar.f, b(nrvVar.i), aigwVar);
    }

    @Override // com.google.android.libraries.elements.interfaces.CommandHandler
    public final void run(CommandOuterClass$Command commandOuterClass$Command, CommandRunContext commandRunContext, CommandRunCompletionCallback commandRunCompletionCallback) {
        nrv nrvVarA;
        if (commandRunContext instanceof mqo) {
            nrvVarA = ((mqo) commandRunContext).a;
        } else if (commandRunContext != null) {
            nrt nrtVarD = nrv.d();
            nrtVarD.e = commandRunContext.senderState();
            nrvVarA = nrtVarD.a();
        } else {
            nrt nrtVarD2 = nrv.d();
            nrtVarD2.e = SenderStateOuterClass$SenderState.getDefaultInstance();
            nrvVarA = nrtVarD2.a();
        }
        avlb avlbVarF = f(commandOuterClass$Command, nrvVarA);
        if (commandRunCompletionCallback != null) {
            avlbVarF = avlbVarF.j(new hoi(commandRunCompletionCallback, 11)).k(new jgq(commandRunCompletionCallback, 18));
        }
        avlbVarF.D();
    }
}
