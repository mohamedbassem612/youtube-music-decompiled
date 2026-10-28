package defpackage;

import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ldu implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public ldu(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj2;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:246:0x0236 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0224  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, kzm] */
    /* JADX WARN: Type inference failed for: r1v84, types: [java.lang.Object, kzm] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        lie lieVarE;
        Long lValueOf;
        double dDoubleValue;
        boolean z = false;
        try {
            switch (this.$cid) {
                case 0:
                    lfv lfvVar = ((lcn) this.b).a;
                    lfvVar.B();
                    lfvVar.A();
                    lfvVar.D();
                    Object obj = this.a;
                    kro.l(obj);
                    lbg lbgVar = (lbg) obj;
                    String str = lbgVar.a;
                    kro.i(str);
                    if (((Boolean) lcl.bg.b(null)).booleanValue()) {
                        lfvVar.v().Z(str, lbgVar.H);
                    }
                    if (lfvVar.i().F(null, lcl.ay)) {
                        lfvVar.aV();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        int iC = lfvVar.i().C(null, lcl.as);
                        lfvVar.i();
                        long jU = jCurrentTimeMillis - lbt.u();
                        for (int i = 0; i < iC && lfvVar.ad(null, jU); i++) {
                        }
                    } else {
                        lfvVar.i();
                        long jW = lbt.w();
                        for (int i2 = 0; i2 < jW && lfvVar.ad(str, 0L); i2++) {
                        }
                    }
                    if (lfvVar.i().F(str, lcl.M)) {
                        if (lfvVar.h.a(str)) {
                            lfvVar.aT().k.b("[sgtm] Going background, trigger client side upload. appId", str);
                            int iC2 = lfvVar.i().C(str, lcl.as);
                            for (int i3 = 0; i3 < iC2 && lfvVar.ad(str, 0L); i3++) {
                            }
                            lfvVar.aV();
                            lfvVar.aa(str, System.currentTimeMillis());
                            return;
                        }
                        return;
                    }
                    lfp lfpVar = lfvVar.h;
                    liv livVarA = liv.a(lbgVar.E);
                    lfpVar.o();
                    if (livVarA != liv.CLIENT_UPLOAD_ELIGIBLE || lfp.d(str) || (lieVarE = lfpVar.s().e(str)) == null || (lieVarE.b & SemanticState.LiveRegion) == 0) {
                        return;
                    }
                    lig ligVar = lieVarE.l;
                    if (ligVar == null) {
                        ligVar = lig.a;
                    }
                    if (ligVar.e.isEmpty()) {
                        return;
                    }
                    lfvVar.aT().k.b("[sgtm] Going background, trigger client side upload. appId", str);
                    lfvVar.aV();
                    lfvVar.aa(str, System.currentTimeMillis());
                    return;
                case 1:
                    lfv lfvVar2 = ((lcn) this.b).a;
                    lfvVar2.B();
                    lfvVar2.Q((lbg) this.a);
                    return;
                case 2:
                    lfv lfvVar3 = ((lcn) this.b).a;
                    lfvVar3.B();
                    lfvVar3.A();
                    lfvVar3.D();
                    Object obj2 = this.a;
                    kro.l(obj2);
                    lbg lbgVar2 = (lbg) obj2;
                    String str2 = lbgVar2.a;
                    kro.i(str2);
                    if (((Boolean) lcl.bg.b(null)).booleanValue()) {
                        lfvVar3.v().Z(str2, lbgVar2.H);
                        return;
                    }
                    return;
                case 3:
                    lfv lfvVar4 = ((lcn) this.b).a;
                    lfvVar4.B();
                    lbq lbqVar = (lbq) this.a;
                    if (lbqVar.c.a() == null) {
                        String str3 = lbqVar.a;
                        kro.l(str3);
                        lbg lbgVarG = lfvVar4.g(str3);
                        if (lbgVarG != null) {
                            lfvVar4.N(lbqVar, lbgVarG);
                            return;
                        }
                        return;
                    }
                    String str4 = lbqVar.a;
                    kro.l(str4);
                    lbg lbgVarG2 = lfvVar4.g(str4);
                    if (lbgVarG2 != null) {
                        lfvVar4.U(lbqVar, lbgVarG2);
                        return;
                    }
                    return;
                case 4:
                    lfv lfvVar5 = ((lcn) this.b).a;
                    lfvVar5.B();
                    if (lfvVar5.q != null) {
                        lfvVar5.r = new ArrayList();
                        lfvVar5.r.addAll(lfvVar5.q);
                    }
                    Object obj3 = this.a;
                    lgp lgpVarV = lfvVar5.v();
                    lbg lbgVar3 = (lbg) obj3;
                    String str5 = lbgVar3.a;
                    kro.l(str5);
                    kro.i(str5);
                    lgpVarV.o();
                    lgpVarV.w();
                    try {
                        SQLiteDatabase sQLiteDatabaseE = lgpVarV.e();
                        String[] strArr = {str5};
                        int iDelete = sQLiteDatabaseE.delete("apps", "app_id=?", strArr) + sQLiteDatabaseE.delete("events", "app_id=?", strArr) + sQLiteDatabaseE.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseE.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseE.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseE.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseE.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseE.delete("queue", "app_id=?", strArr) + sQLiteDatabaseE.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseE.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseE.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseE.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseE.delete("upload_queue", "app_id=?", strArr) + sQLiteDatabaseE.delete("diagnostic_signals", "app_id=?", strArr);
                        if (iDelete > 0) {
                            lgpVarV.aT().k.c("Reset analytics data. app, records", str5, Integer.valueOf(iDelete));
                        }
                        break;
                    } catch (SQLiteException e) {
                        lgpVarV.aT().c.c("Error resetting analytics data. appId, error", lcz.a(str5), e);
                    }
                    if (lbgVar3.h) {
                        lfvVar5.M(lbgVar3);
                        return;
                    }
                    return;
                case 5:
                    lfv lfvVar6 = ((lcn) this.b).a;
                    lfvVar6.B();
                    lfvVar6.A();
                    lfvVar6.D();
                    lbg lbgVar4 = (lbg) this.a;
                    kro.i(lbgVar4.a);
                    lfvVar6.e(lbgVar4);
                    return;
                case 6:
                    lfv lfvVar7 = ((lcn) this.b).a;
                    lfvVar7.B();
                    lfvVar7.A();
                    lfvVar7.D();
                    lbg lbgVar5 = (lbg) this.a;
                    kro.i(lbgVar5.a);
                    lfvVar7.S(lbgVar5);
                    lfvVar7.Q(lbgVar5);
                    return;
                case 7:
                    lfv lfvVar8 = ((lcn) this.b).a;
                    lfvVar8.B();
                    lfvVar8.M((lbg) this.a);
                    return;
                case 8:
                    lbb lbbVar = (lbb) this.a;
                    lct lctVarH = lbbVar.h();
                    String str6 = lctVarH.d;
                    Object obj4 = this.b;
                    boolean z2 = (str6 == null || str6.equals(obj4)) ? false : true;
                    lctVarH.d = (String) obj4;
                    if (z2) {
                        lbbVar.h().x();
                        return;
                    }
                    return;
                case 9:
                    lff lffVarJ = ((lbb) this.a).j();
                    lfm lfmVarA = lfm.a(lho.SGTM_CLIENT);
                    lffVarJ.o();
                    lffVarJ.a();
                    lffVarJ.B(new aew(lffVarJ, this.b, lffVarJ.s(false), lfmVarA, 16));
                    return;
                case 10:
                    ?? r0 = this.b;
                    Object obj5 = this.a;
                    try {
                        ((ler) obj5).S(r0);
                        return;
                    } finally {
                        ((ler) obj5).g.set(false);
                    }
                case 11:
                    Object obj6 = this.b;
                    synchronized (obj6) {
                        try {
                            Object obj7 = this.a;
                            ((AtomicReference) obj6).set(Boolean.valueOf(((ldz) obj7).G().F(((lbb) obj7).h().v(), lcl.al)));
                            this.b.notify();
                        } catch (Throwable th) {
                            this.b.notify();
                            throw th;
                        }
                    }
                    return;
                case 12:
                    Object obj8 = this.b;
                    ldz ldzVar = (ldz) obj8;
                    ldzVar.o();
                    ((lbc) obj8).a();
                    Object obj9 = this.a;
                    Bundle bundle = (Bundle) obj9;
                    String string = bundle.getString("name");
                    String string2 = bundle.getString("origin");
                    kro.i(string);
                    kro.i(string2);
                    kro.l(bundle.get("value"));
                    ler lerVar = (ler) obj8;
                    if (!lerVar.t.w()) {
                        ldzVar.aT().k.a("Conditional property not set since app measurement is disabled");
                        return;
                    }
                    lfy lfyVar = new lfy(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
                    lbt lbtVarG = ldzVar.G();
                    adam adamVar = lcl.aT;
                    lgv lgvVarT = lbtVarG.F(null, adamVar) ? lerVar.t() : lgv.a;
                    lcd lcdVarAq = ((ldz) obj8).L().aq(((Bundle) obj9).getString("app_id"), ((Bundle) obj9).getString("triggered_event_name"), ((Bundle) obj9).getBundle("triggered_event_params"), string2, 0L, 0L, true, lgvVarT);
                    lcd lcdVarAq2 = ((ldz) obj8).L().aq(((Bundle) obj9).getString("app_id"), ((Bundle) obj9).getString("timed_out_event_name"), ((Bundle) obj9).getBundle("timed_out_event_params"), string2, 0L, 0L, true, lgvVarT);
                    lcd lcdVarAq3 = ((ldz) obj8).L().aq(((Bundle) obj9).getString("app_id"), ((Bundle) obj9).getString("expired_event_name"), ((Bundle) obj9).getBundle("expired_event_params"), string2, 0L, 0L, true, lgvVarT);
                    if (((ldz) obj8).G().F(null, adamVar)) {
                        ((ler) obj8).t().a();
                    }
                    ((lbb) obj8).j().E(new lbq(bundle.getString("app_id"), string2, lfyVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), lcdVarAq2, bundle.getLong("trigger_timeout"), lcdVarAq, bundle.getLong("time_to_live"), lcdVarAq3));
                    return;
                case 13:
                    Object obj10 = this.b;
                    ldz ldzVar2 = (ldz) obj10;
                    ldzVar2.o();
                    ((lbc) obj10).a();
                    Object obj11 = this.a;
                    Bundle bundle2 = (Bundle) obj11;
                    String string3 = bundle2.getString("name");
                    kro.i(string3);
                    if (!((ler) obj10).t.w()) {
                        ldzVar2.aT().k.a("Conditional property not cleared since app measurement is disabled");
                        return;
                    }
                    lfy lfyVar2 = new lfy(string3, 0L, null, "");
                    lcd lcdVarAq4 = ((ldz) obj10).L().aq(((Bundle) obj11).getString("app_id"), ((Bundle) obj11).getString("expired_event_name"), ((Bundle) obj11).getBundle("expired_event_params"), "", ((Bundle) obj11).getLong("creation_timestamp"), 0L, true, ((ler) obj10).t());
                    if (((ldz) obj10).G().F(null, lcl.aT)) {
                        ((ler) obj10).t().a();
                    }
                    ((lbb) obj10).j().E(new lbq(bundle2.getString("app_id"), "", lfyVar2, bundle2.getLong("creation_timestamp"), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), null, bundle2.getLong("trigger_timeout"), null, bundle2.getLong("time_to_live"), lcdVarAq4));
                    return;
                case 14:
                    Object obj12 = this.b;
                    lhj lhjVarM = ((lbb) obj12).m();
                    if (lhjVarM.J().f().o()) {
                        ldl ldlVarJ = lhjVarM.J();
                        lhjVarM.aV();
                        if (!ldlVarJ.k(System.currentTimeMillis()) && lhjVarM.J().l.a() != 0) {
                            lValueOf = Long.valueOf(lhjVarM.J().l.a());
                        }
                        if (lValueOf != null) {
                            ((ler) obj12).t.l().Y(this.a, lValueOf.longValue());
                            return;
                        }
                        try {
                            this.a.a(null);
                            return;
                        } catch (RemoteException e2) {
                            ((ler) this.b).t.aT().c.b("getSessionId failed with exception", e2);
                            return;
                        }
                    }
                    lhjVarM.aT().h.a("Analytics storage consent denied; will not get session id");
                    lValueOf = null;
                    if (lValueOf != null) {
                        ((ler) obj12).t.l().Y(this.a, lValueOf.longValue());
                        return;
                    } else {
                        this.a.a(null);
                        return;
                    }
                case 15:
                    Object obj13 = this.b;
                    synchronized (obj13) {
                        try {
                            Object obj14 = this.a;
                            lbt lbtVarG2 = ((ldz) obj14).G();
                            String strV = ((lbb) obj14).h().v();
                            adam adamVar2 = lcl.am;
                            ((AtomicReference) obj13).set(TextUtils.isEmpty(strV) ? (String) adamVar2.b(null) : (String) adamVar2.b(lbtVarG2.b.a(strV, (String) adamVar2.a)));
                            this.b.notify();
                        } catch (Throwable th2) {
                            this.b.notify();
                            throw th2;
                        }
                    }
                    return;
                case 16:
                    Object obj15 = this.b;
                    synchronized (obj15) {
                        try {
                            Object obj16 = this.a;
                            ((AtomicReference) obj15).set(Long.valueOf(((ldz) obj16).G().E(((lbb) obj16).h().v(), lcl.an)));
                            this.b.notify();
                        } catch (Throwable th3) {
                            this.b.notify();
                            throw th3;
                        }
                    }
                    return;
                case 17:
                    Object obj17 = this.b;
                    synchronized (obj17) {
                        try {
                            Object obj18 = this.a;
                            ((AtomicReference) obj17).set(Integer.valueOf(((ldz) obj18).G().C(((lbb) obj18).h().v(), lcl.ao)));
                            this.b.notify();
                        } catch (Throwable th4) {
                            this.b.notify();
                            throw th4;
                        }
                    }
                    return;
                case 18:
                    Object obj19 = this.b;
                    synchronized (obj19) {
                        try {
                            Object obj20 = this.a;
                            lbt lbtVarG3 = ((ldz) obj20).G();
                            String strV2 = ((lbb) obj20).h().v();
                            adam adamVar3 = lcl.ap;
                            if (TextUtils.isEmpty(strV2)) {
                                dDoubleValue = ((Double) adamVar3.b(null)).doubleValue();
                            } else {
                                String strA = lbtVarG3.b.a(strV2, (String) adamVar3.a);
                                if (TextUtils.isEmpty(strA)) {
                                    dDoubleValue = ((Double) adamVar3.b(null)).doubleValue();
                                } else {
                                    try {
                                        dDoubleValue = ((Double) adamVar3.b(Double.valueOf(Double.parseDouble(strA)))).doubleValue();
                                    } catch (NumberFormatException unused) {
                                        dDoubleValue = ((Double) adamVar3.b(null)).doubleValue();
                                    }
                                }
                            }
                            ((AtomicReference) obj19).set(Double.valueOf(dDoubleValue));
                            this.b.notify();
                        } catch (Throwable th5) {
                            this.b.notify();
                            throw th5;
                        }
                        break;
                    }
                    return;
                case 19:
                    Object obj21 = this.a;
                    ldz ldzVar3 = (ldz) obj21;
                    ldl ldlVarJ2 = ldzVar3.J();
                    ldlVarJ2.o();
                    int i4 = ldlVarJ2.d().b;
                    Object obj22 = this.b;
                    lgd lgdVar = (lgd) obj22;
                    int i5 = lgdVar.b;
                    if (!lgh.p(i5, i4)) {
                        ldzVar3.aT().i.b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i5));
                        return;
                    }
                    SharedPreferences.Editor editorEdit = ldlVarJ2.b().edit();
                    editorEdit.putString("dma_consent_settings", lgdVar.c);
                    editorEdit.apply();
                    ldzVar3.aT().k.b("Setting DMA consent(FE)", obj22);
                    lbb lbbVar2 = (lbb) obj21;
                    if (!lbbVar2.j().S()) {
                        lbbVar2.j().U();
                        return;
                    }
                    lff lffVarJ2 = lbbVar2.j();
                    lffVarJ2.o();
                    lffVarJ2.a();
                    lffVarJ2.B(new lei(lffVarJ2, 3));
                    return;
                default:
                    Object obj23 = this.b;
                    lco lcoVar = ((lff) obj23).b;
                    if (lcoVar == null) {
                        ((ldz) obj23).aT().c.a("Failed to reset data on the service: not connected to service");
                        return;
                    }
                    try {
                        lcoVar.q((lbg) this.a);
                        break;
                    } catch (RemoteException e3) {
                        ((ldz) this.b).aT().c.b("Failed to reset data on the service: remote exception", e3);
                    }
                    ((lff) this.b).A();
                    return;
            }
        } catch (IllegalArgumentException unused2) {
        }
    }

    public /* synthetic */ ldu(lcn lcnVar, lbg lbgVar, int i, byte[] bArr) {
        this.$cid = i;
        this.b = lcnVar;
        this.a = lbgVar;
    }

    public /* synthetic */ ldu(ler lerVar, Object obj, int i) {
        this.$cid = i;
        this.a = lerVar;
        this.b = obj;
    }

    public ldu(ler lerVar, Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = lerVar;
    }
}
