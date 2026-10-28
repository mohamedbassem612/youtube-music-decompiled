package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class awnf implements awqg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ awnf(int i) {
        this.$cid = i;
        this.a = "    ";
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [avmn, java.lang.Object] */
    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        Object objI;
        Throwable th;
        int i = this.$cid;
        if (i == 0) {
            Map.Entry entry = (Map.Entry) obj;
            entry.getClass();
            Object key = entry.getKey();
            awng awngVar = (awng) this.a;
            return awngVar.e(key) + '=' + awngVar.e(entry.getValue());
        }
        if (i == 1) {
            return obj == this.a ? "(this Collection)" : String.valueOf(obj);
        }
        if (i == 2) {
            String str = (String) obj;
            str.getClass();
            boolean zV = awrc.v(str);
            Object obj2 = this.a;
            if (zV) {
                return str.length() >= 4 ? str : obj2;
            }
            return ((String) obj2).concat(str);
        }
        if (i == 3) {
            String str2 = (String) obj;
            str2.getClass();
            return ((String) this.a).concat(str2);
        }
        if (i != 4) {
            this.a.dispose();
            return awmy.a;
        }
        Throwable th2 = (Throwable) obj;
        int i2 = axdi.a;
        try {
            th = (Throwable) this.a.invoke(th2);
            boolean zC = awrc.c(th2.getMessage(), th.getMessage());
            objI = th;
            if (!zC && !awrc.c(th.getMessage(), th2.toString())) {
                objI = th;
                objI = null;
            }
        } catch (Throwable th3) {
            objI = atqp.i(th3);
        }
        objI = th;
        return (Throwable) (true != (objI instanceof awmm) ? objI : null);
    }

    public /* synthetic */ awnf(int i, byte[] bArr) {
        this.$cid = i;
        this.a = "";
    }

    public /* synthetic */ awnf(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
