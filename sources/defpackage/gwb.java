package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.provider.MediaStore;
import android.text.TextUtils;
import j$.util.Collection;
import j$.util.Map;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gwb implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gwb(hgy hgyVar, awlx awlxVar, Uri uri, int i) {
        this.$cid = i;
        this.c = hgyVar;
        this.b = awlxVar;
        this.a = uri;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0281  */
    /* JADX WARN: Code duplicated, block: B:89:0x0292  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v21, types: [aaqn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v33, types: [android.content.ServiceConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [android.os.Parcelable, java.lang.Object] */
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
    @Override // java.lang.Runnable
    public final void run() {
        jzx jzxVar;
        jzx jzxVar2;
        lpa lpaVarB;
        Bundle bundle;
        int i = 3;
        int i2 = 0;
        int i3 = 6;
        int i4 = 5;
        int i5 = 4;
        int i6 = 2;
        int i7 = 1;
        Object[] objArr = 0;
        switch (this.$cid) {
            case 0:
                Object obj = this.b;
                aojl aojlVar = (aojl) obj;
                String str = aojlVar.e;
                int iAS = a.aS(aojlVar.d);
                if (iAS == 0) {
                    iAS = 1;
                }
                Object obj2 = this.a;
                Object obj3 = this.c;
                gwd gwdVar = (gwd) obj2;
                hbc hbcVar = gwdVar.d;
                afxd afxdVarF = afxd.f(hbcVar.f.n(hbcVar.d.e()));
                gmv gmvVar = new gmv(hbcVar, 8);
                bog bogVar = hbcVar.e;
                afxd afxdVarF2 = afxd.f(taf.a(bogVar, afxdVarF, gmvVar));
                hsx hsxVar = new hsx(str, iAS, i7);
                Executor executor = hbcVar.c;
                taf.h(taf.a(bogVar, afxdVarF2.h(hsxVar, executor).b(Throwable.class, new cbs(17), executor), new cbs(18)), gwdVar.a, new gwc(obj2, obj, obj3, i2));
                return;
            case 1:
                Object obj4 = this.a;
                gtw gtwVar = (gtw) obj4;
                hdp hdpVar = gtwVar.c;
                afxd afxdVarF3 = afxd.f(hdpVar.f.n(hdpVar.d.e()));
                gmv gmvVar2 = new gmv(hdpVar, 12);
                bog bogVar2 = hdpVar.e;
                afxd afxdVarF4 = afxd.f(taf.a(bogVar2, afxdVarF3, gmvVar2));
                gpr gprVar = new gpr(i6);
                Executor executor2 = hdpVar.c;
                taf.n(taf.a(bogVar2, afxdVarF4.h(gprVar, executor2).b(Throwable.class, new hdn(i5), executor2), new hdn(i4)), gtwVar.d, new gsu(obj4, this.c, this.b, i5));
                return;
            case 2:
                ((gxa) this.a).a.c((ajwo) this.c, this.b);
                return;
            case 3:
                wkf wkfVar = (wkf) this.a;
                if (wkfVar.x()) {
                    ?? r2 = this.b;
                    if (((amzv) r2).d.size() > 0) {
                        ((vwi) ((kwq) this.c).a).j(wkfVar.Y(), r2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Intent intent = new Intent();
                Context context = ((hgy) this.c).b;
                afwl.m(context, intent.setClassName(context, "com.google.android.apps.youtube.music.wear.compose.activity.main.InternalWearMainActivityCompose").setFlags(335544320).setAction("com.google.android.apps.youtube.music.wear.play").putExtra("mediaUri", (Parcelable) this.a).putExtra("wear_headphone_check", true));
                ((awlx) this.b).ki(hgg.a);
                return;
            case 5:
                Collection.EL.stream(this.c).forEach(new hfo(this.a, this.b, i3, objArr == true ? 1 : 0));
                return;
            case 6:
                ((hnz) this.a).c(true, (String) this.b, this.c);
                return;
            case 7:
                Map.EL.remove(((htp) this.a).k, this.b, this.c);
                return;
            case 8:
                hvl hvlVar = (hvl) this.a;
                hvlVar.c.j();
                String strG = hvlVar.b.a.g();
                aihh aihhVar = (aihh) ajwo.a.createBuilder();
                aihf aihfVarCreateBuilder = ajmf.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                ajmf ajmfVar = (ajmf) aihfVarCreateBuilder.instance;
                strG.getClass();
                ajmfVar.b |= 1;
                ajmfVar.c = strG;
                aihhVar.e(ajmj.a, (ajmf) aihfVarCreateBuilder.build());
                ajwo ajwoVar = (ajwo) aihhVar.build();
                anta antaVar = (anta) this.c;
                if ((antaVar.b & 4) == 0) {
                    ?? r1 = this.b;
                    hvlVar.d.a("https://music.youtube.com/onboarding");
                    hvlVar.a.e(ajwoVar, r1, gnl.a);
                    return;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
                ajwoVar.c(aihlVarCheckIsLite);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                String str2 = ((ajmf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c;
                heh hehVar = new heh();
                almd almdVar = antaVar.e;
                if (almdVar == null) {
                    almdVar = almd.a;
                }
                hehVar.h = new wfy(almdVar);
                hehVar.k(hei.c);
                hehVar.o();
                hehVar.j(ajwoVar);
                hehVar.k = str2;
                gez gezVar = hvlVar.a;
                String strC = typ.c(hehVar.b());
                hke hkeVar = gezVar.c;
                hkeVar.b(strC);
                hkeVar.c = strC;
                gezVar.a.a(hehVar);
                return;
            case 9:
                ((iuo) this.b).e.update(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, (ContentValues) this.a, "_id=?", new String[]{((Uri) this.c).getLastPathSegment()});
                return;
            case 10:
                ((jnw) this.a).f((String) this.b, (wgi) this.c);
                return;
            case 11:
                Object obj5 = this.c;
                java.util.Map map = ((kam) this.a).a.p;
                synchronized (map) {
                    jzxVar = (jzx) map.get(obj5);
                    break;
                }
                if (jzxVar != null) {
                    jzxVar.a((String) this.b);
                    return;
                } else {
                    khn.e();
                    return;
                }
            case 12:
                java.util.Map map2 = ((khb) this.a).d;
                synchronized (map2) {
                    jzxVar2 = (jzx) map2.get(this.c);
                    break;
                }
                if (jzxVar2 != null) {
                    jzxVar2.a((String) this.b);
                    return;
                } else {
                    khn.e();
                    return;
                }
            case 13:
                kkr kkrVar = (kkr) this.c;
                if (TextUtils.isEmpty(kkrVar.b())) {
                    lpaVarB = mda.m(null);
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("google.message_id", kkrVar.b());
                    Integer numA = kkrVar.a();
                    if (numA != null) {
                        bundle2.putInt("google.product_id", numA.intValue());
                    }
                    Object obj6 = this.a;
                    bundle2.putBoolean("supports_message_handled", true);
                    lpaVarB = klc.a((Context) obj6).b(2, bundle2);
                }
                lpaVarB.l(new cte(6), new kbr(this.b, i));
                return;
            case 14:
                avju avjuVar = (avju) this.c;
                if (avjuVar.b > 0) {
                    Object obj7 = this.a;
                    Object obj8 = avjuVar.c;
                    ((kot) obj7).e(obj8 != null ? ((Bundle) obj8).getBundle((String) this.b) : null);
                }
                if (avjuVar.b >= 2) {
                    ((kot) this.a).i();
                }
                if (avjuVar.b >= 3) {
                    ((kot) this.a).k();
                }
                if (avjuVar.b >= 4) {
                    ((kot) this.a).j();
                }
                if (avjuVar.b >= 5) {
                    ((kot) this.a).n();
                    return;
                }
                return;
            case 15:
                ldm ldmVar = (ldm) this.b;
                elq elqVar = ldmVar.b;
                Object obj9 = elqVar.a;
                ((ldr) obj9).r();
                Bundle bundle3 = new Bundle();
                String str3 = ldmVar.a;
                bundle3.putString("package_name", str3);
                Object obj10 = this.c;
                try {
                    Parcel parcelC = ((gda) obj10).c();
                    gdc.c(parcelC, bundle3);
                    Parcel parcelD = ((gda) obj10).d(1, parcelC);
                    bundle = (Bundle) gdc.a(parcelD, Bundle.CREATOR);
                    parcelD.recycle();
                    if (bundle == null) {
                        ((ldr) obj9).aT().c.a("Install Referrer Service returned a null response");
                        bundle = null;
                    }
                } catch (Exception e) {
                    ((ldr) elqVar.a).aT().c.b("Exception occurred while retrieving the Install Referrer", e.getMessage());
                }
                ldr ldrVar = (ldr) elqVar.a;
                ldrVar.r();
                ldr.B();
                if (bundle != null) {
                    long j = bundle.getLong("install_begin_timestamp_seconds", 0L) * 1000;
                    if (j == 0) {
                        ldrVar.aT().f.a("Service response is missing Install Referrer install timestamp");
                    } else {
                        String string = bundle.getString("install_referrer");
                        if (string == null || string.isEmpty()) {
                            ldrVar.aT().c.a("No referrer defined in Install Referrer response");
                        } else {
                            ldrVar.aT().k.b("InstallReferrer API result", string);
                            Uri uri = Uri.parse("?".concat(string));
                            Bundle bundleT = ldrVar.l().t(uri);
                            if (bundleT == null) {
                                ldrVar.aT().c.a("No campaign params defined in Install Referrer result");
                                aurt.c();
                                if (ldrVar.c.F(null, lcl.aF) && ldrVar.l().aj(str3) && ldrVar.w() && uri != null) {
                                    Bundle bundle4 = new Bundle();
                                    ldrVar.l().E(bundle4, uri, false);
                                    bundle4.putString("_cis", "referrer API v2");
                                    elqVar.h(str3, bundle4);
                                }
                            } else {
                                List listAsList = Arrays.asList(((String) lcl.aQ.b(null)).split(","));
                                Iterator<String> it = bundleT.keySet().iterator();
                                while (it.hasNext()) {
                                    if (listAsList.contains(it.next())) {
                                        long j2 = bundle.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                                        if (j2 > 0) {
                                            bundleT.putLong("click_timestamp", j2);
                                        }
                                        aurt.c();
                                        if (ldrVar.c.F(null, lcl.aF) && ldrVar.l().aj(str3)) {
                                            ldrVar.l().E(bundleT, uri, true);
                                        }
                                        if (j == ldrVar.g().e.a()) {
                                            ldrVar.aT().k.a("Logging Install Referrer campaign from module while it may have already been logged.");
                                        }
                                        if (ldrVar.w()) {
                                            ldrVar.g().e.b(j);
                                            elqVar.h(str3, bundleT);
                                        }
                                    }
                                }
                                aurt.c();
                                if (ldrVar.c.F(null, lcl.aF)) {
                                    ldrVar.l().E(bundleT, uri, true);
                                }
                                if (j == ldrVar.g().e.a()) {
                                    ldrVar.aT().k.a("Logging Install Referrer campaign from module while it may have already been logged.");
                                }
                                if (ldrVar.w()) {
                                    ldrVar.g().e.b(j);
                                    elqVar.h(str3, bundleT);
                                }
                            }
                        }
                    }
                }
                ksp.a().b(ldrVar.a, this.a);
                return;
            case 16:
                lcn lcnVar = (lcn) this.a;
                lcnVar.a.B();
                Object obj11 = this.c;
                List list = Collections.EMPTY_LIST;
                try {
                    Parcel parcelC2 = ((gda) obj11).c();
                    parcelC2.writeTypedList(list);
                    ((gda) obj11).f(2, parcelC2);
                    return;
                } catch (RemoteException e2) {
                    lcnVar.a.aT().c.c("Failed to return trigger URIs for app", this.b, e2);
                    return;
                }
            case 17:
                lfv lfvVar = ((lcn) this.c).a;
                lfvVar.B();
                lfvVar.A();
                lfvVar.D();
                Object obj12 = this.a;
                kro.l(obj12);
                ?? r3 = this.b;
                kro.l(r3);
                lbg lbgVar = (lbg) obj12;
                String str4 = lbgVar.a;
                kro.i(str4);
                if (lfv.ah(lbgVar)) {
                    if (!lbgVar.h) {
                        lfvVar.e(lbgVar);
                        return;
                    }
                    if (r3.isEmpty()) {
                        return;
                    }
                    lfvVar.v().F();
                    boolean zF = lfvVar.i().F(null, lcl.aT);
                    try {
                        for (lbx lbxVar : r3) {
                            if (zF) {
                                ((lgw) lfvVar.i).a(str4, lbxVar.a, lbxVar.b, lbxVar.c);
                            } else {
                                lfvVar.v().T(str4, lbxVar.a, lbxVar.b, lbxVar.c, lbxVar.d);
                            }
                        }
                        lfvVar.v().Y();
                        return;
                    } finally {
                        lfvVar.v().S();
                    }
                }
                return;
            case 18:
                lfv lfvVar2 = ((lcn) this.b).a;
                lfvVar2.B();
                lbq lbqVar = (lbq) this.c;
                Object objA = lbqVar.c.a();
                Object obj13 = this.a;
                if (objA == null) {
                    lfvVar2.N(lbqVar, (lbg) obj13);
                    return;
                } else {
                    lfvVar2.U(lbqVar, (lbg) obj13);
                    return;
                }
            case 19:
                lfv lfvVar3 = ((lcn) this.c).a;
                lfvVar3.B();
                lfvVar3.I((lcd) this.a, (String) this.b);
                return;
            default:
                lfv lfvVar4 = ((lcn) this.c).a;
                lfvVar4.B();
                lfy lfyVar = (lfy) this.b;
                if (lfyVar.a() == null) {
                    lfvVar4.O(lfyVar.b, (lbg) this.a);
                    return;
                } else {
                    lfvVar4.Y(lfyVar, (lbg) this.a);
                    return;
                }
        }
    }

    public /* synthetic */ gwb(iuo iuoVar, ContentValues contentValues, Uri uri, int i) {
        this.$cid = i;
        this.b = iuoVar;
        this.a = contentValues;
        this.c = uri;
    }

    public /* synthetic */ gwb(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ gwb(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public gwb(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.c = obj2;
        this.a = obj3;
        this.b = obj;
    }

    public /* synthetic */ gwb(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public gwb(Object obj, Object obj2, String str, int i) {
        this.$cid = i;
        this.a = obj2;
        this.b = str;
        this.c = obj;
    }

    public gwb(khb khbVar, String str, String str2, int i) {
        this.$cid = i;
        this.a = khbVar;
        this.c = str;
        this.b = str2;
    }

    public gwb(lcn lcnVar, lfy lfyVar, lbg lbgVar, int i) {
        this.$cid = i;
        this.b = lfyVar;
        this.a = lbgVar;
        this.c = lcnVar;
    }
}
