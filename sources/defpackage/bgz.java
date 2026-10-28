package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import androidx.work.impl.WorkDatabase;
import j$.util.Optional;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bgz implements Function0 {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bgz(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r7v23, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.lang.Object, tns] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Exception {
        String str;
        String str2;
        switch (this.$cid) {
            case 0:
                return new File(((Context) this.a).getApplicationContext().getFilesDir(), "datastore/".concat(((bha) this.b).a.concat(".preferences_pb")));
            case 1:
                SharedPreferences sharedPreferences = ((Context) this.a).getSharedPreferences((String) this.b, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
            case 2:
                Object obj = this.a;
                Object obj2 = this.b;
                synchronized (ecp.b) {
                    Map map = ecp.c;
                    map.remove(obj2);
                    if (map.isEmpty()) {
                        dzf.b();
                        String str3 = ecu.a;
                        ((ConnectivityManager) obj).unregisterNetworkCallback(ecp.a);
                        ecp.f = null;
                        ecp.d = null;
                        ecp.e = false;
                    }
                    break;
                }
                return awmy.a;
            case 3:
                edl edlVar = ((ecv) this.b).a;
                Object obj3 = this.a;
                synchronized (edlVar.b) {
                    LinkedHashSet linkedHashSet = edlVar.c;
                    if (linkedHashSet.remove(obj3) && linkedHashSet.isEmpty()) {
                        edlVar.e();
                    }
                    break;
                }
                return awmy.a;
            case 4:
                Object obj4 = this.a;
                ebm ebmVar = (ebm) obj4;
                WorkDatabase workDatabase = ebmVar.d;
                workDatabase.getClass();
                workDatabase.o(new dzn(workDatabase, this.b, obj4, 4, (char[]) null));
                eaq.a(ebmVar.c, ebmVar.d, ebmVar.e);
                return awmy.a;
            case 5:
                return this.b.invoke(this.a);
            case 6:
                this.a.ad(((tnx) this.b).c().a);
                return awmy.a;
            case 7:
                afqy afqyVar = (afqy) this.b;
                Optional optional = afqyVar.f;
                optional.getClass();
                Callable callable = (Callable) optional.orElse(null);
                if (callable != null) {
                    Object objCall = callable.call();
                    if (objCall == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    str = (String) objCall;
                } else {
                    str = "";
                }
                Object obj5 = this.a;
                return ((afiz) ((abhh) obj5).a).b(afqyVar.d, afqyVar.a + str + ".pb").q();
            default:
                afqy afqyVar2 = (afqy) this.a;
                Optional optional2 = afqyVar2.f;
                optional2.getClass();
                Callable callable2 = (Callable) optional2.orElse(null);
                if (callable2 != null) {
                    Object objCall2 = callable2.call();
                    if (objCall2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    str2 = (String) objCall2;
                } else {
                    str2 = "";
                }
                Object obj6 = this.b;
                afqw afqwVar = afqyVar2.d;
                String str4 = afqyVar2.a;
                return new File(((auor) ((ahpu) obj6).a).i(afqwVar), str4 + str2 + ".pb");
        }
    }

    public /* synthetic */ bgz(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
