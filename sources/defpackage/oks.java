package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oks implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oks(Object obj, Object obj2, boolean z, int i) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = z;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0076  */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, zwa] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        boolean z;
        int i = this.$cid;
        if (i != 0) {
            if (i != 1) {
                tnx tnxVar = (tnx) obj;
                boolean z2 = this.a;
                Object obj2 = this.b;
                tls tlsVar = (tls) this.c;
                tlsVar.c(tnxVar, tlsVar.a((tnm) obj2, tnxVar, z2));
                return null;
            }
            Boolean bool = (Boolean) obj;
            hsn hsnVar = (hsn) this.c;
            boolean z3 = hsnVar.e.g() || bool.booleanValue();
            boolean zIsEmpty = hna.b(hsnVar.g, this.b).isEmpty();
            twf twfVar = hsnVar.h;
            jkg jkgVar = hsnVar.i;
            float fA = twfVar.a();
            boolean zB = twfVar.b();
            if (jkgVar.a()) {
                z = true;
            } else {
                aunn aunnVar = hsnVar.p;
                if (((abvk) aunnVar.io()).Z() && "PPOM".equals(((abvk) aunnVar.io()).m())) {
                    z = true;
                } else {
                    z = false;
                }
            }
            boolean z4 = this.a;
            hlp hlpVar = hsnVar.f;
            tfq tfqVar = hsnVar.s;
            boolean zJ = hlpVar.j();
            boolean zJ2 = tfqVar.j(1);
            String.format("smartDownloadsClientEnabled=%s, ", Boolean.valueOf(z3));
            String.format("batteryLevel=%s, ", Float.valueOf(fA));
            String.format("batteryPluggedIn=%s, ", Boolean.valueOf(zB));
            String.format("userInitiated=%s, ", Boolean.valueOf(z4));
            String.format("feedbackTokensEmpty=%s, ", Boolean.valueOf(zIsEmpty));
            String.format("inForegroundOrPlayingMixtape=%s, ", Boolean.valueOf(z));
            String.format("canOfflineOverWifiOnly=%s, ", Boolean.valueOf(zJ));
            String.format("onWifiNetwork=%s", Boolean.valueOf(zJ2));
            if (!z3) {
                hsnVar.v.d(2);
                return Boolean.FALSE;
            }
            if (!zIsEmpty) {
                agrx agrxVar = agso.a;
                hsnVar.v.e(2, 2);
                return Boolean.FALSE;
            }
            if (!z4 && fA < 0.2f && !zB) {
                agrx agrxVar2 = agso.a;
                hsnVar.v.e(2, 5);
                return Boolean.FALSE;
            }
            if (!z4) {
                if (((abvk) hsnVar.p.io()).Z()) {
                    agrx agrxVar3 = agso.a;
                    hsnVar.v.e(2, 7);
                    return Boolean.FALSE;
                }
                if (z) {
                    Context context = hsnVar.c;
                    if (!txz.d(context) && !txz.g(context)) {
                        agrx agrxVar4 = agso.a;
                        hsnVar.v.e(2, 7);
                        return Boolean.FALSE;
                    }
                }
            }
            if (z4) {
                if (!hlpVar.k()) {
                    agrx agrxVar5 = agso.a;
                    hsnVar.v.e(2, 4);
                    return Boolean.FALSE;
                }
            } else if (!hlpVar.l()) {
                agrx agrxVar6 = agso.a;
                hsnVar.v.e(2, 4);
                return Boolean.FALSE;
            }
            agrx agrxVar7 = agso.a;
            hsnVar.v.d(2);
            return Boolean.TRUE;
        }
        if (!this.a) {
            Object obj3 = this.c;
            elr elrVar = (elr) this.b;
            oip oipVar = (oip) obj3;
            elrVar.f(1009, oipVar);
            aihf aihfVarCreateBuilder = ahai.a.createBuilder();
            String str = oipVar.e;
            aihfVarCreateBuilder.copyOnWrite();
            ahai ahaiVar = (ahai) aihfVarCreateBuilder.instance;
            str.getClass();
            ahaiVar.b |= 4;
            ahaiVar.e = str;
            String str2 = oipVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            ahai ahaiVar2 = (ahai) aihfVarCreateBuilder.instance;
            str2.getClass();
            ahaiVar2.b |= 1;
            ahaiVar2.c = str2;
            int i2 = oipVar.f;
            aihfVarCreateBuilder.copyOnWrite();
            ahai ahaiVar3 = (ahai) aihfVarCreateBuilder.instance;
            ahaiVar3.b |= 2;
            ahaiVar3.d = i2;
            int size = oipVar.o.size();
            aihfVarCreateBuilder.copyOnWrite();
            ahai ahaiVar4 = (ahai) aihfVarCreateBuilder.instance;
            ahaiVar4.b |= 8;
            ahaiVar4.f = size;
            long j = oipVar.s;
            aihfVarCreateBuilder.copyOnWrite();
            ahai ahaiVar5 = (ahai) aihfVarCreateBuilder.instance;
            ahaiVar5.b |= 64;
            ahaiVar5.i = j;
            String str3 = oipVar.t;
            aihfVarCreateBuilder.copyOnWrite();
            ahai ahaiVar6 = (ahai) aihfVarCreateBuilder.instance;
            str3.getClass();
            ahaiVar6.b |= SemanticState.Focused;
            ahaiVar6.j = str3;
            ahai ahaiVar7 = (ahai) aihfVarCreateBuilder.build();
            oio oioVar = oipVar.c;
            if (oioVar == null) {
                oioVar = oio.a;
            }
            long j2 = oioVar.d;
            long j3 = oioVar.f;
            long j4 = oioVar.e;
            aihf aihfVarCreateBuilder2 = aham.a.createBuilder();
            int i3 = oioVar.g;
            aihfVarCreateBuilder2.copyOnWrite();
            aham ahamVar = (aham) aihfVarCreateBuilder2.instance;
            ahamVar.b |= 1;
            ahamVar.c = i3;
            long j5 = j4 - j3;
            aihfVarCreateBuilder2.copyOnWrite();
            aham ahamVar2 = (aham) aihfVarCreateBuilder2.instance;
            ahamVar2.b |= 2;
            ahamVar2.d = j5;
            aihfVarCreateBuilder2.copyOnWrite();
            aham ahamVar3 = (aham) aihfVarCreateBuilder2.instance;
            ahamVar3.b |= 4;
            ahamVar3.e = j4 - j2;
            oio oioVar2 = oipVar.c;
            if (oioVar2 == null) {
                oioVar2 = oio.a;
            }
            boolean z5 = oioVar2.i;
            aihfVarCreateBuilder2.copyOnWrite();
            aham ahamVar4 = (aham) aihfVarCreateBuilder2.instance;
            ahamVar4.b |= 8;
            ahamVar4.f = z5;
            ((ong) elrVar.a).e(ahaiVar7, (aham) aihfVarCreateBuilder2.build());
        }
        return okz.b;
    }

    public /* synthetic */ oks(boolean z, elr elrVar, oip oipVar, int i) {
        this.$cid = i;
        this.a = z;
        this.b = elrVar;
        this.c = oipVar;
    }
}
