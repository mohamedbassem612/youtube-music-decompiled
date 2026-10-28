package defpackage;

import android.net.Uri;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qrr extends qrz {
    public static final qrz a = new qrr();

    @Override // defpackage.qrz
    public final String a() {
        return "singleproc";
    }

    @Override // defpackage.qrz
    public final /* synthetic */ qry b(qrm qrmVar, String str, Executor executor, ayq ayqVar) {
        qsc qscVar = new qsc(qrmVar.b, qrmVar.e ? ExtensionRegistryLite.getGeneratedRegistry() : ExtensionRegistryLite.a);
        Uri uri = qrmVar.a;
        return new qrt(str, uri == null ? aher.a : new aher(uri), qscVar, executor, ayqVar, qrmVar.c, new afub());
    }
}
