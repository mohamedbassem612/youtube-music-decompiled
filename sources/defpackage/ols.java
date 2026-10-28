package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.lang.Iterable$EL;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ols implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ols(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, omw] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v62, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.lang.Object, qmy] */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v95, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, omb] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, omb] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, omb] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.lang.Object, omw] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        oig oigVarA;
        int i = 18;
        boolean zA = true;
        char c = 1;
        switch (this.$cid) {
            case 0:
                ((olt) this.a).i((olg) this.b);
                return ahng.n((Boolean) obj);
            case 1:
                ((olt) this.a).i((olg) this.b);
                return ahng.m((Exception) obj);
            case 2:
                ojb ojbVar = (ojb) obj;
                if (ojbVar == null) {
                    onb.c("%s: Unable to read sharedFile from shared preferences.", "SharedFileManager");
                    return ahng.m(new oma());
                }
                oiv oivVarA = oiv.a(ojbVar.d);
                if (oivVarA == null) {
                    oivVarA = oiv.NONE;
                }
                if (oivVarA != oiv.DOWNLOAD_COMPLETE) {
                    Object obj2 = this.b;
                    Object obj3 = this.a;
                    oiz oizVar = (oiz) obj2;
                    int iAS = a.aS(oizVar.f);
                    omn omnVar = (omn) obj3;
                    Uri uriBR = qnl.bR((Context) omnVar.g, iAS == 0 ? 1 : iAS, ojbVar.c, oizVar.e, (qnl) omnVar.f, (agev) omnVar.e, false);
                    if (uriBR != null) {
                        Object obj4 = omnVar.j;
                        String str = oizVar.e;
                        ((aesp) obj4).p(uriBR);
                    }
                    oiv oivVarA2 = oiv.a(ojbVar.d);
                    if (oivVarA2 == null) {
                        oivVarA2 = oiv.NONE;
                    }
                    if (oivVarA2 == oiv.DOWNLOAD_IN_PROGRESS) {
                        ?? r3 = omnVar.d;
                        aihf builder = ojbVar.toBuilder();
                        oiv oivVar = oiv.SUBSCRIBED;
                        builder.copyOnWrite();
                        ojb ojbVar2 = (ojb) builder.instance;
                        ojbVar2.d = oivVar.h;
                        ojbVar2.b |= 2;
                        return ahno.as(r3.h(oizVar, (ojb) builder.build()), new oly(c == true ? 1 : 0), omnVar.b);
                    }
                }
                return aher.a;
            case 3:
                if (((ojb) obj) != null) {
                    return ahng.n(Boolean.TRUE);
                }
                Object obj5 = this.b;
                omn omnVar2 = (omn) this.a;
                SharedPreferences sharedPreferencesAL = qnl.aL((Context) omnVar2.g, "gms_icing_mdd_shared_file_manager_metadata", (agev) omnVar2.e);
                long j = sharedPreferencesAL.getLong("next_file_name_v2", System.currentTimeMillis());
                if (!sharedPreferencesAL.edit().putLong("next_file_name_v2", 1 + j).commit()) {
                    onb.d("%s: Unable to update file name %s", "SharedFileManager", obj5);
                    return ahng.n(Boolean.FALSE);
                }
                String strBS = a.bS(j, "datadownloadfile_");
                aihf aihfVarCreateBuilder = ojb.a.createBuilder();
                oiv oivVar2 = oiv.SUBSCRIBED;
                aihfVarCreateBuilder.copyOnWrite();
                ojb ojbVar3 = (ojb) aihfVarCreateBuilder.instance;
                ojbVar3.d = oivVar2.h;
                ojbVar3.b |= 2;
                aihfVarCreateBuilder.copyOnWrite();
                ojb ojbVar4 = (ojb) aihfVarCreateBuilder.instance;
                ojbVar4.b |= 1;
                ojbVar4.c = strBS;
                return ahno.as(omnVar2.d.h((oiz) obj5, (ojb) aihfVarCreateBuilder.build()), new oll(obj5, 11), omnVar2.b);
            case 4:
                ojb ojbVar5 = (ojb) obj;
                Object obj6 = this.b;
                if (ojbVar5 == null) {
                    onb.d("%s: No file entry with key %s", "SharedFileManager", obj6);
                    return ahng.n(Boolean.FALSE);
                }
                Object obj7 = this.a;
                oiz oizVar2 = (oiz) obj6;
                int iAS2 = a.aS(oizVar2.f);
                int i2 = iAS2 == 0 ? 1 : iAS2;
                omn omnVar3 = (omn) obj7;
                Uri uriBR2 = qnl.bR((Context) omnVar3.g, i2, ojbVar5.c, oizVar2.e, (qnl) omnVar3.f, (agev) omnVar3.e, false);
                if (uriBR2 != null) {
                    Object obj8 = omnVar3.j;
                    String str2 = oizVar2.e;
                    ((aesp) obj8).p(uriBR2);
                }
                return ahno.as(omnVar3.d.g(oizVar2), new oll(obj6, 10), omnVar3.b);
            case 5:
                agkj agkjVar = (agkj) obj;
                agkh agkhVar = new agkh(4);
                agqr it = ((agkz) this.a).iterator();
                while (it.hasNext()) {
                    oiz oizVar3 = (oiz) it.next();
                    if (!agkjVar.containsKey(oizVar3)) {
                        onb.d("%s: getOnDeviceUris called on file that doesn't exist. Key = %s!", "SharedFileManager", oizVar3);
                        return ahng.m(new oma());
                    }
                    Object obj9 = this.b;
                    ojb ojbVar6 = (ojb) agkjVar.get(oizVar3);
                    int iAS3 = a.aS(oizVar3.f);
                    int i3 = iAS3 == 0 ? 1 : iAS3;
                    omn omnVar4 = (omn) obj9;
                    Object objBR = qnl.bR((Context) omnVar4.g, i3, ojbVar6.c, ojbVar6.g, (qnl) omnVar4.f, (agev) omnVar4.e, ojbVar6.e);
                    if (objBR != null) {
                        agkhVar.e(oizVar3, objBR);
                    }
                }
                return ahng.n(agkhVar.d(false));
            case 6:
                onb.d("%s: Start download called on file that doesn't exist. Key = %s!", "SharedFileManager", this.b);
                acb acbVarA = oig.a();
                acbVarA.b = oif.SHARED_FILE_NOT_FOUND_ERROR;
                acbVarA.d = (oma) obj;
                return ahng.m(acbVarA.a());
            case 7:
                oms omsVar = (oms) this.a;
                oin oinVar = omsVar.c;
                String str3 = oinVar.g;
                ayq ayqVar = omsVar.n;
                Object obj10 = this.b;
                if (omu.e(ayqVar, (Uri) obj10, str3)) {
                    return omt.c(oiv.DOWNLOAD_COMPLETE, oinVar, omsVar.l, omsVar.b, omsVar.k);
                }
                onb.d("%s: Final file checksum verification failed. %s.", "DeltaFileDownloaderCallbackImpl", obj10);
                acb acbVarA2 = oig.a();
                acbVarA2.b = oif.FINAL_FILE_CHECKSUM_MISMATCH_ERROR;
                return ahng.m(acbVarA2.a());
            case 8:
                agev agevVar = (agev) obj;
                if (!agevVar.g()) {
                    onb.h("%s: stopDownloading on non-existent download", "MddFileDownloader");
                    return aher.a;
                }
                Object obj11 = this.b;
                Object obj12 = this.a;
                int i4 = onb.a;
                ((ListenableFuture) agevVar.c()).cancel(true);
                return ((aesp) obj12).o((Uri) obj11);
            case 9:
                return this.a.a((Uri) this.b);
            case 10:
                Exception exc = (Exception) obj;
                if (exc instanceof oig) {
                    oigVarA = (oig) exc;
                } else {
                    acb acbVarA3 = oig.a();
                    acbVarA3.d = exc;
                    acbVarA3.b = oif.UNKNOWN_ERROR;
                    oigVarA = acbVarA3.a();
                }
                return ahno.as(this.b.b(oigVarA), new oll(exc, i), ((aesp) this.a).d);
            case 11:
                oob oobVar = (oob) this.b;
                Uri uri = oobVar.a;
                ojw ojwVarA = ojx.a();
                ojwVarA.e(uri);
                ojwVarA.c(oobVar.c);
                ojwVarA.g(oobVar.b);
                ojwVarA.d(oobVar.f);
                ojwVarA.f(oobVar.e);
                ojwVarA.b(oobVar.g);
                try {
                    return ((xsc) ((syn) this.a).b.io()).ai(ojwVarA.a());
                } catch (RuntimeException e) {
                    acb acbVarA4 = oig.a();
                    acbVarA4.b = oif.UNKNOWN_ERROR;
                    acbVarA4.d = e;
                    return ahng.m(acbVarA4.a());
                }
            case 12:
                ((ahev) this.a).run();
                return this.b;
            case 13:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj13 = this.a;
                syn synVar = (syn) this.b;
                return ((syn) (zBooleanValue ? synVar.d : synVar.c)).q((String) obj13);
            case 14:
                int i5 = qmp.a;
                agjz agjzVar = new agjz(4);
                Context context = ((qkh) this.b).c;
                agjzVar.h(context);
                int i6 = mef.a;
                agjzVar.h(mef.a(context));
                agke agkeVarG = agjzVar.g();
                int i7 = ((agpi) agkeVarG).d;
                for (int i8 = 0; i8 < i7; i8++) {
                    Object obj14 = this.a;
                    File file = new File(String.valueOf(((Context) agkeVarG.get(i8)).getFilesDir()) + "/phenotype/shared/" + ((String) obj14));
                    if (file.exists()) {
                        zA = qmp.a(file);
                    }
                }
                return zA ? aher.a : ahng.m(new IOException("Unable to remove snapshots for removed user"));
            case 15:
                qms qmsVar = (qms) this.b;
                return ((kjc) qmsVar.d.io()).B(new qmr(qmsVar, this.a));
            case 16:
                return ahng.n(((qrg) this.a).e((Uri) this.b));
            case 17:
                Exception exc2 = (Exception) obj;
                tge tgeVarA = quk.a();
                tgeVarA.b = exc2;
                tgeVarA.c = new quh((UUID) this.a, 1);
                ((rdr) ((qzf) this.b).b).D(tgeVarA.e());
                return ahng.m(exc2);
            case 18:
                Exception exc3 = (Exception) obj;
                tge tgeVarA2 = quk.a();
                tgeVarA2.b = exc3;
                tgeVarA2.c = new quj((UUID) this.a, 1);
                ((rdr) ((qzf) this.b).b).D(tgeVarA2.e());
                return ahng.m(exc3);
            case 19:
                Exception exc4 = (Exception) obj;
                int i9 = qzf.f;
                Iterable$EL.forEach(this.a, new hfo(this.b, exc4, i, null));
                return ahng.m(exc4);
            default:
                return ((axfd) ((rmj) this.a).e.io()).O(this.b, MoreExecutors.directExecutor());
        }
    }

    public /* synthetic */ ols(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
