package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qmd implements agek {
    private final /* synthetic */ int $cid;

    public /* synthetic */ qmd(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                ruk rukVar = qmi.i;
                return "";
            case 1:
                oja ojaVar = ((oiy) obj).f;
                return ojaVar == null ? oja.a : ojaVar;
            case 2:
                return ((acip) obj).ap();
            case 3:
                return ((tnw) obj).a;
            case 4:
                return new Exception((Throwable) obj);
            case 5:
                return ((vob) obj).s();
            case 6:
                List<vwn> list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                for (vwn vwnVar : list) {
                    if (vwnVar != null) {
                        arrayList.add(vwnVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList.add(vwn.AVAILABLE);
                }
                return (vwn) Collections.max(arrayList, vwm.a);
            case 7:
                return (vxe) ((awmd) obj).io();
            case 8:
                return (vxe) ((awmd) obj).io();
            case 9:
                String str = (String) obj;
                return Boolean.valueOf((TextUtils.isEmpty(str) || str.startsWith(".") || str.split("\\.").length < 2) ? false : true);
            case 10:
                ((agrc) ((agrc) ((agrc) vyt.a.b()).j((Exception) obj)).k("com/google/android/libraries/youtube/innertube/config/ProtoDataStoreApiaryEnvironment", "isVixSnapshotSet", 175, "ProtoDataStoreApiaryEnvironment.java")).t("Failed to read vix snapshot.");
                return Boolean.FALSE;
            case 11:
                return (weh) ((Optional) obj).orElse(null);
            case 12:
                int i = wed.a;
                return ((akvh) obj).c;
            case 13:
                return Boolean.FALSE;
            case 14:
                return ((alei) obj).l;
            case 15:
                alei aleiVar = (alei) obj;
                return aleiVar.d == 3 ? (String) aleiVar.e : "";
            case 16:
                alei aleiVar2 = (alei) obj;
                return aleiVar2.d == 7 ? (aigj) aleiVar2.e : aigj.d;
            case 17:
                return ((alei) obj).k;
            case 18:
                return wll.e((ajvu) obj);
            case 19:
                alei aleiVar3 = (alei) obj;
                return aleiVar3.b == 1 ? (String) aleiVar3.c : "";
            default:
                alei aleiVar4 = (alei) obj;
                return aleiVar4.b == 6 ? (aigj) aleiVar4.c : aigj.d;
        }
    }
}
