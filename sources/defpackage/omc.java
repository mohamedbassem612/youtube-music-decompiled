package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class omc implements ola {
    public final Executor a;
    private final Context b;
    private final agev c;
    private final omj d;
    private final qnl e;

    public omc(Context context, omj omjVar, qnl qnlVar, agev agevVar, Executor executor) {
        this.b = context;
        this.d = omjVar;
        this.e = qnlVar;
        this.c = agevVar;
        this.a = executor;
    }

    @Override // defpackage.ola
    public final ListenableFuture a(oip oipVar) {
        int i = onb.a;
        oip oipVarD = nsp.d(oipVar, (this.d.f() / 1000) + oipVar.k);
        ArrayList arrayList = new ArrayList();
        arrayList.add(oipVarD);
        return m(arrayList);
    }

    @Override // defpackage.ola
    public final ListenableFuture b() {
        Context context = this.b;
        agev agevVar = this.c;
        context.getSharedPreferences(qnl.aO("gms_icing_mdd_groups", agevVar), 0).edit().clear().commit();
        context.getSharedPreferences(qnl.aO("gms_icing_mdd_group_key_properties", agevVar), 0).edit().clear().commit();
        return k();
    }

    @Override // defpackage.ola
    public final ListenableFuture c() {
        ListenableFuture listenableFutureD = d();
        olm olmVar = new olm(this, 8);
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), olmVar, 1);
        int i = ahcs.c;
        Executor executor = this.a;
        ahcq ahcqVar = new ahcq(listenableFutureD, ahdbVar);
        listenableFutureD.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
        return ahcqVar;
    }

    @Override // defpackage.ola
    public final ListenableFuture d() {
        ArrayList arrayList = new ArrayList();
        SharedPreferences sharedPreferences = this.b.getSharedPreferences(qnl.aO("gms_icing_mdd_groups", this.c), 0);
        SharedPreferences.Editor editorEdit = null;
        for (String str : sharedPreferences.getAll().keySet()) {
            try {
                arrayList.add(qnl.aX(str));
            } catch (onv e) {
                onb.f(e, "Failed to deserialize groupKey:".concat(String.valueOf(str)));
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

    @Override // defpackage.ola
    public final ListenableFuture e() {
        Object objAU;
        File fileAY = qnl.aY(this.b, this.c);
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(agyn.b(fileAY, new ahng()));
            oip oipVar = oip.a;
            objAU = qnl.aU(byteBufferWrap, oip.class, aihn.getParserForClass(oip.class));
            if (objAU == null) {
                objAU = agpi.a;
            }
        } catch (FileNotFoundException unused) {
            fileAY.getAbsolutePath();
            int i = onb.a;
            objAU = agpi.a;
        } catch (IOException e) {
            onb.g(e, "%s: IOException occurred while reading file groups.", "FileGroupsMetadataUtil");
            objAU = agpi.a;
        }
        return objAU == null ? aher.a : new aher(objAU);
    }

    @Override // defpackage.ola
    public final ListenableFuture f() {
        return aher.a;
    }

    @Override // defpackage.ola
    public final ListenableFuture g(oiw oiwVar) {
        Context context = this.b;
        String strAZ = qnl.aZ(oiwVar);
        SharedPreferences sharedPreferencesAL = qnl.aL(context, "gms_icing_mdd_groups", this.c);
        oip oipVar = oip.a;
        return ahng.n((oip) qnl.aN(sharedPreferencesAL, strAZ, aihn.getParserForClass(oip.class)));
    }

    @Override // defpackage.ola
    public final ListenableFuture h(oiw oiwVar) {
        Context context = this.b;
        String strAZ = qnl.aZ(oiwVar);
        SharedPreferences sharedPreferencesAL = qnl.aL(context, "gms_icing_mdd_group_key_properties", this.c);
        oix oixVar = oix.a;
        return ahng.n((oix) qnl.aN(sharedPreferencesAL, strAZ, aihn.getParserForClass(oix.class)));
    }

    @Override // defpackage.ola
    public final ListenableFuture i(oiw oiwVar) {
        Context context = this.b;
        agev agevVar = this.c;
        return ahng.n(Boolean.valueOf(qnl.aR(qnl.aL(context, "gms_icing_mdd_groups", agevVar), qnl.aZ(oiwVar))));
    }

    @Override // defpackage.ola
    public final ListenableFuture j(List list) {
        SharedPreferences.Editor editorEdit = this.b.getSharedPreferences(qnl.aO("gms_icing_mdd_groups", this.c), 0).edit();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oiw oiwVar = (oiw) it.next();
            String str = oiwVar.c;
            String str2 = oiwVar.d;
            int i = onb.a;
            editorEdit.remove(qnl.aP(oiwVar));
        }
        return new aher(Boolean.valueOf(editorEdit.commit()));
    }

    @Override // defpackage.ola
    public final ListenableFuture k() {
        n().delete();
        return aher.a;
    }

    @Override // defpackage.ola
    public final ListenableFuture l(oiw oiwVar, oip oipVar) {
        Context context = this.b;
        agev agevVar = this.c;
        return ahng.n(Boolean.valueOf(qnl.aS(qnl.aL(context, "gms_icing_mdd_groups", agevVar), qnl.aZ(oiwVar), oipVar)));
    }

    @Override // defpackage.ola
    public final ListenableFuture m(List list) {
        aher aherVar;
        File fileN = n();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileN, true);
            try {
                ByteBuffer byteBufferAT = qnl.aT(list);
                if (byteBufferAT == null) {
                    aherVar = new aher(Boolean.FALSE);
                } else {
                    ahno.P(byteBufferAT.hasArray(), "ByteBuffer is not heap-backed, cannot write using stream.");
                    fileOutputStream.write(byteBufferAT.array(), byteBufferAT.arrayOffset() + byteBufferAT.position(), byteBufferAT.remaining());
                    aherVar = new aher(Boolean.TRUE);
                }
                fileOutputStream.close();
                return aherVar;
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException unused) {
            onb.c("File %s not found while writing.", fileN.getAbsolutePath());
            return new aher(Boolean.FALSE);
        } catch (IOException unused2) {
            onb.b("IOException occurred while writing file groups.");
            return new aher(Boolean.FALSE);
        }
    }

    final File n() {
        return qnl.aY(this.b, this.c);
    }
}
