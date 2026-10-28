package defpackage;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class abzy implements agek {
    private final /* synthetic */ int $cid;

    public /* synthetic */ abzy(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                return ((acip) obj).ah();
            case 1:
                return ((acip) obj).af();
            case 2:
                return ((acip) obj).aj();
            case 3:
                return ((acip) obj).ao();
            case 4:
                return ((acip) obj).aj();
            case 5:
                return new IllegalStateException("Timed out trying to build the Queries container.");
            case 6:
                return ((szc) obj).m;
            case 7:
                throw new affy();
            case 8:
                if (((Boolean) obj).booleanValue()) {
                    return afhm.a();
                }
                throw new affy();
            case 9:
                afhm afhmVar = (afhm) obj;
                return afhmVar == null ? afhm.a() : afhmVar;
            case 10:
                afhn afhnVar = (afhn) obj;
                int i = afhnVar.c;
                int i2 = afhp.a;
                ahno.K(i == 2, "Account must be in ENABLED state, but was %s.", i != 1 ? i != 2 ? "DISABLED" : "ENABLED" : "UNSPECIFIED");
                return afhnVar;
            case 11:
                agjz agjzVar = new agjz(4);
                for (afiw afiwVar : DesugarCollections.unmodifiableMap(((afiu) obj).d).values()) {
                    int iAS = a.aS(afiwVar.e);
                    if (iAS == 0) {
                        iAS = 1;
                    }
                    if (iAS == 2) {
                        agjzVar.h(abhh.t(afiwVar));
                    }
                }
                return agjzVar.g();
            case 12:
                agjz agjzVar2 = new agjz(4);
                Iterator it = DesugarCollections.unmodifiableMap(((afiu) obj).d).values().iterator();
                while (it.hasNext()) {
                    agjzVar2.h(abhh.t((afiw) it.next()));
                }
                return agjzVar2.g();
            case 13:
            case 16:
                return null;
            case 14:
                return null;
            case 15:
                agjz agjzVar3 = new agjz(4);
                for (dzs dzsVar : (List) obj) {
                    if (!dzsVar.c.contains("tiktok_account_work")) {
                        agjzVar3.h(dzsVar);
                    }
                }
                return agjzVar3.g();
            case 17:
                return null;
            case 18:
                HashSet hashSet = new HashSet();
                for (afhn afhnVar2 : (List) obj) {
                    if (!afhnVar2.b.f.equals("incognito")) {
                        hashSet.add(afhnVar2.a);
                    }
                }
                return hashSet;
            case 19:
                return null;
            default:
                Log.e("ClientLoggingBackend", "Logging to Clearcut failed.", (Exception) obj);
                return null;
        }
    }
}
