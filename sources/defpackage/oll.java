package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.chromium.base.Callback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oll implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ oll(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v39, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, omb] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) throws Throwable {
        int i = 2;
        int i2 = 4;
        switch (this.$cid) {
            case 0:
                return ((olp) this.a).a();
            case 1:
                Object obj2 = this.a;
                ole oleVar = (ole) obj2;
                return ahno.as(oleVar.b(oleVar.b.a()), new olb(obj2, (onu) obj, 14), oleVar.c);
            case 2:
                olp olpVar = (olp) this.a;
                Context context = olpVar.b;
                qnl.bg(context);
                qnl.aL(context, "gms_icing_mdd_manager_metadata", olpVar.f).edit().clear().commit();
                olp.a = false;
                return aher.a;
            case 3:
                return ((olp) this.a).j.a();
            case 4:
                return ((olp) this.a).c.b();
            case 5:
                return olp.f(((omh) this.a).b);
            case 6:
                Object obj3 = this.a;
                olp olpVar2 = (olp) obj3;
                return ahno.as(olpVar2.d.a(), new oll(obj3, i2), olpVar2.g);
            case 7:
                olk olkVar = new olk(3);
                olq olqVar = (olq) this.a;
                return olqVar.b.a(olkVar, olqVar.a);
            case 8:
                ojb ojbVar = (ojb) obj;
                if (ojbVar != null) {
                    return ahng.n(ojbVar);
                }
                onb.d("%s: getSharedFile called on file that doesn't exist! Key = %s", "SharedFileManager", this.a);
                return ahng.m(new oma());
            case 9:
                List<oiz> list = (List) obj;
                ArrayList arrayList = new ArrayList();
                Object obj4 = this.a;
                try {
                    for (oiz oizVar : list) {
                        arrayList.add(ahno.as(((omn) obj4).d.e(oizVar), new ols(obj4, oizVar, i), ((omn) obj4).b));
                    }
                } catch (Exception unused) {
                }
                return qnl.aJ(arrayList).O(new iud(obj4, i2), ((omn) obj4).b);
            case 10:
                if (((Boolean) obj).booleanValue()) {
                    return ahng.n(Boolean.TRUE);
                }
                onb.d("%s: Unable to modify file subscription for key %s", "SharedFileManager", this.a);
                return ahng.n(Boolean.FALSE);
            case 11:
                if (((Boolean) obj).booleanValue()) {
                    return ahng.n(Boolean.TRUE);
                }
                onb.d("%s: Unable to write back subscription for file entry with %s", "SharedFileManager", this.a);
                return ahng.n(Boolean.FALSE);
            case 12:
                ((oig) this.a).addSuppressed((IOException) obj);
                return aher.a;
            case 13:
                return ahng.m((Throwable) this.a);
            case 14:
                if (((Boolean) obj).booleanValue()) {
                    return aher.a;
                }
                onb.d("%s: Unable to write back download info for file entry with %s", "DownloaderCallbackImpl", this.a);
                acb acbVarA = oig.a();
                acbVarA.b = oif.UNABLE_TO_UPDATE_FILE_STATE_ERROR;
                return ahng.m(acbVarA.a());
            case 15:
                ((oig) this.a).addSuppressed((IOException) obj);
                return aher.a;
            case 16:
                return ahng.m((Throwable) this.a);
            case 17:
                ojb ojbVar2 = (ojb) obj;
                if (ojbVar2 != null) {
                    return ahng.n(ojbVar2);
                }
                onb.d("%s: Shared file not found, newFileKey = %s", "DownloaderCallbackImpl", this.a);
                acb acbVarA2 = oig.a();
                acbVarA2.b = oif.SHARED_FILE_NOT_FOUND_ERROR;
                return ahng.m(acbVarA2.a());
            case 18:
                throw ((Throwable) this.a);
            case 19:
                return ((qdc) this.a).a((qda) obj);
            default:
                agke agkeVar = (agke) obj;
                if (agkeVar.isEmpty()) {
                    return aher.a;
                }
                Object obj5 = this.a;
                qgg qggVar = (qgg) obj5;
                axfu axfuVar = (axfu) qggVar.g.io();
                aihf aihfVarCreateBuilder = axft.a.createBuilder();
                int size = agkeVar.size();
                aihfVarCreateBuilder.copyOnWrite();
                axft axftVar = (axft) aihfVarCreateBuilder.instance;
                axftVar.b |= 2;
                axftVar.e = size;
                aihfVarCreateBuilder.copyOnWrite();
                axft axftVar2 = (axft) aihfVarCreateBuilder.instance;
                axfuVar.getClass();
                axftVar2.d = axfuVar;
                axftVar2.b |= 1;
                HashSet hashSet = new HashSet();
                for (int i3 = 0; i3 < axfuVar.b.size(); i3++) {
                    int iG = Callback.Helper.g(axfuVar.b.d(i3));
                    if (iG == 0) {
                        iG = 1;
                    }
                    hashSet.add(Integer.valueOf(iG - 1));
                }
                int size2 = agkeVar.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    axfs axfsVar = (axfs) agkeVar.get(i4);
                    int iG2 = Callback.Helper.g(axfsVar.d);
                    if (iG2 == 0) {
                        iG2 = 1;
                    }
                    if (hashSet.contains(Integer.valueOf(iG2 - 1))) {
                        aihfVarCreateBuilder.copyOnWrite();
                        axft axftVar3 = (axft) aihfVarCreateBuilder.instance;
                        axfsVar.getClass();
                        aiie aiieVar = axftVar3.c;
                        if (!aiieVar.c()) {
                            axftVar3.c = aihn.mutableCopy(aiieVar);
                        }
                        axftVar3.c.add(axfsVar);
                    }
                }
                axft axftVar4 = (axft) aihfVarCreateBuilder.build();
                qfg qfgVar = qggVar.a;
                qfc qfcVarA = qfd.a();
                aihf aihfVarCreateBuilder2 = axhz.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                axhz axhzVar = (axhz) aihfVarCreateBuilder2.instance;
                axftVar4.getClass();
                axhzVar.n = axftVar4;
                axhzVar.b |= 65536;
                qfcVarA.g((axhz) aihfVarCreateBuilder2.build());
                return ahcs.e(qfgVar.a(qfcVarA.a()), new kjh(obj5, agkeVar, 11, null), qggVar.c);
        }
    }
}
