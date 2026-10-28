package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class py implements Function0 {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ py(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [dpg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v31, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r9v41, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r9v42, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r9v51, types: [dow, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws ClassNotFoundException, IOException {
        Object axagVar;
        dpo dpoVar;
        boolean z = true;
        switch (this.$cid) {
            case 0:
                return qe.onBackPressedInput_delegate$lambda$0((qe) this.a);
            case 1:
                return qe.fullyDrawnReporter_delegate$lambda$0((qe) this.a);
            case 2:
                return Boolean.valueOf(qe.isExported_delegate$lambda$0((qe) this.a));
            case 3:
                return qe.defaultViewModelProviderFactory_delegate$lambda$0((qe) this.a);
            case 4:
                return qe.onBackPressedDispatcher_delegate$lambda$0((qe) this.a);
            case 5:
                return new qt((qv) this.a);
            case 6:
                bfv bfvVar = (bfv) ((bfp) this.a).a;
                File canonicalFile = ((File) bfvVar.e.invoke()).getCanonicalFile();
                synchronized (bfv.b) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    Set set = bfv.a;
                    if (set.contains(absolutePath)) {
                        throw new IllegalStateException(a.bT(absolutePath, "There are multiple DataStores active for the same file: ", ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled)."));
                    }
                    absolutePath.getClass();
                    set.add(absolutePath);
                }
                canonicalFile.getClass();
                return new bfy(canonicalFile, bfvVar.c, (ayq) bfvVar.d.invoke(canonicalFile), new py(canonicalFile, 8));
            case 7:
                return ((bfp) this.a).j().c;
            case 8:
                Object obj = this.a;
                synchronized (bfv.b) {
                    bfv.a.remove(((File) obj).getAbsolutePath());
                }
                return awmy.a;
            case 9:
                Object objInvoke = this.a.invoke();
                File file = (File) objInvoke;
                String name = file.getName();
                name.getClass();
                if (!awrc.c(awrc.t(name, '.', ""), "preferences_pb")) {
                    throw new IllegalStateException(a.bV(objInvoke, "File extension for file: ", " does not match required extension for Preferences file: preferences_pb"));
                }
                File absoluteFile = file.getAbsoluteFile();
                absoluteFile.getClass();
                return absoluteFile;
            case 10:
                boc bocVar = (boc) this.a;
                axaf axafVarA = axaw.a(bocVar.a());
                bocVar.b(new bpb(axafVarA, 1));
                axagVar = new axag(axafVarA, null);
                break;
            case 11:
                dmq dmqVar = ((dmg) this.a).a;
                if (dmqVar.q() && !dmqVar.s()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 12:
                this.a.run();
                return awmy.a;
            case 13:
                return this.a.call();
            case 14:
                dnx dnxVar = (dnx) this.a;
                ?? r0 = dnxVar.d.a;
                String strC = r0.c();
                String str = dnxVar.a;
                if (strC == null) {
                    if (!awrc.c(str, ":memory:")) {
                        throw new IllegalArgumentException(a.bT(str, "This driver is configured to open an in-memory database but a file-based named '", "' was requested."));
                    }
                } else if (!awrc.c(strC, str) && !awrc.c(awrc.t(strC, '/', strC), awrc.t(str, '/', str))) {
                    throw new IllegalArgumentException("This driver is configured to open a database named '" + r0.c() + "' but '" + str + "' was requested.");
                }
                axagVar = new dpt(r0.b());
            case 15:
                ?? r9 = this.a;
                r9.getLifecycle().b(new dop(r9));
                return awmy.a;
            case 16:
                dpp dppVar = (dpp) this.a;
                String str2 = dppVar.b;
                if (str2 == null || !dppVar.d) {
                    dpoVar = new dpo(dppVar.a, str2, new heg(), dppVar.c, dppVar.e);
                } else {
                    Context context = dppVar.a;
                    dpoVar = new dpo(context, new File(context.getNoBackupFilesDir(), str2).getAbsolutePath(), new heg(), dppVar.c, dppVar.e);
                }
                dpoVar.setWriteAheadLoggingEnabled(dppVar.f);
                return dpoVar;
            case 17:
                Class<?> clsLoadClass = ((ClassLoader) ((dov) this.a).a).loadClass("androidx.window.extensions.WindowExtensionsProvider");
                clsLoadClass.getClass();
                return clsLoadClass;
            case 18:
                efl.a((eax) this.a);
                return awmy.a;
            case 19:
                return new efe((dmq) this.a);
            default:
                return new edy((dmq) this.a);
        }
        return axagVar;
    }
}
