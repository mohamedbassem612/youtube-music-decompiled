package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ome implements omb {
    private final Context a;
    private final agev b;
    private final oii c;
    private final qnl d;

    public ome(Context context, qnl qnlVar, agev agevVar, oii oiiVar) {
        this.a = context;
        this.d = qnlVar;
        this.b = agevVar;
        this.c = oiiVar;
    }

    @Override // defpackage.omb
    public final ListenableFuture a() {
        this.a.getSharedPreferences(qnl.aO("gms_icing_mdd_shared_files", this.b), 0).edit().clear().commit();
        return aher.a;
    }

    @Override // defpackage.omb
    public final ListenableFuture c() {
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences(qnl.aO("gms_icing_mdd_shared_files", this.b), 0);
        SharedPreferences.Editor editorEdit = null;
        for (String str : sharedPreferences.getAll().keySet()) {
            try {
                arrayList.add(nst.c(str, context, this.d));
            } catch (onx e) {
                onb.f(e, "Failed to deserialize newFileKey:".concat(String.valueOf(str)));
                agfm.c("|").h(str).size();
                if (editorEdit == null) {
                    editorEdit = sharedPreferences.edit();
                }
                editorEdit.remove(str);
            }
        }
        if (editorEdit != null) {
            editorEdit.commit();
        }
        return new aher(arrayList);
    }

    @Override // defpackage.omb
    public final ListenableFuture d() {
        int i;
        int i2;
        Context context = this.a;
        if (!qnl.bh(context)) {
            int i3 = onb.a;
            Context context2 = this.a;
            qnl.bj(context2);
            this.c.z();
            qnl.bi(context2, olg.USE_CHECKSUM_ONLY);
            return new aher(Boolean.FALSE);
        }
        this.c.z();
        qnl qnlVar = this.d;
        olg olgVar = olg.USE_CHECKSUM_ONLY;
        olg olgVarBT = qnl.bT(context, qnlVar);
        int i4 = olgVar.d;
        int i5 = olgVarBT.d;
        boolean z = true;
        if (i4 != i5) {
            int i6 = 2;
            if (i4 < i5) {
                onb.e("%s Cannot migrate back from value %s to %s. Clear everything!", "SharedFilesMetadata", olgVarBT, olgVar);
                new Exception("Downgraded file key from " + olgVarBT.toString() + " to " + olgVar.toString() + '.');
                qnl.bi(context, olgVar);
                z = false;
            } else {
                int i7 = i5 + 1;
                while (true) {
                    if (i7 <= i4) {
                        try {
                            olg olgVarA = olg.a(i7);
                            int iOrdinal = olgVarA.ordinal();
                            if (iOrdinal == z) {
                                i = i4;
                                int i8 = onb.a;
                                SharedPreferences sharedPreferences = context.getSharedPreferences(qnl.aO("gms_icing_mdd_shared_files", this.b), 0);
                                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                for (String str : sharedPreferences.getAll().keySet()) {
                                    try {
                                        oiz oizVarC = nst.c(str, context, qnlVar);
                                        ojb ojbVar = ojb.a;
                                        ojb ojbVar2 = (ojb) qnl.aN(sharedPreferences, str, aihn.getParserForClass(ojb.class));
                                        if (ojbVar2 == null) {
                                            onb.c("%s: Unable to read sharedFile from shared preferences.", "SharedFilesMetadata");
                                            editorEdit.remove(str);
                                        } else {
                                            editorEdit.remove(str);
                                            qnl.aQ(editorEdit, nst.b(oizVarC), ojbVar2);
                                        }
                                    } catch (onx unused) {
                                        onb.d("%s Failed to deserialize file key %s, remove and continue.", "SharedFilesMetadata", str);
                                        editorEdit.remove(str);
                                    }
                                }
                                if (!editorEdit.commit()) {
                                    onb.b("Failed to commit migration metadata to disk");
                                    new Exception("Migrate to DownloadTransform failed.");
                                    break;
                                }
                                qnl.bi(this.a, olg.a(i7));
                                i7++;
                                i4 = i;
                                z = true;
                                i6 = 2;
                            } else {
                                if (iOrdinal != i6) {
                                    throw new UnsupportedOperationException("Upgrade to version " + olgVarA.name() + "not supported!");
                                }
                                int i9 = onb.a;
                                Context context3 = this.a;
                                SharedPreferences sharedPreferences2 = context3.getSharedPreferences(qnl.aO("gms_icing_mdd_shared_files", this.b), 0);
                                SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                                for (String str2 : sharedPreferences2.getAll().keySet()) {
                                    try {
                                        oiz oizVarC2 = nst.c(str2, context3, this.d);
                                        ojb ojbVar3 = ojb.a;
                                        i2 = i4;
                                        ojb ojbVar4 = (ojb) qnl.aN(sharedPreferences2, str2, aihn.getParserForClass(ojb.class));
                                        if (ojbVar4 == null) {
                                            onb.c("%s: Unable to read sharedFile from shared preferences.", "SharedFilesMetadata");
                                            editorEdit2.remove(str2);
                                        } else {
                                            editorEdit2.remove(str2);
                                            qnl.aQ(editorEdit2, nst.a(oizVarC2), ojbVar4);
                                        }
                                    } catch (onx unused2) {
                                        i2 = i4;
                                        onb.d("%s Failed to deserialize file key %s, remove and continue.", "SharedFilesMetadata", str2);
                                        editorEdit2.remove(str2);
                                    }
                                    i4 = i2;
                                }
                                i = i4;
                                if (!editorEdit2.commit()) {
                                    onb.b("Failed to commit migration metadata to disk");
                                    new Exception("Migrate to ChecksumOnly failed.");
                                    break;
                                }
                                qnl.bi(this.a, olg.a(i7));
                                i7++;
                                i4 = i;
                                z = true;
                                i6 = 2;
                            }
                        } catch (Throwable th) {
                            Context context4 = this.a;
                            if (qnl.bT(context4, this.d).d != olgVar.d && !qnl.bi(context4, olgVar)) {
                                onb.b(a.cn((byte) 46, olgVar, "Failed to commit migration version to disk. Fail to set target version to "));
                                new Exception(a.cn((byte) 46, olgVar, "Fail to set target version "));
                            }
                            throw th;
                        }
                    } else {
                        Context context5 = this.a;
                        if (qnl.bT(context5, this.d).d != olgVar.d && !qnl.bi(context5, olgVar)) {
                            onb.b(a.cn((byte) 46, olgVar, "Failed to commit migration version to disk. Fail to set target version to "));
                            new Exception(a.cn((byte) 46, olgVar, "Fail to set target version "));
                        }
                        z = true;
                    }
                }
                Context context6 = this.a;
                if (qnl.bT(context6, this.d).d != olgVar.d && !qnl.bi(context6, olgVar)) {
                    onb.b(a.cn((byte) 46, olgVar, "Failed to commit migration version to disk. Fail to set target version to "));
                    new Exception(a.cn((byte) 46, olgVar, "Fail to set target version "));
                }
                z = false;
            }
        }
        return new aher(Boolean.valueOf(z));
    }

    @Override // defpackage.omb
    public final ListenableFuture e(oiz oizVar) {
        return ahno.ar(f(new agqj(oizVar)), new olj(oizVar, 18), MoreExecutors.directExecutor());
    }

    @Override // defpackage.omb
    public final ListenableFuture f(agkz agkzVar) {
        Context context = this.a;
        SharedPreferences sharedPreferencesAL = qnl.aL(context, "gms_icing_mdd_shared_files", this.b);
        agkh agkhVar = new agkh(4);
        agqr it = agkzVar.iterator();
        while (it.hasNext()) {
            oiz oizVar = (oiz) it.next();
            String strD = nst.d(oizVar, context, this.d);
            ojb ojbVar = ojb.a;
            ojb ojbVar2 = (ojb) qnl.aN(sharedPreferencesAL, strD, aihn.getParserForClass(ojb.class));
            if (ojbVar2 != null) {
                agkhVar.e(oizVar, ojbVar2);
            }
        }
        return ahng.n(agkhVar.d(false));
    }

    @Override // defpackage.omb
    public final ListenableFuture g(oiz oizVar) {
        Context context = this.a;
        agev agevVar = this.b;
        return ahng.n(Boolean.valueOf(qnl.aR(qnl.aL(context, "gms_icing_mdd_shared_files", agevVar), nst.d(oizVar, context, this.d))));
    }

    @Override // defpackage.omb
    public final ListenableFuture h(oiz oizVar, ojb ojbVar) {
        Context context = this.a;
        agev agevVar = this.b;
        return ahng.n(Boolean.valueOf(qnl.aS(qnl.aL(context, "gms_icing_mdd_shared_files", agevVar), nst.d(oizVar, context, this.d), ojbVar)));
    }
}
