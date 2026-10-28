package defpackage;

import j$.time.Duration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abrg {
    public final wlp a;
    public final vyo b;
    private final zwb c;
    private final String d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final tbt h;
    private final abxv i;
    private final abxv j;

    public abrg(wlp wlpVar, abxv abxvVar, abxv abxvVar2, zwb zwbVar, String str, tbt tbtVar, vxu vxuVar, vyo vyoVar, abmt abmtVar) {
        this.i = abxvVar2;
        abxvVar.getClass();
        this.j = abxvVar;
        zwbVar.getClass();
        this.c = zwbVar;
        int i = typ.a;
        if (ahno.aa(str)) {
            throw new IllegalArgumentException();
        }
        this.d = str;
        wlpVar.getClass();
        this.a = wlpVar;
        this.e = g(vxuVar);
        tbtVar.getClass();
        this.h = tbtVar;
        this.b = vyoVar;
        this.f = abmtVar.ci();
        this.g = abmtVar.g.l(233, 45708738L, false);
    }

    public static agev f(vyo vyoVar) {
        alik alikVarB = vyoVar.b();
        if (alikVarB != null) {
            aoqs aoqsVar = alikVarB.k;
            if (aoqsVar == null) {
                aoqsVar = aoqs.a;
            }
            aosk aoskVar = aoqsVar.p;
            if (aoskVar == null) {
                aoskVar = aosk.a;
            }
            int i = aoskVar.b;
            if (i != 0) {
                twq twqVar = new twq(aoskVar.d, ((long) aoskVar.c) * 1000, Long.MAX_VALUE, ((long) i) * 1000, 2.0d);
                ahfi ahfiVarB = wlt.b(0L);
                ahfiVarB.h(twqVar);
                return agev.i(ahfiVarB.g());
            }
        }
        return agdf.a;
    }

    public static boolean g(vxu vxuVar) {
        ajvu ajvuVarC = vxuVar.c();
        if (ajvuVarC != null) {
            anhb anhbVar = ajvuVarC.j;
            if (anhbVar == null) {
                anhbVar = anhb.a;
            }
            if ((anhbVar.c & 4) != 0) {
                anhb anhbVar2 = ajvuVarC.j;
                if (anhbVar2 == null) {
                    anhbVar2 = anhb.a;
                }
                ajdh ajdhVar = anhbVar2.q;
                if (ajdhVar == null) {
                    ajdhVar = ajdh.a;
                }
                return ajdhVar.d;
            }
        }
        return true;
    }

    public final wlo a(abri abriVar, zza zzaVar) {
        agev agevVarF = f(this.b);
        boolean zG = agevVarF.g();
        wlp wlpVar = this.a;
        int i = 15;
        int i2 = 5;
        return zG ? wlpVar.b(abriVar, alvt.a, zzaVar, new ablq(i2), new wvb(i), (wlt) agevVarF.c()) : wlpVar.a(abriVar, alvt.a, zzaVar, new ablq(i2), new wvb(i));
    }

    public final abri b(String str, byte[] bArr, String str2, String str3, int i, boolean z, int i2, aphs aphsVar, Set set, String str4, String str5, xir xirVar, boolean z2, boolean z3, boolean z4, Duration duration) {
        abri abriVarE = e(new abre(this.h, xirVar));
        abriVarE.A = true == this.f ? 3 : 1;
        abriVarE.o(bArr);
        abriVarE.a = str;
        abriVarE.b = z;
        abriVarE.d = str3;
        abriVarE.e = i;
        abriVarE.Z = i2;
        abriVarE.ab = aphsVar;
        abriVarE.c = str2;
        abriVarE.U = str5;
        abriVarE.H(z2);
        abriVarE.I = z3;
        abriVarE.e();
        abriVarE.h = z4;
        abriVarE.T = str4;
        if (duration != null && this.g) {
            abriVarE.af = duration;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((abrf) it.next()).hX(abriVarE);
        }
        return abriVarE;
    }

    public final abri c(abnl abnlVar, int i, aphs aphsVar, Set set, xir xirVar, String str) {
        abri abriVarB = b(abnlVar.w(), abnlVar.Q(), abnlVar.s(), abnlVar.u(), abnlVar.a(), abnlVar.L(), i, aphsVar, set, str, abnlVar.t(), xirVar, abnlVar.e, abnlVar.D(), false, abnlVar.j());
        if (abnlVar.I()) {
            abriVarB.O = true;
        }
        if (abnlVar.H()) {
            abriVarB.P = true;
        }
        if (!abnlVar.y().isEmpty()) {
            for (Map.Entry entry : abnlVar.y().entrySet()) {
                abriVarB.k().put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        abriVarB.R = abnlVar.K();
        return abriVarB;
    }

    public final abri d() {
        return e(new tez(this.h, new vzm(), new vzl(), new vzk(), new vzj()));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [aunn, java.lang.Object] */
    public final abri e(tgs tgsVar) {
        zwa zwaVarE = this.c.e();
        zwaVarE.getClass();
        abxv abxvVar = this.i;
        dov dovVar = (dov) abxvVar.d.io();
        dovVar.getClass();
        Set set = (Set) ((aupo) abxvVar.a).b;
        set.getClass();
        ?? Io = abxvVar.c.io();
        Io.getClass();
        abmt abmtVar = (abmt) abxvVar.b.io();
        abmtVar.getClass();
        abri abriVar = new abri(this.j, zwaVarE, this.e, dovVar, set, Io, abmtVar);
        abriVar.r = this.d;
        abriVar.x = tgsVar;
        return abriVar;
    }
}
