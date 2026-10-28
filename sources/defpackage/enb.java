package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class enb {
    static /* synthetic */ String a(ena enaVar, String str) {
        return str + a.aH(enaVar.p()) + " at path " + enaVar.d();
    }

    public static /* synthetic */ String b(Object obj, String str, String str2) {
        return str + String.valueOf(obj) + str2;
    }

    public static /* synthetic */ String d(Object obj, Class cls, String str) {
        return str + cls.toString() + ", but the wrapper available is of type: " + String.valueOf(obj.getClass()) + ". Does your peer's @Inject constructor reference the wrong wrapper class?";
    }
}
