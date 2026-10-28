package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class zhe implements zhd {
    private final /* synthetic */ int $cid;
    private final Object a;

    public zhe(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.zhd
    public final String a() {
        return this.$cid != 0 ? "ce.j" : "ce.js";
    }

    @Override // defpackage.zhd
    public final String b() {
        return this.$cid != 0 ? "cs.j" : "cs.js";
    }

    @Override // defpackage.zhd
    public final String c() {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            return obj.getClass().getSimpleName();
        }
        asja asjaVar = (asja) obj;
        return (asjaVar.b & 1) != 0 ? asjaVar.c : "";
    }

    @Override // defpackage.zhd
    public final String d() {
        return this.$cid != 0 ? "e.j" : "e.js";
    }

    @Override // defpackage.zhd
    public final String e() {
        return this.$cid != 0 ? "s.j" : "s.js";
    }

    @Override // defpackage.zhd
    public final String f() {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            return ((Throwable) obj).getMessage();
        }
        asja asjaVar = (asja) obj;
        if ((asjaVar.b & 2) != 0) {
            return asjaVar.d;
        }
        return null;
    }

    @Override // defpackage.zhd
    public final String g(int i, int i2, String str) {
        int i3 = 0;
        if (this.$cid != 0) {
            StackTraceElement[] stackTrace = ((Throwable) this.a).getStackTrace();
            int length = stackTrace.length;
            if (length == 0) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            int iMin = Math.min(i2, length);
            while (i < iMin) {
                StackTraceElement stackTraceElement = stackTrace[i];
                String[] strArr = {stackTraceElement.getClassName(), stackTraceElement.getMethodName()};
                Pattern pattern = zhf.a;
                String strJoin = TextUtils.join(".", strArr);
                String string = Integer.toString(stackTraceElement.getLineNumber());
                String[] strArrSplit = zhf.b.split(zhf.e(strJoin));
                for (int i4 = 0; i4 < strArrSplit.length; i4++) {
                    if (strArrSplit[i4].length() > 4) {
                        strArrSplit[i4] = strArrSplit[i4].substring(0, 4);
                    }
                }
                sb.append(TextUtils.join(".", strArrSplit));
                sb.append('.');
                sb.append(string);
                if (i != iMin - 1) {
                    sb.append(str);
                }
                i++;
            }
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            asja asjaVar = (asja) this.a;
            if (i3 >= asjaVar.e.size()) {
                return sb2.toString();
            }
            asjb asjbVar = (asjb) asjaVar.e.get(i3);
            sb2.append(zhf.e(asjbVar.c));
            sb2.append('.');
            sb2.append(asjbVar.b);
            sb2.append('.');
            sb2.append(asjbVar.d);
            sb2.append('.');
            sb2.append(asjbVar.e);
            if (i3 != asjaVar.e.size() - 1) {
                sb2.append(str);
            }
            i3++;
        }
    }

    @Override // defpackage.zhd
    public final int h() {
        return this.$cid != 0 ? 1 : 2;
    }
}
