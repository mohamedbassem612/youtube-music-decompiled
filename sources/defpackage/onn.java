package defpackage;

import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import j$.time.Duration;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class onn implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ onn(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, rhd] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, rhd] */
    /* JADX WARN: Type inference failed for: r9v67, types: [awqg, java.lang.Object] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        UUID uuid;
        switch (this.$cid) {
            case 0:
                Uri uri = (Uri) obj;
                Object obj2 = this.a;
                if (uri != null) {
                    try {
                        return Long.valueOf(((ayq) ((onp) obj2).c).V(uri));
                    } catch (IOException e) {
                        onb.g(e, "%s: Failed to call mobstore fileSize on uri %s!", "StorageLogger", uri);
                    }
                }
                return 0L;
            case 1:
                oiy oiyVar = (oiy) obj;
                int i = oni.e;
                aiie aiieVar = oiyVar.d;
                Object obj3 = this.a;
                int iG = aguu.G(aiieVar, new hsb(obj3, 5));
                if (iG == -1) {
                    aihf builder = oiyVar.toBuilder();
                    builder.copyOnWrite();
                    oiy oiyVar2 = (oiy) builder.instance;
                    obj3.getClass();
                    oiyVar2.a();
                    oiyVar2.d.add(obj3);
                    return (oiy) builder.build();
                }
                oit oitVar = (oit) oiyVar.d.get(iG);
                aihf builder2 = oitVar.toBuilder();
                oit oitVar2 = (oit) obj3;
                long j = oitVar.g + oitVar2.g;
                builder2.copyOnWrite();
                oit oitVar3 = (oit) builder2.instance;
                oitVar3.b |= 16;
                oitVar3.g = j;
                long j2 = oitVar.h + oitVar2.h;
                builder2.copyOnWrite();
                oit oitVar4 = (oit) builder2.instance;
                oitVar4.b |= 32;
                oitVar4.h = j2;
                oit oitVar5 = (oit) builder2.build();
                aihf builder3 = oiyVar.toBuilder();
                builder3.copyOnWrite();
                oiy oiyVar3 = (oiy) builder3.instance;
                oitVar5.getClass();
                oiyVar3.a();
                oiyVar3.d.set(iG, oitVar5);
                return (oiy) builder3.build();
            case 2:
                try {
                    return new ProcessBuilder("/system/bin/trigger_perfetto", (String) obj).start();
                } catch (IOException unused) {
                    ((qfl) this.a).b = true;
                    return null;
                }
            case 3:
                Log.w("FlagStore", "Failed to commit to updated flags for ".concat(String.valueOf(((qmi) this.a).c)), (Throwable) obj);
                return null;
            case 4:
                int i2 = qmp.a;
                aihf aihfVarCreateBuilder = qll.a.createBuilder();
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(((qll) obj).b).entrySet()) {
                    Object obj4 = this.a;
                    qlk qlkVar = (qlk) entry.getValue();
                    aihf aihfVarCreateBuilder2 = qlk.a.createBuilder();
                    if (!qlkVar.d.equals(obj4)) {
                        String str = qlkVar.d;
                        aihfVarCreateBuilder2.copyOnWrite();
                        qlk qlkVar2 = (qlk) aihfVarCreateBuilder2.instance;
                        str.getClass();
                        qlkVar2.b |= 1;
                        qlkVar2.d = str;
                    }
                    for (String str2 : qlkVar.c) {
                        if (!str2.equals(obj4)) {
                            aihfVarCreateBuilder2.aa(str2);
                        }
                    }
                    aihfVarCreateBuilder.ab((String) entry.getKey(), (qlk) aihfVarCreateBuilder2.build());
                }
                return (qll) aihfVarCreateBuilder.build();
            case 5:
                int i3 = qmp.a;
                qlk qlkVar3 = qlk.a;
                qlk qlkVar4 = (qlk) ((qll) obj).b.get(this.a);
                if (qlkVar4 != null) {
                    qlkVar3 = qlkVar4;
                }
                return qlkVar3.c;
            case 6:
                int i4 = qmp.a;
                Object obj5 = this.a;
                qlk qlkVar5 = qlk.a;
                obj5.getClass();
                qlk qlkVar6 = (qlk) ((qll) obj).b.get(obj5);
                if (qlkVar6 != null) {
                    qlkVar5 = qlkVar6;
                }
                return qlkVar5.d;
            case 7:
                return ((qnc) this.a).e();
            case 8:
                qmi.i.d(agke.q(this.a));
                return null;
            case 9:
                qli qliVar = (qli) obj;
                Object obj6 = this.a;
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                try {
                    try {
                        synchronized (qnf.a) {
                            String str3 = (String) ((qnf) obj6).g.io();
                            qlf qlfVar = qliVar.c;
                            if (qlfVar == null) {
                                qlfVar = qlf.b;
                            }
                            qnf.e(str3, qlfVar, "ce-tmp");
                            qlf qlfVar2 = qliVar.c;
                            if (qlfVar2 == null) {
                                qlfVar2 = qlf.b;
                            }
                            ((qnf) obj6).h = qlfVar2;
                            break;
                        }
                        synchronized (qnf.b) {
                            String str4 = (String) ((qnf) obj6).i.io();
                            qlg qlgVar = qliVar.d;
                            if (qlgVar == null) {
                                qlgVar = qlg.b;
                            }
                            qnf.e(str4, qlgVar, "de-tmp");
                            qlg qlgVar2 = qliVar.d;
                            if (qlgVar2 == null) {
                                qlgVar2 = qlg.b;
                            }
                            ((qnf) obj6).j = qlgVar2;
                            break;
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        return null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        throw th;
                    }
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            case 10:
                qyv qyvVar = (qyv) this.a;
                String str5 = qyvVar.a;
                return !((agkz) obj).contains(str5) ? qyvVar.b : str5;
            case 11:
                qyv qyvVar2 = (qyv) this.a;
                String str6 = qyvVar2.a;
                return !((agkz) obj).contains(str6) ? qyvVar2.b : str6;
            case 12:
                qvk qvkVar = (qvk) obj;
                int i5 = qzf.f;
                ((qvc) this.a).d(qvkVar);
                return qvkVar;
            case 13:
                Object obj7 = this.a;
                red redVar = (red) obj7;
                Optional optional = redVar.e;
                optional.getClass();
                ree reeVar = redVar.d;
                rhx rhxVar = redVar.c;
                synchronized (reeVar) {
                    if (rhxVar.l()) {
                        int i6 = rgm.c;
                        rgk rgkVar = new rgk();
                        rgkVar.a = reeVar.e;
                        Duration duration = (Duration) ((rhy) rhxVar).h.get();
                        duration.getClass();
                        rgkVar.b = reeVar.j(duration);
                        req reqVar = reeVar.c;
                        rgkVar.c = reqVar.p().a.c;
                        rgkVar.b(optional.get());
                        rgkVar.b(((red) obj7).a);
                        rgkVar.d = reqVar.p().a;
                        ((rei) obj7).f(rgkVar.a());
                    } else {
                        rgo rgoVar = new rgo();
                        rgoVar.b(optional.get());
                        rgoVar.b(((red) obj7).a);
                        ((rei) obj7).f(new rgn(rgoVar));
                    }
                    rgp rgpVar = ((red) obj7).f;
                    rgpVar.getClass();
                    qup qupVar = reeVar.b;
                    rgpVar.l(qupVar.c, qupVar.b());
                    rgp rgpVar2 = ((red) obj7).f;
                    rgpVar2.getClass();
                    rgpVar2.i(rhxVar);
                    rhxVar.w();
                    break;
                }
                return null;
            case 14:
                Exception exc = (Exception) obj;
                tge tgeVarA = quk.a();
                tgeVarA.b = exc;
                ree reeVar2 = ((red) this.a).d;
                tgeVarA.c = new quh(reeVar2.b.a, 1);
                reeVar2.c.a(tgeVarA.e());
                throw new IllegalStateException(exc);
            case 15:
                int i7 = res.h;
                rei reiVar = (rei) this.a;
                reiVar.a(reiVar.g);
                return Boolean.FALSE;
            case 16:
                Exception exc2 = (Exception) obj;
                if (exc2 instanceof CancellationException) {
                    return null;
                }
                Object obj8 = this.a;
                rbc rbcVar = new rbc(rgw.j, rbd.d);
                rbcVar.a = exc2;
                rbcVar.c();
                rbcVar.a("Failed to apply the effects onto the segment, not applying any effects.", new Object[0]);
                rgw rgwVar = (rgw) obj8;
                qug qugVar = rgwVar.e;
                if (qugVar == null || (uuid = rgwVar.f) == null) {
                    return null;
                }
                tge tgeVarA2 = quk.a();
                tgeVarA2.b = exc2;
                tgeVarA2.c = new quh(uuid, 2);
                qugVar.a(tgeVarA2.e());
                return null;
            case 17:
                Exception exc3 = (Exception) obj;
                if (exc3 instanceof CancellationException) {
                    return null;
                }
                Object obj9 = this.a;
                rbc rbcVar2 = new rbc(rhg.p, rbd.d);
                rbcVar2.a = exc3;
                rbcVar2.c();
                rbcVar2.a("Failed to apply the transition effect.", new Object[0]);
                rhg rhgVar = (rhg) obj9;
                qug qugVar2 = rhgVar.d;
                if (qugVar2 == null || !rhgVar.g.isPresent()) {
                    return null;
                }
                tge tgeVarA3 = quk.a();
                tgeVarA3.b = exc3;
                tgeVarA3.c = new quj(((qvc) rhgVar.g.get()).c, 2);
                ((rdr) qugVar2).D(tgeVarA3.e());
                return null;
            case 18:
                return this.a.invoke(obj);
            case 19:
                return ((rmc) ((rmj) this.a).c).j((String) obj, false);
            default:
                ((rmj) this.a).o(zvn.a, "Fail to fetch incognito previousSignedInIdentity");
                return null;
        }
    }
}
