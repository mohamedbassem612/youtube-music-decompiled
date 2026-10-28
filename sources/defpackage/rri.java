package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.util.Log;
import com.google.android.libraries.youtube.media.interfaces.CuePointDataProviderWrapper;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rri implements awqg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ rri(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01a9  */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v46, types: [awmd, java.lang.Object] */
    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        acip acipVar;
        acip acipVar2;
        switch (this.$cid) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((rrk) this.a).a.set(bool.booleanValue());
                return awmy.a;
            case 1:
                ComponentInfo componentInfo = (ComponentInfo) obj;
                componentInfo.getClass();
                boolean zIsEnabled = componentInfo.isEnabled();
                Object obj2 = this.a;
                if (zIsEnabled) {
                    hed hedVar = (hed) obj2;
                    if (((PackageManager) hedVar.c).getComponentEnabledSetting((ComponentName) hedVar.a) == 2) {
                        hed hedVar2 = (hed) obj2;
                        ((PackageManager) hedVar2.c).setComponentEnabledSetting((ComponentName) hedVar2.a, 1, 1);
                    }
                } else {
                    hed hedVar3 = (hed) obj2;
                    ((PackageManager) hedVar3.c).setComponentEnabledSetting((ComponentName) hedVar3.a, 1, 1);
                }
                return awmy.a;
            case 2:
                aesp aespVar = (aesp) this.a;
                AtomicReference atomicReference = (AtomicReference) aespVar.d;
                atomicReference.set((Integer) obj);
                ((AtomicBoolean) aespVar.b).set(true);
                Objects.toString(atomicReference.get());
                return awmy.a;
            case 3:
                AtomicReference atomicReference2 = (AtomicReference) ((aesp) this.a).c;
                atomicReference2.set((Integer) obj);
                Objects.toString(atomicReference2.get());
                return awmy.a;
            case 4:
                aazr aazrVar = (aazr) obj;
                String strA = aazrVar.a();
                acip acipVar3 = aazrVar.a;
                CuePointDataProviderWrapper.Holder holderG = acipVar3.g();
                Object obj3 = this.a;
                ((abfv) obj3).b.put(strA, holderG);
                acipVar3.getClass();
                acipVar3.W().Z(acipVar3.ar().g()).ak(new abae(new pge(acipVar3, obj3, 17), 0));
                return awmy.a;
            case 5:
                CuePointDataProviderWrapper.Holder holder = (CuePointDataProviderWrapper.Holder) ((ConcurrentHashMap) ((abfv) this.a).b).remove(((aazs) obj).a());
                if (holder != null) {
                    holder.close();
                }
                return awmy.a;
            case 6:
                acip acipVar4 = ((aazr) obj).a;
                if (acipVar4 != null) {
                    ((abvy) this.a).b(acipVar4);
                }
                return awmy.a;
            case 7:
                String strA2 = ((aazs) obj).a();
                if (strA2 != null) {
                    ((abvy) this.a).d(strA2);
                }
                return awmy.a;
            case 8:
                aazq aazqVar = (aazq) obj;
                boolean zC = awrc.c(aazqVar, aazq.a);
                Object obj4 = this.a;
                if (zC || (acipVar = aazqVar.b) == null) {
                    ((abvy) obj4).e(null);
                } else {
                    ((abvy) obj4).e(acipVar);
                }
                return awmy.a;
            case 9:
                aazq aazqVar2 = (aazq) obj;
                boolean zC2 = awrc.c(aazqVar2, aazq.a);
                Object obj5 = this.a;
                if (zC2 || (acipVar2 = aazqVar2.b) == null) {
                    ((abvy) obj5).f(null);
                } else {
                    ((abvy) obj5).f(acipVar2);
                }
                return awmy.a;
            case 10:
                ((acgo) this.a.io()).b((List) obj);
                return awmy.a;
            case 11:
                String strA3 = ((aazs) obj).a();
                strA3.getClass();
                ((ConcurrentHashMap) ((abxu) this.a).f).remove(strA3);
                return awmy.a;
            case 12:
                bdu bduVar = (bdu) obj;
                bduVar.getClass();
                int i = awrn.a;
                Log.w(new awqv(ahpr.class).c(), "CorruptionException in " + ((ahpr) this.a).b + " DataStore running in process " + Process.myPid(), bduVar);
                return new bhj(true);
            case 13:
                Context context = (Context) obj;
                context.getClass();
                Set set = bhf.a;
                set.getClass();
                List listSingletonList = Collections.singletonList(new bgx(context, ((ahpr) this.a).b, bgy.a, new doa(set, (awoq) null, 1), new psn(null, 1, null)));
                listSingletonList.getClass();
                return listSingletonList;
            default:
                ((axfi) this.a).c();
                return awmy.a;
        }
    }
}
